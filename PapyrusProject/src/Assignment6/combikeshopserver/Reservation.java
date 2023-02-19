/**
 */
package Assignment6.combikeshopserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.Reservation#getReservationDate <em>Reservation Date</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Reservation#getBikeId <em>Bike Id</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Reservation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.Reservation#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Reservation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Date</em>' attribute.
	 * @see #setReservationDate(String)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getReservation_ReservationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getReservationDate();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Reservation#getReservationDate <em>Reservation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Date</em>' attribute.
	 * @see #getReservationDate()
	 * @generated
	 */
	void setReservationDate(String value);

	/**
	 * Returns the value of the '<em><b>Bike Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike Id</em>' reference.
	 * @see #setBikeId(Bike)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getReservation_BikeId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bike getBikeId();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Reservation#getBikeId <em>Bike Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike Id</em>' reference.
	 * @see #getBikeId()
	 * @generated
	 */
	void setBikeId(Bike value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getReservation_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Reservation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getReservation_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Reservation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reserve();

} // Reservation
