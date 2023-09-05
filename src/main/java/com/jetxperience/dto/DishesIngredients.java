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
    @JoinColumn(name = "id_dishes")
    private Dishes id_dishes;
    
    @ManyToOne
    @JoinColumn(name = "id_ingredients")
    private Ingredients id_ingredients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dishes getIdDishes() {
    	
        return id_dishes;
    }

    public void setIdDishes(Dishes idDishes) {
    	
        this.id_dishes = idDishes;
    }

    public Ingredients getIdIngredients() {
    	
        return id_ingredients;
    }

    public void setIdIngredients(Ingredients idIngredients) {
    	
        this.id_ingredients = idIngredients;
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