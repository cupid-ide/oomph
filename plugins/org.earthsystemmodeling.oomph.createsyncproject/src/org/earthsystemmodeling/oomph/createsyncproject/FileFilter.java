/**
 */
package org.earthsystemmodeling.oomph.createsyncproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter#isExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getFileFilter()
 * @model
 * @generated
 */
public interface FileFilter extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getFileFilter_Pattern()
   * @model required="true"
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude</em>' attribute.
   * @see #setExclude(boolean)
   * @see org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage#getFileFilter_Exclude()
   * @model default="true" required="true"
   * @generated
   */
  boolean isExclude();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.oomph.createsyncproject.FileFilter#isExclude <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' attribute.
   * @see #isExclude()
   * @generated
   */
  void setExclude(boolean value);

} // FileFilter
