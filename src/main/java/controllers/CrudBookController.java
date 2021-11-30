/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.BookClient;
import models.Book;
import models.Publisher;

/**
 *
 * @author hp
 */
public class CrudBookController {
    private BookClient client;

    public CrudBookController() {
        client = new BookClient();
    }

    public void createBook(String codigo, String nombre, String isbn, int stock, int codePublisher) throws Exception {
        Book book = new Book(codigo, nombre,isbn,stock,codePublisher);

        client.createBook(book,codePublisher);
    }
}
