package es_project.students_project.user;

public class User {
    private String email;
    private String nome_completo;
    private String data_nascimento;
    private String password;
    private String nif;
    private String morada;
    private String telemovel;
    private Boolean admin;

    public User(){

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public void setData_nascimento(String data_nascimento) {
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

    public String getData_nascimento() {
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
}