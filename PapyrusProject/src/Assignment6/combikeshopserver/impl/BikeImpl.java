/**
 */
package Assignment6.combikeshopserver.impl;

import Assignment6.combikeshopserver.Bike;
import Assignment6.combikeshopserver.CombikeshopserverPackage;
import Assignment6.combikeshopserver.Reservation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.impl.BikeImpl#getBikeId <em>Bike Id</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.BikeImpl#isAvailable <em>Is Available</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.BikeImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.BikeImpl#getUpdateBy <em>Update By</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.BikeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.BikeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BikeImpl extends MinimalEObjectImpl.Container implements Bike {
	/**
	 * The default value of the '{@link #getBikeId() <em>Bike Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeId()
	 * @generated
	 * @ordered
	 */
	protected static final long BIKE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBikeId() <em>Bike Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeId()
	 * @generated
	 * @ordered
	 */
	protected long bikeId = BIKE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvailable() <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvailable() <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean isAvailable = IS_AVAILABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected Reservation reservation;

	/**
	 * The default value of the '{@link #getUpdateBy() <em>Update By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateBy()
	 * @generated
	 * @ordered
	 */
	protected static final long UPDATE_BY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUpdateBy() <em>Update By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateBy()
	 * @generated
	 * @ordered
	 */
	protected long updateBy = UPDATE_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final long PRICE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected long price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombikeshopserverPackage.Literals.BIKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBikeId() {
		return bikeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBikeId(long newBikeId) {
		long oldBikeId = bikeId;
		bikeId = newBikeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.BIKE__BIKE_ID, oldBikeId, bikeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable() {
		return isAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAvailable(boolean newIsAvailable) {
		boolean oldIsAvailable = isAvailable;
		isAvailable = newIsAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.BIKE__IS_AVAILABLE, oldIsAvailable, isAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getReservation() {
		if (reservation != null && reservation.eIsProxy()) {
			InternalEObject oldReservation = (InternalEObject)reservation;
			reservation = (Reservation)eResolveProxy(oldReservation);
			if (reservation != oldReservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CombikeshopserverPackage.BIKE__RESERVATION, oldReservation, reservation));
			}
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(Reservation newReservation) {
		Reservation oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.BIKE__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUpdateBy() {
		return updateBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateBy(long newUpdateBy) {
		long oldUpdateBy = updateBy;
		updateBy = newUpdateBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.BIKE__UPDATE_BY, oldUpdateBy, updateBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(long newPrice) {
		long oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.BIKE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.BIKE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CombikeshopserverPackage.BIKE__BIKE_ID:
				return getBikeId();
			case CombikeshopserverPackage.BIKE__IS_AVAILABLE:
				return isAvailable();
			case CombikeshopserverPackage.BIKE__RESERVATION:
				if (resolve) return getReservation();
				return basicGetReservation();
			case CombikeshopserverPackage.BIKE__UPDATE_BY:
				return getUpdateBy();
			case CombikeshopserverPackage.BIKE__PRICE:
				return getPrice();
			case CombikeshopserverPackage.BIKE__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CombikeshopserverPackage.BIKE__BIKE_ID:
				setBikeId((Long)newValue);
				return;
			case CombikeshopserverPackage.BIKE__IS_AVAILABLE:
				setIsAvailable((Boolean)newValue);
				return;
			case CombikeshopserverPackage.BIKE__RESERVATION:
				setReservation((Reservation)newValue);
				return;
			case CombikeshopserverPackage.BIKE__UPDATE_BY:
				setUpdateBy((Long)newValue);
				return;
			case CombikeshopserverPackage.BIKE__PRICE:
				setPrice((Long)newValue);
				return;
			case CombikeshopserverPackage.BIKE__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CombikeshopserverPackage.BIKE__BIKE_ID:
				setBikeId(BIKE_ID_EDEFAULT);
				return;
			case CombikeshopserverPackage.BIKE__IS_AVAILABLE:
				setIsAvailable(IS_AVAILABLE_EDEFAULT);
				return;
			case CombikeshopserverPackage.BIKE__RESERVATION:
				setReservation((Reservation)null);
				return;
			case CombikeshopserverPackage.BIKE__UPDATE_BY:
				setUpdateBy(UPDATE_BY_EDEFAULT);
				return;
			case CombikeshopserverPackage.BIKE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CombikeshopserverPackage.BIKE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CombikeshopserverPackage.BIKE__BIKE_ID:
				return bikeId != BIKE_ID_EDEFAULT;
			case CombikeshopserverPackage.BIKE__IS_AVAILABLE:
				return isAvailable != IS_AVAILABLE_EDEFAULT;
			case CombikeshopserverPackage.BIKE__RESERVATION:
				return reservation != null;
			case CombikeshopserverPackage.BIKE__UPDATE_BY:
				return updateBy != UPDATE_BY_EDEFAULT;
			case CombikeshopserverPackage.BIKE__PRICE:
				return price != PRICE_EDEFAULT;
			case CombikeshopserverPackage.BIKE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CombikeshopserverPackage.BIKE___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bikeId: ");
		result.append(bikeId);
		result.append(", isAvailable: ");
		result.append(isAvailable);
		result.append(", updateBy: ");
		result.append(updateBy);
		result.append(", price: ");
		result.append(price);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BikeImpl
