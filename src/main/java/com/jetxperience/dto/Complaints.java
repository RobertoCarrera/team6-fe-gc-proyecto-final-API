// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="complaints")
public class Complaints implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    @Column(nullable=false, length=255)
    private String message;
    @Column(name="date_send", nullable=false)
    private LocalDate dateSend;
    
    @OneToMany(mappedBy = "complaints", fetch = FetchType.LAZY)
    private List<Answers> answers;
    
    @ManyToOne
    @JoinColumn(name = "sender")
    private Users sender;

    /** Default constructor. */
    public Complaints() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for message.
     *
     * @return the current value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for message.
     *
     * @param aMessage the new value for message
     */
    public void setMessage(String aMessage) {
        message = aMessage;
    }

    /**
     * Access method for dateSend.
     *
     * @return the current value of dateSend
     */
    public LocalDate getDateSend() {
        return dateSend;
    }

    /**
     * Setter method for dateSend.
     *
     * @param aDateSend the new value for dateSend
     */
    public void setDateSend(LocalDate aDateSend) {
        dateSend = aDateSend;
    }

    /**
     * Compares the key for this instance with another Complaints.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Complaints and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Complaints)) {
            return false;
        }
        Complaints that = (Complaints) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Complaints.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Complaints)) return false;
        return this.equalKeys(other) && ((Complaints)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Complaints |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
