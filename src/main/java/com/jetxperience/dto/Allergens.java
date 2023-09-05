// Generated with g9.

package com.jetxperience.dto;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "allergens")
public class Allergens {

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

    // Constructores
    public Allergens() {

    }

    public Allergens(int id, boolean isActive, String name, String image) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.image = image;
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

    @Override
    public String toString() {
        return "AllergensDTO [id=" + id + ", isActive=" + isActive + ", name=" + name + ", image=" + image + "]";
    }
}
