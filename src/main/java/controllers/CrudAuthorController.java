/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.AuthorClient;
import models.Author;


/**
 *
 * @author hp
 */
public class CrudAuthorController {
    private AuthorClient client;

    public CrudAuthorController() {
        client = new AuthorClient();
    }

    public void createAuthor(int id, String lastName,String name) throws Exception {
        Author author = new Author(id, lastName,name);

        client.createAuthor(author);
    }
}
