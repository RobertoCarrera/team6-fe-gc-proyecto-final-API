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
@Table(name = "users_allergens")
public class UsersAllergens {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "id_allergens")
    private Allergens allergens;

    // Constructores
    public UsersAllergens() {

    }

    public UsersAllergens(int id, Users users, Allergens allergens) {
        this.id = id;
        this.users = users;
        this.allergens = allergens;
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

    public Allergens getAllergens() {
        return allergens;
    }

    public void setAllergens(Allergens allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "UsersAllergensDTO [id=" + id + ", users=" + users + ", allergens=" + allergens + "]";
    }
}

