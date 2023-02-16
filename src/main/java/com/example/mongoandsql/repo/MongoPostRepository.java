package com.example.mongoandsql.repo;

import com.example.mongoandsql.domain.mongo.MongoPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoPostRepository extends MongoRepository<MongoPost, String> {
}
