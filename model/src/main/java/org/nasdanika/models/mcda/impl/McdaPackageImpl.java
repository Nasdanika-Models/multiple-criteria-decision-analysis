/**
 */
package org.nasdanika.models.mcda.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.mcda.Alternative;
import org.nasdanika.models.mcda.Criterion;
import org.nasdanika.models.mcda.Evaluation;
import org.nasdanika.models.mcda.Expert;
import org.nasdanika.models.mcda.ExpertGroup;
import org.nasdanika.models.mcda.Judgment;
import org.nasdanika.models.mcda.McdaFactory;
import org.nasdanika.models.mcda.McdaPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McdaPackageImpl extends EPackageImpl implements McdaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expertEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expertGroupEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass judgmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.mcda.McdaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private McdaPackageImpl() {
		super(eNS_URI, McdaFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link McdaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static McdaPackage init() {
		if (isInited) return (McdaPackage)EPackage.Registry.INSTANCE.getEPackage(McdaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMcdaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		McdaPackageImpl theMcdaPackage = registeredMcdaPackage instanceof McdaPackageImpl ? (McdaPackageImpl)registeredMcdaPackage : new McdaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMcdaPackage.createPackageContents();

		// Initialize created meta-data
		theMcdaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMcdaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(McdaPackage.eNS_URI, theMcdaPackage);
		return theMcdaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_Criteria() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_Alternatives() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_Experts() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_ExpertJudgments() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_CriteriaJudgments() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparable_ReceivedJudgments() {
		return (EReference)comparableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriterion() {
		return criterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterion_SubCriteria() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterion_ExpertJudgments() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterion_InheritExpertWeights() {
		return (EAttribute)criterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterion_SubCriteriaJudgments() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterion_AlternativeJudgments() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriterion_AlternativeFormula() {
		return (EAttribute)criterionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpert() {
		return expertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpert_ProvidedJudgments() {
		return (EReference)expertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpertGroup() {
		return expertGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpertGroup_Members() {
		return (EReference)expertGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpertGroup_ExpertJudgments() {
		return (EReference)expertGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlternative_Properties() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJudgment() {
		return judgmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJudgment_Expert() {
		return (EReference)judgmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJudgment_Targets() {
		return (EReference)judgmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJudgment_Value() {
		return (EAttribute)judgmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public McdaFactory getMcdaFactory() {
		return (McdaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evaluationEClass = createEClass(EVALUATION);
		createEReference(evaluationEClass, EVALUATION__CRITERIA);
		createEReference(evaluationEClass, EVALUATION__ALTERNATIVES);
		createEReference(evaluationEClass, EVALUATION__EXPERTS);
		createEReference(evaluationEClass, EVALUATION__EXPERT_JUDGMENTS);
		createEReference(evaluationEClass, EVALUATION__CRITERIA_JUDGMENTS);

		comparableEClass = createEClass(COMPARABLE);
		createEReference(comparableEClass, COMPARABLE__RECEIVED_JUDGMENTS);

		criterionEClass = createEClass(CRITERION);
		createEReference(criterionEClass, CRITERION__SUB_CRITERIA);
		createEReference(criterionEClass, CRITERION__EXPERT_JUDGMENTS);
		createEAttribute(criterionEClass, CRITERION__INHERIT_EXPERT_WEIGHTS);
		createEReference(criterionEClass, CRITERION__SUB_CRITERIA_JUDGMENTS);
		createEReference(criterionEClass, CRITERION__ALTERNATIVE_JUDGMENTS);
		createEAttribute(criterionEClass, CRITERION__ALTERNATIVE_FORMULA);

		expertEClass = createEClass(EXPERT);
		createEReference(expertEClass, EXPERT__PROVIDED_JUDGMENTS);

		expertGroupEClass = createEClass(EXPERT_GROUP);
		createEReference(expertGroupEClass, EXPERT_GROUP__MEMBERS);
		createEReference(expertGroupEClass, EXPERT_GROUP__EXPERT_JUDGMENTS);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__PROPERTIES);

		judgmentEClass = createEClass(JUDGMENT);
		createEReference(judgmentEClass, JUDGMENT__EXPERT);
		createEReference(judgmentEClass, JUDGMENT__TARGETS);
		createEAttribute(judgmentEClass, JUDGMENT__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evaluationEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		comparableEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		criterionEClass.getESuperTypes().add(this.getComparable());
		expertEClass.getESuperTypes().add(this.getComparable());
		expertGroupEClass.getESuperTypes().add(this.getExpert());
		alternativeEClass.getESuperTypes().add(this.getComparable());
		judgmentEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		judgmentEClass.getESuperTypes().add(theNcorePackage.getDocumented());

		// Initialize classes, features, and operations; add parameters
		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluation_Criteria(), this.getCriterion(), null, "criteria", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_Alternatives(), this.getAlternative(), null, "alternatives", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_Experts(), this.getExpert(), null, "experts", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_ExpertJudgments(), this.getJudgment(), null, "expertJudgments", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_CriteriaJudgments(), this.getJudgment(), null, "criteriaJudgments", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparableEClass, org.nasdanika.models.mcda.Comparable.class, "Comparable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparable_ReceivedJudgments(), this.getJudgment(), this.getJudgment_Targets(), "receivedJudgments", null, 0, -1, org.nasdanika.models.mcda.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criterionEClass, Criterion.class, "Criterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterion_SubCriteria(), this.getCriterion(), null, "subCriteria", null, 0, -1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterion_ExpertJudgments(), this.getJudgment(), null, "expertJudgments", null, 0, -1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterion_InheritExpertWeights(), ecorePackage.getEBoolean(), "inheritExpertWeights", "true", 0, 1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterion_SubCriteriaJudgments(), this.getJudgment(), null, "subCriteriaJudgments", null, 0, -1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterion_AlternativeJudgments(), this.getJudgment(), null, "alternativeJudgments", null, 0, -1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriterion_AlternativeFormula(), ecorePackage.getEString(), "alternativeFormula", null, 0, 1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expertEClass, Expert.class, "Expert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpert_ProvidedJudgments(), this.getJudgment(), this.getJudgment_Expert(), "providedJudgments", null, 0, -1, Expert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expertGroupEClass, ExpertGroup.class, "ExpertGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpertGroup_Members(), this.getExpert(), null, "members", null, 0, -1, ExpertGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpertGroup_ExpertJudgments(), this.getJudgment(), null, "expertJudgments", null, 0, -1, ExpertGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_Properties(), theNcorePackage.getProperty(), null, "properties", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAlternative_Properties().getEKeys().add(theNcorePackage.getProperty_Name());

		initEClass(judgmentEClass, Judgment.class, "Judgment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJudgment_Expert(), this.getExpert(), this.getExpert_ProvidedJudgments(), "expert", null, 1, 1, Judgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJudgment_Targets(), this.getComparable(), this.getComparable_ReceivedJudgments(), "targets", null, 1, 2, Judgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJudgment_Value(), ecorePackage.getEDoubleObject(), "value", "1.0", 0, 1, Judgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (evaluationEClass,
		   source,
		   new String[] {
			   "documentation", "Model root containing criteria (hierarchy), alternatives, and experts"
		   });
		addAnnotation
		  (getEvaluation_Criteria(),
		   source,
		   new String[] {
			   "documentation", "Root evaluation criteria"
		   });
		addAnnotation
		  (getEvaluation_Alternatives(),
		   source,
		   new String[] {
			   "documentation", "Alternatives to choose from"
		   });
		addAnnotation
		  (getEvaluation_Experts(),
		   source,
		   new String[] {
			   "documentation", "Experts provide judgments by comparing criteria and alternatives (comparables)"
		   });
		addAnnotation
		  (getEvaluation_ExpertJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments to assign weight to experts to be used in criteria and alternative judgments. If empty, all experts get the same weight."
		   });
		addAnnotation
		  (getEvaluation_CriteriaJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments to compute weights of the root criteria"
		   });
		addAnnotation
		  (comparableEClass,
		   source,
		   new String[] {
			   "documentation", "Something that can be compared - criteria for importance, alternatives for meeting criteria, experts for weight in the evaluation or a particular criterion in the evaluation"
		   });
		addAnnotation
		  (getComparable_ReceivedJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments in which this comparable is a target"
		   });
		addAnnotation
		  (criterionEClass,
		   source,
		   new String[] {
			   "documentation", "A criterion for choosing one of alternatives. Criteria may form a hierarchy."
		   });
		addAnnotation
		  (getCriterion_SubCriteria(),
		   source,
		   new String[] {
			   "documentation", "Child criteria of this criterion"
		   });
		addAnnotation
		  (getCriterion_ExpertJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments to assign weight to experts to be used in criteria and alternative judgments. If empty, expert weights are inherited from the container or set to all equal depending on inheritExpertWeights value."
		   });
		addAnnotation
		  (getCriterion_InheritExpertWeights(),
		   source,
		   new String[] {
			   "documentation", "If true, expert weights computed from judgments are multiplied by expert weights inherited from the container. If false, expert weights in the container are not taken into account."
		   });
		addAnnotation
		  (getCriterion_SubCriteriaJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments to compute weights of sub-criteria"
		   });
		addAnnotation
		  (getCriterion_AlternativeJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments to compute weights of alternatives"
		   });
		addAnnotation
		  (getCriterion_AlternativeFormula(),
		   source,
		   new String[] {
			   "documentation", "SpEL (Spring Expression Language) expression used to compute alternative weight, e.g. from properties. "
		   });
		addAnnotation
		  (expertEClass,
		   source,
		   new String[] {
			   "documentation", "Experts provide judgments which are used to compute criteria and alternative weights. Experts themselves may be assigned weights using judgments."
		   });
		addAnnotation
		  (getExpert_ProvidedJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments provided by this expert"
		   });
		addAnnotation
		  (expertGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Group is a composite expert. E.g. \"Security\", \"Business\". Groups can be used to transitively assign expert weights to criteria. E.g. \"Security\" group may have little or no weight in \"Business Functionality\" criteria."
		   });
		addAnnotation
		  (getExpertGroup_Members(),
		   source,
		   new String[] {
			   "documentation", "Group members, may include other groups so experts may form a hierarchy."
		   });
		addAnnotation
		  (getExpertGroup_ExpertJudgments(),
		   source,
		   new String[] {
			   "documentation", "Judgments to assign weight to experts in this group. If empty, all experts get the same weight. "
		   });
		addAnnotation
		  (alternativeEClass,
		   source,
		   new String[] {
			   "documentation", "Evaluation computes alternative weights using expert judgments of how wll an alternative addresses leaf criteria"
		   });
		addAnnotation
		  (getAlternative_Properties(),
		   source,
		   new String[] {
			   "documentation", "Alternative properties. E.g. cost, safety rating, ... Properties can be used to assist in expert judgements and also to visualize \"alternative space\". E.g. cost might be a property which does not taken into account in judgments, rather it is used to build cost/benefit chart."
		   });
		addAnnotation
		  (judgmentEClass,
		   source,
		   new String[] {
			   "documentation", "Expert judgment regarding target(s) expressed as a double value. If there is one target, then value is a weight of the target. If there are two targets, then value reflects preference of the first value over the second. E.g. 1 would mean that targets are equal, 2 that the first is twice \"better\" than the second, and 0.5 would mean that the second is twice \"better\" than the first."
		   });
		addAnnotation
		  (getJudgment_Expert(),
		   source,
		   new String[] {
			   "documentation", "Expert who cast the judgment"
		   });
		addAnnotation
		  (getJudgment_Targets(),
		   source,
		   new String[] {
			   "documentation", "Judgment targets - one for weights and two for pair-wise comparisons"
		   });
		addAnnotation
		  (getJudgment_Value(),
		   source,
		   new String[] {
			   "documentation", "Judgment value. If there is one target, then value is a weight of the target. If there are two targets, then value reflects preference of the first value over the second. E.g. 1 would mean that targets are equal, 2 that the first is twice \"better\" than the second, and 0.5 would mean that the second is twice \"better\" than the first."
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getAlternative_Properties(),
		   source,
		   new String[] {
			   "reference-type", "map: MapProperty\nlist: ListProperty\nstring: StringProperty\ninteger: IntegerProperty",
			   "value-feature", "value"
		   });
	}

} //McdaPackageImpl
