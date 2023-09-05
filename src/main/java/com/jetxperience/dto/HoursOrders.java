package com.jetxperience.dto;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="hours_orders")
public class HoursOrders implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @Column(name="id_hours")
    private short idHours;
    @Column(name="id_orders")
    private int idOrders;
    
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public short getIdHours() {
        return idHours;
    }

    public void setIdHours(short idHours) {
        this.idHours = idHours;
    }

    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    public Integer getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }
}