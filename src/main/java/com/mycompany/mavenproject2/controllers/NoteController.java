/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.controllers;

import com.mycompany.mavenproject2.Note;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aset_
 */
public class NoteController {
    private final List<Note> notes;

    public NoteController() {
        this.notes = new ArrayList<>();
    }

    public List<Note> getAllNotes() {
        return notes;
    }

    public void addNote(String title, String text) {
        Note note = new Note(title, text);
        notes.add(note);
    }

    public void editNote(int id, String title, String text) {
        if (id >= 0 && id < notes.size()) {
            Note note = notes.get(id);
            note.setTitle(title);
            note.setText(text);
        } else {
            throw new IllegalArgumentException("Invalid note id");
        }
    }

    public void deleteNote(int id) {
        if (id >= 0 && id < notes.size()) {
            notes.remove(id);
        } else {
            throw new IllegalArgumentException("Invalid note id");
        }
    }

    public Note getNoteById(int id) {
        if (id >= 0 && id < notes.size()) {
            return notes.get(id);
        } else {
            throw new IllegalArgumentException("Invalid note id");
        }
    }
}