package com.Java.Project;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Online_Reservation_S_1 {
        private static final int min = 1000;
        private static final int max = 9999;

        public static class user {
            private String username;
            private String password;

            Scanner in = new Scanner(System.in);

            public user() {

            }

            public String getUsername() {
                System.out.println("Enter Username : ");
                username = in.nextLine();
                return username;
            }

            public String getPassword() {
                System.out.println("Enter Password : ");
                password = in.nextLine();
                return password;
            }
        }

        public static class PnrRecord {
            private int pnrNumber;
            private String passengerName;
            private String trainNumber;
            private String classType;
            private String journeyDate;
            private String from;
            private String to;

            Scanner in = new Scanner(System.in);

            public int getpnrNumber() {
                Random random = new Random();
                pnrNumber = random.nextInt(max) + min;
                return pnrNumber;
            }

            public String getPassengerName() {
                System.out.println("Enter the passenger name : ");
                passengerName = in.nextLine();
                return passengerName;
            }

            public String gettrainNumber() {
                System.out.println("Enter the train number: ");
                trainNumber = in.nextLine();
                return trainNumber;
            }

            public String getclassType() {
                System.out.println("Enter the class type : ");
                classType = in.nextLine();
                return classType;
            }

            public String getjourneyDate() {
                System.out.println("Enter the Journey date as 'YYYY-MM-DD' format");
                in.nextLine();
                return journeyDate;

            }

            public String getfrom() {
                System.out.println("Enter the starting place : ");
                from = in.nextLine();
                return from;
            }

            public String getto() {
                System.out.println("Enter the destination place : ");
                to = in.nextLine();
                return to;
            }

//	public reverse_of_number getPassengerName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            user u1 = new user();
            String username = u1.getUsername();
            String password = u1.getPassword();

            String url = "jdbc:mysql://localhost:3306/rishi";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    System.out.println("user Connection Granted. \n");
                    while (true) {
                        // reverse_of_number InsertQuery = "insert into reservations value(? ? ? ?) ";
                        String InsertQuery = "insert into reservations values(?, ?, ?, ?, ?, ?, ?)";
                        String DeletQuery = "DELETE FROM reservations WHERE pnr_number";
                        String showQuery = "select * from reservations ";

                        System.out.println("Enter the choice :");
                        System.out.println("1. Insert Record.\n");
                        System.out.println("2. Delete Record.\n");
                        System.out.println("3. show All Records\n");
                        System.out.println("4. Exit. \n");
                        int choice = in.nextInt();

                        if (choice == 1) {

                            PnrRecord p1 = new PnrRecord();
                            int pnr_number = p1.getpnrNumber();
                            String passengerName = p1.getPassengerName();
                            String trainNumber = p1.gettrainNumber();
                            String classType = p1.getclassType();
                            String journeyDate = p1.getjourneyDate();
                            String getfrom = p1.getfrom();
                            String getto = p1.getto();

                            try (PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery)) {
                                preparedStatement.setInt(1, pnr_number);
                                preparedStatement.setString(2, passengerName);
                                preparedStatement.setString(3, trainNumber);
                                preparedStatement.setString(4, classType);
                                preparedStatement.setString(5, journeyDate);
                                preparedStatement.setString(6, getfrom);
                                preparedStatement.setString(7, getto);

                                int rowsAffected = preparedStatement.executeUpdate();
                                if (rowsAffected > 0) {
                                    System.out.println("Record added successfully.");
                                }

                                else {
                                    System.out.println("No records were added.");
                                }
                            } catch (SQLException e) {
                                System.err.println("SQLException : " + e.getMessage());
                            }
                        }

                        else if (choice == 2) {
                            System.out.println("Enter the PNR number to delete the record : ");

                            int pnerNumber = in.nextInt();
                            try (PreparedStatement preparedStatement = connection.prepareStatement(DeletQuery)) {
                                preparedStatement.setInt(1, pnerNumber);
                                int rowsAffected = preparedStatement.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Record deleted successfully.");
                                }

                                else {
                                    System.out.println("No records were deleted.");
                                }
                            }

                            catch (SQLException e) {
                                System.err.println("SQLException : " + e.getMessage());
                            }
                        } else if (choice == 3) {
                            try (PreparedStatement preparedStatement = connection.prepareStatement(showQuery);
                                 ResultSet resultSet = preparedStatement.executeQuery()) {
                                System.out.println("\nAll records printing.\n");
                                while (resultSet.next()) {
                                    String pnrNumber = resultSet.getString("pnr_number");
                                    String passengerName = resultSet.getString("passenger_name");
                                    String trainNumber = resultSet.getString("train_number");
                                    String classType = resultSet.getString("class_type");
                                    String journeyDate = resultSet.getString("journey_date");
                                    String fromLocation = resultSet.getString("from_location");
                                    String toLocation = resultSet.getString("to_location");

                                    System.out.println("PNR Number: " + pnrNumber);
                                    System.out.println("Passenger Name: " + passengerName);
                                    System.out.println("Train Number: " + trainNumber);
                                    System.out.println("Class Type: " + classType);
                                    System.out.println("Journey Date: " + journeyDate);
                                    System.out.println("From Location:" + fromLocation);
                                    System.out.println("To Location:" + toLocation);
                                    System.out.println("--------------------------");
                                }
                            } catch (SQLException e) {
                                System.err.println("SQLException: " + e.getMessage());
                            }
                        } else if (choice == 4) {
                            System.out.println("Exiting the program.\n");
                            break;
                        }

                        else {
                            System.out.println("Invalid choice Entered.\n");
                        }
                    }
                }

                catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            } catch (ClassNotFoundException e) {
                System.err.println("Error loading JDBC driver: " + e.getMessage());
            }

            in.close();
        }
    }


