//package com.chatApp;
//
//import javafx.*;
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.stage.Stage;
//
//import java.io.*;
//import java.net.Socket;
//
//public class ChatClient extends Application {
//
//    private Socket socket;
//    private BufferedReader in;
//    private PrintWriter out;
//    private VBox messagesBox;
//    private TextField inputField;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Chat Application");
//
//        BorderPane root = new BorderPane();
//
//        messagesBox = new VBox();
//        messagesBox.setPadding(new Insets(10));
//        messagesBox.setSpacing(5);
//
//        ScrollPane scrollPane = new ScrollPane(messagesBox);
//        scrollPane.setFitToWidth(true);
//        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
//
//        inputField = new TextField();
//        inputField.setPromptText("Type a message");
//        inputField.setOnAction(event -> sendMessage());
//
//        Button sendButton = new Button("Send");
//        sendButton.setOnAction(event -> sendMessage());
//
//        HBox inputBox = new HBox(10, inputField, sendButton);
//        inputBox.setPadding(new Insets(10));
//        inputBox.setAlignment(Pos.CENTER);
//
//        root.setCenter(scrollPane);
//        root.setBottom(inputBox);
//
//        Scene scene = new Scene(root, 400, 600);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        new Thread(this::connectToServer).start();
//    }
//
//    private void connectToServer() {
//        try {
//            socket = new Socket("127.0.0.1", 4444);
//            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            out = new PrintWriter(socket.getOutputStream(), true);
//
//            String message;
//            while ((message = in.readLine()) != null) {
//                String finalMessage = message;
//                Platform.runLater(() -> addMessage(finalMessage, false));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void sendMessage() {
//        String message = inputField.getText().trim();
//        if (!message.isEmpty()) {
//            addMessage(message, true);
//            out.println(message);
//            inputField.clear();
//        }
//    }
//
//    private void addMessage(String message, boolean isSentByUser) {
//        Label messageLabel = new Label(message);
//        messageLabel.setPadding(new Insets(10));
//        messageLabel.setStyle("-fx-background-color: lightblue; -fx-background-radius: 10;");
//
//        HBox messageBubble = new HBox(messageLabel);
//        messageBubble.setAlignment(isSentByUser ? Pos.CENTER_RIGHT : Pos.CENTER_LEFT);
//        messagesBox.getChildren().add(messageBubble);
//    }
//
//    @Override
//    public void stop() throws Exception {
//        super.stop();
//        if (socket != null) {
//            socket.close();
//        }
//    }
//}
