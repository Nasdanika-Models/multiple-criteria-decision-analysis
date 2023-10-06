/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Judgment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Expert judgment regarding target(s) expressed as a double value. If there is one target, then value is a weight of the target. If there are two targets, then value reflects preference of the first value over the second. E.g. 1 would mean that targets are equal, 2 that the first is twice "better" than the second, and 0.5 would mean that the second is twice "better" than the first.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.Judgment#getExpert <em>Expert</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Judgment#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.nasdanika.models.mcda.Judgment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getJudgment()
 * @model
 * @generated
 */
public interface Judgment extends ModelElement, Documented {
	/**
	 * Returns the value of the '<em><b>Expert</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.mcda.Expert#getProvidedJudgments <em>Provided Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expert who cast the judgment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expert</em>' reference.
	 * @see #setExpert(Expert)
	 * @see org.nasdanika.models.mcda.McdaPackage#getJudgment_Expert()
	 * @see org.nasdanika.models.mcda.Expert#getProvidedJudgments
	 * @model opposite="providedJudgments" required="true"
	 * @generated
	 */
	Expert getExpert();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mcda.Judgment#getExpert <em>Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expert</em>' reference.
	 * @see #getExpert()
	 * @generated
	 */
	void setExpert(Expert value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.mcda.Comparable}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.mcda.Comparable#getReceivedJudgments <em>Received Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgment targets - one for weights and two for pair-wise comparisons
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getJudgment_Targets()
	 * @see org.nasdanika.models.mcda.Comparable#getReceivedJudgments
	 * @model opposite="receivedJudgments" required="true" upper="2"
	 * @generated
	 */
	EList<org.nasdanika.models.mcda.Comparable> getTargets();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Judgment value. If there is one target, then value is a weight of the target. If there are two targets, then value reflects preference of the first value over the second. E.g. 1 would mean that targets are equal, 2 that the first is twice "better" than the second, and 0.5 would mean that the second is twice "better" than the first.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see org.nasdanika.models.mcda.McdaPackage#getJudgment_Value()
	 * @model default="1.0"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mcda.Judgment#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // Judgment
