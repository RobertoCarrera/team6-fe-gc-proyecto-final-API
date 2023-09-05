// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity(name="allergens")
public class Allergens implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private short id;
    @Column(nullable=false)
    private boolean isActive;
    @Column(nullable=false, length=15)
    private String name;
    @Column(nullable=false, length=150)
    private String image;
   
    @OneToMany(mappedBy = "allergen", fetch = FetchType.LAZY)
    private List<Ingredients> ingredient;
    
    public Allergens() {
        super();
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

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Allergens |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }
}