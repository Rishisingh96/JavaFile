package com.Java.Universal.Week2;

import java.util.Scanner;

class Product {
    int pid;
    int price;
    int quantity;

    public Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class calculateProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product information
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter the product ID for product " + (i + 1) + ": ");
            int pid = sc.nextInt();
            System.out.println("Enter the price of product " + (i + 1) + ": ");
            int price = sc.nextInt();
            System.out.println("Enter the quantity of product " + (i + 1) + ": ");
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find the product with the highest price
        int maxPricePid = products[0].pid;
        int maxPrice = products[0].price;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }

        System.out.println("Product with the highest price has ID: " + maxPricePid);

        // Calculate and display total amount spent on all products
        int totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    public static int calculateTotalAmountSpent(Product[] products) {
        int totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }
}
/*Sure, I can provide a sample output for five products based on the given code. Here’s an example:

### Sample Run:

```
Enter the product ID for product 1:
101
Enter the price of product 1:
500
Enter the quantity of product 1:
3
Enter the product ID for product 2:
102
Enter the price of product 2:
700
Enter the quantity of product 2:
2
Enter the product ID for product 3:
103
Enter the price of product 3:
600
Enter the quantity of product 3:
4
Enter the product ID for product 4:
104
Enter the price of product 4:
1000
Enter the quantity of product 4:
1
Enter the product ID for product 5:
105
Enter the price of product 5:
800
Enter the quantity of product 5:
2

Product with the highest price has ID: 104
Total amount spent on all products: 8100
```

### Explanation of Sample Output:
1. **Product Information Input**:
    - **Product 1**: ID = 101, Price = 500, Quantity = 3
    - **Product 2**: ID = 102, Price = 700, Quantity = 2
    - **Product 3**: ID = 103, Price = 600, Quantity = 4
    - **Product 4**: ID = 104, Price = 1000, Quantity = 1
    - **Product 5**: ID = 105, Price = 800, Quantity = 2

2. **Finding Product with the Highest Price**:
    - The product with the highest price is Product 4 (ID = 104) with a price of 1000.

3. **Calculating Total Amount Spent**:
    - **Product 1**: 500 * 3 = 1500
    - **Product 2**: 700 * 2 = 1400
    - **Product 3**: 600 * 4 = 2400
    - **Product 4**: 1000 * 1 = 1000
    - **Product 5**: 800 * 2 = 1600
    - **Total**: 1500 + 1400 + 2400 + 1000 + 1600 = 7900

This example provides a detailed run-through of how the program captures the product information, determines the product with the highest price, and calculates the total amount spent on all products. The output may vary based on the actual input values provided during the run.
*/

/*Enter the product ID for product 1:
201
Enter the price of product 1:
20000
Enter the quantity of product 1:
3
Enter the product ID for product 2:
202
Enter the price of product 2:
2000
Enter the quantity of product 2:
2
Enter the product ID for product 3:
1
Enter the price of product 3:
1000
Enter the quantity of product 3:
2
Enter the product ID for product 4:
302
Enter the price of product 4:
3500
Enter the quantity of product 4:
2
Enter the product ID for product 5:
501
Enter the price of product 5:
40000
Enter the quantity of product 5:
5
Product with the highest price has ID: 501
Total amount spent on all products: 273000
*/