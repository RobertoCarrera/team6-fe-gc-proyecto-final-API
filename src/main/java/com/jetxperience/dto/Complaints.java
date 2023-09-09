// Generated with g9.

package com.jetxperience.dto;

import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name="complaints")
public class Complaints{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    @Column(nullable=false, length=255)
    private String message;
    @Column(name="date_send", nullable=false)
    private LocalDate dateSend;
    
    @OneToMany(mappedBy = "complaint", fetch = FetchType.LAZY)
    private List<Answers> answers;
    
    @ManyToOne
    @JoinColumn(name = "sender")
    @JsonProperty("sender")
    private Users sender;

    public Complaints() {
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
        StringBuffer sb = new StringBuffer("[Complaints |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }
}