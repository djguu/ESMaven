package es_project.students_project.contact;

import java.sql.Timestamp;

import static java.lang.Boolean.*;

public class Message {
    private Contact contact;
    private String timestamp;
    private String message;
    private Boolean read;

    public Message(Contact contact, String message){
        this.contact = contact;
        this.message = message;
        this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
        this.read = FALSE;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //Set message as read
    public void message_read(){
        if (this.read.equals(FALSE))
            this.read = TRUE;
    }

    //Verifies if message is read
    public boolean read(){
        return this.read;
    }
}
