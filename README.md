# Multiple-criteria Decision Analysis

Ecore model, graph nodes, and processors for [MCDA](https://en.wikipedia.org/wiki/Multiple-criteria_decision_analysis): [Analytic hierarchy process](https://en.wikipedia.org/wiki/Analytic_hierarchy_process) and [Weighted sum model](https://en.wikipedia.org/wiki/Weighted_sum_model) in particular- alternative, criterion, ...

The model is intended to usable on its own to model decisions and generate reports. 
It is also intended to be extensible by other models. For example, some classes the [architecture](https://github.com/Nasdanika-Models/architecture) model (e.g. Architecture, Building Block), may extend Alternative
in order to support disciplined analytical decision making.

## Opportunities and solutions

* [sat4j](http://www.sat4j.org/) [2.3.6](https://gitlab.ow2.org/sat4j/sat4j/-/releases/2_3_6) or something similar for AHP. 2.3.6 not in Maven Central, only 2.3.1 is - https://mvnrepository.com/artifact/org.sat4j/org.sat4j.core.
* [Echarts](https://echarts.apache.org/en/index.html) [3D Scatter](https://echarts.apache.org/examples/en/index.html#chart-type-scatter3D) and [Scatter](https://echarts.apache.org/examples/en/index.html#chart-type-scatter) to visually compare alternatives. 
3D Scatter allows to create a visualization using 5 dimensions which are user selectable - 3 geometric dimensions, size, color. Respectively, (2D) scatter allows to visually compare using 4 dimensions. Examples:
    * Benefit/value on the Y axis, Cost on the X axis, risk as bubble size.
    * Criteria as dimensions. In AHP such a visualization can be produced at each level of the hierarchy
* Multiple experts with weights. Weights can be computed using one of MCDA methods. Example:
    * AHP is used for solution selection. Top criteria include "User", "Finance", "Security"
    * The evaluation owner assigns criteria owners, "experts". The evaluation owner may assign multiple experts per criterion and assign weights to them. E.g. a senior security specialist would have higher weight than a junior security specialist or a generalist.
    * Expert judgments are compared to detect inconsistencies/bias 
* Evaluation models are stored in version control:
    * Audit
    * Reuse - if a situation changes the model can be revisited. Or the same model can be applied in different contexts and yield different results. Say, top-level criteria weights change, but other comparisons stay the same. 
    Example: cost might be more important than security for internal systems and the opposite would be for internet-facing systems. 
* A library of models with pre-defined criteria for reuse. For example, when decision analysis model is used as part of an architecture model, building block domains (storage, compute, ...) may contain pre-defined and pre-approved decision models to drive consistent and auditable decision making in the organizaiton.
Higher-level organizational units would define criteria and conduct evaluation of alternatives against the criteria. Lower-level units would assign importance of criteria for a particular application and the model will provide a recommendation.      
