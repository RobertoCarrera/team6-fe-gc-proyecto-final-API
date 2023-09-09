// Generated with g9.

package com.jetxperience.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rewards")
public class Rewards {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "cost")
    private int cost;

    @Column(name = "discount")
    private float discount;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "category")
    @JsonProperty("category")
    private Categories category;

    // Constructores
    public Rewards() {

    }

    public Rewards(int id, boolean isActive, String name, String description, int cost, float discount, String image, Categories category) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.discount = discount;
        this.image = image;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "RewardsDTO [id=" + id + ", isActive=" + isActive + ", name=" + name + ", description=" + description + ", cost=" + cost + ", discount=" + discount + ", image=" + image + ", category=" + category + "]";
    }
}
