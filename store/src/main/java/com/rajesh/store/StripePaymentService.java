package com.rajesh.store;

public class StripePaymentService implements PaymentService{
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
