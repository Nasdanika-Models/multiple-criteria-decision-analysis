/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something that can be compared - criteria for importance, alternatives for meeting criteria, experts for weight in the evaluation or a particular criterion in the evaluation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.Comparable#getReceivedJudgments <em>Received Judgments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getComparable()
 * @model abstract="true"
 * @generated
 */
public interface Comparable extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Received Judgments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.mcda.Judgment#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments in which this comparable is a target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Judgments</em>' reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getComparable_ReceivedJudgments()
	 * @see org.nasdanika.models.mcda.Judgment#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	EList<Judgment> getReceivedJudgments();

} // Comparable
