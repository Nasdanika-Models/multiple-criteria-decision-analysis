/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A criterion for choosing one of alternatives. Criteria may form a hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.Criterion#getSubCriteria <em>Sub Criteria</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Criterion#getExpertJudgments <em>Expert Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Criterion#isInheritExpertWeights <em>Inherit Expert Weights</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Criterion#getSubCriteriaJudgments <em>Sub Criteria Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Criterion#getAlternativeJudgments <em>Alternative Judgments</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Criterion#getAlternativeFormula <em>Alternative Formula</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion()
 * @model
 * @generated
 */
public interface Criterion extends org.nasdanika.models.mcda.Comparable {

	/**
	 * Returns the value of the '<em><b>Sub Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Criterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Child criteria of this criterion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Criteria</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion_SubCriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getSubCriteria();

	/**
	 * Returns the value of the '<em><b>Expert Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments to assign weight to experts to be used in criteria and alternative judgments. If empty, expert weights are inherited from the container or set to all equal depending on inheritExpertWeights value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expert Judgments</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion_ExpertJudgments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Judgment> getExpertJudgments();

	/**
	 * Returns the value of the '<em><b>Inherit Expert Weights</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, expert weights computed from judgments are multiplied by expert weights inherited from the container. If false, expert weights in the container are not taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherit Expert Weights</em>' attribute.
	 * @see #setInheritExpertWeights(boolean)
	 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion_InheritExpertWeights()
	 * @model default="true"
	 * @generated
	 */
	boolean isInheritExpertWeights();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mcda.Criterion#isInheritExpertWeights <em>Inherit Expert Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Expert Weights</em>' attribute.
	 * @see #isInheritExpertWeights()
	 * @generated
	 */
	void setInheritExpertWeights(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Criteria Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments to compute weights of sub-criteria
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Criteria Judgments</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion_SubCriteriaJudgments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Judgment> getSubCriteriaJudgments();

	/**
	 * Returns the value of the '<em><b>Alternative Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments to compute weights of alternatives
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Judgments</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion_AlternativeJudgments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Judgment> getAlternativeJudgments();

	/**
	 * Returns the value of the '<em><b>Alternative Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpEL (Spring Expression Language) expression used to compute alternative weight, e.g. from properties. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Formula</em>' attribute.
	 * @see #setAlternativeFormula(String)
	 * @see org.nasdanika.models.mcda.McdaPackage#getCriterion_AlternativeFormula()
	 * @model
	 * @generated
	 */
	String getAlternativeFormula();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mcda.Criterion#getAlternativeFormula <em>Alternative Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Formula</em>' attribute.
	 * @see #getAlternativeFormula()
	 * @generated
	 */
	void setAlternativeFormula(String value);
} // Criterion
