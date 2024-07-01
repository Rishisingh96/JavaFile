class Item {
    private boolean available = false;

    public synchronized void produce() {
        if (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Producer produced an item.");
        available = true;
        notify();
    }

    public synchronized void consume() {
        if (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer consumed an item.");
        available = false;
        notify();
    }
}

class Producer implements Runnable {
    private Item item;

    public Producer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            item.produce();
        }
    }
}

class Consumer implements Runnable {
    private Item item;

    public Consumer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            item.consume();
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Item item = new Item();
        Thread producerThread = new Thread(new Producer(item));
        Thread consumerThread = new Thread(new Consumer(item));

        producerThread.start();
        consumerThread.start();
    }
}
