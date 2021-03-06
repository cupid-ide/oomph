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
package org.earthsystemmodeling.oomph.createsyncproject;

import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Sync Project Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteConnectionName <em>Remote Connection Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteLocation <em>Remote Location</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getFileFilter <em>File Filter</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#isEnableFortranAnalysis <em>Enable Fortran Analysis</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateSyncProjectTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface CreateSyncProjectTask extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateSyncProjectTask_ProjectName()
   * @model required="true"
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

  /**
   * Returns the value of the '<em><b>Remote Connection Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote Connection Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote Connection Name</em>' attribute.
   * @see #setRemoteConnectionName(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateSyncProjectTask_RemoteConnectionName()
   * @model required="true"
   * @generated
   */
  String getRemoteConnectionName();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteConnectionName <em>Remote Connection Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Connection Name</em>' attribute.
   * @see #getRemoteConnectionName()
   * @generated
   */
  void setRemoteConnectionName(String value);

  /**
   * Returns the value of the '<em><b>Remote Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote Location</em>' attribute.
   * @see #setRemoteLocation(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateSyncProjectTask_RemoteLocation()
   * @model required="true"
   * @generated
   */
  String getRemoteLocation();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#getRemoteLocation <em>Remote Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Location</em>' attribute.
   * @see #getRemoteLocation()
   * @generated
   */
  void setRemoteLocation(String value);

  /**
   * Returns the value of the '<em><b>File Filter</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Filter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Filter</em>' containment reference list.
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateSyncProjectTask_FileFilter()
   * @model containment="true"
   * @generated
   */
  EList<FileFilter> getFileFilter();

  /**
   * Returns the value of the '<em><b>Enable Fortran Analysis</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enable Fortran Analysis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable Fortran Analysis</em>' attribute.
   * @see #setEnableFortranAnalysis(boolean)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getCreateSyncProjectTask_EnableFortranAnalysis()
   * @model default="false" required="true"
   * @generated
   */
  boolean isEnableFortranAnalysis();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectTask#isEnableFortranAnalysis <em>Enable Fortran Analysis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable Fortran Analysis</em>' attribute.
   * @see #isEnableFortranAnalysis()
   * @generated
   */
  void setEnableFortranAnalysis(boolean value);

} // CreateSyncProjectTask
