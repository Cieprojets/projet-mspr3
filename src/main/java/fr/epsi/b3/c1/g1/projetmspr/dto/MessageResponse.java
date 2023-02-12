package fr.epsi.b3.c1.g1.projetmspr.dto;

public class MessageResponse {

    private String message;

    public MessageResponse( String message ) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }
}
