package es_project.students_project.contact;

import es_project.students_project.user.User;

public class MessageHistory {
    private User user;
    private Message[] messages;

    public MessageHistory(User user){
        this.user = user;
    }

    public Message[] RetrieveMessageHistory(){
        //Goes to DB and puts every message in messages array
        //this.messages = DBGetAllMessages(this.user)
        return this.messages;
    }

    private void DBGetAllMessages(User user){
        //connects to db
    }
}
