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
@Table(name = "hours_orders")
public class HoursOrders {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_hours")
    private Hours hours;

    @ManyToOne
    @JoinColumn(name = "id_orders")
    private Orders orders;

    // Constructores
    public HoursOrders() {

    }

    public HoursOrders(int id, Hours hours, Orders orders) {
        this.id = id;
        this.hours = hours;
        this.orders = orders;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hours getHours() {
        return hours;
    }

    public void setHours(Hours hours) {
        this.hours = hours;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "HoursOrdersDTO [id=" + id + ", hours=" + hours + ", orders=" + orders + "]";
    }
}
