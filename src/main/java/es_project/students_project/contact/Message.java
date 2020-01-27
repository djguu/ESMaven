package es_project.students_project.contact;

import java.sql.Timestamp;

import static java.lang.Boolean.*;

public class Message {
    private Contact contact;
    private Timestamp timestamp;
    private String message;
    private Boolean read;

    public Message(Contact contact, String message){
        this.contact = contact;
        this.message = message;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.read = FALSE;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //Set message as read
    public void setMessageRead(){
        if (this.read.equals(FALSE))
            this.read = TRUE;
    }

    //Verifies if message is read
    public boolean read(){
        return this.read;
    }
}
