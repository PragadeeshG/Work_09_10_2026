package com.test1;

public class OpenKnowledgeFormatConfiguration {
	private long knowledgeFormatConfigurationId;
	private long applicationId;
	private String applicationName;
	private String knowledgeBaseId;
	private String knowledgeFormatVersion;
	private String knowledgeDomain;
	private String knowledgeSourceType;
	private String sourceRepository;
	private String documentFormat;
	private String metadataFormat;
	private String contentStructure;
	private String entityExtractionEnabled;
	private String relationshipMappingEnabled;
	private String semanticIndexingEnabled;
	private String embeddingModel;
	private String vectorDatabaseType;
	private String knowledgeValidationEnbaled;
	private String schemaValidationRules;

	public OpenKnowledgeFormatConfiguration() {

	}

	public OpenKnowledgeFormatConfiguration(long knowledgeFormatConfigurationId, long applicationId,
			String applicationName, String knowledgeBaseId, String knowledgeFormatVersion, String knowledgeDomain,
			String knowledgeSourceType, String sourceRepository, String documentFormat, String metadataFormat,
			String contentStructure, String entityExtractionEnabled, String relationshipMappingEnabled,
			String semanticIndexingEnabled, String embeddingModel, String vectorDatabaseType,
			String knowledgeValidationEnbaled, String schemaValidationRules) {
		super();
		this.knowledgeFormatConfigurationId = knowledgeFormatConfigurationId;
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.knowledgeBaseId = knowledgeBaseId;
		this.knowledgeFormatVersion = knowledgeFormatVersion;
		this.knowledgeDomain = knowledgeDomain;
		this.knowledgeSourceType = knowledgeSourceType;
		this.sourceRepository = sourceRepository;
		this.documentFormat = documentFormat;
		this.metadataFormat = metadataFormat;
		this.contentStructure = contentStructure;
		this.entityExtractionEnabled = entityExtractionEnabled;
		this.relationshipMappingEnabled = relationshipMappingEnabled;
		this.semanticIndexingEnabled = semanticIndexingEnabled;
		this.embeddingModel = embeddingModel;
		this.vectorDatabaseType = vectorDatabaseType;
		this.knowledgeValidationEnbaled = knowledgeValidationEnbaled;
		this.schemaValidationRules = schemaValidationRules;
	}

	public long getKnowledgeFormatConfigurationId() {
		return knowledgeFormatConfigurationId;
	}

	public void setKnowledgeFormatConfigurationId(long knowledgeFormatConfigurationId) {
		this.knowledgeFormatConfigurationId = knowledgeFormatConfigurationId;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getKnowledgeBaseId() {
		return knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public String getKnowledgeFormatVersion() {
		return knowledgeFormatVersion;
	}

	public void setKnowledgeFormatVersion(String knowledgeFormatVersion) {
		this.knowledgeFormatVersion = knowledgeFormatVersion;
	}

	public String getKnowledgeDomain() {
		return knowledgeDomain;
	}

	public void setKnowledgeDomain(String knowledgeDomain) {
		this.knowledgeDomain = knowledgeDomain;
	}

	public String getKnowledgeSourceType() {
		return knowledgeSourceType;
	}

	public void setKnowledgeSourceType(String knowledgeSourceType) {
		this.knowledgeSourceType = knowledgeSourceType;
	}

	public String getSourceRepository() {
		return sourceRepository;
	}

	public void setSourceRepository(String sourceRepository) {
		this.sourceRepository = sourceRepository;
	}

	public String getDocumentFormat() {
		return documentFormat;
	}

	public void setDocumentFormat(String documentFormat) {
		this.documentFormat = documentFormat;
	}

	public String getMetadataFormat() {
		return metadataFormat;
	}

	public void setMetadataFormat(String metadataFormat) {
		this.metadataFormat = metadataFormat;
	}

	public String getContentStructure() {
		return contentStructure;
	}

	public void setContentStructure(String contentStructure) {
		this.contentStructure = contentStructure;
	}

	public String getEntityExtractionEnabled() {
		return entityExtractionEnabled;
	}

	public void setEntityExtractionEnabled(String entityExtractionEnabled) {
		this.entityExtractionEnabled = entityExtractionEnabled;
	}

	public String getRelationshipMappingEnabled() {
		return relationshipMappingEnabled;
	}

	public void setRelationshipMappingEnabled(String relationshipMappingEnabled) {
		this.relationshipMappingEnabled = relationshipMappingEnabled;
	}

	public String getSemanticIndexingEnabled() {
		return semanticIndexingEnabled;
	}

	public void setSemanticIndexingEnabled(String semanticIndexingEnabled) {
		this.semanticIndexingEnabled = semanticIndexingEnabled;
	}

	public String getEmbeddingModel() {
		return embeddingModel;
	}

	public void setEmbeddingModel(String embeddingModel) {
		this.embeddingModel = embeddingModel;
	}

	public String getVectorDatabaseType() {
		return vectorDatabaseType;
	}

	public void setVectorDatabaseType(String vectorDatabaseType) {
		this.vectorDatabaseType = vectorDatabaseType;
	}

	public String getKnowledgeValidationEnbaled() {
		return knowledgeValidationEnbaled;
	}

	public void setKnowledgeValidationEnbaled(String knowledgeValidationEnbaled) {
		this.knowledgeValidationEnbaled = knowledgeValidationEnbaled;
	}

	public String getSchemaValidationRules() {
		return schemaValidationRules;
	}

	public void setSchemaValidationRules(String schemaValidationRules) {
		this.schemaValidationRules = schemaValidationRules;
	}

}
