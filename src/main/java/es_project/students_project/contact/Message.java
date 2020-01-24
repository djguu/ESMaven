package es_project.students_project.contact;

import java.sql.Timestamp;

public class Message {
    private Contact contact;
    private String timestamp;
    private String message;
    private String read;

    public Message(Contact contact, String message){
        this.contact = contact;
        this.message = message;
        this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
        this.read = "0";
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

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }
}
