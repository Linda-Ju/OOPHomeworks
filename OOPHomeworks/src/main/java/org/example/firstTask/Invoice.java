package org.example.firstTask;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int qty;
    private int price;
    public Invoice(String partNumber, String partDescription, int qty, int price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.qty = qty;
        this.price = price;
    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInvoiceAmount(int qty, int price){
        if(qty < 0 ){
            qty = 0;
        }else if (price < 0){
            price = 0;
        }
        int totalAmount = qty*price;
        return totalAmount;
    }
}
