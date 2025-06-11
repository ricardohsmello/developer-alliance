package com.alliance.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "myentity")
public class MyEntity {
	@Field(value = "classId")
	private String classId;

	@Field(value = "prodId")
	private String prodId;

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public void setAttributes(List<AttributeEntity> attributes) {
		this.attributes = attributes;
	}

	public String getClassId() {
		return classId;
	}

	public String getProdId() {
		return prodId;
	}

	@Field(value = "attributes")
	private List<AttributeEntity> attributes;

	public List<AttributeEntity> getAttributes() {
		return attributes;
	}
}
