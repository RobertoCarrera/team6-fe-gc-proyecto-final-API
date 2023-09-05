package com.jetxperience.dto;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="dishes_orders")
public class DishesOrders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="id_dishes")
    private short idDishes;
    @Column(name="id_orders")
    private int idOrders;

    @Column(nullable=false)
    private double quantity;
    
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getIdDishes() {
        return idDishes;
    }

    public void setIdDishes(short idDishes) {
        this.idDishes = idDishes;
    }

    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    public Integer getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }
}
