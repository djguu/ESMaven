package es_project.students_project.vehicle;

public class Car extends Vehicle {
    private int nr_doors;
    private boolean ac;
    private String tejadilho;

    public Car(){

    }

    public int getNr_doors() {
        return nr_doors;
    }

    public void setNr_doors(int nr_doors) {
        this.nr_doors = nr_doors;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public String getTejadilho() {
        return tejadilho;
    }

    public void setTejadilho(String tejadilho) {
        this.tejadilho = tejadilho;
    }
}
