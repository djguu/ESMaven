package es_project.students_project.ad;

import es_project.students_project.user.User;
import es_project.students_project.vehicle.Vehicle;

public class Compra {
    private Ad ad;
    private User buyer;

    public Compra(){

    }

    private Ad getAd() {
        return ad;
    }

    public Vehicle getVehicle(){
        return getAd().getVehicle();
    }
}
