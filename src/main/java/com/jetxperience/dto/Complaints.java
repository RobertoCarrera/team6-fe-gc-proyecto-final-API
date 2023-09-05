// Generated with g9.

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
@Table(name = "complaints")
public class Complaints {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "message")
    private String message;

    @Column(name = "date_send")
    private String dateSend;

    @ManyToOne
    @JoinColumn(name = "sender")
    private Users sender;

    // Constructores
    public Complaints() {

    }

    public Complaints(int id, String message, String dateSend, Users sender) {
        this.id = id;
        this.message = message;
        this.dateSend = dateSend;
        this.sender = sender;
    }

    // Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateSend() {
        return dateSend;
    }

    public void setDateSend(String dateSend) {
        this.dateSend = dateSend;
    }

    public Users getSender() {
        return sender;
    }

    public void setSender(Users sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "ComplaintsDTO [id=" + id + ", message=" + message + ", dateSend=" + dateSend + ", sender=" + sender + "]";
    }
}