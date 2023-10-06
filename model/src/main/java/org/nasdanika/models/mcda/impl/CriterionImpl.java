/**
 */
package org.nasdanika.models.mcda.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.mcda.Criterion;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.impl.CriterionImpl#getSubCriteria <em>Sub Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.CriterionImpl#getExpertJudgments <em>Expert Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.CriterionImpl#isInheritExpertWeights <em>Inherit Expert Weights</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.CriterionImpl#getSubCriteriaJudgments <em>Sub Criteria Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.CriterionImpl#getAlternativeJudgments <em>Alternative Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.impl.CriterionImpl#getAlternativeFormula <em>Alternative Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriterionImpl extends ComparableImpl implements Criterion {
	/**
	 * The default value of the '{@link #isInheritExpertWeights() <em>Inherit Expert Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritExpertWeights()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_EXPERT_WEIGHTS_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getAlternativeFormula() <em>Alternative Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_FORMULA_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McdaPackage.Literals.CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Criterion> getSubCriteria() {
		return (EList<Criterion>)eDynamicGet(McdaPackage.CRITERION__SUB_CRITERIA, McdaPackage.Literals.CRITERION__SUB_CRITERIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getExpertJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.CRITERION__EXPERT_JUDGMENTS, McdaPackage.Literals.CRITERION__EXPERT_JUDGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInheritExpertWeights() {
		return (Boolean)eDynamicGet(McdaPackage.CRITERION__INHERIT_EXPERT_WEIGHTS, McdaPackage.Literals.CRITERION__INHERIT_EXPERT_WEIGHTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritExpertWeights(boolean newInheritExpertWeights) {
		eDynamicSet(McdaPackage.CRITERION__INHERIT_EXPERT_WEIGHTS, McdaPackage.Literals.CRITERION__INHERIT_EXPERT_WEIGHTS, newInheritExpertWeights);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getSubCriteriaJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.CRITERION__SUB_CRITERIA_JUDGMENTS, McdaPackage.Literals.CRITERION__SUB_CRITERIA_JUDGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Judgment> getAlternativeJudgments() {
		return (EList<Judgment>)eDynamicGet(McdaPackage.CRITERION__ALTERNATIVE_JUDGMENTS, McdaPackage.Literals.CRITERION__ALTERNATIVE_JUDGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlternativeFormula() {
		return (String)eDynamicGet(McdaPackage.CRITERION__ALTERNATIVE_FORMULA, McdaPackage.Literals.CRITERION__ALTERNATIVE_FORMULA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternativeFormula(String newAlternativeFormula) {
		eDynamicSet(McdaPackage.CRITERION__ALTERNATIVE_FORMULA, McdaPackage.Literals.CRITERION__ALTERNATIVE_FORMULA, newAlternativeFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McdaPackage.CRITERION__SUB_CRITERIA:
				return ((InternalEList<?>)getSubCriteria()).basicRemove(otherEnd, msgs);
			case McdaPackage.CRITERION__EXPERT_JUDGMENTS:
				return ((InternalEList<?>)getExpertJudgments()).basicRemove(otherEnd, msgs);
			case McdaPackage.CRITERION__SUB_CRITERIA_JUDGMENTS:
				return ((InternalEList<?>)getSubCriteriaJudgments()).basicRemove(otherEnd, msgs);
			case McdaPackage.CRITERION__ALTERNATIVE_JUDGMENTS:
				return ((InternalEList<?>)getAlternativeJudgments()).basicRemove(otherEnd, msgs);
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
			case McdaPackage.CRITERION__SUB_CRITERIA:
				return getSubCriteria();
			case McdaPackage.CRITERION__EXPERT_JUDGMENTS:
				return getExpertJudgments();
			case McdaPackage.CRITERION__INHERIT_EXPERT_WEIGHTS:
				return isInheritExpertWeights();
			case McdaPackage.CRITERION__SUB_CRITERIA_JUDGMENTS:
				return getSubCriteriaJudgments();
			case McdaPackage.CRITERION__ALTERNATIVE_JUDGMENTS:
				return getAlternativeJudgments();
			case McdaPackage.CRITERION__ALTERNATIVE_FORMULA:
				return getAlternativeFormula();
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
			case McdaPackage.CRITERION__SUB_CRITERIA:
				getSubCriteria().clear();
				getSubCriteria().addAll((Collection<? extends Criterion>)newValue);
				return;
			case McdaPackage.CRITERION__EXPERT_JUDGMENTS:
				getExpertJudgments().clear();
				getExpertJudgments().addAll((Collection<? extends Judgment>)newValue);
				return;
			case McdaPackage.CRITERION__INHERIT_EXPERT_WEIGHTS:
				setInheritExpertWeights((Boolean)newValue);
				return;
			case McdaPackage.CRITERION__SUB_CRITERIA_JUDGMENTS:
				getSubCriteriaJudgments().clear();
				getSubCriteriaJudgments().addAll((Collection<? extends Judgment>)newValue);
				return;
			case McdaPackage.CRITERION__ALTERNATIVE_JUDGMENTS:
				getAlternativeJudgments().clear();
				getAlternativeJudgments().addAll((Collection<? extends Judgment>)newValue);
				return;
			case McdaPackage.CRITERION__ALTERNATIVE_FORMULA:
				setAlternativeFormula((String)newValue);
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
			case McdaPackage.CRITERION__SUB_CRITERIA:
				getSubCriteria().clear();
				return;
			case McdaPackage.CRITERION__EXPERT_JUDGMENTS:
				getExpertJudgments().clear();
				return;
			case McdaPackage.CRITERION__INHERIT_EXPERT_WEIGHTS:
				setInheritExpertWeights(INHERIT_EXPERT_WEIGHTS_EDEFAULT);
				return;
			case McdaPackage.CRITERION__SUB_CRITERIA_JUDGMENTS:
				getSubCriteriaJudgments().clear();
				return;
			case McdaPackage.CRITERION__ALTERNATIVE_JUDGMENTS:
				getAlternativeJudgments().clear();
				return;
			case McdaPackage.CRITERION__ALTERNATIVE_FORMULA:
				setAlternativeFormula(ALTERNATIVE_FORMULA_EDEFAULT);
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
			case McdaPackage.CRITERION__SUB_CRITERIA:
				return !getSubCriteria().isEmpty();
			case McdaPackage.CRITERION__EXPERT_JUDGMENTS:
				return !getExpertJudgments().isEmpty();
			case McdaPackage.CRITERION__INHERIT_EXPERT_WEIGHTS:
				return isInheritExpertWeights() != INHERIT_EXPERT_WEIGHTS_EDEFAULT;
			case McdaPackage.CRITERION__SUB_CRITERIA_JUDGMENTS:
				return !getSubCriteriaJudgments().isEmpty();
			case McdaPackage.CRITERION__ALTERNATIVE_JUDGMENTS:
				return !getAlternativeJudgments().isEmpty();
			case McdaPackage.CRITERION__ALTERNATIVE_FORMULA:
				return ALTERNATIVE_FORMULA_EDEFAULT == null ? getAlternativeFormula() != null : !ALTERNATIVE_FORMULA_EDEFAULT.equals(getAlternativeFormula());
		}
		return super.eIsSet(featureID);
	}

} //CriterionImpl
