// Generated with g9.

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
@Table(name = "orders")
public class Orders {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "total")
    private float total;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "status")
    private String status;

    @Column(name = "date_ordered")
    private String dateOrdered;

    @Column(name = "time_pick_up")
    private String timePickUp;

    @ManyToOne
    @JoinColumn(name = "user")
    private Users user;

    // Constructores
    public Orders() {

    }

    public Orders(int id, float total, Float discount, String status, String dateOrdered, String timePickUp, Users user) {
        this.id = id;
        this.total = total;
        this.discount = discount;
        this.status = status;
        this.dateOrdered = dateOrdered;
        this.timePickUp = timePickUp;
        this.user = user;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public String getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(String timePickUp) {
        this.timePickUp = timePickUp;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "OrdersDTO [id=" + id + ", total=" + total + ", discount=" + discount + ", status=" + status + ", dateOrdered=" + dateOrdered + ", timePickUp=" + timePickUp + ", user=" + user + "]";
    }
}