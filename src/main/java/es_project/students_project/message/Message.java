package es_project.students_project.message;

import es_project.students_project.user.User;


import java.sql.Timestamp;
import java.util.*;

public class Message {
    private User user;
    private User end_user;
    List<Map<String, String>> messages;

    public Message(User user, User end_user){
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

    public List<String> getMessages(){
        return messages;
//        return new String[][] {{"",""},{"",""}};
    }

    public void setMessages(List<Map<String, String>> messages) {
        // Suposto ir a bd buscar todas as mensagens com o estilo
        // {{user, message, timestamp, read},{user, message, timestamp, read}, {...}}
        this.messages = messages;
    }

    public void sendMessage(String text){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Map<String, String> map = Map.ofEntries()
                "user": this.user,
                "end_user": this.end_user,
                "message": text,
                "timestamp": timestamp,
                "read": 0,
        );
        this.messages.add(map);
    }
}
