package com.Java.Universal.Advance_Topic;

// Base class Shape
class Shape {
    protected String name;

    // Constructor to initialize the name field
    public Shape(String name) {
        this.name = name;
    }

    // Method to be overridden by subclasses
    void displayArea() {
        // Default implementation (can be overridden)
        System.out.println("Displaying area of shape.");
    }
}

// Derived class Circle extends Shape
class Circle extends Shape {
    private int radius;

    // Constructor for Circle
    public Circle(String name, int radius) {
        super(name); // Call the parent class (Shape) constructor
        this.radius = radius;
    }

    // Override the displayArea method to calculate and display the area of the circle
    @Override
    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of " + name + " with radius " + radius + " is: " + area);
    }
}

// Derived class Rectangle extends Shape
class Rectangle extends Shape {
    private int length;
    private int width;

    // Constructor for Rectangle
    public Rectangle(String name, int length, int width) {
        super(name); // Call the parent class (Shape) constructor
        this.length = length;
        this.width = width;
    }

    // Override the displayArea method to calculate and display the area of the rectangle
    @Override
    void displayArea() {
        int area = length * width;
        System.out.println("Area of " + name + " with length " + length + " and width " + width + " is: " + area);
    }
}

// Main class to test the functionality
public class super_method_class {
    public static void main(String[] args) {
        // Create a Circle object with name "Circle" and radius 5
        Circle circle = new Circle("Circle", 5);
        // Create a Rectangle object with name "Rectangle", length 4, and width 6
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);

        // Call the displayArea method for both objects
        circle.displayArea();  // Outputs: Area of Circle with radius 5 is: 78.53981633974483
        rectangle.displayArea();  // Outputs: Area of Rectangle with length 4 and width 6 is: 24
    }
}
/*
 In Java, the super() function is used to call the constructor of the parent class (also known as the superclass). This is particularly useful when the child class needs to initialize the parent class's members or perform certain setup tasks defined in the parent's constructor. The super keyword can also be used to call a superclass method that has been overridden in the subclass.

Why use super(data)?
When you have a class hierarchy where the parent class has a constructor that requires parameters, the child class needs to call this constructor to properly initialize the inherited fields. Using super(data) ensures that the parent class's constructor is called with the appropriate arguments, allowing it to initialize its state correctly.

//

Sure! Let's dry run this code and explain the use of the `super()` function in detail.

### Dry Run of the Code

1. **Execution Starts**:
   - The `main` method is invoked.

2. **Creating `Circle` Object**:
   - `new Circle("Circle", 5)` is called.
   - Control goes to the `Circle` constructor.
   - The `Circle` constructor calls `super(name)` with `name` set to "Circle".
   - Control goes to the `Shape` constructor with `name = "Circle"`.
   - The `Shape` constructor sets `this.name` to "Circle" and returns.
   - Control goes back to the `Circle` constructor.
   - The `Circle` constructor sets `this.radius` to 5 and returns.
   - `Circle` object is created with `name = "Circle"` and `radius = 5`.

3. **Creating `Rectangle` Object**:
   - `new Rectangle("Rectangle", 4, 6)` is called.
   - Control goes to the `Rectangle` constructor.
   - The `Rectangle` constructor calls `super(name)` with `name` set to "Rectangle".
   - Control goes to the `Shape` constructor with `name = "Rectangle"`.
   - The `Shape` constructor sets `this.name` to "Rectangle" and returns.
   - Control goes back to the `Rectangle` constructor.
   - The `Rectangle` constructor sets `this.length` to 4 and `this.width` to 6 and returns.
   - `Rectangle` object is created with `name = "Rectangle"`, `length = 4`, and `width = 6`.

4. **Calling `displayArea` on `Circle` Object**:
   - `circle.displayArea()` is called.
   - Control goes to the `displayArea` method in the `Circle` class.
   - The area of the circle is calculated as `Math.PI * radius * radius`, which is `Math.PI * 5 * 5 = 78.53981633974483`.
   - "Area of Circle with radius 5 is: 78.53981633974483" is printed.

5. **Calling `displayArea` on `Rectangle` Object**:
   - `rectangle.displayArea()` is called.
   - Control goes to the `displayArea` method in the `Rectangle` class.
   - The area of the rectangle is calculated as `length * width`, which is `4 * 6 = 24`.
   - "Area of Rectangle with length 4 and width 6 is: 24" is printed.

### Explanation of `super()`

- **Why Use `super()`**:
  - The `super()` function is used to call the constructor of the parent class.
  - It allows the derived class to initialize the fields inherited from the parent class.
  - It ensures that the base class's constructor logic is executed before the derived class's constructor logic.

- **When to Use `super()`**:
  - Use `super()` when the derived class needs to initialize or use fields/methods from the base class.
  - It is necessary when the parent class does not have a no-argument constructor, and the derived class needs to pass parameters to the parent class's constructor.
  - In our example, `super(name)` is used to initialize the `name` field of the `Shape` class from within the constructors of the `Circle` and `Rectangle` classes.

### Example Breakdown

1. **Shape Class**:
   - The `Shape` class has a constructor that takes `name` as a parameter and sets it.

2. **Circle Class**:
   - The `Circle` constructor calls `super(name)`, which initializes the `name` field of the `Shape` class.
   - This ensures that `Circle` objects have the `name` field correctly set via the `Shape` constructor.

3. **Rectangle Class**:
   - Similar to the `Circle` class, the `Rectangle` constructor calls `super(name)` to initialize the `name` field of the `Shape` class.
   - This ensures that `Rectangle` objects have the `name` field correctly set via the `Shape` constructor.

### Summary

The `super()` function is crucial for initializing the inherited properties of a base class when constructing objects of a derived class. It allows the derived class to leverage the base class's constructor, ensuring proper initialization and setup of the inherited fields.

*/