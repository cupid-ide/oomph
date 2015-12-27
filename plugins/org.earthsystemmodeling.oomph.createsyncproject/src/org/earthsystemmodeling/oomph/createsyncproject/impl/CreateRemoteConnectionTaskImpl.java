/**
 */
package org.earthsystemmodeling.oomph.createsyncproject.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.remote.core.IRemoteConnectionType;
import org.eclipse.remote.core.IRemoteConnectionWorkingCopy;
import org.eclipse.remote.core.IRemoteServicesManager;
import org.eclipse.remote.internal.jsch.core.JSchConnection;

import org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Remote Connection Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl#getConnectionName <em>Connection Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateRemoteConnectionTaskImpl extends SetupTaskImpl implements CreateRemoteConnectionTask
{
  public static final String PLUGIN_ID = "org.earthsystemmodeling.oomph.createsyncproject";

  /**
   * The default value of the '{@link #getConnectionName() <em>Connection Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionName()
   * @generated
   * @ordered
   */
  protected static final String CONNECTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectionName() <em>Connection Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionName()
   * @generated
   * @ordered
   */
  protected String connectionName = CONNECTION_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected static final String HOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected String host = HOST_EDEFAULT;

  /**
   * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected static final String USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected String username = USERNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateRemoteConnectionTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CreateSyncProjectPackage.Literals.CREATE_REMOTE_CONNECTION_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnectionName()
  {
    return connectionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectionName(String newConnectionName)
  {
    String oldConnectionName = connectionName;
    connectionName = newConnectionName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME, oldConnectionName,
          connectionName));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHost()
  {
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHost(String newHost)
  {
    String oldHost = host;
    host = newHost;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__HOST, oldHost, host));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(String newUsername)
  {
    String oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__USERNAME, oldUsername, username));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME:
      return getConnectionName();
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__HOST:
      return getHost();
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__USERNAME:
      return getUsername();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME:
      setConnectionName((String)newValue);
      return;
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__HOST:
      setHost((String)newValue);
      return;
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__USERNAME:
      setUsername((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME:
      setConnectionName(CONNECTION_NAME_EDEFAULT);
      return;
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__HOST:
      setHost(HOST_EDEFAULT);
      return;
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__USERNAME:
      setUsername(USERNAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME:
      return CONNECTION_NAME_EDEFAULT == null ? connectionName != null : !CONNECTION_NAME_EDEFAULT.equals(connectionName);
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__HOST:
      return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__USERNAME:
      return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (connectionName: ");
    result.append(connectionName);
    result.append(", host: ");
    result.append(host);
    result.append(", username: ");
    result.append(username);
    result.append(')');
    return result.toString();
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#isNeeded(org.eclipse.oomph.setup.SetupTaskContext)
   */
  public boolean isNeeded(SetupTaskContext arg0) throws Exception
  {
    // TODO Auto-generated method stub
    return false;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#perform(org.eclipse.oomph.setup.SetupTaskContext)
   */
  public void perform(SetupTaskContext context) throws Exception
  {
    IProgressMonitor monitor = context.getProgressMonitor(true);
    context.log("Creating remote connection: " + getConnectionName());
    monitor.beginTask("Creating remote connection: " + getConnectionName(), 2);

    IRemoteServicesManager remoteServicesManager = getRemoteServicesManager();
    if (remoteServicesManager == null)
    {
      context.log("Cannot create remote connection because remote services are not installed.");
      monitor.done();
      return;
    }

    IRemoteConnectionType remoteConnType = remoteServicesManager.getConnectionType("org.eclipse.remote.JSch");
    if (remoteConnType == null)
    {
      context.log("Cannot create remote connection because the JSch connection type is not installed.");
      monitor.done();
      return;
    }

    monitor.worked(1);

    IRemoteConnectionWorkingCopy remoteConnWorkingCopy = null;

    if (remoteConnType.canAdd())
    {
      remoteConnWorkingCopy = remoteConnType.newConnection(getConnectionName());
      remoteConnWorkingCopy.setAttribute(JSchConnection.ADDRESS_ATTR, getHost());
      remoteConnWorkingCopy.setAttribute(JSchConnection.USERNAME_ATTR, getUsername());
      remoteConnWorkingCopy.setAttribute(JSchConnection.IS_PASSWORD_ATTR, "true");
      remoteConnWorkingCopy.save();
    }
    else
    {
      context.log("Cannot add remote connection.");
    }

    monitor.worked(1);
    monitor.done();

  }

  private static IRemoteServicesManager getRemoteServicesManager()
  {
    BundleContext context = Platform.getBundle(PLUGIN_ID).getBundleContext();
    ServiceReference<IRemoteServicesManager> ref = context.getServiceReference(IRemoteServicesManager.class);
    if (ref != null)
    {
      return context.getService(ref);
    }
    else
    {
      return null;
    }
  }

} // CreateRemoteConnectionTaskImpl
