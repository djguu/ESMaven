package es_project.students_project.Payment;


import es_project.students_project.ad.Compra;

import java.sql.Timestamp;

class Payment {
    private Timestamp timestamp;
    private Invoice invoice;
    private Compra compra;


    Payment(Compra compra){
        this.compra = compra;
        setInvoice();
    }

    private boolean request_api_payment(){
        //Simular aqui ligaçao a api pagamento
        //Envia this.compra para API
        return Boolean.TRUE;
    }

    private void setInvoice(){
        if(request_api_payment()){
            this.invoice = new Invoice(this.compra);
        }
    }

    public Invoice getInvoice() {
        return invoice;
    }

    //TODO PENSAR BEM EM COMO IMPLEMENTAR O PAGAMENTO
    // FALTA TALVEZ FAZER SEARCH, COMPLETAR USER
    // TALVEZ FAZER LIGAÇOES A UM MOCKUP DE SITE / ADICIONAR AO MODELO EXISTENTE DO PROF

}
