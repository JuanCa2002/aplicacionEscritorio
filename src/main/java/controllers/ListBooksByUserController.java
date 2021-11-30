/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.UserClient;
import java.io.IOException;
import java.util.List;
import models.Book;

/**
 *
 * @author hp
 */
public class ListBooksByUserController {
    private UserClient client;

    public ListBooksByUserController() {
       client = new UserClient();
    }

    public List<Book> getBooksByUser(int idUser) throws IOException {
        return client.findBooksByUser(idUser);
    }
}
