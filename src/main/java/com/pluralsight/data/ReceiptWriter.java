package com.pluralsight.data;

import com.pluralsight.model.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void saveReceipt(Order order) {
        try {
            File folder = new File("receipts");

            if (!folder.exists()) {
                folder.mkdirs();
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String fileName = "receipts/" + LocalDateTime.now().format(formatter) + ".txt";

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(order.getReceiptText());
            writer.close();

            System.out.println("Receipt saved: " + fileName);

        } catch (Exception e) {
            System.out.println("Could not save receipt.");
            System.out.println(e.getMessage());
        }
    }
}