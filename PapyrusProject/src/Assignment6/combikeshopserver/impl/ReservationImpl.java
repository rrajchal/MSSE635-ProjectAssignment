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
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.impl.ReservationImpl#getReservationDate <em>Reservation Date</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.ReservationImpl#getBikeId <em>Bike Id</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.ReservationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.ReservationImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
	/**
	 * The default value of the '{@link #getReservationDate() <em>Reservation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservationDate() <em>Reservation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationDate()
	 * @generated
	 * @ordered
	 */
	protected String reservationDate = RESERVATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBikeId() <em>Bike Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeId()
	 * @generated
	 * @ordered
	 */
	protected Bike bikeId;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombikeshopserverPackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReservationDate() {
		return reservationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationDate(String newReservationDate) {
		String oldReservationDate = reservationDate;
		reservationDate = newReservationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.RESERVATION__RESERVATION_DATE, oldReservationDate, reservationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike getBikeId() {
		if (bikeId != null && bikeId.eIsProxy()) {
			InternalEObject oldBikeId = (InternalEObject)bikeId;
			bikeId = (Bike)eResolveProxy(oldBikeId);
			if (bikeId != oldBikeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CombikeshopserverPackage.RESERVATION__BIKE_ID, oldBikeId, bikeId));
			}
		}
		return bikeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike basicGetBikeId() {
		return bikeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBikeId(Bike newBikeId) {
		Bike oldBikeId = bikeId;
		bikeId = newBikeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.RESERVATION__BIKE_ID, oldBikeId, bikeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.RESERVATION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.RESERVATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reserve() {
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
			case CombikeshopserverPackage.RESERVATION__RESERVATION_DATE:
				return getReservationDate();
			case CombikeshopserverPackage.RESERVATION__BIKE_ID:
				if (resolve) return getBikeId();
				return basicGetBikeId();
			case CombikeshopserverPackage.RESERVATION__START_DATE:
				return getStartDate();
			case CombikeshopserverPackage.RESERVATION__END_DATE:
				return getEndDate();
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
			case CombikeshopserverPackage.RESERVATION__RESERVATION_DATE:
				setReservationDate((String)newValue);
				return;
			case CombikeshopserverPackage.RESERVATION__BIKE_ID:
				setBikeId((Bike)newValue);
				return;
			case CombikeshopserverPackage.RESERVATION__START_DATE:
				setStartDate((String)newValue);
				return;
			case CombikeshopserverPackage.RESERVATION__END_DATE:
				setEndDate((String)newValue);
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
			case CombikeshopserverPackage.RESERVATION__RESERVATION_DATE:
				setReservationDate(RESERVATION_DATE_EDEFAULT);
				return;
			case CombikeshopserverPackage.RESERVATION__BIKE_ID:
				setBikeId((Bike)null);
				return;
			case CombikeshopserverPackage.RESERVATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CombikeshopserverPackage.RESERVATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case CombikeshopserverPackage.RESERVATION__RESERVATION_DATE:
				return RESERVATION_DATE_EDEFAULT == null ? reservationDate != null : !RESERVATION_DATE_EDEFAULT.equals(reservationDate);
			case CombikeshopserverPackage.RESERVATION__BIKE_ID:
				return bikeId != null;
			case CombikeshopserverPackage.RESERVATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case CombikeshopserverPackage.RESERVATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
			case CombikeshopserverPackage.RESERVATION___RESERVE:
				reserve();
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
		result.append(" (reservationDate: ");
		result.append(reservationDate);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
