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
@Table(name = "users_dishes")
public class UsersDishes {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "id_dishes")
    private Dishes dishes;

    @Column(name = "is_available")
    private boolean isAvailable;

    // Constructores
    public UsersDishes() {

    }

    public UsersDishes(int id, Users users, Dishes dishes, boolean isAvailable) {
        this.id = id;
        this.users = users;
        this.dishes = dishes;
        this.isAvailable = isAvailable;
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

    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "UsersDishesDTO [id=" + id + ", users=" + users + ", dishes=" + dishes + ", isAvailable=" + isAvailable + "]";
    }
}
