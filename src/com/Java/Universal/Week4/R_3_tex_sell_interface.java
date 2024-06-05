package com.Java.Universal.Week4;

interface Taxable {
    double salesTax = 7 / 100.0;
    double incomeTax = 10.5 / 100;
    void calcTax();
}

class Employee implements Taxable {
    int emp_id;
    String name;
    int salary;

    public Employee(int emp_id, String name, int salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    public void calcTax() {
        double IT = salary * incomeTax;
        System.out.printf("Your income Tax is = %.2f%n", IT);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Product implements Taxable {
    String pid;
    int price;
    int quantity;

    public Product(String pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void calcTax() {
        double st = price * salesTax;
        System.out.printf("Your sales Tax is = %.2f%n", st);
    }
}

public class R_3_tex_sell_interface {
    public static void main(String[] args) {
        Employee employee = new Employee(12, "Rishi", 50000);
        System.out.println(employee.toString());
        employee.calcTax();

        Product product = new Product("Yes", 40000, 1);
        System.out.println(product.toString());
        product.calcTax();
    }
}
