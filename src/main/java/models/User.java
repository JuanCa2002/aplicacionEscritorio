/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author hp
 */
public class User {
    
    private String name;
    private String lastName;
    private String identification;

    public User() {
    }

    public User(String name, String lastName, String identification) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
    @Override
    public String toString() {
        return "User{" +
                " name='" + name +'\'' +
                ",lastName='" + lastName +'\'' +
                ",identification='" + identification +'\'' +
                '}';
    }
    
}
