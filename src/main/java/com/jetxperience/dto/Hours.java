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
import jakarta.persistence.Table;

@Entity
@Table(name = "hours")
public class Hours {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hour")
    private String hour;

    @Column(name = "isAvailable")
    private boolean isAvailable;
    
	@OneToMany(mappedBy = "idHours", fetch = FetchType.LAZY)
	private List<HoursOrders> hoursOrders;

    // Constructores
    public Hours() {

    }

    public Hours(int id, String hour, boolean isAvailable) {
        this.id = id;
        this.hour = hour;
        this.isAvailable = isAvailable;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "HoursDTO [id=" + id + ", hour=" + hour + ", isAvailable=" + isAvailable + "]";
    }
}
