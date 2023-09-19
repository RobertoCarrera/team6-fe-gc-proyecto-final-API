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
@Table(name = "users_allergens")
public class UsersAllergens {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users idUsers;

    @ManyToOne
    @JoinColumn(name = "id_allergens")
    private Allergens idAllergens;
    
    @Column(name = "is_allergic")
    private boolean isAllergic;

    // Constructores
    public UsersAllergens() {

    }

    public UsersAllergens(int id, Users users, Allergens allergen, boolean isAllergic) {
        this.id = id;
        this.idUsers = users;
        this.idAllergens = allergen;
        this.isAllergic = isAllergic;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return idUsers;
    }

    public void setUsers(Users users) {
        this.idUsers = users;
    }

    public Allergens getAllergens() {
    	
        return idAllergens;
    }

    public void setAllergens(Allergens allergens) {
    	
        this.idAllergens = allergens;
    }
    
    public boolean getIsAllergic() {
    	
        return isAllergic;
    }

    public void setIsAllergic(boolean isAllergic) {
    	
        this.isAllergic = isAllergic;
    }

    @Override
    public String toString() {
        return "UsersAllergensDTO [id=" + id + ", users=" + idUsers + ", allergens=" + idAllergens + "]";
    }
}

