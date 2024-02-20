/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Date;

/**
 *
 * @author aset_
 */
public class Note {
    private int id;
    private String title;
    private String text;
    private Date date;

    // Конструктор
    public Note() {
    }
    
    public Note(String title, String text) {
        this.title = title;
        this.text = text;
        this.date = new Date(); // Automatically set the date to the current date/time
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}