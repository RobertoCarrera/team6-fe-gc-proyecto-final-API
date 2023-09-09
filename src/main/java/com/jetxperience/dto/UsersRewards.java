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
@Table(name="users_rewards")
public class UsersRewards{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users idUsers;
    
    @ManyToOne
    @JoinColumn(name = "id_rewards")
    private Rewards idRewards;
    
    @Column(name="is_available", nullable=false)
    private boolean isAvailable;

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

    public Rewards getIdRewards() {
        return idRewards;
    }

    public void setIdRewards(Rewards idRewards) {
        this.idRewards = idRewards;
    }
    
    public boolean getIsAvailable() {
    	
        return isAvailable;
    }

    public void setIsAvailable(boolean newIsAvailable) {
    	
        this.isAvailable = newIsAvailable;
    }
}