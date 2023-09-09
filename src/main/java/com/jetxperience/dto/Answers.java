// Generated with g9.

package com.jetxperience.dto;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="answers")
public class Answers {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    @Column(nullable=false, length=255)
    private String message;
    @Column(name="date_send", nullable=false)
    private LocalDate dateSend;

    @ManyToOne
    @JoinColumn(name = "complaint")
    private Complaints complaint;

    public Answers() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int aId) {
        id = aId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }

    public LocalDate getDateSend() {
        return dateSend;
    }

    public void setDateSend(LocalDate aDateSend) {
        dateSend = aDateSend;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Answers |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }
}