package com.pockocmoc.notesapp.models;

public class Note {
    private String content;
    private String timestamp;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Note() {
    }

    public Note(String content, String timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }
}
