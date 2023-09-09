package com.jetxperience.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "ingredients")
public class Ingredients {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "allergen")
    @JsonProperty("allergen")
    private Allergens allergen;
    
    @OneToMany(mappedBy = "idIngredients", fetch = FetchType.LAZY)
    private List<DishesIngredients> dishesIngredients;
    
    @OneToMany(mappedBy = "idIngredients", fetch = FetchType.LAZY)
    private List<UsersIngredients> idUsers;

    // Constructores
    public Ingredients() {

    }

    public Ingredients(int id, String name, String image, int stock, Allergens allergen) {
        this.id = id;
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
        return "IngredientDTO [id=" + id + ", name=" + name + ", image=" + image + ", stock=" + stock + ", allergen=" + allergen + "]";
    }
}
