package ru.sssii.java.api.OOP2.Seminar.Task3;

public class Human {
    private Transport lastTransport;

    public void drive(Transport transport){
        lastTransport = transport;
        transport.start();
    }

    public void stop(){
        if(lastTransport!=null){
            lastTransport.stop();
            lastTransport=null;
        }else{
            System.out.println("Мы уже стоим");
        }
    }

}
