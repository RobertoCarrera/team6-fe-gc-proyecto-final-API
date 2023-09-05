// Generated with g9.

package com.jetxperience.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="ingredients")
public class Ingredients implements Serializable {

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
    private boolean isActive;
    @Column(nullable=false, length=50)
    private String name;
    @Column(length=150)
    private String image;
    private short stock;
    private short allergen;
    
    @OneToMany(mappedBy = "ingredients")
    private List<Allergens> allergens_list;

    /** Default constructor. */
    public Ingredients() {
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
     * Access method for stock.
     *
     * @return the current value of stock
     */
    public short getStock() {
        return stock;
    }

    /**
     * Setter method for stock.
     *
     * @param aStock the new value for stock
     */
    public void setStock(short aStock) {
        stock = aStock;
    }

    /**
     * Access method for allergen.
     *
     * @return the current value of allergen
     */
    public short getAllergen() {
        return allergen;
    }

    /**
     * Setter method for allergen.
     *
     * @param aAllergen the new value for allergen
     */
    public void setAllergen(short aAllergen) {
        allergen = aAllergen;
    }

    /**
     * Compares the key for this instance with another Ingredients.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Ingredients and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Ingredients)) {
            return false;
        }
        Ingredients that = (Ingredients) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Ingredients.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Ingredients)) return false;
        return this.equalKeys(other) && ((Ingredients)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Ingredients |");
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
