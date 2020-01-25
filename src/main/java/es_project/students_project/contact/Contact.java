package es_project.students_project.contact;

import es_project.students_project.user.User;


import java.util.*;

import static java.lang.Boolean.*;

public class Contact {
    private User user;
    private User end_user;
    List<Message> messages;

    public Contact(User user, User end_user){
        setUser(user);
        setEnd_user(end_user);
    }

    public User getUser() {
        return user;
    }

    public User getEnd_user() {
        return end_user;
    }

    private void setUser(User user) {
        this.user = user;
    }

    private void setEnd_user(User end_user) {
        this.end_user = end_user;
    }

    public List<Message> getMessages(){
        return messages;
    }

    // Update messages list
    public void updateMessages(List<Message> messages) {
        this.messages = messages;
    }
}
