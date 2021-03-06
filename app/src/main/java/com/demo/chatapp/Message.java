package com.demo.chatapp;

public class Message {
    private String author;
    private String textOfMessage;
    private long date;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }

    public Message(String author, String textOfMessage, long date) {
        this.author = author;
        this.textOfMessage = textOfMessage;
        this.date = date;
    }

    public Message() {
    }
}
