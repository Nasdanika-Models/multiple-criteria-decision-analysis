/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model root containing criteria (hierarchy), alternatives, and experts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.Evaluation#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Evaluation#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Evaluation#getExperts <em>Experts</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Evaluation#getExpertJudgments <em>Expert Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Evaluation#getCriteriaJudgments <em>Criteria Judgments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Criterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root evaluation criteria
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getEvaluation_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternatives to choose from
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getEvaluation_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Experts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Expert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Experts provide judgments by comparing criteria and alternatives (comparables)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experts</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getEvaluation_Experts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expert> getExperts();

	/**
	 * Returns the value of the '<em><b>Expert Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments to assign weight to experts to be used in criteria and alternative judgments. If empty, all experts get the same weight.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expert Judgments</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getEvaluation_ExpertJudgments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Judgment> getExpertJudgments();

	/**
	 * Returns the value of the '<em><b>Criteria Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments to compute weights of the root criteria
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria Judgments</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getEvaluation_CriteriaJudgments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Judgment> getCriteriaJudgments();

} // Evaluation
