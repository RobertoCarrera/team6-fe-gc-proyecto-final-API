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
@Table(name="users_ingredients")
public class UsersIngredients{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="disliked_counter")
    private int dislikedCounter;
    
    @Column(name="is_disliked", nullable=false)
    private boolean isDisliked;
    
    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users idUsers;
    
    @ManyToOne
    @JoinColumn(name = "id_ingredients")
    private Ingredients idIngredients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Users idUsers) {
        this.idUsers = idUsers;
    }

    public Ingredients getIdIngredients() {
        return idIngredients;
    }

    public void setIdIngredients(Ingredients idIngredients) {
        this.idIngredients = idIngredients;
    }

    public void getIsDisliked(boolean newIsDisliked) {
    	
        this.isDisliked= newIsDisliked ;
    }
    
    public boolean setIsDisliked() {
    	
        return isDisliked;
    }

    public void getDislikedCounter(int newDislikedCounter) {
    	
        this.dislikedCounter= newDislikedCounter ;
    }
    
    public int setDislikedCounter() {
    	
        return dislikedCounter;
    }
}
