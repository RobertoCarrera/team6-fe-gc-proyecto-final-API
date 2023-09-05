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
@Table(name = "ingredients")
public class Ingredients {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "allergen")
    private Allergens allergen;

    // Constructores
    public Ingredients() {

    }

    public Ingredients(int id, boolean isActive, String name, String image, int stock, Allergens allergen) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.image = image;
        this.stock = stock;
        this.allergen = allergen;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Allergens getAllergen() {
        return allergen;
    }

    public void setAllergen(Allergens allergen) {
        this.allergen = allergen;
    }

    @Override
    public String toString() {
        return "IngredientDTO [id=" + id + ", isActive=" + isActive + ", name=" + name + ", image=" + image + ", stock=" + stock + ", allergen=" + allergen + "]";
    }
}
