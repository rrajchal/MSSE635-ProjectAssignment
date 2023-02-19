/**
 */
package Assignment6.combikeshopserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.Bike#getBikeId <em>Bike Id</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Bike#isAvailable <em>Is Available</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Bike#getReservation <em>Reservation</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Bike#getUpdateBy <em>Update By</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Bike#getPrice <em>Price</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Bike#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike()
 * @model
 * @generated
 */
public interface Bike extends EObject {
	/**
	 * Returns the value of the '<em><b>Bike Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike Id</em>' attribute.
	 * @see #setBikeId(long)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike_BikeId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getBikeId();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Bike#getBikeId <em>Bike Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike Id</em>' attribute.
	 * @see #getBikeId()
	 * @generated
	 */
	void setBikeId(long value);

	/**
	 * Returns the value of the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Available</em>' attribute.
	 * @see #setIsAvailable(boolean)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike_IsAvailable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Bike#isAvailable <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setIsAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike_Reservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Bike#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);

	/**
	 * Returns the value of the '<em><b>Update By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update By</em>' attribute.
	 * @see #setUpdateBy(long)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike_UpdateBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getUpdateBy();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Bike#getUpdateBy <em>Update By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update By</em>' attribute.
	 * @see #getUpdateBy()
	 * @generated
	 */
	void setUpdateBy(long value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(long)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getPrice();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Bike#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(long value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getBike_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Bike#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // Bike
