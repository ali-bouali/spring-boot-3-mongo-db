package com.alibou.coding.mongodemo.category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository
    extends MongoRepository<Category, String> {

}
