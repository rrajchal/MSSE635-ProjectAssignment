/**
 */
package Assignment6.combikeshopserver;

import Assignment6.combikeshopclient.Customer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Db</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.CustomerDb#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.CustomerDb#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getCustomerDb()
 * @model
 * @generated
 */
public interface CustomerDb extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getCustomerDb_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.CustomerDb#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike</em>' reference.
	 * @see #setBike(Bike)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getCustomerDb_Bike()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bike getBike();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.CustomerDb#getBike <em>Bike</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike</em>' reference.
	 * @see #getBike()
	 * @generated
	 */
	void setBike(Bike value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // CustomerDb
