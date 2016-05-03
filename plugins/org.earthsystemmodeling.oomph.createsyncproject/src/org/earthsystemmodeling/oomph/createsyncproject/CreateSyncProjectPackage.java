/**
 */
package org.earthsystemmodeling.oomph.createsyncproject;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/cupid-ide/oomph/master/plugins/org.earthsystemmodeling.oomph.createsyncproject/model/CreateSyncProject.ecore'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='setup.createsyncproject.p2' repository='http://www.earthsystemmodeling.org/cupid/oomph/mars' installableUnits='org.earthsystemmodeling.oomph.createsyncproject.feature.group'"
 * @generated
 */
public interface CreateSyncProjectPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "createsyncproject";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/oomph/setup/createsyncproject/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "createsyncproject";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CreateSyncProjectPackage eINSTANCE = org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl.init();

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl
   * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl#getCreateSyncProjectTask()
   * @generated
   */
  int CREATE_SYNC_PROJECT_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__PROJECT_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Remote Connection Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Remote Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>File Filter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK__FILE_FILTER = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl <em>Create Remote Connection Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl
   * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl#getCreateRemoteConnectionTask()
   * @generated
   */
  int CREATE_REMOTE_CONNECTION_TASK = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Connection Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__HOST = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__USERNAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__PORT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Proxy Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__PROXY_CONNECTION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Proxy Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK__PROXY_COMMAND = SetupPackage.SETUP_TASK_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Create Remote Connection Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.earthsystemmodeling.oomph.createsyncproject.impl.FileFilterImpl <em>File Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemmodeling.oomph.createsyncproject.impl.FileFilterImpl
   * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl#getFileFilter()
   * @generated
   */
  int FILE_FILTER = 2;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FILTER__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Exclude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FILTER__EXCLUDE = 1;

  /**
   * The number of structural features of the '<em>File Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FILTER_FEATURE_COUNT = 2;

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask
   * @generated
   */
  EClass getCreateSyncProjectTask();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getProjectName()
   * @see #getCreateSyncProjectTask()
   * @generated
   */
  EAttribute getCreateSyncProjectTask_ProjectName();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteConnectionName <em>Remote Connection Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote Connection Name</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteConnectionName()
   * @see #getCreateSyncProjectTask()
   * @generated
   */
  EAttribute getCreateSyncProjectTask_RemoteConnectionName();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteLocation <em>Remote Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote Location</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteLocation()
   * @see #getCreateSyncProjectTask()
   * @generated
   */
  EAttribute getCreateSyncProjectTask_RemoteLocation();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getFileFilter <em>File Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>File Filter</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getFileFilter()
   * @see #getCreateSyncProjectTask()
   * @generated
   */
  EReference getCreateSyncProjectTask_FileFilter();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask <em>Create Remote Connection Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Remote Connection Task</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask
   * @generated
   */
  EClass getCreateRemoteConnectionTask();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getConnectionName <em>Connection Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connection Name</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getConnectionName()
   * @see #getCreateRemoteConnectionTask()
   * @generated
   */
  EAttribute getCreateRemoteConnectionTask_ConnectionName();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getHost()
   * @see #getCreateRemoteConnectionTask()
   * @generated
   */
  EAttribute getCreateRemoteConnectionTask_Host();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Username</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getUsername()
   * @see #getCreateRemoteConnectionTask()
   * @generated
   */
  EAttribute getCreateRemoteConnectionTask_Username();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getPort()
   * @see #getCreateRemoteConnectionTask()
   * @generated
   */
  EAttribute getCreateRemoteConnectionTask_Port();

  /**
   * Returns the meta object for the reference '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyConnection <em>Proxy Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Proxy Connection</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyConnection()
   * @see #getCreateRemoteConnectionTask()
   * @generated
   */
  EReference getCreateRemoteConnectionTask_ProxyConnection();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyCommand <em>Proxy Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proxy Command</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask#getProxyCommand()
   * @see #getCreateRemoteConnectionTask()
   * @generated
   */
  EAttribute getCreateRemoteConnectionTask_ProxyCommand();

  /**
   * Returns the meta object for class '{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter <em>File Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Filter</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.FileFilter
   * @generated
   */
  EClass getFileFilter();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.FileFilter#getPattern()
   * @see #getFileFilter()
   * @generated
   */
  EAttribute getFileFilter_Pattern();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter#isExclude <em>Exclude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclude</em>'.
   * @see org.earthsystemmodeling.oomph.createsyncproject.FileFilter#isExclude()
   * @see #getFileFilter()
   * @generated
   */
  EAttribute getFileFilter_Exclude();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CreateSyncProjectFactory getCreateSyncProjectFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl
     * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl#getCreateSyncProjectTask()
     * @generated
     */
    EClass CREATE_SYNC_PROJECT_TASK = eINSTANCE.getCreateSyncProjectTask();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_SYNC_PROJECT_TASK__PROJECT_NAME = eINSTANCE.getCreateSyncProjectTask_ProjectName();

    /**
     * The meta object literal for the '<em><b>Remote Connection Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME = eINSTANCE.getCreateSyncProjectTask_RemoteConnectionName();

    /**
     * The meta object literal for the '<em><b>Remote Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION = eINSTANCE.getCreateSyncProjectTask_RemoteLocation();

    /**
     * The meta object literal for the '<em><b>File Filter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_SYNC_PROJECT_TASK__FILE_FILTER = eINSTANCE.getCreateSyncProjectTask_FileFilter();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl <em>Create Remote Connection Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateRemoteConnectionTaskImpl
     * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl#getCreateRemoteConnectionTask()
     * @generated
     */
    EClass CREATE_REMOTE_CONNECTION_TASK = eINSTANCE.getCreateRemoteConnectionTask();

    /**
     * The meta object literal for the '<em><b>Connection Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME = eINSTANCE.getCreateRemoteConnectionTask_ConnectionName();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_REMOTE_CONNECTION_TASK__HOST = eINSTANCE.getCreateRemoteConnectionTask_Host();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_REMOTE_CONNECTION_TASK__USERNAME = eINSTANCE.getCreateRemoteConnectionTask_Username();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_REMOTE_CONNECTION_TASK__PORT = eINSTANCE.getCreateRemoteConnectionTask_Port();

    /**
     * The meta object literal for the '<em><b>Proxy Connection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_REMOTE_CONNECTION_TASK__PROXY_CONNECTION = eINSTANCE.getCreateRemoteConnectionTask_ProxyConnection();

    /**
     * The meta object literal for the '<em><b>Proxy Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_REMOTE_CONNECTION_TASK__PROXY_COMMAND = eINSTANCE.getCreateRemoteConnectionTask_ProxyCommand();

    /**
     * The meta object literal for the '{@link org.earthsystemmodeling.oomph.createsyncproject.impl.FileFilterImpl <em>File Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemmodeling.oomph.createsyncproject.impl.FileFilterImpl
     * @see org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectPackageImpl#getFileFilter()
     * @generated
     */
    EClass FILE_FILTER = eINSTANCE.getFileFilter();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_FILTER__PATTERN = eINSTANCE.getFileFilter_Pattern();

    /**
     * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_FILTER__EXCLUDE = eINSTANCE.getFileFilter_Exclude();

  }

} // CreateSyncProjectPackage
