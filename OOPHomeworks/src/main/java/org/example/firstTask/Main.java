package org.example.firstTask;

import org.example.firstTask.Invoice;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("290922", "Invoice", 3, 30 );
        System.out.println( invoice.getInvoiceAmount(invoice.getQty(), invoice.getPrice()));

        Invoice  invoice1 = new Invoice("280922", "Invoice1", -1, 30);
        System.out.println( invoice1.getInvoiceAmount(invoice1.getQty(), invoice1.getPrice()));

        Invoice  invoice2 = new Invoice("270922", "Invoice2", 2, -2);
        System.out.println( invoice2.getInvoiceAmount(invoice2.getQty(), invoice2.getPrice()));
    }
}