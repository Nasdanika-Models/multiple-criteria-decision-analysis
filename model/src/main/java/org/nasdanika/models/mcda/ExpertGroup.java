/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expert Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Group is a composite expert. E.g. "Security", "Business". Groups can be used to transitively assign expert weights to criteria. E.g. "Security" group may have little or no weight in "Business Functionality" criteria.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.ExpertGroup#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.ExpertGroup#getExpertJudgments <em>Expert Judgments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getExpertGroup()
 * @model
 * @generated
 */
public interface ExpertGroup extends Expert {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Expert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group members, may include other groups so experts may form a hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getExpertGroup_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expert> getMembers();

	/**
	 * Returns the value of the '<em><b>Expert Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments to assign weight to experts in this group. If empty, all experts get the same weight. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expert Judgments</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getExpertGroup_ExpertJudgments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Judgment> getExpertJudgments();

} // ExpertGroup
