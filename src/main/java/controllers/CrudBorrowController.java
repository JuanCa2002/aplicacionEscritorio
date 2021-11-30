/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.BookClient;
import https.BorrowClient;
import https.UserClient;
import java.io.IOException;
import java.util.List;
import models.Book;
import models.Borrow;
import models.User;

/**
 *
 * @author hp
 */
public class CrudBorrowController {
    private BorrowClient client;
    private UserClient clientU;
    private BookClient clientB;

    public CrudBorrowController() {
        client = new BorrowClient();
        clientU= new UserClient();
        clientB= new BookClient();
    }

    public void createBorrow(int id,String idBook,String idUser) throws Exception {
        Borrow borrow = new Borrow(id,idBook,idUser);

        client.createBorrow(borrow);
    }
    
    public void deleteBorrow(int idBorrow) throws Exception{
        client.deleteBorrow(idBorrow);
    }
    
    public List<User> getAllUsers() throws IOException{
        List<User> users= clientU.getUsers();
        return users;
    }
    
    public List<Book> getAllBooks() throws IOException{
        List<Book> books= clientB.getBooks();
        return books;
    } 
    
}
