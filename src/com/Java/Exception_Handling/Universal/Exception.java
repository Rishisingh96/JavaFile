package com.Java.Exception_Handling.Universal;
public class Exception extends Throwable {
    public static void main(String args[]) {
    String st = "60.";
    int result;
    try{
        result = Integer.parseInt(st)*2;
        System.out.println(STR."Result : \{result}");
    }catch(NumberFormatException e){
    System.out.println("String is incorrect.");
    System.out.println("How are you Rishi.");
    System.out.println("I am fine.");
    }
    }
}
/*Sure, let's go through the code step by step to understand how it works and why we use the `ConnectionDB()` method.

### Code Breakdown

1. **Package Declaration**
    ```java
    package DB.JDBC.Universal.ByConnectionMethod;
    ```
    This line declares the package in which the class `ConnectionMethod` resides. It's a way to organize your classes in a hierarchical manner.

2. **Import Statements**
    ```java
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    ```
    These lines import the necessary classes from the `java.sql` package. Specifically, `Connection`, `DriverManager`, and `SQLException`.

3. **Class Declaration**
    ```java
    public class ConnectionMethod {
    ```
    This line declares a public class named `ConnectionMethod`.

4. **ConnectionDB() Method**
    ```java
    public static Connection ConnectionDB() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/universal";
        String user = "root";
        String pass = "Rishi@9838";
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;  // Return the Connection object
    }
    ```
    - **Method Signature**: `public static Connection ConnectionDB() throws SQLException`
      - `public`: The method is accessible from anywhere.
      - `static`: The method belongs to the class, not an instance of the class.
      - `Connection`: The method returns an object of type `Connection`.
      - `ConnectionDB()`: The method name.
      - `throws SQLException`: The method might throw an `SQLException`.

    - **Connection Details**:
      - `url`: Specifies the database URL.
      - `user`: Specifies the database username.
      - `pass`: Specifies the database password.

    - **DriverManager.getConnection**: This method attempts to establish a connection to the database using the provided URL, username, and password. If successful, it returns a `Connection` object.

    - **Return Statement**: The method returns the `Connection` object.

5. **Main Method**
    ```java
    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionDB();
        if (con != null) {
            System.out.println("Connection Established");
        } else {
            System.out.println("Failed to establish connection");
        }
    }
    ```
    - **ConnectionDB() Call**: The `main` method calls `ConnectionDB()` to establish a connection to the database.
    - **Connection Check**: It checks if the `Connection` object is not null.
    - **Output**: If the connection is established, it prints "Connection Established". Otherwise, it prints "Failed to establish connection".

### Purpose of `ConnectionDB()` Method

- **Reusability**: By encapsulating the connection logic in a separate method, you can reuse this method whenever you need to establish a connection to the database. This avoids code duplication.
- **Maintainability**: If you need to change the connection details (URL, username, password), you only need to update them in one place.
- **Abstraction**: It abstracts the connection logic, making your code cleaner and easier to read.

### Dry Run

1. The `main` method is executed.
2. It calls the `ConnectionDB()` method.
3. The `ConnectionDB()` method attempts to establish a connection to the database using the provided URL, username, and password.
4. If the connection is successful, `ConnectionDB()` returns a `Connection` object.
5. The `main` method checks if the returned `Connection` object is not null.
6. If the connection is established, it prints "Connection Established". Otherwise, it prints "Failed to establish connection".

### Example Output
If the database connection details are correct and the database server is running, the output will be:
```
Connection Established
```
If the connection details are incorrect or the database server is not running, the output will be:
```
Failed to establish connection
```

This approach helps in managing the database connection efficiently, making your code modular and easy to maintain.
*/