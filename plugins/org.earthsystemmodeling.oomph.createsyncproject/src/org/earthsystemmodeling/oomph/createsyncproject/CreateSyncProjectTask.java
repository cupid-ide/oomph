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

} // CreateSyncProjectTask
