// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity(name="allergens")
public class Allergens implements Serializable {

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
    @Column(nullable=false)
    private boolean isActive;
    @Column(nullable=false, length=15)
    private String name;
    @Column(nullable=false, length=150)
    private String image;
   
    @OneToMany(mappedBy = "allergen", fetch = FetchType.LAZY)
    private List<Ingredients> ingredient;
    
    /** Default constructor. */
    public Allergens() {
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
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for image.
     *
     * @return the current value of image
     */
    public String getImage() {
        return image;
    }

    /**
     * Setter method for image.
     *
     * @param aImage the new value for image
     */
    public void setImage(String aImage) {
        image = aImage;
    }

    /**
     * Compares the key for this instance with another Allergens.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Allergens and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Allergens)) {
            return false;
        }
        Allergens that = (Allergens) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Allergens.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Allergens)) return false;
        return this.equalKeys(other) && ((Allergens)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Allergens |");
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
