/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.BookClient;
import https.PublisherClient;
import java.io.IOException;
import java.util.List;
import models.Book;
import models.Publisher;

/**
 *
 * @author hp
 */
public class CrudBookController {
    private BookClient client;
    private PublisherClient clientP;

    public CrudBookController() {
        client = new BookClient();
        clientP= new PublisherClient();
    }

    public void createBook(String codigo, String nombre, String isbn, int stock, Publisher publisher) throws Exception {
        Book book = new Book(codigo, nombre,isbn,stock,publisher);

        client.createBook(book,publisher.getCode());
    }
    
    public List<Publisher> getAllPublisher() throws IOException{
        List<Publisher> publishers= clientP.getPublishers();
        
        return publishers;
    }
}
