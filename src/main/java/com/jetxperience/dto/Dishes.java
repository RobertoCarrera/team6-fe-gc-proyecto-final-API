// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="dishes")
public class Dishes implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private short id;
    @Column(name="isActive", nullable=false)
    private boolean isActive;
    @Column(name="name", nullable=false, length=50)
    private String name;
    @Column(name="image", nullable=false, length=150)
    private String image;
    @Column(name="cost", nullable=false)
    private double cost;
    @Column(name="description", nullable=false, length=255)
    private String description;
    @Column(name="isRecommended")
    private boolean isRecommended;
    @Column(name="isSuggested")
    private boolean isSuggested;
    @Column(name="isHighlighted")
    private boolean isHighlighted;
    @Column(name="IsAvailable")
    private boolean isAvailable;
    @Column(name="stock")
    private Integer stock;
    
    @ManyToOne
    @JoinColumn(name = "category")
    private Categories category;
    
    @OneToMany(mappedBy = "idDishes", fetch = FetchType.LAZY)
    private List<DishesOrders> dishesOrders;

    @OneToMany(mappedBy = "idDishes", fetch = FetchType.LAZY)
    private List<DishesIngredients> dishesIngredients;

    public Dishes() {
    }
    
    public Dishes(boolean isActive, String name, String image, double cost, String description,
    		boolean isRommended, boolean isSuggested, boolean isHighlighted, boolean isAvailable, int stock) {
    	
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
    }

    public short getId() {
        return id;
    }

    public void setId(short aId) {
        id = aId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String aImage) {
        image = aImage;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double aCost) {
        cost = aCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public boolean getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(boolean aIsRecommended) {
        isRecommended = aIsRecommended;
    }

    public boolean getIsSuggested() {
        return isSuggested;
    }

    public void setIsSuggested(boolean aIsSuggested) {
        isSuggested = aIsSuggested;
    }

    public boolean getIsHighlighted() {
        return isHighlighted;
    }

    public void setIsHighlighted(boolean aIsHighlighted) {
        isHighlighted = aIsHighlighted;
    }

    public boolean getIsAvailable() {
    	
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
    	
    	isAvailable = isAvailable;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int aStock) {
        stock = aStock;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Dishes |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }
}