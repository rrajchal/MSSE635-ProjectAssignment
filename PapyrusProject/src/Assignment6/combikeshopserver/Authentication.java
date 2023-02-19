/**
 */
package Assignment6.combikeshopserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.Authentication#isAuthorized <em>Is Authorized</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getAuthentication()
 * @model
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorized</em>' attribute.
	 * @see #setIsAuthorized(boolean)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getAuthentication_IsAuthorized()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAuthorized();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.Authentication#isAuthorized <em>Is Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorized</em>' attribute.
	 * @see #isAuthorized()
	 * @generated
	 */
	void setIsAuthorized(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void authorize();

} // Authentication
