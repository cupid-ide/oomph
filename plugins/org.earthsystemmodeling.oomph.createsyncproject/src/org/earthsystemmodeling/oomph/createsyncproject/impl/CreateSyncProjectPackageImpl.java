/**
 */
package org.earthsystemmodeling.oomph.createsyncproject.impl;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectFactory;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateSyncProjectPackageImpl extends EPackageImpl implements CreateSyncProjectPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createSyncProjectTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createRemoteConnectionTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CreateSyncProjectPackageImpl()
  {
    super(eNS_URI, CreateSyncProjectFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link CreateSyncProjectPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CreateSyncProjectPackage init()
  {
    if (isInited)
    {
      return (CreateSyncProjectPackage)EPackage.Registry.INSTANCE.getEPackage(CreateSyncProjectPackage.eNS_URI);
    }

    // Obtain or create and register package
    CreateSyncProjectPackageImpl theCreateSyncProjectPackage = (CreateSyncProjectPackageImpl)(EPackage.Registry.INSTANCE
        .get(eNS_URI) instanceof CreateSyncProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CreateSyncProjectPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCreateSyncProjectPackage.createPackageContents();

    // Initialize created meta-data
    theCreateSyncProjectPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCreateSyncProjectPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CreateSyncProjectPackage.eNS_URI, theCreateSyncProjectPackage);
    return theCreateSyncProjectPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateSyncProjectTask()
  {
    return createSyncProjectTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateSyncProjectTask_ProjectName()
  {
    return (EAttribute)createSyncProjectTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateRemoteConnectionTask()
  {
    return createRemoteConnectionTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateRemoteConnectionTask_ConnectionName()
  {
    return (EAttribute)createRemoteConnectionTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateRemoteConnectionTask_Host()
  {
    return (EAttribute)createRemoteConnectionTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateRemoteConnectionTask_Username()
  {
    return (EAttribute)createRemoteConnectionTaskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateSyncProjectFactory getCreateSyncProjectFactory()
  {
    return (CreateSyncProjectFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    createSyncProjectTaskEClass = createEClass(CREATE_SYNC_PROJECT_TASK);
    createEAttribute(createSyncProjectTaskEClass, CREATE_SYNC_PROJECT_TASK__PROJECT_NAME);

    createRemoteConnectionTaskEClass = createEClass(CREATE_REMOTE_CONNECTION_TASK);
    createEAttribute(createRemoteConnectionTaskEClass, CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME);
    createEAttribute(createRemoteConnectionTaskEClass, CREATE_REMOTE_CONNECTION_TASK__HOST);
    createEAttribute(createRemoteConnectionTaskEClass, CREATE_REMOTE_CONNECTION_TASK__USERNAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    createSyncProjectTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());
    createRemoteConnectionTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(createSyncProjectTaskEClass, CreateSyncProjectTask.class, "CreateSyncProjectTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateSyncProjectTask_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, CreateSyncProjectTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createRemoteConnectionTaskEClass, CreateRemoteConnectionTask.class, "CreateRemoteConnectionTask", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateRemoteConnectionTask_ConnectionName(), ecorePackage.getEString(), "connectionName", null, 1, 1, CreateRemoteConnectionTask.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateRemoteConnectionTask_Host(), ecorePackage.getEString(), "host", null, 1, 1, CreateRemoteConnectionTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateRemoteConnectionTask_Username(), ecorePackage.getEString(), "username", null, 1, 1, CreateRemoteConnectionTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(
        "https://raw.githubusercontent.com/cupid-ide/oomph/master/plugins/org.earthsystemmodeling.oomph.createsyncproject/model/CreateSyncProject.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/base/LabelProvider
    createLabelProviderAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation",
        "https://raw.githubusercontent.com/cupid-ide/oomph/master/plugins/org.earthsystemmodeling.oomph.createsyncproject/model/CreateSyncProject.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(this, source,
        new String[] { "variableName", "setup.createsyncproject.p2", "repository",
            "file:/home/rocky/eclipse/cupiddev-v0-2/git/oomph/releng/org.earthsystemmodeling.oomph.releng.p2/target/repository", "installableUnits",
            "org.earthsystemmodeling.oomph.createsyncproject.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/base/LabelProvider</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createLabelProviderAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/base/LabelProvider";
    addAnnotation(this, source, new String[] { "imageBaseURI",
        "http://git.eclipse.org/c/oomph/org.eclipse.oomph.git/plain/plugins/org.earthsystemmodeling.oomph.createsyncproject.edit/icons/full/obj16" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(createSyncProjectTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
    addAnnotation(createRemoteConnectionTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
  }

} // CreateSyncProjectPackageImpl