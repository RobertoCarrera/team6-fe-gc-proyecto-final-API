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
@Table(name = "dishes")
public class Dishes {

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

    @Column(name = "cost")
    private float cost;

    @Column(name = "description")
    private String description;

    @Column(name = "isRecommended")
    private boolean isRecommended;

    @Column(name = "isSuggested")
    private boolean isSuggested;

    @Column(name = "isHighlighted")
    private boolean isHighlighted;

    @Column(name = "IsAvailable")
    private boolean isAvailable;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "category")
    private Categories category;

    // Constructores
    public Dishes() {

    }

    public Dishes(int id, boolean isActive, String name, String image, float cost, String description,
            boolean isRecommended, boolean isSuggested, boolean isHighlighted, boolean isAvailable, int stock,
            Categories category) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.image = image;
        this.cost = cost;
        this.description = description;
        this.isRecommended = isRecommended;
        this.isSuggested = isSuggested;
        this.isHighlighted = isHighlighted;
        this.isAvailable = isAvailable;
        this.stock = stock;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRecommended() {
        return isRecommended;
    }

    public void setRecommended(boolean isRecommended) {
        this.isRecommended = isRecommended;
    }

    public boolean isSuggested() {
        return isSuggested;
    }

    public void setSuggested(boolean isSuggested) {
        this.isSuggested = isSuggested;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }

    public void setHighlighted(boolean isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "DishesDTO [id=" + id + ", isActive=" + isActive + ", name=" + name + ", image=" + image + ", cost="
                + cost + ", description=" + description + ", isRecommended=" + isRecommended + ", isSuggested="
                + isSuggested + ", isHighlighted=" + isHighlighted + ", isAvailable=" + isAvailable + ", stock="
                + stock + ", category=" + category + "]";
    }
}
