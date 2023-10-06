/**
 */
package org.nasdanika.models.mcda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.mcda.Alternative;
import org.nasdanika.models.mcda.Criterion;
import org.nasdanika.models.mcda.Evaluation;
import org.nasdanika.models.mcda.Expert;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.impl.EvaluationImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.EvaluationImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.EvaluationImpl#getExperts <em>Experts</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.EvaluationImpl#getExpertJudgments <em>Expert Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.EvaluationImpl#getCriteriaJudgments <em>Criteria Judgments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationImpl extends DocumentedNamedElementImpl implements Evaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McdaPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Criterion> getCriteria() {
		return (EList<Criterion>)eDynamicGet(McdaPackage.EVALUATION__CRITERIA, McdaPackage.Literals.EVALUATION__CRITERIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alternative> getAlternatives() {
		return (EList<Alternative>)eDynamicGet(McdaPackage.EVALUATION__ALTERNATIVES, McdaPackage.Literals.EVALUATION__ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expert> getExperts() {
		return (EList<Expert>)eDynamicGet(McdaPackage.EVALUATION__EXPERTS, McdaPackage.Literals.EVALUATION__EXPERTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getExpertJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.EVALUATION__EXPERT_JUDGMENTS, McdaPackage.Literals.EVALUATION__EXPERT_JUDGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getCriteriaJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.EVALUATION__CRITERIA_JUDGMENTS, McdaPackage.Literals.EVALUATION__CRITERIA_JUDGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McdaPackage.EVALUATION__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
			case McdaPackage.EVALUATION__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case McdaPackage.EVALUATION__EXPERTS:
				return ((InternalEList<?>)getExperts()).basicRemove(otherEnd, msgs);
			case McdaPackage.EVALUATION__EXPERT_JUDGMENTS:
				return ((InternalEList<?>)getExpertJudgments()).basicRemove(otherEnd, msgs);
			case McdaPackage.EVALUATION__CRITERIA_JUDGMENTS:
				return ((InternalEList<?>)getCriteriaJudgments()).basicRemove(otherEnd, msgs);
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
			case McdaPackage.EVALUATION__CRITERIA:
				return getCriteria();
			case McdaPackage.EVALUATION__ALTERNATIVES:
				return getAlternatives();
			case McdaPackage.EVALUATION__EXPERTS:
				return getExperts();
			case McdaPackage.EVALUATION__EXPERT_JUDGMENTS:
				return getExpertJudgments();
			case McdaPackage.EVALUATION__CRITERIA_JUDGMENTS:
				return getCriteriaJudgments();
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
			case McdaPackage.EVALUATION__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criterion>)newValue);
				return;
			case McdaPackage.EVALUATION__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends Alternative>)newValue);
				return;
			case McdaPackage.EVALUATION__EXPERTS:
				getExperts().clear();
				getExperts().addAll((Collection<? extends Expert>)newValue);
				return;
			case McdaPackage.EVALUATION__EXPERT_JUDGMENTS:
				getExpertJudgments().clear();
				getExpertJudgments().addAll((Collection<? extends Judgment>)newValue);
				return;
			case McdaPackage.EVALUATION__CRITERIA_JUDGMENTS:
				getCriteriaJudgments().clear();
				getCriteriaJudgments().addAll((Collection<? extends Judgment>)newValue);
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
			case McdaPackage.EVALUATION__CRITERIA:
				getCriteria().clear();
				return;
			case McdaPackage.EVALUATION__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case McdaPackage.EVALUATION__EXPERTS:
				getExperts().clear();
				return;
			case McdaPackage.EVALUATION__EXPERT_JUDGMENTS:
				getExpertJudgments().clear();
				return;
			case McdaPackage.EVALUATION__CRITERIA_JUDGMENTS:
				getCriteriaJudgments().clear();
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
			case McdaPackage.EVALUATION__CRITERIA:
				return !getCriteria().isEmpty();
			case McdaPackage.EVALUATION__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case McdaPackage.EVALUATION__EXPERTS:
				return !getExperts().isEmpty();
			case McdaPackage.EVALUATION__EXPERT_JUDGMENTS:
				return !getExpertJudgments().isEmpty();
			case McdaPackage.EVALUATION__CRITERIA_JUDGMENTS:
				return !getCriteriaJudgments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluationImpl
