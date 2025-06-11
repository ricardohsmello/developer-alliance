package com.alliance.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("attributeEntity")
public class AttributeEntity {

	private String id;
	private String attribute;

	public String getId() {
		return id;
	}

	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {}

	public void setId(String id) {
		this.id = id;
	}
}
