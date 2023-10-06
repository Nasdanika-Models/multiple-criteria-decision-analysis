/**
 */
package org.nasdanika.models.mcda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.mcda.Expert;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Judgment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.impl.JudgmentImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.JudgmentImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.JudgmentImpl#getExpert <em>Expert</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.JudgmentImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.JudgmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JudgmentImpl extends ModelElementImpl implements Judgment {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = Double.valueOf(1.0);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JudgmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McdaPackage.Literals.JUDGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(McdaPackage.JUDGMENT__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(McdaPackage.JUDGMENT__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expert getExpert() {
		return (Expert)eDynamicGet(McdaPackage.JUDGMENT__EXPERT, McdaPackage.Literals.JUDGMENT__EXPERT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expert basicGetExpert() {
		return (Expert)eDynamicGet(McdaPackage.JUDGMENT__EXPERT, McdaPackage.Literals.JUDGMENT__EXPERT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpert(Expert newExpert, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpert, McdaPackage.JUDGMENT__EXPERT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpert(Expert newExpert) {
		eDynamicSet(McdaPackage.JUDGMENT__EXPERT, McdaPackage.Literals.JUDGMENT__EXPERT, newExpert);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.mcda.Comparable> getTargets() {
		return (EList<org.nasdanika.models.mcda.Comparable>)eDynamicGet(McdaPackage.JUDGMENT__TARGETS, McdaPackage.Literals.JUDGMENT__TARGETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getValue() {
		return (Double)eDynamicGet(McdaPackage.JUDGMENT__VALUE, McdaPackage.Literals.JUDGMENT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		eDynamicSet(McdaPackage.JUDGMENT__VALUE, McdaPackage.Literals.JUDGMENT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McdaPackage.JUDGMENT__EXPERT:
				Expert expert = basicGetExpert();
				if (expert != null)
					msgs = ((InternalEObject)expert).eInverseRemove(this, McdaPackage.EXPERT__PROVIDED_JUDGMENTS, Expert.class, msgs);
				return basicSetExpert((Expert)otherEnd, msgs);
			case McdaPackage.JUDGMENT__TARGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McdaPackage.JUDGMENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case McdaPackage.JUDGMENT__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
			case McdaPackage.JUDGMENT__EXPERT:
				return basicSetExpert(null, msgs);
			case McdaPackage.JUDGMENT__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McdaPackage.JUDGMENT__DOCUMENTATION:
				return getDocumentation();
			case McdaPackage.JUDGMENT__CONTEXT_HELP:
				return getContextHelp();
			case McdaPackage.JUDGMENT__EXPERT:
				if (resolve) return getExpert();
				return basicGetExpert();
			case McdaPackage.JUDGMENT__TARGETS:
				return getTargets();
			case McdaPackage.JUDGMENT__VALUE:
				return getValue();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McdaPackage.JUDGMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case McdaPackage.JUDGMENT__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case McdaPackage.JUDGMENT__EXPERT:
				setExpert((Expert)newValue);
				return;
			case McdaPackage.JUDGMENT__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends org.nasdanika.models.mcda.Comparable>)newValue);
				return;
			case McdaPackage.JUDGMENT__VALUE:
				setValue((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case McdaPackage.JUDGMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case McdaPackage.JUDGMENT__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case McdaPackage.JUDGMENT__EXPERT:
				setExpert((Expert)null);
				return;
			case McdaPackage.JUDGMENT__TARGETS:
				getTargets().clear();
				return;
			case McdaPackage.JUDGMENT__VALUE:
				setValue(VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case McdaPackage.JUDGMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case McdaPackage.JUDGMENT__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case McdaPackage.JUDGMENT__EXPERT:
				return basicGetExpert() != null;
			case McdaPackage.JUDGMENT__TARGETS:
				return !getTargets().isEmpty();
			case McdaPackage.JUDGMENT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case McdaPackage.JUDGMENT__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case McdaPackage.JUDGMENT__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return McdaPackage.JUDGMENT__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return McdaPackage.JUDGMENT__CONTEXT_HELP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JudgmentImpl
