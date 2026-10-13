package com.test1;

public class OpeKnowledgeFormatDocManagement {
	private long knowledgeDocumentId;
	private long knowledgeFormatConfigurationId;
	private String documentId;
	private String documentName;
	private String documentType;
	private String documentVersion;
	private String sourceSystem;
	private String sourceDcoumentUrl;
	private String documentContent;
	private String documentMetadata;
	private String knowledgeCategory;
	private String semanticTags;
	private String extractedEntitites;
	private String extractedRelationships;
	private String contentChecksum;
	private String documentLanguage;
	private String documentCreatedTime;
	private String documentUpdatedTime;

	public OpeKnowledgeFormatDocManagement() {

	}

	public OpeKnowledgeFormatDocManagement(long knowledgeDocumentId, long knowledgeFormatConfigurationId,
			String documentId, String documentName, String documentType, String documentVersion, String sourceSystem,
			String sourceDcoumentUrl, String documentContent, String documentMetadata, String knowledgeCategory,
			String semanticTags, String extractedEntitites, String extractedRelationships, String contentChecksum,
			String documentLanguage, String documentCreatedTime, String documentUpdatedTime) {
		super();
		this.knowledgeDocumentId = knowledgeDocumentId;
		this.knowledgeFormatConfigurationId = knowledgeFormatConfigurationId;
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentType = documentType;
		this.documentVersion = documentVersion;
		this.sourceSystem = sourceSystem;
		this.sourceDcoumentUrl = sourceDcoumentUrl;
		this.documentContent = documentContent;
		this.documentMetadata = documentMetadata;
		this.knowledgeCategory = knowledgeCategory;
		this.semanticTags = semanticTags;
		this.extractedEntitites = extractedEntitites;
		this.extractedRelationships = extractedRelationships;
		this.contentChecksum = contentChecksum;
		this.documentLanguage = documentLanguage;
		this.documentCreatedTime = documentCreatedTime;
		this.documentUpdatedTime = documentUpdatedTime;
	}

	public long getKnowledgeDocumentId() {
		return knowledgeDocumentId;
	}

	public void setKnowledgeDocumentId(long knowledgeDocumentId) {
		this.knowledgeDocumentId = knowledgeDocumentId;
	}

	public long getKnowledgeFormatConfigurationId() {
		return knowledgeFormatConfigurationId;
	}

	public void setKnowledgeFormatConfigurationId(long knowledgeFormatConfigurationId) {
		this.knowledgeFormatConfigurationId = knowledgeFormatConfigurationId;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentVersion() {
		return documentVersion;
	}

	public void setDocumentVersion(String documentVersion) {
		this.documentVersion = documentVersion;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSourceDcoumentUrl() {
		return sourceDcoumentUrl;
	}

	public void setSourceDcoumentUrl(String sourceDcoumentUrl) {
		this.sourceDcoumentUrl = sourceDcoumentUrl;
	}

	public String getDocumentContent() {
		return documentContent;
	}

	public void setDocumentContent(String documentContent) {
		this.documentContent = documentContent;
	}

	public String getDocumentMetadata() {
		return documentMetadata;
	}

	public void setDocumentMetadata(String documentMetadata) {
		this.documentMetadata = documentMetadata;
	}

	public String getKnowledgeCategory() {
		return knowledgeCategory;
	}

	public void setKnowledgeCategory(String knowledgeCategory) {
		this.knowledgeCategory = knowledgeCategory;
	}

	public String getSemanticTags() {
		return semanticTags;
	}

	public void setSemanticTags(String semanticTags) {
		this.semanticTags = semanticTags;
	}

	public String getExtractedEntitites() {
		return extractedEntitites;
	}

	public void setExtractedEntitites(String extractedEntitites) {
		this.extractedEntitites = extractedEntitites;
	}

	public String getExtractedRelationships() {
		return extractedRelationships;
	}

	public void setExtractedRelationships(String extractedRelationships) {
		this.extractedRelationships = extractedRelationships;
	}

	public String getContentChecksum() {
		return contentChecksum;
	}

	public void setContentChecksum(String contentChecksum) {
		this.contentChecksum = contentChecksum;
	}

	public String getDocumentLanguage() {
		return documentLanguage;
	}

	public void setDocumentLanguage(String documentLanguage) {
		this.documentLanguage = documentLanguage;
	}

	public String getDocumentCreatedTime() {
		return documentCreatedTime;
	}

	public void setDocumentCreatedTime(String documentCreatedTime) {
		this.documentCreatedTime = documentCreatedTime;
	}

	public String getDocumentUpdatedTime() {
		return documentUpdatedTime;
	}

	public void setDocumentUpdatedTime(String documentUpdatedTime) {
		this.documentUpdatedTime = documentUpdatedTime;
	}

}
