package com.jetxperience.dto;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class DishesIngredients implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="id_dishes")
    private short idDishes;
    @Column(name="id_ingredients")
    private int idIngredients;

    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Column(nullable=false)
    private double quantity;
    @Column(nullable=false)
    private boolean isEssential;

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

    public int getIdIngredients() {
        return idIngredients;
    }

    public void setIdIngredients(int idIngredients) {
        this.idIngredients = idIngredients;
    }

    public Integer getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean getIsEssential() {
    	
        return isEssential;
    }

    public void setIsEssential(boolean isEssential) {
        this.isEssential = isEssential;
    }
}