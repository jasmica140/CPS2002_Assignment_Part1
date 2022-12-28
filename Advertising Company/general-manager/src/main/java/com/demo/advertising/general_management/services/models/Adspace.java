package com.demo.advertising.general_management.services.models;

public class Adspace{

    private String SpaceId;
    private String Popularity;     //people viewing space per day
    private String Type;        //billboard, buses, benches
    private String Size;           //size of advertising space
    private String Price;          //cost to rent space per week
    private String Location;    //town/park where ad space is
    private String BusRoute;       //bus route


    public Adspace(String popularity, String type, String size, String price, String location, String busRoute) {
        Popularity = popularity;
        Type = type;
        Size = size;
        Price = price;
        Location = location;
        BusRoute = busRoute;
    }

    public String getSpaceId() {
        return SpaceId;
    }

    public void setSpaceId(String SpaceId) {this.SpaceId = SpaceId;}

    public String getPopularity() { return Popularity; }

    public void setPopularity(String Popularity) {
        this.Popularity = Popularity;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getBusRoute() {
        return BusRoute;
    }

    public void setBusRoute(String BusRoute) {
        this.BusRoute = BusRoute;
    }

}

