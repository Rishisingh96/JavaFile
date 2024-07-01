package com.Java.Universal.Week5;

import java.io.File;
import java.io.IOException;

public class R07_FindImageBytes {
    public static void main(String[] args) throws IOException {
        // Path to the image file
        File file = new File("India/Rishi.jpg"); // Change this to your image file path
        int internetSpeedBps = 256; // Internet speed in bits per second

        // Get the total number of bytes in the image file
        long totalBytes = file.length();
        System.out.println("Total Bytes: " + totalBytes);

        // Calculate upload time in seconds
        double uploadTime = calculateUploadTime(totalBytes, internetSpeedBps);
        System.out.println("Upload Time: " + uploadTime + " seconds");
    }

    // Method to calculate the upload time
    public static double calculateUploadTime(long totalBytes, int internetSpeedBps) {
        double internetSpeedBpsInBytes = internetSpeedBps / 8.0; // Convert bps to Bps (bytes per second)
        return totalBytes / internetSpeedBpsInBytes; // Calculate upload time in seconds
    }
}

/*Let's do a step-by-step dry run of your Java program to understand how it works and verify its correctness.

### Step-by-Step Execution

1. **Initialization and Setup**:
   ```java
   public static void main(String[] args) throws IOException {
       // Path to the image file
       File file = new File("India/Rishi.jpg"); // Change this to your image file path
       int internetSpeedBps = 256; // Internet speed in bits per second
   ```
   - `file` is initialized with the path to `"India/Rishi.jpg"`.
   - `internetSpeedBps` is set to `256`.

2. **Get the Total Number of Bytes in the Image File**:
   ```java
       // Get the total number of bytes in the image file
       long totalBytes = file.length();
       System.out.println("Total Bytes: " + totalBytes);
   ```
   - `file.length()` is called, which returns the size of the file in bytes.
   - This value is stored in `totalBytes`.
   - `totalBytes` is printed to the console.

3. **Calculate Upload Time in Seconds**:
   ```java
       // Calculate upload time in seconds
       double uploadTime = calculateUploadTime(totalBytes, internetSpeedBps);
       System.out.println("Upload Time: " + uploadTime + " seconds");
   ```
   - `calculateUploadTime(totalBytes, internetSpeedBps)` is called.
   - The returned value is stored in `uploadTime`.
   - `uploadTime` is printed to the console.

4. **Method to Calculate the Upload Time**:
   ```java
   // Method to calculate the upload time
   public static double calculateUploadTime(long totalBytes, int internetSpeedBps) {
       double internetSpeedBpsInBytes = internetSpeedBps / 8.0; // Convert bps to Bps (bytes per second)
       return totalBytes / internetSpeedBpsInBytes; // Calculate upload time in seconds
   }
   ```
   - `calculateUploadTime` method takes `totalBytes` and `internetSpeedBps` as arguments.
   - `internetSpeedBps` is divided by `8.0` to convert it from bits per second to bytes per second.
     - This is because 1 byte = 8 bits.
   - The total number of bytes (`totalBytes`) is divided by the internet speed in bytes per second (`internetSpeedBpsInBytes`) to get the upload time in seconds.
   - The calculated upload time is returned.

### Example Dry Run

Assume the size of `India/Rishi.jpg` is 2048 bytes.

1. **Initialization**:
   - `file` = new File("India/Rishi.jpg")
   - `internetSpeedBps` = 256

2. **Get Total Bytes**:
   - `totalBytes` = `file.length()` = 2048
   - Print: "Total Bytes: 2048"

3. **Calculate Upload Time**:
   - Call `calculateUploadTime(2048, 256)`
     - `internetSpeedBpsInBytes` = 256 / 8.0 = 32 bytes per second
     - `uploadTime` = 2048 / 32 = 64 seconds
   - Return `uploadTime` = 64
   - Print: "Upload Time: 64.0 seconds"

### Summary

1. **Initialization**: Sets up the file and internet speed.
2. **Get Total Bytes**: Calculates the file size in bytes.
3. **Calculate Upload Time**: Converts internet speed to bytes per second and calculates the upload time.
4. **Output**: Prints the file size and upload time to the console.

Your code correctly calculates the total number of bytes in the image file and estimates the upload time based on the given internet speed.


BEGIN

    // Initialize variables
    SET filePath = "India/Rishi.jpg"  // Change this to your image file path
    SET internetSpeedBps = 256  // Internet speed in bits per second

    // Main process
    TRY
        // Get the total number of bytes in the image file
        SET totalBytes = CALL getTotalBytes(filePath)
        PRINT "Total Bytes: " + totalBytes

        // Calculate upload time in seconds
        SET uploadTime = CALL calculateUploadTime(totalBytes, internetSpeedBps)
        PRINT "Upload Time: " + uploadTime + " seconds"
    CATCH error
        PRINT "Error: " + error message
    END TRY

END

// Function to get the total number of bytes in the image file
FUNCTION getTotalBytes(filePath)
    CREATE file with filePath
    IF file does not exist OR is not a valid file
        THROW error "File not found or is not a valid file."
    ENDIF
    RETURN length of file
END FUNCTION

// Function to calculate the upload time
FUNCTION calculateUploadTime(totalBytes, internetSpeedBps)
    SET internetSpeedBpsInBytes = internetSpeedBps / 8.0  // Convert bps to Bps (bytes per second)
    RETURN totalBytes / internetSpeedBpsInBytes  // Calculate upload time in seconds
END FUNCTION
*/
