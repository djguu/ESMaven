package es_project.students_project.user;

import es_project.students_project.ad.CompraHistory;
import es_project.students_project.contact.MessageHistory;

import java.util.Date;

import static java.lang.Boolean.*;

public class User {
    private String email;
    private String nome_completo;
    private Date data_nascimento;
    private String password;
    private String nif;
    private String morada;
    private String telemovel;
    private Boolean admin;
    private MessageHistory messageHistory;
    private CompraHistory compraHistory;
    //TODO Sistema guarda o historico de mensagens e transaçoes
    // maybe Registo + Login ? Rever opçao

    public User(String email){
        this.email = email;
        this.messageHistory = new MessageHistory(this);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public String getPassword() {
        return password;
    }

    public String getNif() {
        return nif;
    }

    public String getMorada() {
        return morada;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public Boolean exists(){
        //Simulation, connects to db with user and locates if exists
        //Model db = new Model(...)
//        if(db.getUser(this.user)){
//            this.password = db.getPassword();         // GETS PASSWORD FROM DB
              return TRUE;
//        }
//        return FALSE;
    }

    public Boolean passwordMatch(String password){
        if (this.password.equals(password)){
            return TRUE;
        }
        return FALSE;
    }
}
