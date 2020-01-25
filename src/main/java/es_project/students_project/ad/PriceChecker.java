package es_project.students_project.ad;

import es_project.students_project.vehicle.Vehicle;

public class PriceChecker {
    private Vehicle vehicle;
    private double market_price;

    public PriceChecker(Vehicle vehicle){
        this.vehicle = vehicle;
    }

     private void requestMarketPrice(){
        //sends getVehicle() to a priceChecking API
         this.market_price = 10000.0;   //made up marketPrice
     }

     public double getMarket_price(){
         requestMarketPrice();
         return this.market_price;
     }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
