/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.servlet;
import com.mycompany.mavenproject2.controllers.NoteController;
import com.mycompany.mavenproject2.Note;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author aset_
 */

@WebServlet(name = "NoteServlet", value = "/note/*")
public class NoteServlet extends HttpServlet {
    private NoteController noteController;

    @Override
    public void init() throws ServletException {
        super.init();
        noteController = new NoteController();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo == null || pathInfo.equals("/")) {
            // Main page - list all notes
            List<Note> notes = noteController.getAllNotes();
            request.setAttribute("notes", notes);
            request.getRequestDispatcher("/read.jsp").forward(request, response);
        } else if (pathInfo.startsWith("/add")) {
            // Display add note form
            request.getRequestDispatcher("/add.jsp").forward(request, response);
        } else if (pathInfo.startsWith("/edit")) {
            // Display edit note form
            String[] pathParts = pathInfo.split("/");
            int id = Integer.parseInt(pathParts[2]);
            Note note = noteController.getNoteById(id);
            request.setAttribute("note", note);
            request.getRequestDispatcher("/edit.jsp").forward(request, response);
        } else if (pathInfo.startsWith("/delete")) {
            // Delete note
            String[] pathParts = pathInfo.split("/");
            int id = Integer.parseInt(pathParts[2]);
            noteController.deleteNote(id);
            response.sendRedirect(request.getContextPath() + "/note");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo.startsWith("/add")) {
            // Add new note
            String title = request.getParameter("title");
            String text = request.getParameter("text");
            noteController.addNote(title, text);
            response.sendRedirect(request.getContextPath() + "/note");
        } else if (pathInfo.startsWith("/edit")) {
            // Edit existing note
            String[] pathParts = pathInfo.split("/");
            int id = Integer.parseInt(pathParts[2]);
            String title = request.getParameter("title");
            String text = request.getParameter("text");
            noteController.editNote(id, title, text);
            response.sendRedirect(request.getContextPath() + "/note");
        }
    }
}
