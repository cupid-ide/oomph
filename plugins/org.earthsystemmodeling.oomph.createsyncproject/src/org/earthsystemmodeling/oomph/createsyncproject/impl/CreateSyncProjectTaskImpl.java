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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.photran.internal.core.FProjectNature;

import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sync Project Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.CreateSyncProjectTaskImpl#getProjectName <em>Project Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSyncProjectTaskImpl extends SetupTaskImpl implements CreateSyncProjectTask
{
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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME:
      return getProjectName();
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
    case CreateSyncProjectPackage.CREATE_SYNC_PROJECT_TASK__PROJECT_NAME:
      setProjectName((String)newValue);
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
    // TODO Implement CreateSyncProjectTaskImpl.isNeeded()
    return true;
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
      // System.out.println("Toolchain: " + tc.getName() + " : " + tc.getId());
      // Linux GCC --> cdt.managedbuild.toolchain.gnu.base
      // GCC Fortran --> photran.managedbuild.toolchain.gnu.fortran.exe.debug
      if (tc.getId().equals("org.eclipse.ptp.rdt.managedbuild.toolchain.gnu.base"))
      {
        toolchain = tc;
      }
    }
    assert toolchain != null;

    Configuration cfg = new Configuration(mProj, (ToolChain)toolchain, "org.earthsystemmodeling.cupid.config", "Cupid Configuration");

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

    monitor.done();
    context.log("Done creating synchronized project");
  }

  @Override
  public void dispose()
  {
    // TODO Implement CreateSyncProjectTaskImpl.perform() or remove this override if not needed
  }

} // CreateSyncProjectTaskImpl
