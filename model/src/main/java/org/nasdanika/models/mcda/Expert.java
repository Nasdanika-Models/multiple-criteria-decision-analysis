/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Experts provide judgments which are used to compute criteria and alternative weights. Experts themselves may be assigned weights using judgments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.Expert#getProvidedJudgments <em>Provided Judgments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getExpert()
 * @model
 * @generated
 */
public interface Expert extends org.nasdanika.models.mcda.Comparable {
	/**
	 * Returns the value of the '<em><b>Provided Judgments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Judgment}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.mcda.Judgment#getExpert <em>Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgments provided by this expert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Judgments</em>' reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getExpert_ProvidedJudgments()
	 * @see org.nasdanika.models.mcda.Judgment#getExpert
	 * @model opposite="expert"
	 * @generated
	 */
	EList<Judgment> getProvidedJudgments();

} // Expert
