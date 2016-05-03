/**
 */
package org.earthsystemmodeling.oomph.createsyncproject;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Remote Connection Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getConnectionName <em>Connection Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getHost <em>Host</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getUsername <em>Username</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getPort <em>Port</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyConnection <em>Proxy Connection</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyCommand <em>Proxy Command</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface CreateRemoteConnectionTask extends SetupTask
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
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask_ConnectionName()
   * @model required="true"
   * @generated
   */
  String getConnectionName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getConnectionName <em>Connection Name</em>}' attribute.
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
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask_Host()
   * @model required="true"
   * @generated
   */
  String getHost();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getHost <em>Host</em>}' attribute.
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
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask_Username()
   * @model required="true"
   * @generated
   */
  String getUsername();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getUsername <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' attribute.
   * @see #getUsername()
   * @generated
   */
  void setUsername(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * The default value is <code>"22"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask_Port()
   * @model default="22" required="true"
   * @generated
   */
  String getPort();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(String value);

  /**
   * Returns the value of the '<em><b>Proxy Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxy Connection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxy Connection</em>' reference.
   * @see #setProxyConnection(CreateRemoteConnectionTask)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask_ProxyConnection()
   * @model
   * @generated
   */
  CreateRemoteConnectionTask getProxyConnection();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyConnection <em>Proxy Connection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxy Connection</em>' reference.
   * @see #getProxyConnection()
   * @generated
   */
  void setProxyConnection(CreateRemoteConnectionTask value);

  /**
   * Returns the value of the '<em><b>Proxy Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxy Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxy Command</em>' attribute.
   * @see #setProxyCommand(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateRemoteConnectionTask_ProxyCommand()
   * @model
   * @generated
   */
  String getProxyCommand();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyCommand <em>Proxy Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxy Command</em>' attribute.
   * @see #getProxyCommand()
   * @generated
   */
  void setProxyCommand(String value);

} // CreateRemoteConnectionTask
