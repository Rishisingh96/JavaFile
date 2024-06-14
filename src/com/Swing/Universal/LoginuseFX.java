//package com.Swing.Universal;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//public class LoginFX extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Registration Form");
//
//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10, 10, 10, 10));
//        grid.setVgap(8);
//        grid.setHgap(10);
//
//        // Name label and text field
//        Label nameLabel = new Label("Name:");
//        GridPane.setConstraints(nameLabel, 0, 0);
//        TextField nameField = new TextField();
//        nameField.setPromptText("Name");
//        GridPane.setConstraints(nameField, 1, 0);
//
//        // Age label and text field
//        Label ageLabel = new Label("Age:");
//        GridPane.setConstraints(ageLabel, 0, 1);
//        TextField ageField = new TextField();
//        ageField.setPromptText("Age");
//        GridPane.setConstraints(ageField, 1, 1);
//
//        // Phone label and text field
//        Label phoneLabel = new Label("Phone:");
//        GridPane.setConstraints(phoneLabel, 0, 2);
//        TextField phoneField = new TextField();
//        phoneField.setPromptText("Phone");
//        GridPane.setConstraints(phoneField, 1, 2);
//
//        // Email label and text field
//        Label emailLabel = new Label("Email:");
//        GridPane.setConstraints(emailLabel, 0, 3);
//        TextField emailField = new TextField();
//        emailField.setPromptText("Email");
//        GridPane.setConstraints(emailField, 1, 3);
//
//        // Password label and password field
//        Label passwordLabel = new Label("Password:");
//        GridPane.setConstraints(passwordLabel, 0, 4);
//        PasswordField passwordField = new PasswordField();
//        passwordField.setPromptText("Password");
//        GridPane.setConstraints(passwordField, 1, 4);
//
//        // Gender label and radio buttons
//        Label genderLabel = new Label("Gender:");
//        GridPane.setConstraints(genderLabel, 0, 5);
//        ToggleGroup genderGroup = new ToggleGroup();
//        RadioButton maleRadioButton = new RadioButton("Male");
//        maleRadioButton.setToggleGroup(genderGroup);
//        RadioButton femaleRadioButton = new RadioButton("Female");
//        femaleRadioButton.setToggleGroup(genderGroup);
//        GridPane.setConstraints(maleRadioButton, 1, 5);
//        GridPane.setConstraints(femaleRadioButton, 1, 6);
//
//        // Course label and choice box
//        Label courseLabel = new Label("Course:");
//        GridPane.setConstraints(courseLabel, 0, 7);
//        ChoiceBox<String> courseChoiceBox = new ChoiceBox<>();
//        courseChoiceBox.getItems().addAll("Select", "Course 1", "Course 2", "Course 3");
//        courseChoiceBox.setValue("Select");
//        GridPane.setConstraints(courseChoiceBox, 1, 7);
//
//        // Signup button
//        Button signupButton = new Button("Sign Up");
//        GridPane.setConstraints(signupButton, 1, 8);
//
//        signupButton.setOnAction(e -> {
//            String name = nameField.getText();
//            String age = ageField.getText();
//            String phone = phoneField.getText();
//            String email = emailField.getText();
//            String password = passwordField.getText();
//            String gender = maleRadioButton.isSelected() ? "Male" : (femaleRadioButton.isSelected() ? "Female" : "");
//            String course = courseChoiceBox.getValue();
//
//            if (name.isEmpty() || age.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty() || "Select".equals(course)) {
//                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please fill in all the fields");
//            } else {
//                // Add more detailed validation if needed
//                if (!phone.matches("\\d{10}")) {
//                    showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter a valid 10-digit phone number");
//                } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
//                    showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter a valid email address");
//                } else if (!age.matches("\\d+")) {
//                    showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter a valid age");
//                } else {
//                    showAlert(Alert.AlertType.INFORMATION, "Registration Successful", "Welcome " + name);
//                }
//            }
//        });
//
//        grid.getChildren().addAll(nameLabel, nameField, ageLabel, ageField, phoneLabel, phoneField, emailLabel, emailField, passwordLabel, passwordField, genderLabel, maleRadioButton, femaleRadioButton, courseLabel, courseChoiceBox, signupButton);
//
//        Scene scene = new Scene(grid, 300, 400);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    private void showAlert(Alert.AlertType alertType, String title, String message) {
//        Alert alert = new Alert(alertType);
//        alert.setTitle(title);
//        alert.setHeaderText(null);
//        alert.setContentText(message);
//        alert.showAndWait();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
