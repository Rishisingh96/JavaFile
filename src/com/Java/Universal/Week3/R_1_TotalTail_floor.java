package com.Java.Universal.Week3;

/*
Create a class Tile to store the edge length of a square tile and create
another class Floor to store length and width of a rectangular floor. Add
method totalTiles(Tile t) in Floor class with Tile as argument to clculate
the whole number of tiles needed to cover the floor completely.
*/
class Tile{
    int  edge_length_square(int s){
        int square = s*s;
    return square;
    }
}
class Floor extends Tile {
    int Floor(int length,int width){
        int CFloor = length*width;
        return CFloor;
    }
}
public class R_1_TotalTail_floor {
    public static void main(String[] args) {

        Floor tf = new Floor();
        double floor =  tf.Floor(20,15);
        double tile = tf.edge_length_square(4);
//        System.out.println(Math.ceil(floar/tile));
        System.out.println((int) Math.ceil((double) floor/tile));

    }
}


/*The `Math.ceil(double)` method in Java is used to return the smallest integer value that is greater than or equal to the argument. This is useful in scenarios where you need to round up to the nearest whole number, regardless of the decimal part.

### When to Use `Math.ceil(double)`

1. **Rounding Up Calculations**:
    - When you need to ensure that you always round up a floating-point number to the nearest integer, even if the number has a small fractional part.

2. **Determining Number of Containers or Items**:
    - In cases where you need to determine the number of containers or items required to hold a certain amount, such as the number of tiles needed to cover a floor, the number of buses needed to transport people, etc. Since you can't have a fraction of a container or item, you round up to ensure you have enough.

3. **Allocating Resources**:
    - When allocating resources in scenarios where fractional units are not feasible, such as allocating memory blocks, computing page numbers for pagination, or distributing workload across multiple workers or threads.

### Example Scenarios

1. **Floor Tiling Example**:
    - Calculating the number of tiles needed to cover a floor.
    - If the total floor area is 300 square units and each tile covers 16 square units, you'd use `Math.ceil(300.0 / 16.0)` to ensure you have enough tiles.

2. **Bus Transportation Example**:
    - Calculating the number of buses needed to transport people.
    - If you have 53 people and each bus can carry 10 people, you'd use `Math.ceil(53.0 / 10.0)` to determine that you need 6 buses.

### Code Example

Here's an example of using `Math.ceil(double)` in a practical scenario:

```java
public class CeilingExample {
    public static void main(String[] args) {
        // Example 1: Floor Tiling
        double floorArea = 300.0;
        double tileArea = 16.0;
        int totalTiles = (int) Math.ceil(floorArea / tileArea);
        System.out.println("Total tiles needed: " + totalTiles); // Output: 19

        // Example 2: Bus Transportation
        double totalPeople = 53.0;
        double busCapacity = 10.0;
        int totalBuses = (int) Math.ceil(totalPeople / busCapacity);
        System.out.println("Total buses needed: " + totalBuses); // Output: 6
    }
}
```

In this example:
- For the floor tiling, `Math.ceil(300.0 / 16.0)` returns `19` because 18.75 is rounded up to the next whole number.
- For the bus transportation, `Math.ceil(53.0 / 10.0)` returns `6` because 5.3 is rounded up to the next whole number.

### Summary

Use `Math.ceil(double)` whenever you need to round up a floating-point number to the nearest integer to ensure you cover the entire quantity without falling short. This method is particularly useful in resource allocation and distribution scenarios where partial units are not practical.
*/


