/**
 */
package org.nasdanika.models.mcda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.mcda.Expert;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.impl.ExpertImpl#getProvidedJudgments <em>Provided Judgments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpertImpl extends ComparableImpl implements Expert {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McdaPackage.Literals.EXPERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getProvidedJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.EXPERT__PROVIDED_JUDGMENTS, McdaPackage.Literals.EXPERT__PROVIDED_JUDGMENTS, true, true);
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
			case McdaPackage.EXPERT__PROVIDED_JUDGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedJudgments()).basicAdd(otherEnd, msgs);
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
			case McdaPackage.EXPERT__PROVIDED_JUDGMENTS:
				return ((InternalEList<?>)getProvidedJudgments()).basicRemove(otherEnd, msgs);
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
			case McdaPackage.EXPERT__PROVIDED_JUDGMENTS:
				return getProvidedJudgments();
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
			case McdaPackage.EXPERT__PROVIDED_JUDGMENTS:
				getProvidedJudgments().clear();
				getProvidedJudgments().addAll((Collection<? extends Judgment>)newValue);
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
			case McdaPackage.EXPERT__PROVIDED_JUDGMENTS:
				getProvidedJudgments().clear();
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
			case McdaPackage.EXPERT__PROVIDED_JUDGMENTS:
				return !getProvidedJudgments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpertImpl
