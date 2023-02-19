// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Assignment6.com.bikeshop.server;

/************************************************************/
/**
 * 
 */
public class Bike {
	/**
	 * 
	 */
	public Long bikeId;
	/**
	 * 
	 */
	public Boolean isAvailable;
	/**
	 * 
	 */
	public Reservation reservation;
	/**
	 * 
	 */
	public Long updateBy;
	/**
	 * 
	 */
	public Long price;
	/**
	 * 
	 */
	public String description;

	/**
	 * 
	 */
	public void update() {
	}

	public Long getBikeId() {
		return bikeId;
	}

	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", isAvailable=" + isAvailable + ", reservation=" + reservation
				+ ", updateBy=" + updateBy + ", price=" + price + ", description=" + description + "]";
	}
	
	
}
