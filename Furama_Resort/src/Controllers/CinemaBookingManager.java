package Controllers;

import Commons.FuncWritingReading;
import Models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CinemaBookingManager {
    CustomerManagement customerManagement = new CustomerManagement();
    FuncWritingReading funcWritingReading = new FuncWritingReading();
    Scanner scanner = new Scanner(System.in);

    //    public void cinemaBooking() {
//        System.out.println("---Booking 4D ticket Menu---\n" +
//                "1.Buy ticket\n" +
//                "2.Show seating number\n" +
//                "0.Exit" +
//                "---Please choice customer in list blow--");
//        Queue<Customer> customerQueue = new LinkedList<>();
//        int numberOfSeating = 1;
//        System.out.println("Please choose: ");
//        String choose = null;
//        boolean exit = false;
//
//        while (true) {
//            choose = scanner.nextLine();
//            switch (choose) {
//                case "1":
//                    if (numberOfSeating < 5) {
//                        System.out.println("We still have " + (6 - numberOfSeating) + " ticket 4D cinema");
//                        System.out.println("Please choice the customer info in list blow if you  want to book ticket");
//                        Customer customer = customerManagement.choiceCustomer();
//                        customerQueue.offer(customer);
//                        System.out.println("Thank you for booking");
//                    } else {
//                        System.err.println("Tickets are sold out, see you next time, Thank you!");
//                    }
//                    break;
//                case "2":
//                    for (Customer cus : customerQueue) {
//                        System.out.println("Seat'number is: " + numberOfSeating + ", customer's information " + cus.showInfo());
//                        numberOfSeating++;
//                    }
//                    break;
//                case "0":
//                    System.out.println("exited!");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("invalid! please choose action in below menu:");
//                    break;
//            }
//            if (exit) {
//                break;
//            }
//        }
////
////        do {
//
////            System.out.println("List number of seating blow");
//////            System.out.println("Do you want to book cinema ticket\n" +
//////                    "1.Yes\n" +
//////                    "0.No");
//////            System.out.println("Please choose: ");
//////            String choose = null;
//////            boolean exit = false;
//
////            if (numberOfSeating > 5) {
////                System.out.println("Tickets are sold out, see you next time, Thank you!");
////                break;
////            }
////        } while (true);
////    }
//    }
//}
//    public void cinemaBooking() {
//        int noOfTickets = 5;
//        Queue<Customer> customers = new LinkedList<>();
//        while (true) {
//            System.out.print("\nSelect an option from the list below:\n" +
//                    "1.	Buy Cinema Ticket\n" +
//                    "2.	Show All Customers\n" +
//                    "3.	Back to menu\n" +
//                    "4.	Exit\n" +
//                    "Enter your choice: ");
//            String choice = scanner.nextLine();
//            switch (choice) {
//                case "1":
//                    if (customers.size() >= noOfTickets) {
//                        System.out.println("Tickets are sold out");
//                    } else {
//                        addNewBuying(customers);
//                    }
//                    break;
//                case "2":
//                    showCustomersBought(customers);
//                    break;
//                case "3":
//                    displayMainMenu();
//                    break;
//                case "4":
//                    System.exit(0);
//                default:
//                    System.out.println("Input is out of range");
//            }
//        }
//    }
//
//    private void addNewBuying(Queue<Customer> customers) {
//    }
}

