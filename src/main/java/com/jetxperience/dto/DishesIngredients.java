package com.jetxperience.dto;

import java.io.Serializable;

import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity
public class DishesIngredients implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Column(nullable=false)
    private double quantity;
    @Column(nullable=false)
    private boolean isEssential;
    
    @ManyToOne
    @JoinColumn(name = "id_dish")
    private Dishes idDish;
    
    @ManyToOne
    @JoinColumn(name = "id_ingredient")
    private Ingredients idIngredient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dishes getIdDishes() {
    	
        return idDish;
    }

    public void setIdDishes(Dishes idDishes) {
    	
        this.idDish = idDishes;
    }

    public Ingredients getIdIngredients() {
    	
        return idIngredient;
    }

    public void setIdIngredients(Ingredients idIngredients) {
    	
        this.idIngredient = idIngredients;
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