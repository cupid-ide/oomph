/**
 */
package org.earthsystemmodeling.oomph.createsyncproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage;
import org.earthsystemmodeling.oomph.createsyncproject.FileFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.FileFilterImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.earthsystemmodeling.oomph.createsyncproject.impl.FileFilterImpl#isExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileFilterImpl extends MinimalEObjectImpl.Container implements FileFilter
{
  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected String pattern = PATTERN_EDEFAULT;

  /**
   * The default value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected boolean exclude = EXCLUDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileFilterImpl()
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
    return CreateSyncProjectPackage.Literals.FILE_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(String newPattern)
  {
    String oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.FILE_FILTER__PATTERN, oldPattern, pattern));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclude(boolean newExclude)
  {
    boolean oldExclude = exclude;
    exclude = newExclude;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, CreateSyncProjectPackage.FILE_FILTER__EXCLUDE, oldExclude, exclude));
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
    case CreateSyncProjectPackage.FILE_FILTER__PATTERN:
      return getPattern();
    case CreateSyncProjectPackage.FILE_FILTER__EXCLUDE:
      return isExclude();
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
    case CreateSyncProjectPackage.FILE_FILTER__PATTERN:
      setPattern((String)newValue);
      return;
    case CreateSyncProjectPackage.FILE_FILTER__EXCLUDE:
      setExclude((Boolean)newValue);
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
    case CreateSyncProjectPackage.FILE_FILTER__PATTERN:
      setPattern(PATTERN_EDEFAULT);
      return;
    case CreateSyncProjectPackage.FILE_FILTER__EXCLUDE:
      setExclude(EXCLUDE_EDEFAULT);
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
    case CreateSyncProjectPackage.FILE_FILTER__PATTERN:
      return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
    case CreateSyncProjectPackage.FILE_FILTER__EXCLUDE:
      return exclude != EXCLUDE_EDEFAULT;
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
    result.append(" (pattern: ");
    result.append(pattern);
    result.append(", exclude: ");
    result.append(exclude);
    result.append(')');
    return result.toString();
  }

} // FileFilterImpl
