package com.Java.Universal.Week3;
/*Create a class Tile to store the edge length of a square tile and create
another class Floor to store length and width of a rectangular floor. Add
method totalTiles(Tile t) in Floor class with Tile as argument to clculate
the whole number of tiles needed to cover the floor completely.*/
class Tile1 {
    private  int edgeLength;
    public Tile1(int edgeLength){
        this.edgeLength = edgeLength;
    }
    public int getEdgeLength(){
        return edgeLength;
    }
    public int getTileArea(){
        return edgeLength * edgeLength;
    }
}
class Floor1 {
    private int length;
    private int width;
    public Floor1(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int totalTiles(Tile1 tile){
        int floorArea = length * width;
        int tileArea = tile.getTileArea();
        return (int) Math.ceil((double) floorArea/tileArea);
    }
}
public class R_0_TotalTail_floor {
    public static void main(String[] args) {
        Tile1 tile = new Tile1(4);
        Floor1 floor = new Floor1(20,15);

        int totalTilesNeed = floor.totalTiles(tile);
        System.out.println("Total tiles needed : " + totalTilesNeed);
    }
}


/*### Dry Run of the Code with Example

Let's take the example provided in the code:
- Tile edge length: 4
- Floor dimensions: length 20, width 15

### Code Dry Run

1. **Main Method**:
    - `Tile1 tile = new Tile1(4);`
        - Creates an instance of `Tile1` with `edgeLength` set to 4.
    - `Floor1 floor = new Floor1(20, 15);`
        - Creates an instance of `Floor1` with `length` set to 20 and `width` set to 15.

2. **totalTiles Method Call**:
    - `int totalTilesNeed = floor.totalTiles(tile);`
        - Calls the `totalTiles` method of the `floor` object, passing the `tile` object as an argument.

3. **totalTiles Method**:
    - `int floorArea = length * width;`
        - `length` is 20 and `width` is 15.
        - `floorArea = 20 * 15 = 300`.
    - `int tileArea = tile.getTileArea();`
        - Calls the `getTileArea` method of the `tile` object.

4. **getTileArea Method**:
    - `return edgeLength * edgeLength;`
        - `edgeLength` is 4.
        - `tileArea = 4 * 4 = 16`.

5. **totalTiles Calculation**:
    - `return (int) Math.ceil((double) floorArea / tileArea);`
        - `floorArea` is 300 and `tileArea` is 16.
        - `floorArea / tileArea = 300 / 16 = 18.75`.
        - `Math.ceil(18.75) = 19`.
        - Casts the result to an integer: `19`.

6. **Print Result**:
    - `System.out.println("Total tiles needed : " + totalTilesNeed);`
        - Prints: `Total tiles needed : 19`.

### Dry Run Example Steps

1. **Tile Initialization**:
    - `Tile1 tile = new Tile1(4);`
        - `edgeLength = 4`.

2. **Floor Initialization**:
    - `Floor1 floor = new Floor1(20, 15);`
        - `length = 20`
        - `width = 15`.

3. **Calculating Floor Area**:
    - `int floorArea = length * width;`
        - `floorArea = 20 * 15 = 300`.

4. **Calculating Tile Area**:
    - `int tileArea = tile.getTileArea();`
    - Inside `getTileArea()`:
        - `tileArea = 4 * 4 = 16`.

5. **Calculating Total Tiles Needed**:
    - `return (int) Math.ceil((double) floorArea / tileArea);`
        - `300 / 16 = 18.75`.
        - `Math.ceil(18.75) = 19`.
        - Cast to int: `19`.

6. **Output**:
    - `Total tiles needed : 19`.

### Conclusion

The dry run shows that the code correctly calculates the total number of tiles needed to cover a floor with the given dimensions using tiles of the specified edge length. The output is `Total tiles needed : 19`.
*/