/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.earthsystemmodeling.oomph.createsyncproject.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.managedbuilder.internal.core.ToolChain;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.photran.internal.core.FProjectNature;
import org.eclipse.photran.internal.core.properties.SearchPathProperties;
import org.eclipse.ptp.internal.rdt.sync.cdt.ui.wizards.NewRemoteSyncProjectWizardOperation;
import org.eclipse.ptp.internal.rdt.sync.ui.SynchronizeParticipantRegistry;
import org.eclipse.ptp.rdt.sync.core.AbstractSyncFileFilter;
import org.eclipse.ptp.rdt.sync.core.SyncFlag;
import org.eclipse.ptp.rdt.sync.core.SyncManager;
import org.eclipse.ptp.rdt.sync.ui.AbstractSynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipantDescriptor;
import org.eclipse.remote.core.IRemoteConnection;
import org.eclipse.remote.core.IRemoteConnectionType;
import org.eclipse.remote.core.IRemoteServicesManager;
import org.eclipse.swt.widgets.Composite;

import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask;
import org.earthsystemmodeling.oomph.createsyncproject.FileFilter;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sync Project Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl#getRemoteConnectionName <em>Remote Connection Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl#getRemoteLocation <em>Remote Location</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl#getFileFilter <em>File Filter</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl#isEnableFortranAnalysis <em>Enable Fortran Analysis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSyncProjectTaskImpl extends SetupTaskImpl implements CreateSyncProjectTask
{

  public static final String PLUGIN_ID = "org.earthsystemmodeling.oomph.createsyncproject";

  /**
   * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected String projectName = PROJECT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRemoteConnectionName() <em>Remote Connection Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteConnectionName()
   * @generated
   * @ordered
   */
  protected static final String REMOTE_CONNECTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoteConnectionName() <em>Remote Connection Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteConnectionName()
   * @generated
   * @ordered
   */
  protected String remoteConnectionName = REMOTE_CONNECTION_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRemoteLocation() <em>Remote Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteLocation()
   * @generated
   * @ordered
   */
  protected static final String REMOTE_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoteLocation() <em>Remote Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteLocation()
   * @generated
   * @ordered
   */
  protected String remoteLocation = REMOTE_LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getFileFilter() <em>File Filter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileFilter()
   * @generated
   * @ordered
   */
  protected EList<FileFilter> fileFilter;

  /**
   * The default value of the '{@link #isEnableFortranAnalysis() <em>Enable Fortran Analysis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnableFortranAnalysis()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLE_FORTRAN_ANALYSIS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnableFortranAnalysis() <em>Enable Fortran Analysis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnableFortranAnalysis()
   * @generated
   * @ordered
   */
  protected boolean enableFortranAnalysis = ENABLE_FORTRAN_ANALYSIS_EDEFAULT;

  private static final int PRIORITY = PRIORITY_DEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateSyncProjectTaskImpl()
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
    return CreateSyncProjectPackage.Literals.CREATE_SYNC_PROJECT_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectName()
  {
    return projectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectName(String newProjectName)
  {
    String oldProjectName = projectName;
    projectName = newProjectName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME, oldProjectName, projectName));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRemoteConnectionName()
  {
    return remoteConnectionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoteConnectionName(String newRemoteConnectionName)
  {
    String oldRemoteConnectionName = remoteConnectionName;
    remoteConnectionName = newRemoteConnectionName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME, oldRemoteConnectionName,
          remoteConnectionName));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRemoteLocation()
  {
    return remoteLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoteLocation(String newRemoteLocation)
  {
    String oldRemoteLocation = remoteLocation;
    remoteLocation = newRemoteLocation;
    if (eNotificationRequired())
    {
      eNotify(
          new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION, oldRemoteLocation, remoteLocation));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FileFilter> getFileFilter()
  {
    if (fileFilter == null)
    {
      fileFilter = new EObjectContainmentEList<FileFilter>(FileFilter.class, this, CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__FILE_FILTER);
    }
    return fileFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnableFortranAnalysis()
  {
    return enableFortranAnalysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnableFortranAnalysis(boolean newEnableFortranAnalysis)
  {
    boolean oldEnableFortranAnalysis = enableFortranAnalysis;
    enableFortranAnalysis = newEnableFortranAnalysis;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__ENABLE_FORTRAN_ANALYSIS,
          oldEnableFortranAnalysis, enableFortranAnalysis));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__FILE_FILTER:
      return ((InternalEList<?>)getFileFilter()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME:
      return getProjectName();
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME:
      return getRemoteConnectionName();
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION:
      return getRemoteLocation();
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__FILE_FILTER:
      return getFileFilter();
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__ENABLE_FORTRAN_ANALYSIS:
      return isEnableFortranAnalysis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME:
      setProjectName((String)newValue);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME:
      setRemoteConnectionName((String)newValue);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION:
      setRemoteLocation((String)newValue);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__FILE_FILTER:
      getFileFilter().clear();
      getFileFilter().addAll((Collection<? extends FileFilter>)newValue);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__ENABLE_FORTRAN_ANALYSIS:
      setEnableFortranAnalysis((Boolean)newValue);
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
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME:
      setProjectName(PROJECT_NAME_EDEFAULT);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME:
      setRemoteConnectionName(REMOTE_CONNECTION_NAME_EDEFAULT);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION:
      setRemoteLocation(REMOTE_LOCATION_EDEFAULT);
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__FILE_FILTER:
      getFileFilter().clear();
      return;
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__ENABLE_FORTRAN_ANALYSIS:
      setEnableFortranAnalysis(ENABLE_FORTRAN_ANALYSIS_EDEFAULT);
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
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME:
      return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_CONNECTION_NAME:
      return REMOTE_CONNECTION_NAME_EDEFAULT == null ? remoteConnectionName != null : !REMOTE_CONNECTION_NAME_EDEFAULT.equals(remoteConnectionName);
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__REMOTE_LOCATION:
      return REMOTE_LOCATION_EDEFAULT == null ? remoteLocation != null : !REMOTE_LOCATION_EDEFAULT.equals(remoteLocation);
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__FILE_FILTER:
      return fileFilter != null && !fileFilter.isEmpty();
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__ENABLE_FORTRAN_ANALYSIS:
      return enableFortranAnalysis != ENABLE_FORTRAN_ANALYSIS_EDEFAULT;
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
    result.append(" (projectName: ");
    result.append(projectName);
    result.append(", remoteConnectionName: ");
    result.append(remoteConnectionName);
    result.append(", remoteLocation: ");
    result.append(remoteLocation);
    result.append(", enableFortranAnalysis: ");
    result.append(enableFortranAnalysis);
    result.append(')');
    return result.toString();
  }

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    IProject projectHandle = workspace.getRoot().getProject(getProjectName());
    return !projectHandle.exists();
  }

  @SuppressWarnings("restriction")
  public void perform(SetupTaskContext context) throws Exception
  {

    context.log("Creating synchronized project: " + getProjectName());

    IProgressMonitor monitor = context.getProgressMonitor(true);
    monitor.beginTask("Creating new synchronized project: " + getProjectName(), 10);

    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    IProject projectHandle = workspace.getRoot().getProject(getProjectName());
    IProjectDescription projectDesc = workspace.newProjectDescription(projectHandle.getName());

    IProject project = CCorePlugin.getDefault().createCDTProject(projectDesc, projectHandle, new SubProgressMonitor(monitor, 1));

    ICProjectDescriptionManager mngr = CoreModel.getDefault().getProjectDescriptionManager();
    ICProjectDescription des = mngr.createProjectDescription(project, false);
    ManagedProject mProj = new ManagedProject(des);

    // tool chains
    IToolChain[] tcs = ManagedBuildManager.getRealToolChains();
    IToolChain toolchain = null;
    for (IToolChain tc : tcs)
    {
      // Linux GCC --> cdt.managedbuild.toolchain.gnu.base
      // GCC Fortran --> photran.managedbuild.toolchain.gnu.fortran.exe.debug
      if (tc.getId().equals("org.eclipse.ptp.rdt.managedbuild.toolchain.gnu.base"))
      {
        toolchain = tc;
      }
    }
    assert toolchain != null;

    String configId = "org.earthsystemmodeling.cupid.config." + getProjectName().replaceAll("[^A-Za-z0-9]", "");
    Configuration cfg = new Configuration(mProj, (ToolChain)toolchain, configId, getProjectName() + " Configuration");

    IBuilder bld = cfg.getEditableBuilder();
    assert bld != null;
    assert bld.isInternalBuilder() == false;

    bld.setManagedBuildOn(false);

    CConfigurationData data = cfg.getConfigurationData();
    assert data != null;
    des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);

    CProjectNature.addCNature(project, new SubProgressMonitor(monitor, 1));
    FProjectNature.addFNature(project, new SubProgressMonitor(monitor, 1));

    // Persist the project description
    mngr.setProjectDescription(project, des);
    monitor.worked(1);

    // if requested, enable Fortran analysis
    if (isEnableFortranAnalysis())
    {
      SearchPathProperties spp = new SearchPathProperties();
      spp.setProperty(project, SearchPathProperties.ENABLE_VPG_PROPERTY_NAME, "true");
    }

    // make synchronized project

    monitor.subTask("Setting up project synchronization...");

    ISynchronizeParticipantDescriptor syncDescriptor = null;
    ISynchronizeParticipantDescriptor[] providers = SynchronizeParticipantRegistry.getDescriptors();
    for (ISynchronizeParticipantDescriptor p : providers)
    {
      if (p.getId().equals("org.eclipse.ptp.rdt.sync.git.ui.gitParticipant"))
      {
        syncDescriptor = p;
        break;
      }
    }

    if (syncDescriptor == null)
    {
      throw new Exception("Error creating synchronized project: unable to find Git sync participant.");
    }

    Set<String> localToolChains = new HashSet<String>();
    Set<String> remoteToolChains = new HashSet<String>();

    if (toolchain != null)
    {
      localToolChains.add(toolchain.getName());
      remoteToolChains.add(toolchain.getName());
    }

    // find remote connection by name
    assert getRemoteConnectionName() != null;
    assert getRemoteLocation() != null;

    IRemoteServicesManager remoteServicesManager = getRemoteServicesManager();
    if (remoteServicesManager == null)
    {
      throw new Exception("Error getting remote services manager.");
    }

    IRemoteConnectionType remoteConnType = remoteServicesManager.getConnectionType("org.eclipse.remote.JSch");
    if (remoteConnType == null)
    {
      throw new Exception("Erroring getting JSch connection type.");
    }

    final IRemoteConnection remoteConn = remoteConnType.getConnection(getRemoteConnectionName());
    if (remoteConn == null)
    {
      throw new Exception("Cannot find remote connection with name: " + getRemoteConnectionName());
    }

    ISynchronizeParticipant syncParticipant = new AbstractSynchronizeParticipant(syncDescriptor)
    {

      public void setProjectName(String projectName)
      {

      }

      public boolean isConfigComplete()
      {
        return true;
      }

      public String getSyncConfigName()
      {
        return remoteConn.getName();
      }

      public String getLocation()
      {
        return getRemoteLocation();
      }

      public String getErrorMessage()
      {
        // TODO Auto-generated method stub
        return null;
      }

      public IRemoteConnection getConnection()
      {
        return remoteConn;
      }

      public void createConfigurationArea(Composite parent, IRunnableContext context)
      {
        // TODO Auto-generated method stub

      }

    };

    AbstractSyncFileFilter fileFilter = SyncManager.getDefaultFileFilter();
    for (FileFilter ff : getFileFilter())
    {
      fileFilter.addPattern(ff.getPattern(), ff.isExclude());
    }

    NewRemoteSyncProjectWizardOperation.run(project, syncParticipant, fileFilter, localToolChains, remoteToolChains, new SubProgressMonitor(monitor, 2));

    // force a sync
    boolean firstSync = true; // context.getPrompter().getUserCallback().question("Perform an initial sync?");

    if (firstSync)
    {
      try
      {
        SyncManager.syncBlocking(null, project, SyncFlag.BOTH, new SubProgressMonitor(monitor, 7));
      }
      catch (CoreException ce)
      {
        String msg = "Could not perform initial synchronization for project " + getProjectName() + " with remote connection " + getRemoteConnectionName();
        context.log(msg);
        context.getPrompter().getUserCallback().information(false, msg);
      }
    }

    monitor.done();

    context.log("Done creating synchronized project");

  }

  @Override
  public void dispose()
  {
    // TODO Implement CreateSyncProjectTaskImpl.perform() or remove this override if not needed
  }

  private static IRemoteServicesManager getRemoteServicesManager()
  {
    BundleContext context = Platform.getBundle(PLUGIN_ID).getBundleContext();
    if (context == null)
    {
      return null;
    }
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

} // CreateSyncProjectTaskImpl
