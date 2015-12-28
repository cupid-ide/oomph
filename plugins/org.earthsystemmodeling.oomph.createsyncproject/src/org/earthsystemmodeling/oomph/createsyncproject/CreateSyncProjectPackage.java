/**
 */
package org.earthsystemmodeling.oomph.createsyncproject;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='setup.createsyncproject.p2' repository='file:/home/rocky/eclipse/cupiddev-v0-2/git/oomph/releng/org.earthsystemmodeling.oomph.releng.p2/target/repository' installableUnits='org.earthsystemmodeling.oomph.createsyncproject.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/base/LabelProvider imageBaseURI='http://git.eclipse.org/c/oomph/org.eclipse.oomph.git/plain/plugins/org.earthsystemmodeling.oomph.createsyncproject.edit/icons/full/obj16'"
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
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SYNC_PROJECT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

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
   * The number of structural features of the '<em>Create Remote Connection Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_REMOTE_CONNECTION_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

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

  }

} // CreateSyncProjectPackage
