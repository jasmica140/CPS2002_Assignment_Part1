package com.demo.advertising.general_management.services.models;

import java.util.List;

public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String paymentDetails;

    public Customer(){

    }

    public Customer(String customerId, String name, String email, String phoneNumber, String paymentDetails) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.paymentDetails = paymentDetails;
    }

    public Customer(String name, String email, String phoneNumber, String paymentDetails) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.paymentDetails = paymentDetails;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

}
