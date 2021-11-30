/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author hp
 */
public class Borrow {
    
    private int id;
    private String idBook;
    private String idUser;

    public Borrow() {
    }

    public Borrow(int id, String idBook, String idUser) {
        this.id = id;
        this.idBook = idBook;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", bookId:'" + idBook +'\'' +
                ", userId:'" + idUser +'\'' +
                '}';
    }
    
}
