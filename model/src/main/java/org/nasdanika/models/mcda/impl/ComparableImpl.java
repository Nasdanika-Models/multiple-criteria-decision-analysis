/**
 */
package org.nasdanika.models.mcda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.impl.ComparableImpl#getReceivedJudgments <em>Received Judgments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComparableImpl extends DocumentedNamedElementImpl implements org.nasdanika.models.mcda.Comparable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McdaPackage.Literals.COMPARABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getReceivedJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS, McdaPackage.Literals.COMPARABLE__RECEIVED_JUDGMENTS, true, true);
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
			case McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivedJudgments()).basicAdd(otherEnd, msgs);
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
			case McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS:
				return ((InternalEList<?>)getReceivedJudgments()).basicRemove(otherEnd, msgs);
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
			case McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS:
				return getReceivedJudgments();
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
			case McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS:
				getReceivedJudgments().clear();
				getReceivedJudgments().addAll((Collection<? extends Judgment>)newValue);
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
			case McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS:
				getReceivedJudgments().clear();
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
			case McdaPackage.COMPARABLE__RECEIVED_JUDGMENTS:
				return !getReceivedJudgments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComparableImpl
