package com.encription.chatapp.Model;

import java.security.PrivateKey;

public class Chat {

    private String sender;
    private String receiver;
    private String message;
    private  String myMassage;
    private boolean isseen;



    public Chat(String sender, String receiver, String message,String myMassage, boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.myMassage = myMassage;
        this.isseen = isseen;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }
    public String getMyMassage() {
        return myMassage;
    }

    public void setMyMassage(String myMassage) {
        this.myMassage = myMassage;
    }
    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
