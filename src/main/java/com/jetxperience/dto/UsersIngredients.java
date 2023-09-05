package com.jetxperience.dto;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity
public class UsersIngredients implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="id_users")
    private short idUsers;
    @Column(name="id_ingredients")
    private int idIngredients;

    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Column(nullable=false)
    private boolean isAvailable;
    
    @Column(nullable=false)
    private boolean isDisliked;
    
    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users id_users;
    
    @ManyToOne
    @JoinColumn(name = "id_ingredients")
    private Ingredients id_ingredients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(short idUsers) {
        this.idUsers = idUsers;
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

    public boolean isDisliked() {
        return isDisliked;
    }

    public void setAvailable(boolean isDisliked) {
        this.isDisliked = isDisliked;
    }
}
