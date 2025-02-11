package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PaymentGateway {
    private final ArrayList<Payment> payments = new ArrayList<>();
    private final Random random = new Random();

    // Generates a random payment ID
    public int generatePaymentId() {
        return random.nextInt(10000);
    }

    public void processPayment(Payment payment) {
        payment.setStatus("Success");
        payments.add(payment);
    }

    public Payment getPaymentById(int paymentId) {
        for (Payment payment : payments) {
            if (payment.getPaymentId() == paymentId) {
                return payment;
            }
        }
        return null;
    }

    public List<Payment> getAllPayments() {
        return payments;
    }
}