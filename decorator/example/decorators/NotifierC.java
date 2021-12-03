package refactoring_guru.decorator.example.decorators;

import java.io.*;

public class NotifierC implements Notifier {
    private String correo;
    private String telefono;

    public NotifierC(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public void send(String message){
        //enviar message por correo
        //enviar message por sms
    }
}

