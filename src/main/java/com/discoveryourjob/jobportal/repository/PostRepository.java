package com.discoveryourjob.jobportal.repository;

import com.discoveryourjob.jobportal.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
