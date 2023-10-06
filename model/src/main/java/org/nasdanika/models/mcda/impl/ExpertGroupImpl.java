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
import org.nasdanika.models.mcda.ExpertGroup;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expert Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.impl.ExpertGroupImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.ExpertGroupImpl#getExpertJudgments <em>Expert Judgments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpertGroupImpl extends ExpertImpl implements ExpertGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpertGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McdaPackage.Literals.EXPERT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expert> getMembers() {
		return (EList<Expert>)eDynamicGet(McdaPackage.EXPERT_GROUP__MEMBERS, McdaPackage.Literals.EXPERT_GROUP__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getExpertJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.EXPERT_GROUP__EXPERT_JUDGMENTS, McdaPackage.Literals.EXPERT_GROUP__EXPERT_JUDGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McdaPackage.EXPERT_GROUP__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case McdaPackage.EXPERT_GROUP__EXPERT_JUDGMENTS:
				return ((InternalEList<?>)getExpertJudgments()).basicRemove(otherEnd, msgs);
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
			case McdaPackage.EXPERT_GROUP__MEMBERS:
				return getMembers();
			case McdaPackage.EXPERT_GROUP__EXPERT_JUDGMENTS:
				return getExpertJudgments();
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
			case McdaPackage.EXPERT_GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Expert>)newValue);
				return;
			case McdaPackage.EXPERT_GROUP__EXPERT_JUDGMENTS:
				getExpertJudgments().clear();
				getExpertJudgments().addAll((Collection<? extends Judgment>)newValue);
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
			case McdaPackage.EXPERT_GROUP__MEMBERS:
				getMembers().clear();
				return;
			case McdaPackage.EXPERT_GROUP__EXPERT_JUDGMENTS:
				getExpertJudgments().clear();
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
			case McdaPackage.EXPERT_GROUP__MEMBERS:
				return !getMembers().isEmpty();
			case McdaPackage.EXPERT_GROUP__EXPERT_JUDGMENTS:
				return !getExpertJudgments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpertGroupImpl
