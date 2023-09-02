package com.jetxperience.dto;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class UsersRewards implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="id_users")
    private short idUsers;
    @Column(name="id_rewards")
    private int idRewards;

    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

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

    public int getIdRewards() {
        return idRewards;
    }

    public void setIdRewards(int idRewards) {
        this.idRewards = idRewards;
    }

    public Integer getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }
}
