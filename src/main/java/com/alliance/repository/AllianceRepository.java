package com.alliance.repository;

import com.alliance.model.MyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllianceRepository extends MongoRepository<MyEntity, String> {

	List<MyEntity> findByProdIdIn(List<String> ids);



}
