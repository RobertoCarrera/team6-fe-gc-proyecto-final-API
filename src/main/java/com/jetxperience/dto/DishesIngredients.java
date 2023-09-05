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
@Table(name = "dishes_ingredients")
public class DishesIngredients {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_dishes")
    private Dishes dishes;

    @ManyToOne
    @JoinColumn(name = "id_ingredients")
    private Ingredients ingredients;

    @Column(name = "quantity")
    private float quantity;

    @Column(name = "isEssential")
    private boolean isEssential;

    // Constructores
    public DishesIngredients() {

    }

    public DishesIngredients(int id, Dishes dishes, Ingredients ingredients, float quantity, boolean isEssential) {
        this.id = id;
        this.dishes = dishes;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.isEssential = isEssential;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean isEssential() {
        return isEssential;
    }

    public void setEssential(boolean isEssential) {
        this.isEssential = isEssential;
    }

    @Override
    public String toString() {
        return "DishesIngredientsDTO [id=" + id + ", dishes=" + dishes + ", ingredients=" + ingredients + ", quantity="
                + quantity + ", isEssential=" + isEssential + "]";
    }
}