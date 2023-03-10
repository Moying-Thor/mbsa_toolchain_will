/**
 */
package hazard.provider;

import hazard.util.Hazard_AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Hazard_ItemProviderAdapterFactory extends Hazard_AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard_ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.HazardPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardPackageItemProvider hazardPackageItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.HazardPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHazardPackageAdapter() {
		if (hazardPackageItemProvider == null) {
			hazardPackageItemProvider = new HazardPackageItemProvider(this);
		}

		return hazardPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.HazardPackageBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardPackageBindingItemProvider hazardPackageBindingItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.HazardPackageBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHazardPackageBindingAdapter() {
		if (hazardPackageBindingItemProvider == null) {
			hazardPackageBindingItemProvider = new HazardPackageBindingItemProvider(this);
		}

		return hazardPackageBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.HazardPackageInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardPackageInterfaceItemProvider hazardPackageInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.HazardPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHazardPackageInterfaceAdapter() {
		if (hazardPackageInterfaceItemProvider == null) {
			hazardPackageInterfaceItemProvider = new HazardPackageInterfaceItemProvider(this);
		}

		return hazardPackageInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.HazardousSituation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardousSituationItemProvider hazardousSituationItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.HazardousSituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHazardousSituationAdapter() {
		if (hazardousSituationItemProvider == null) {
			hazardousSituationItemProvider = new HazardousSituationItemProvider(this);
		}

		return hazardousSituationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.Cause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseItemProvider causeItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.Cause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCauseAdapter() {
		if (causeItemProvider == null) {
			causeItemProvider = new CauseItemProvider(this);
		}

		return causeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.ControlMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlMeasureItemProvider controlMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.ControlMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlMeasureAdapter() {
		if (controlMeasureItemProvider == null) {
			controlMeasureItemProvider = new ControlMeasureItemProvider(this);
		}

		return controlMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.VerificationofEffectiveness} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationofEffectivenessItemProvider verificationofEffectivenessItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.VerificationofEffectiveness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerificationofEffectivenessAdapter() {
		if (verificationofEffectivenessItemProvider == null) {
			verificationofEffectivenessItemProvider = new VerificationofEffectivenessItemProvider(this);
		}

		return verificationofEffectivenessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.Validation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationItemProvider validationItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.Validation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValidationAdapter() {
		if (validationItemProvider == null) {
			validationItemProvider = new ValidationItemProvider(this);
		}

		return validationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hazard.SafetyDecisionRationale} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyDecisionRationaleItemProvider safetyDecisionRationaleItemProvider;

	/**
	 * This creates an adapter for a {@link hazard.SafetyDecisionRationale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSafetyDecisionRationaleAdapter() {
		if (safetyDecisionRationaleItemProvider == null) {
			safetyDecisionRationaleItemProvider = new SafetyDecisionRationaleItemProvider(this);
		}

		return safetyDecisionRationaleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (hazardPackageItemProvider != null) hazardPackageItemProvider.dispose();
		if (hazardPackageBindingItemProvider != null) hazardPackageBindingItemProvider.dispose();
		if (hazardPackageInterfaceItemProvider != null) hazardPackageInterfaceItemProvider.dispose();
		if (hazardousSituationItemProvider != null) hazardousSituationItemProvider.dispose();
		if (causeItemProvider != null) causeItemProvider.dispose();
		if (controlMeasureItemProvider != null) controlMeasureItemProvider.dispose();
		if (verificationofEffectivenessItemProvider != null) verificationofEffectivenessItemProvider.dispose();
		if (validationItemProvider != null) validationItemProvider.dispose();
		if (safetyDecisionRationaleItemProvider != null) safetyDecisionRationaleItemProvider.dispose();
	}

}
