/**
 */
package org.nasdanika.models.mcda.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;
import org.nasdanika.models.mcda.Alternative;
import org.nasdanika.models.mcda.Criterion;
import org.nasdanika.models.mcda.Evaluation;
import org.nasdanika.models.mcda.Expert;
import org.nasdanika.models.mcda.ExpertGroup;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaPackage;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.persistence.Marked;
import org.nasdanika.models.mcda.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.mcda.McdaPackage
 * @generated
 */
public class McdaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static McdaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McdaSwitch() {
		if (modelPackage == null) {
			modelPackage = McdaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case McdaPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = caseDocumentedNamedElement(evaluation);
				if (result == null) result = caseNamedElement(evaluation);
				if (result == null) result = caseDocumented(evaluation);
				if (result == null) result = caseModelElement(evaluation);
				if (result == null) result = caseMarked(evaluation);
				if (result == null) result = caseAdaptable(evaluation);
				if (result == null) result = caseIMarked(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McdaPackage.COMPARABLE: {
				org.nasdanika.models.mcda.Comparable comparable = (org.nasdanika.models.mcda.Comparable)theEObject;
				T result = caseComparable(comparable);
				if (result == null) result = caseDocumentedNamedElement(comparable);
				if (result == null) result = caseNamedElement(comparable);
				if (result == null) result = caseDocumented(comparable);
				if (result == null) result = caseModelElement(comparable);
				if (result == null) result = caseMarked(comparable);
				if (result == null) result = caseAdaptable(comparable);
				if (result == null) result = caseIMarked(comparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McdaPackage.CRITERION: {
				Criterion criterion = (Criterion)theEObject;
				T result = caseCriterion(criterion);
				if (result == null) result = caseComparable(criterion);
				if (result == null) result = caseDocumentedNamedElement(criterion);
				if (result == null) result = caseNamedElement(criterion);
				if (result == null) result = caseDocumented(criterion);
				if (result == null) result = caseModelElement(criterion);
				if (result == null) result = caseMarked(criterion);
				if (result == null) result = caseAdaptable(criterion);
				if (result == null) result = caseIMarked(criterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McdaPackage.EXPERT: {
				Expert expert = (Expert)theEObject;
				T result = caseExpert(expert);
				if (result == null) result = caseComparable(expert);
				if (result == null) result = caseDocumentedNamedElement(expert);
				if (result == null) result = caseNamedElement(expert);
				if (result == null) result = caseDocumented(expert);
				if (result == null) result = caseModelElement(expert);
				if (result == null) result = caseMarked(expert);
				if (result == null) result = caseAdaptable(expert);
				if (result == null) result = caseIMarked(expert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McdaPackage.EXPERT_GROUP: {
				ExpertGroup expertGroup = (ExpertGroup)theEObject;
				T result = caseExpertGroup(expertGroup);
				if (result == null) result = caseExpert(expertGroup);
				if (result == null) result = caseComparable(expertGroup);
				if (result == null) result = caseDocumentedNamedElement(expertGroup);
				if (result == null) result = caseNamedElement(expertGroup);
				if (result == null) result = caseDocumented(expertGroup);
				if (result == null) result = caseModelElement(expertGroup);
				if (result == null) result = caseMarked(expertGroup);
				if (result == null) result = caseAdaptable(expertGroup);
				if (result == null) result = caseIMarked(expertGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McdaPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseComparable(alternative);
				if (result == null) result = caseDocumentedNamedElement(alternative);
				if (result == null) result = caseNamedElement(alternative);
				if (result == null) result = caseDocumented(alternative);
				if (result == null) result = caseModelElement(alternative);
				if (result == null) result = caseMarked(alternative);
				if (result == null) result = caseAdaptable(alternative);
				if (result == null) result = caseIMarked(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McdaPackage.JUDGMENT: {
				Judgment judgment = (Judgment)theEObject;
				T result = caseJudgment(judgment);
				if (result == null) result = caseModelElement(judgment);
				if (result == null) result = caseDocumented(judgment);
				if (result == null) result = caseMarked(judgment);
				if (result == null) result = caseAdaptable(judgment);
				if (result == null) result = caseIMarked(judgment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(org.nasdanika.models.mcda.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterion(Criterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpert(Expert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expert Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expert Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpertGroup(ExpertGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Judgment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJudgment(Judgment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //McdaSwitch
