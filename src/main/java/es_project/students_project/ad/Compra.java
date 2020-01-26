package es_project.students_project.ad;

import es_project.students_project.Payment.Invoice;
import es_project.students_project.Payment.*;
import es_project.students_project.user.User;
import es_project.students_project.vehicle.Vehicle;

public class Compra<Payment> {
    private Ad ad;
    private User buyer;
    private Invoice invoice;
    private Payment payment;

    public Compra(Ad ad, User buyer, String payment_type){
       switch (payment_type){
           case "mbway": this.payment = (Payment) new MBWay(this); break;
           case "paypal": this.payment = (Payment) new Paypal(this); break;
           case "multibanco": this.payment = (Payment) new Multibanco(this); break;
           default: 
       }
    }

    private Ad getAd() {
        return ad;
    }

    public Vehicle getVehicle(){
        return getAd().getVehicle();
    }

    public void SendPayment(Invoice invoice) {

    }
}
