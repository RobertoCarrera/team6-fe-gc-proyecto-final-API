// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity(name="orders")
public class Orders implements Serializable {

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
    @Column(nullable=false)
    private double total;
    private double discount;
    @Column(nullable=false, length=20)
    private String status;
    @Column(name="date_ordered", nullable=false)
    private LocalDate dateOrdered;
    @Column(name="time_pick_up", nullable=false)
    private LocalDate timePickUp;
    @Column(nullable=false)
    private short user;
    @Column(name="FOREIGN")
    private String foreign;

    /** Default constructor. */
    public Orders() {
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
     * Access method for total.
     *
     * @return the current value of total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Setter method for total.
     *
     * @param aTotal the new value for total
     */
    public void setTotal(double aTotal) {
        total = aTotal;
    }

    /**
     * Access method for discount.
     *
     * @return the current value of discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Setter method for discount.
     *
     * @param aDiscount the new value for discount
     */
    public void setDiscount(double aDiscount) {
        discount = aDiscount;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for dateOrdered.
     *
     * @return the current value of dateOrdered
     */
    public LocalDate getDateOrdered() {
        return dateOrdered;
    }

    /**
     * Setter method for dateOrdered.
     *
     * @param aDateOrdered the new value for dateOrdered
     */
    public void setDateOrdered(LocalDate aDateOrdered) {
        dateOrdered = aDateOrdered;
    }

    /**
     * Access method for timePickUp.
     *
     * @return the current value of timePickUp
     */
    public LocalDate getTimePickUp() {
        return timePickUp;
    }

    /**
     * Setter method for timePickUp.
     *
     * @param aTimePickUp the new value for timePickUp
     */
    public void setTimePickUp(LocalDate aTimePickUp) {
        timePickUp = aTimePickUp;
    }

    /**
     * Access method for user.
     *
     * @return the current value of user
     */
    public short getUser() {
        return user;
    }

    /**
     * Setter method for user.
     *
     * @param aUser the new value for user
     */
    public void setUser(short aUser) {
        user = aUser;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign() {
        return foreign;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign(String aForeign) {
        foreign = aForeign;
    }

    /**
     * Compares the key for this instance with another Orders.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Orders and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Orders)) {
            return false;
        }
        Orders that = (Orders) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Orders.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Orders)) return false;
        return this.equalKeys(other) && ((Orders)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Orders |");
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
