/**
 */
package org.nasdanika.models.mcda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.mcda.McdaFactory
 * @model kind="package"
 * @generated
 */
public interface McdaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mcda";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/mcda";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.mcda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	McdaPackage eINSTANCE = org.nasdanika.models.mcda.impl.McdaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.EvaluationImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__MARKERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__URIS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__UUID = NcorePackage.DOCUMENTED_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__NAME = NcorePackage.DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__CRITERIA = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__ALTERNATIVES = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__EXPERTS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expert Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__EXPERT_JUDGMENTS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Criteria Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__CRITERIA_JUDGMENTS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.ComparableImpl <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.ComparableImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__MARKERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__URIS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__UUID = NcorePackage.DOCUMENTED_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__NAME = NcorePackage.DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Received Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE__RECEIVED_JUDGMENTS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.CriterionImpl <em>Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.CriterionImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getCriterion()
	 * @generated
	 */
	int CRITERION = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__MARKERS = COMPARABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__URIS = COMPARABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__DESCRIPTION = COMPARABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__UUID = COMPARABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__LABEL_PROTOTYPE = COMPARABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__REPRESENTATIONS = COMPARABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__ANNOTATIONS = COMPARABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__NAME = COMPARABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__DOCUMENTATION = COMPARABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__CONTEXT_HELP = COMPARABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Received Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__RECEIVED_JUDGMENTS = COMPARABLE__RECEIVED_JUDGMENTS;

	/**
	 * The feature id for the '<em><b>Sub Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__SUB_CRITERIA = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expert Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__EXPERT_JUDGMENTS = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherit Expert Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__INHERIT_EXPERT_WEIGHTS = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Criteria Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__SUB_CRITERIA_JUDGMENTS = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternative Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__ALTERNATIVE_JUDGMENTS = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alternative Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__ALTERNATIVE_FORMULA = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.ExpertImpl <em>Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.ExpertImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getExpert()
	 * @generated
	 */
	int EXPERT = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__MARKERS = COMPARABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__URIS = COMPARABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__DESCRIPTION = COMPARABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__UUID = COMPARABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__LABEL_PROTOTYPE = COMPARABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__REPRESENTATIONS = COMPARABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__ANNOTATIONS = COMPARABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__NAME = COMPARABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__DOCUMENTATION = COMPARABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__CONTEXT_HELP = COMPARABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Received Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__RECEIVED_JUDGMENTS = COMPARABLE__RECEIVED_JUDGMENTS;

	/**
	 * The feature id for the '<em><b>Provided Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT__PROVIDED_JUDGMENTS = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.ExpertGroupImpl <em>Expert Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.ExpertGroupImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getExpertGroup()
	 * @generated
	 */
	int EXPERT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__MARKERS = EXPERT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__URIS = EXPERT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__DESCRIPTION = EXPERT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__UUID = EXPERT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__LABEL_PROTOTYPE = EXPERT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__REPRESENTATIONS = EXPERT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__ANNOTATIONS = EXPERT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__NAME = EXPERT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__DOCUMENTATION = EXPERT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__CONTEXT_HELP = EXPERT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Received Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__RECEIVED_JUDGMENTS = EXPERT__RECEIVED_JUDGMENTS;

	/**
	 * The feature id for the '<em><b>Provided Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__PROVIDED_JUDGMENTS = EXPERT__PROVIDED_JUDGMENTS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__MEMBERS = EXPERT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expert Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP__EXPERT_JUDGMENTS = EXPERT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expert Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP_FEATURE_COUNT = EXPERT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expert Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERT_GROUP_OPERATION_COUNT = EXPERT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.AlternativeImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__MARKERS = COMPARABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__URIS = COMPARABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DESCRIPTION = COMPARABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__UUID = COMPARABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LABEL_PROTOTYPE = COMPARABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__REPRESENTATIONS = COMPARABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ANNOTATIONS = COMPARABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = COMPARABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DOCUMENTATION = COMPARABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CONTEXT_HELP = COMPARABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Received Judgments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__RECEIVED_JUDGMENTS = COMPARABLE__RECEIVED_JUDGMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PROPERTIES = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mcda.impl.JudgmentImpl <em>Judgment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mcda.impl.JudgmentImpl
	 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getJudgment()
	 * @generated
	 */
	int JUDGMENT = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__MARKERS = NcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__URIS = NcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__UUID = NcorePackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__LABEL_PROTOTYPE = NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__REPRESENTATIONS = NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__ANNOTATIONS = NcorePackage.MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__DOCUMENTATION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__CONTEXT_HELP = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__EXPERT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__TARGETS = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__VALUE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see org.nasdanika.models.mcda.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Evaluation#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see org.nasdanika.models.mcda.Evaluation#getCriteria()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Evaluation#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see org.nasdanika.models.mcda.Evaluation#getAlternatives()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Evaluation#getExperts <em>Experts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experts</em>'.
	 * @see org.nasdanika.models.mcda.Evaluation#getExperts()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Experts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Evaluation#getExpertJudgments <em>Expert Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expert Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Evaluation#getExpertJudgments()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_ExpertJudgments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Evaluation#getCriteriaJudgments <em>Criteria Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Evaluation#getCriteriaJudgments()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_CriteriaJudgments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see org.nasdanika.models.mcda.Comparable
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.mcda.Comparable#getReceivedJudgments <em>Received Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Comparable#getReceivedJudgments()
	 * @see #getComparable()
	 * @generated
	 */
	EReference getComparable_ReceivedJudgments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see org.nasdanika.models.mcda.Criterion
	 * @generated
	 */
	EClass getCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Criterion#getSubCriteria <em>Sub Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Criteria</em>'.
	 * @see org.nasdanika.models.mcda.Criterion#getSubCriteria()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_SubCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Criterion#getExpertJudgments <em>Expert Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expert Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Criterion#getExpertJudgments()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_ExpertJudgments();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mcda.Criterion#isInheritExpertWeights <em>Inherit Expert Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherit Expert Weights</em>'.
	 * @see org.nasdanika.models.mcda.Criterion#isInheritExpertWeights()
	 * @see #getCriterion()
	 * @generated
	 */
	EAttribute getCriterion_InheritExpertWeights();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Criterion#getSubCriteriaJudgments <em>Sub Criteria Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Criteria Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Criterion#getSubCriteriaJudgments()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_SubCriteriaJudgments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Criterion#getAlternativeJudgments <em>Alternative Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Criterion#getAlternativeJudgments()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_AlternativeJudgments();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mcda.Criterion#getAlternativeFormula <em>Alternative Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Formula</em>'.
	 * @see org.nasdanika.models.mcda.Criterion#getAlternativeFormula()
	 * @see #getCriterion()
	 * @generated
	 */
	EAttribute getCriterion_AlternativeFormula();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.Expert <em>Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expert</em>'.
	 * @see org.nasdanika.models.mcda.Expert
	 * @generated
	 */
	EClass getExpert();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.mcda.Expert#getProvidedJudgments <em>Provided Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Judgments</em>'.
	 * @see org.nasdanika.models.mcda.Expert#getProvidedJudgments()
	 * @see #getExpert()
	 * @generated
	 */
	EReference getExpert_ProvidedJudgments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.ExpertGroup <em>Expert Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expert Group</em>'.
	 * @see org.nasdanika.models.mcda.ExpertGroup
	 * @generated
	 */
	EClass getExpertGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.ExpertGroup#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.mcda.ExpertGroup#getMembers()
	 * @see #getExpertGroup()
	 * @generated
	 */
	EReference getExpertGroup_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.ExpertGroup#getExpertJudgments <em>Expert Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expert Judgments</em>'.
	 * @see org.nasdanika.models.mcda.ExpertGroup#getExpertJudgments()
	 * @see #getExpertGroup()
	 * @generated
	 */
	EReference getExpertGroup_ExpertJudgments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see org.nasdanika.models.mcda.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.mcda.Alternative#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.models.mcda.Alternative#getProperties()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Properties();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mcda.Judgment <em>Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judgment</em>'.
	 * @see org.nasdanika.models.mcda.Judgment
	 * @generated
	 */
	EClass getJudgment();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.mcda.Judgment#getExpert <em>Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expert</em>'.
	 * @see org.nasdanika.models.mcda.Judgment#getExpert()
	 * @see #getJudgment()
	 * @generated
	 */
	EReference getJudgment_Expert();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.mcda.Judgment#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.nasdanika.models.mcda.Judgment#getTargets()
	 * @see #getJudgment()
	 * @generated
	 */
	EReference getJudgment_Targets();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mcda.Judgment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.mcda.Judgment#getValue()
	 * @see #getJudgment()
	 * @generated
	 */
	EAttribute getJudgment_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	McdaFactory getMcdaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.EvaluationImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();
		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__CRITERIA = eINSTANCE.getEvaluation_Criteria();
		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__ALTERNATIVES = eINSTANCE.getEvaluation_Alternatives();
		/**
		 * The meta object literal for the '<em><b>Experts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__EXPERTS = eINSTANCE.getEvaluation_Experts();
		/**
		 * The meta object literal for the '<em><b>Expert Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__EXPERT_JUDGMENTS = eINSTANCE.getEvaluation_ExpertJudgments();
		/**
		 * The meta object literal for the '<em><b>Criteria Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__CRITERIA_JUDGMENTS = eINSTANCE.getEvaluation_CriteriaJudgments();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.ComparableImpl <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.ComparableImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();
		/**
		 * The meta object literal for the '<em><b>Received Judgments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARABLE__RECEIVED_JUDGMENTS = eINSTANCE.getComparable_ReceivedJudgments();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.CriterionImpl <em>Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.CriterionImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getCriterion()
		 * @generated
		 */
		EClass CRITERION = eINSTANCE.getCriterion();
		/**
		 * The meta object literal for the '<em><b>Sub Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION__SUB_CRITERIA = eINSTANCE.getCriterion_SubCriteria();
		/**
		 * The meta object literal for the '<em><b>Expert Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION__EXPERT_JUDGMENTS = eINSTANCE.getCriterion_ExpertJudgments();
		/**
		 * The meta object literal for the '<em><b>Inherit Expert Weights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERION__INHERIT_EXPERT_WEIGHTS = eINSTANCE.getCriterion_InheritExpertWeights();
		/**
		 * The meta object literal for the '<em><b>Sub Criteria Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION__SUB_CRITERIA_JUDGMENTS = eINSTANCE.getCriterion_SubCriteriaJudgments();
		/**
		 * The meta object literal for the '<em><b>Alternative Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION__ALTERNATIVE_JUDGMENTS = eINSTANCE.getCriterion_AlternativeJudgments();
		/**
		 * The meta object literal for the '<em><b>Alternative Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERION__ALTERNATIVE_FORMULA = eINSTANCE.getCriterion_AlternativeFormula();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.ExpertImpl <em>Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.ExpertImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getExpert()
		 * @generated
		 */
		EClass EXPERT = eINSTANCE.getExpert();
		/**
		 * The meta object literal for the '<em><b>Provided Judgments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERT__PROVIDED_JUDGMENTS = eINSTANCE.getExpert_ProvidedJudgments();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.ExpertGroupImpl <em>Expert Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.ExpertGroupImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getExpertGroup()
		 * @generated
		 */
		EClass EXPERT_GROUP = eINSTANCE.getExpertGroup();
		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERT_GROUP__MEMBERS = eINSTANCE.getExpertGroup_Members();
		/**
		 * The meta object literal for the '<em><b>Expert Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERT_GROUP__EXPERT_JUDGMENTS = eINSTANCE.getExpertGroup_ExpertJudgments();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.AlternativeImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__PROPERTIES = eINSTANCE.getAlternative_Properties();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mcda.impl.JudgmentImpl <em>Judgment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mcda.impl.JudgmentImpl
		 * @see org.nasdanika.models.mcda.impl.McdaPackageImpl#getJudgment()
		 * @generated
		 */
		EClass JUDGMENT = eINSTANCE.getJudgment();
		/**
		 * The meta object literal for the '<em><b>Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUDGMENT__EXPERT = eINSTANCE.getJudgment_Expert();
		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUDGMENT__TARGETS = eINSTANCE.getJudgment_Targets();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGMENT__VALUE = eINSTANCE.getJudgment_Value();

	}

} //McdaPackage
