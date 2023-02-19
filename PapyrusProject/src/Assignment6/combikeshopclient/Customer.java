/**
 */
package Assignment6.combikeshopclient;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopclient.Customer#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link Assignment6.combikeshopclient.Customer#getCustomerId <em>Customer Id</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Name</em>' attribute.
	 * @see #setCustomerName(String)
	 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getCustomer_CustomerName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopclient.Customer#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(long)
	 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getCustomer_CustomerId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCustomerId();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopclient.Customer#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(long value);

} // Customer
