/**
 */
package org.earthsystemmodeling.oomph.createsyncproject.provider;

import org.eclipse.oomph.setup.provider.SetupTaskItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask;
import org.earthsystemmodeling.oomph.createsyncproject.CreateSyncProjectPackage;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link org.earthsystemmodeling.oomph.createsyncproject.CreateRemoteConnectionTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateRemoteConnectionTaskItemProvider extends SetupTaskItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateRemoteConnectionTaskItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addConnectionNamePropertyDescriptor(object);
      addHostPropertyDescriptor(object);
      addUsernamePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Connection Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConnectionNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CreateRemoteConnectionTask_connectionName_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CreateRemoteConnectionTask_connectionName_feature", "_UI_CreateRemoteConnectionTask_type"),
        CreateSyncProjectPackage.Literals.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        null));
  }

  /**
   * This adds a property descriptor for the Host feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHostPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CreateRemoteConnectionTask_host_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CreateRemoteConnectionTask_host_feature", "_UI_CreateRemoteConnectionTask_type"),
        CreateSyncProjectPackage.Literals.CREATE_REMOTE_CONNECTION_TASK__HOST, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Username feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUsernamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CreateRemoteConnectionTask_username_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CreateRemoteConnectionTask_username_feature", "_UI_CreateRemoteConnectionTask_type"),
        CreateSyncProjectPackage.Literals.CREATE_REMOTE_CONNECTION_TASK__USERNAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This returns CreateRemoteConnectionTask.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateRemoteConnectionTask"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage()
  {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((CreateRemoteConnectionTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_CreateRemoteConnectionTask_type")
        : getString("_UI_CreateRemoteConnectionTask_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(CreateRemoteConnectionTask.class))
    {
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__CONNECTION_NAME:
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__HOST:
    case CreateSyncProjectPackage.CREATE_REMOTE_CONNECTION_TASK__USERNAME:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
