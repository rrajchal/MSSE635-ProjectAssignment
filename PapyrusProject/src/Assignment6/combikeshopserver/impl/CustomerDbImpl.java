/**
 */
package Assignment6.combikeshopserver.impl;

import Assignment6.combikeshopclient.Customer;

import Assignment6.combikeshopserver.Bike;
import Assignment6.combikeshopserver.CombikeshopserverPackage;
import Assignment6.combikeshopserver.CustomerDb;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Db</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.impl.CustomerDbImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.impl.CustomerDbImpl#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerDbImpl extends MinimalEObjectImpl.Container implements CustomerDb {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getBike() <em>Bike</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBike()
	 * @generated
	 * @ordered
	 */
	protected Bike bike;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerDbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombikeshopserverPackage.Literals.CUSTOMER_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CombikeshopserverPackage.CUSTOMER_DB__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.CUSTOMER_DB__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike getBike() {
		if (bike != null && bike.eIsProxy()) {
			InternalEObject oldBike = (InternalEObject)bike;
			bike = (Bike)eResolveProxy(oldBike);
			if (bike != oldBike) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CombikeshopserverPackage.CUSTOMER_DB__BIKE, oldBike, bike));
			}
		}
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike basicGetBike() {
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBike(Bike newBike) {
		Bike oldBike = bike;
		bike = newBike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.CUSTOMER_DB__BIKE, oldBike, bike));
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
			case CombikeshopserverPackage.CUSTOMER_DB__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case CombikeshopserverPackage.CUSTOMER_DB__BIKE:
				if (resolve) return getBike();
				return basicGetBike();
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
			case CombikeshopserverPackage.CUSTOMER_DB__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case CombikeshopserverPackage.CUSTOMER_DB__BIKE:
				setBike((Bike)newValue);
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
			case CombikeshopserverPackage.CUSTOMER_DB__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case CombikeshopserverPackage.CUSTOMER_DB__BIKE:
				setBike((Bike)null);
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
			case CombikeshopserverPackage.CUSTOMER_DB__CUSTOMER:
				return customer != null;
			case CombikeshopserverPackage.CUSTOMER_DB__BIKE:
				return bike != null;
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
			case CombikeshopserverPackage.CUSTOMER_DB___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerDbImpl
