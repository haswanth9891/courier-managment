package com.hexaware.entities;

import java.util.Date;
public class Courier {
	// Static variable for generating unique courier IDs
    private static long nextCourierID = 1;

    // Properties of the Courier class
    private long courierID;
    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;
    private double weight;
    private String status;
    private long trackingNumber;
    private Date deliveryDate;
    private int userId;  // Assuming userId refers to the ID of the associated user

    // Constructor for creating a Courier object
    public Courier(String senderName, String senderAddress, String receiverName,
                   String receiverAddress, double weight, String status, Date deliveryDate, int userId) {
        this.courierID = generateCourierID();
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.weight = weight;
        this.status = status;
        this.trackingNumber = generateTrackingNumber();
        this.deliveryDate = deliveryDate;
        this.userId = userId;
    }

    public Courier(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	// Method to generate a unique courier ID using a static variable
    private static synchronized long generateCourierID() {
        return nextCourierID++;
    }

    // Method to generate a unique tracking number using a static variable
    private static synchronized long generateTrackingNumber() {
        // You can implement your logic for generating tracking numbers
        // For simplicity, using the current time in milliseconds
        return System.currentTimeMillis();
    }

   

    // toString method for displaying Courier information
    @Override
    public String toString() {
        return "Courier ID: " + courierID +
               "\nSender: " + senderName +
               "\nReceiver: " + receiverName +
               "\nWeight: " + weight +
               "\nStatus: " + status +
               "\nTracking Number: " + trackingNumber +
               "\nDelivery Date: " + deliveryDate +
               "\nUser ID: " + userId;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a sample Courier instance
        Courier courier1 = new Courier("John Doe", "123 Main St", "Jane Smith",
                "456 Market St", 2.5, "In Transit", new Date(), 101);

        // Displaying Courier information using toString method
        System.out.println(courier1.toString());
	}

}

