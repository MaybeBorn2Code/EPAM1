package HomeWork;


import lesson.AbstractProduct;
import lesson.AbstractShop;

import java.util.ArrayList;


public class ElectronicStore extends AbstractShop {

    private java.util.List<lesson.AbstractProduct> products = new ArrayList();
    private String workingHours;
    private String address;
    private double summary;

    public ElectronicStore(String workingHours, String address) {
        this.workingHours = workingHours;
        this.address = address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addQuantity(AbstractProduct product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(product);
        }
    }


    public void soldToCustomer(AbstractProduct product) {
        this.products.add(product);
    }

    public void sumOfSold() {
        for (AbstractProduct product : products) {
            summary += product.getPrice();
        }
        System.out.println("Summary of sold electronics - " + summary + "$");
    }
}








