//package com.interviewQuestion_DSA_Java.Queue;
//
//class QueueSimple{
//    int arr[10];
//    int front;
//    int rear;
//
//    public:
//    QueueSimple(){
//        front=-1;
//        rear = -1;
//    }
//    void push();
//    void pop();
//    int front();
//    int rear();
//    bool isEmpty();
//    void display();
//};
//void QueueSimple::display(){
//    int i = front;
//    while(i<=rear){
//        cout<<arr[i]<<" ";
//        i++;
//    }
//}
//
//void QueueSimple::push(int n){
//    if(b==10){
//        cout<<"Queue Overflow"<<endl;
//        return;
//    }
//    if(f==-1){
//        f++;
//        b++;
//        arr[f] = n;
//    }
//    else
//    {
//        b++;
//        arr[r] = n;
//    }
//
//
//}
//int QueueSimple ::pop(int rear){
//    if(front == -1){
//        cout<<"Queue Uniderflow"<<endl;
//        return;
//    }
//    int i = front;
//    while(i<b){
//        arr[i] = arr[i+1];
//        i++;
//    }
//    b--;
//}
//bool QueueSimple::isEmpty(){
//    if(front == -1){
//        return true;
//    }
//    return false;
//}
//int QueueSimple ::front(){
//    return arr[front];
//}
//int QueueSimple ::rear(){
//    return arr[rear];
//}
//public class Queue {
//    public static void main(String[] args) {
//        QueueSimple q;
//        q.push(10);
//        q.push(20);
//        q.push(30);
//        q.push(60);
//        q.push(90);
//        q.push(70);
//        q.push(50);
//        q.push(40);
//        // q.pop();
//        q.display();
//        return 0;
//    }
//}
