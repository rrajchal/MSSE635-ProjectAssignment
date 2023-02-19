/**
 */
package Assignment6.combikeshopserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overwrite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.Overwrite#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getOverwrite()
 * @model
 * @generated
 */
public interface Overwrite extends EObject {
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
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getOverwrite_Bike()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bike getBike();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Overwrite#getBike <em>Bike</em>}' reference.
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
	void overwrite();

} // Overwrite
