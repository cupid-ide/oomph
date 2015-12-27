/**
 */
package org.earthsystemmodeling.oomph.createsyncproject;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Remote Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnection#getConnectionName <em>Connection Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnection#getHost <em>Host</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnection#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnection()
 * @model
 * @generated
 */
public interface CreateRemoteConnection extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Connection Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Name</em>' attribute.
   * @see #setConnectionName(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnection_ConnectionName()
   * @model required="true"
   * @generated
   */
  String getConnectionName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnection#getConnectionName <em>Connection Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection Name</em>' attribute.
   * @see #getConnectionName()
   * @generated
   */
  void setConnectionName(String value);

  /**
   * Returns the value of the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host</em>' attribute.
   * @see #setHost(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnection_Host()
   * @model required="true"
   * @generated
   */
  String getHost();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnection#getHost <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host</em>' attribute.
   * @see #getHost()
   * @generated
   */
  void setHost(String value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' attribute.
   * @see #setUsername(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnection_Username()
   * @model required="true"
   * @generated
   */
  String getUsername();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnection#getUsername <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' attribute.
   * @see #getUsername()
   * @generated
   */
  void setUsername(String value);
} // CreateRemoteConnection
