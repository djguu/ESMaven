package es_project.students_project;


import es_project.students_project.ad.Ad;
import es_project.students_project.contact.Contact;
import es_project.students_project.contact.Message;
import es_project.students_project.user.User;
import es_project.students_project.vehicle.Combustiveis;
import es_project.students_project.vehicle.Vehicle;

import javax.swing.table.DefaultTableModel;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import static java.lang.Boolean.*;

public class Website {
    private User user;
    private Vehicle vehicle;

    public Website(){

    }

    public void login(String email, String password){
        //enables user to login
        User user = new User(email);
        if (user.exists()){
            //------------
            user.setPassword(getMd5(password)); // this should not be here in final product, only for demonstration
            //------------
            if(user.passwordMatch(getMd5(password))){
                //logs person in
                System.out.println("ok");
            }
        }
    }

    public void register(String form /* should be a Form from GUI */){
        //enables user to register
        //Form would get every field
        //This is dummy data
        String email = "email";
        String nome_completo = "full_name";
        Date data_nascimento = new Date(1996-10-21);
        String password = getMd5("password");
        String nif = "nif";
        String morada = "morada";
        String telemovel = "telemovel";
        User user = new User(email);
        if (!user.exists()){
            user.setNome_completo(nome_completo);
            user.setData_nascimento(data_nascimento);
            user.setPassword(password);
            user.setNif(nif);
            user.setMorada(morada);
            user.setTelemovel(telemovel);
            user.setAdmin(FALSE);
            //System registers person
            //db.register(user)
        }
    }

    //form should send seller and message information
    public void contact(User seller, String form){
        Contact contact = new Contact(this.user, seller);
        Message message = new Message(contact, form);
        //when other user sees message
        message.setMessageRead();
    }

    //PURELY CONCEPT, MADE BY Prof. Doutor. Miguel Garcia
    public void getAllVehicles(DefaultTableModel dataTableModel, String brand, String model) {
//        dataTableModel.setColumnIdentifiers(Vehicle.getVehicleDefinition());
//        dataTableModel.addRow(Vehicle.getVehicleDefinition());
//        ResultSet rs = db.getAllVehicles(brand, model);
//        try {
//            while (rs.next()) {
                Vehicle vehicle = createVehicle(/*rs*/);
//                dataTableModel.addRow(vehicle.vehicleToArray());
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    //PURELY CONCEPT, MADE BY Prof. Doutor. Miguel Garcia
    private Vehicle createVehicle(/*ResultSet rs*/) {
        // creates a vehicle using the specific form data
        //Form would get every field
        //This is dummy data
        Vehicle vehicle = new Vehicle();
//        try {
            int id = 1;
            String marca = "marca";
            String modelo = "modelo";
            double cilindrada = 2.0;
            int cavalos = 120;
            double preco = 1000.0;
            int quilometros = 200000;
            java.sql.Date date = new Date(1996-10-21);
            String combustivel = "combustivel";
//            //ADICIONAR
            vehicle.setId(id);
            vehicle.setMarca(marca);
            vehicle.setModelo(modelo);
            vehicle.setCilindrada(cilindrada);
            vehicle.setCavalos(cavalos);
            vehicle.setPreco(preco);
            vehicle.setDate(date);
            vehicle.setQuilometros(quilometros);
            vehicle.setCombustivel(Combustiveis.valueOf(combustivel));

//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return vehicle;
    }

    public void createAd(/*Should be a form*/){
        // creates an ad using the specific form data
        //Form would get every field
        //This is dummy data
        Ad ad = new Ad();
        User owner = this.user;
        Vehicle vehicle = this.vehicle;
        String 
//            //ADICIONAR
        ad.setOwner();
        ad.setVehicle();
        ad.setDescription();
        ad.setPics();
        ad.setMain_pic();
    }

    //HASH PASSWORD
    public static String getMd5(String input) {
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
