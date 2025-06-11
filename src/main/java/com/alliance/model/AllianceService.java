package com.alliance.model;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllianceService {

	private final MongoTemplate mongoTemplate;

	AllianceService(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public List<MyEntity> findByProdIdWithLimitAndSkip(int skip, int limit) {
		Query query = new Query();
		query.addCriteria(Criteria.where("prodId").in(List.of("A", "B", "C")));
		query.skip(skip);
		query.limit(limit);

		return mongoTemplate.find(query, MyEntity.class);
	}

}
