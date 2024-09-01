package com.telusko.joblisting.repository;

import com.telusko.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

// in <> -> mention whattype of data, primarykey/String
//MongoRepository take cares of all the CRUD ops
public interface PostRepository extends MongoRepository<Post,String>
{

}
