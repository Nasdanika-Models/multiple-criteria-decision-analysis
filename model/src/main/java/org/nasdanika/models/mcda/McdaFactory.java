/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.mcda.McdaPackage
 * @generated
 */
public interface McdaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	McdaFactory eINSTANCE = org.nasdanika.models.mcda.impl.McdaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns a new object of class '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion</em>'.
	 * @generated
	 */
	Criterion createCriterion();

	/**
	 * Returns a new object of class '<em>Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expert</em>'.
	 * @generated
	 */
	Expert createExpert();

	/**
	 * Returns a new object of class '<em>Expert Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expert Group</em>'.
	 * @generated
	 */
	ExpertGroup createExpertGroup();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Judgment</em>'.
	 * @generated
	 */
	Judgment createJudgment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	McdaPackage getMcdaPackage();

} //McdaFactory
