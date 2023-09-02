// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity(name="hours")
public class Hours implements Serializable {

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
    private short id;
    private LocalTime hour;
    private boolean isAvailable;

    /** Default constructor. */
    public Hours() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public short getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(short aId) {
        id = aId;
    }

    /**
     * Access method for hour.
     *
     * @return the current value of hour
     */
    public LocalTime getHour() {
        return hour;
    }

    /**
     * Setter method for hour.
     *
     * @param aHour the new value for hour
     */
    public void setHour(LocalTime aHour) {
        hour = aHour;
    }

    /**
     * Access method for isAvailable.
     *
     * @return true if and only if isAvailable is currently true
     */
    public boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * Setter method for isAvailable.
     *
     * @param aIsAvailable the new value for isAvailable
     */
    public void setIsAvailable(boolean aIsAvailable) {
        isAvailable = aIsAvailable;
    }

    /**
     * Compares the key for this instance with another Hours.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Hours and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Hours)) {
            return false;
        }
        Hours that = (Hours) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Hours.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Hours)) return false;
        return this.equalKeys(other) && ((Hours)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Hours |");
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
        ret.put("id", Short.valueOf(getId()));
        return ret;
    }

}
