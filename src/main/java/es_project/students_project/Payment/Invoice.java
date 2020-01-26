package es_project.students_project.Payment;

import es_project.students_project.ad.Compra;
import es_project.students_project.user.User;
import es_project.students_project.vehicle.Vehicle;

public class Invoice {
    private Compra compra;

    Invoice(Compra compra)
    {
        this.compra = compra;
    }


    public Vehicle getVehicle() {
        return this.compra.getVehicle();
    }
}
