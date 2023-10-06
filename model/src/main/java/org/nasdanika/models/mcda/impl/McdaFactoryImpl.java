/**
 */
package org.nasdanika.models.mcda.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.mcda.Alternative;
import org.nasdanika.models.mcda.Criterion;
import org.nasdanika.models.mcda.Evaluation;
import org.nasdanika.models.mcda.Expert;
import org.nasdanika.models.mcda.ExpertGroup;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaFactory;
import org.nasdanika.models.mcda.McdaPackage;
import org.nasdanika.models.mcda.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McdaFactoryImpl extends EFactoryImpl implements McdaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static McdaFactory init() {
		try {
			McdaFactory theMcdaFactory = (McdaFactory)EPackage.Registry.INSTANCE.getEFactory(McdaPackage.eNS_URI);
			if (theMcdaFactory != null) {
				return theMcdaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new McdaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McdaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case McdaPackage.EVALUATION: return createEvaluation();
			case McdaPackage.CRITERION: return createCriterion();
			case McdaPackage.EXPERT: return createExpert();
			case McdaPackage.EXPERT_GROUP: return createExpertGroup();
			case McdaPackage.ALTERNATIVE: return createAlternative();
			case McdaPackage.JUDGMENT: return createJudgment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criterion createCriterion() {
		CriterionImpl criterion = new CriterionImpl();
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expert createExpert() {
		ExpertImpl expert = new ExpertImpl();
		return expert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpertGroup createExpertGroup() {
		ExpertGroupImpl expertGroup = new ExpertGroupImpl();
		return expertGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Judgment createJudgment() {
		JudgmentImpl judgment = new JudgmentImpl();
		return judgment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public McdaPackage getMcdaPackage() {
		return (McdaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static McdaPackage getPackage() {
		return McdaPackage.eINSTANCE;
	}

} //McdaFactoryImpl
