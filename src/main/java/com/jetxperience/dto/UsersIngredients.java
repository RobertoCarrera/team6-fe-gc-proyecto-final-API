package com.jetxperience.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_ingredients")
public class UsersIngredients {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "id_ingredients")
    private Ingredients ingredients;

    @Column(name = "isDisliked")
    private boolean isDisliked;

    // Constructores
    public UsersIngredients() {

    }

    public UsersIngredients(int id, Users users, Ingredients ingredients, boolean isDisliked) {
        this.id = id;
        this.users = users;
        this.ingredients = ingredients;
        this.isDisliked = isDisliked;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isDisliked() {
        return isDisliked;
    }

    public void setDisliked(boolean isDisliked) {
        this.isDisliked = isDisliked;
    }

    @Override
    public String toString() {
        return "UsersIngredientsDTO [id=" + id + ", users=" + users + ", ingredients=" + ingredients + ", isDisliked=" + isDisliked + "]";
    }
}
