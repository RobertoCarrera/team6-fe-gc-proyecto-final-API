// Generated with g9.

package com.jetxperience.dto;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="categories")
public class Categories {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private short id;
    @Column(nullable=false, length=20)
    private String name;
    
    @OneToMany(mappedBy = "category")
    private List<Dishes> dishes_list;
    
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Rewards> rewards;

    public Categories() {
        super();
    }
    public short getId() {
        return id;
    }

    public void setId(short aId) {
        id = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Categories |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }
}