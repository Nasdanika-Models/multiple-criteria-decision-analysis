/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.Property;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluation computes alternative weights using expert judgments of how wll an alternative addresses leaf criteria
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mcda.Alternative#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mcda.McdaPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends org.nasdanika.models.mcda.Comparable {

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ncore.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternative properties. E.g. cost, safety rating, ... Properties can be used to assist in expert judgements and also to visualize "alternative space". E.g. cost might be a property which does not taken into account in judgments, rather it is used to build cost/benefit chart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.nasdanika.models.mcda.McdaPackage#getAlternative_Properties()
	 * @model containment="true" keys="name"
	 *        annotation="urn:org.nasdanika reference-type='map: MapProperty\nlist: ListProperty\nstring: StringProperty\ninteger: IntegerProperty' value-feature='value'"
	 * @generated
	 */
	EList<Property> getProperties();
} // Alternative
