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
@Table(name = "dishes_orders")
public class DishesOrders {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_dish")
    private Dishes idDish;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Orders orders;

    @Column(name = "quantity")
    private int quantity;

    // Constructores
    public DishesOrders() {

    }

    public DishesOrders(int id, Dishes dishes, Orders orders, int quantity) {
        this.id = id;
        this.idDish = dishes;
        this.orders = orders;
        this.quantity = quantity;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dishes getDishes() {
        return idDish;
    }

    public void setDishes(Dishes dishes) {
        this.idDish = dishes;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DishesOrdersDTO [id=" + id + ", dishes=" + idDish + ", orders=" + orders + ", quantity=" + quantity + "]";
    }
}
