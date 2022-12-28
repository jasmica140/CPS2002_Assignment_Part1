package com.demo.advertising.general_management.controllers.responses;
import com.demo.advertising.general_management.services.models.Adspace;

import java.time.LocalDate;
import java.util.List;

public class GetBookingResponse {

    private String customerId;
    private String bookingId;
    private String SpaceId;
    private String startingDate;
    private String noOfWeeks;

    private String price;
    private List<Adspace> adspace;

    public GetBookingResponse(String customerId, String bookingId, String SpaceId, String startingDate, String noOfWeeks, String price, List<Adspace> adspace) {
        this.customerId = customerId;
        this.bookingId = bookingId;
        this.SpaceId = SpaceId;
        this.startingDate= startingDate;
        this.noOfWeeks = noOfWeeks;
        this.price = price;
        this.adspace = adspace;
    }

    public GetBookingResponse() {
    }

    public String getSpaceId() {
        return SpaceId;
    }

    public void setSpaceId(String spaceId) {
        SpaceId = spaceId;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getNoOfWeeks() {
        return noOfWeeks;
    }

    public void setNoOfWeeks(String noOfWeeks) {
        this.noOfWeeks = noOfWeeks;
    }

    public List<Adspace> getAdspace() {
        return adspace;
    }

    public void setAdspace(List<Adspace> adspace) {
        this.adspace = adspace;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
