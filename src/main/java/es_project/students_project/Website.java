package es_project.students_project;


import es_project.students_project.user.User;
import es_project.students_project.vehicle.Vehicle;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Website {
    private User user;

    public Website(){

    }

    public void login(String email, String password){
        //enables user to login
        User user = new User(email, password);
        if user.exists()
    }

    public void register(){
        //enables user to register
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
        Vehicle vehicle = new Vehicle();
//        try {
//            int id = rs.getInt("id");
//            String marca = rs.getString("marca");
//            String modelo = rs.getString("modelo");
//            double cilindrada = rs.getDouble("cilindrada");
//            int cavalos = rs.getInt("cavalos");
//            double preco = rs.getDouble("preco");
//            int quilometros = rs.getInt("quilometros");
//            java.sql.Date date = rs.getDate("ano");
//            String combustivel = rs.getString("combustivel");
//
//            //ADICIONAR
//            vehicle.setId(id);
//            vehicle.setMarca(marca);
//            vehicle.setModelo(modelo);
//            vehicle.setCilindrada(cilindrada);
//            vehicle.setCavalos(cavalos);
//            vehicle.setPreco(preco);
//            vehicle.setDate(date);
//            vehicle.setQuilometros(quilometros);
//            vehicle.setCombustivel(Combustiveis.valueOf(combustivel));

//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return vehicle;
    }

}
