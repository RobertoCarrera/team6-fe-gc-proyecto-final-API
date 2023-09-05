package com.jetxperience.dto;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="users_ingredients")
public class UsersIngredients implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Column(nullable=false)
    private boolean isAvailable;
    
    @Column(nullable=false)
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
