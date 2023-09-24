module org.nasdanika.models.mcda.processors {
		
	requires transitive org.nasdanika.models.mcda;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.mcda.processors;
	opens org.nasdanika.models.mcda.processors; // For loading resources
	
}
