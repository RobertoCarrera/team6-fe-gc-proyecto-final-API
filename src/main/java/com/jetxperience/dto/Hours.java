// Generated with g9.

package com.jetxperience.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hours")
public class Hours {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hour")
    private String hour;

    @Column(name = "isAvailable")
    private boolean isAvailable;
    
    @Column(name = "orders_counter")
    private int ordersCounter;

    // Constructores
    public Hours() {

    }

    public Hours(int id, String hour, boolean isAvailable, int newOrdersCounter) {
        this.id = id;
        this.hour = hour;
        this.isAvailable = isAvailable;
        this.ordersCounter = newOrdersCounter;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public int getOrdersCounter() {
        return id;
    }

    public void setOrdersCounter(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "HoursDTO [id=" + id + ", hour=" + hour + ", isAvailable=" + isAvailable + "order counter="+ordersCounter+"]";
    }
}
