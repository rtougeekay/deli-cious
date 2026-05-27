package com.pluralsight.data;

import com.pluralsight.model.Order;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void saveReceipt(Order order) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String fileName = "receipts/" + LocalDateTime.now().format(formatter) + ".txt";

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(order.getReceiptText());
            writer.close();

            System.out.println("Receipt saved: " + fileName);
        } catch (Exception e) {
            System.out.println("Could not save receipt.");
        }
    }
}