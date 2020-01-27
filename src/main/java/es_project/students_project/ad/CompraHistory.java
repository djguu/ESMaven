package es_project.students_project.ad;


import es_project.students_project.user.User;

public class CompraHistory {
    private User user;
    private Compra[] compra;

    public CompraHistory(User user){
        this.user = user;
    }

    public Compra[] RetrieveCompraHistory(){
        //Goes to DB and puts every message in messages array
        //this.messages = DBGetAllMessages(this.user)
        return this.compra;
    }

    private void DBGetAllHistory(){
        User user = this.user;
        //connects to db using user
    }
}
