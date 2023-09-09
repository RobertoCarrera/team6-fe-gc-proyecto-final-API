// Generated with g9.

package com.jetxperience.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "image")
    private String image;

    @Column(name = "points")
    private int points;

    @ManyToOne
    @JoinColumn(name = "role")
    @JsonProperty("role")
    private Roles role;
    
    @OneToMany(mappedBy = "idUsers", fetch = FetchType.LAZY)
    private List<UsersIngredients> usersIngredients;

    // Constructores
    public Users() {

    }

    public Users(int id, boolean isActive, String name, String surname, String email, String password, String image, int points, Roles role) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.image = image;
        this.points = points;
        this.role = role;
    }

    // Métodos
    public int getId() {
    	
        return id;
    }

    public void setId(int id) {
    	
        this.id = id;
    }

    public boolean isActive() {
    	
        return isActive;
    }

    public void setActive(boolean isActive) {
    	
        this.isActive = isActive;
    }

    public String getName() {
    	
        return name;
    }

    public void setName(String name) {
    	
        this.name = name;
    }

    public String getSurname() {
    	
        return surname;
    }

    public void setSurname(String surname) {
    	
        this.surname = surname;
    }

    public String getEmail() {
    	
        return email;
    }

    public void setEmail(String newEmail) {
    	
        this.email = newEmail;
    }

    public String getPassword() {
    	
        return password;
    }

    public void setPassword(String password) {
    	
        this.password = password;
    }

    public String getImage() {
    	
        return image;
    }

    public void setImage(String image) {
    	
        this.image = image;
    }

    public int getPoints() {
    	
        return points;
    }

    public void setPoints(int points) {
    	
        this.points = points;
    }

    public Roles getRole() {
    	
        return role;
    }

    public void setRole(Roles role) {
    	
        this.role = role;
    }

    @Override
    public String toString() {
    	
        return "UsersDTO [id=" + id + ", isActive=" + isActive + ", name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password + ", image=" + image + ", points=" + points + ", role=" + role + "]";
    }
}

