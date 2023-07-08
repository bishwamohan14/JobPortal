//package com.discoveryourjob.jobportal.repository;
//
//import com.discoveryourjob.jobportal.model.Post;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;
//
//import com.mongodb.client.*;
//import org.bson.Document;
//import org.bson.conversions.Bson;
//import java.util.concurrent.TimeUnit;
//import org.bson.Document;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.convert.MongoConverter;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SearchPostImp implements SearchRepository {
//
//    @Autowired
//    MongoClient client;
//
//    @Autowired
//    MongoConverter converter;
//
//    @Override
//    public List<Post> findByText(String text) {
//        final List<Post>posts=new ArrayList<>();
//
//        MongoDatabase database = client.getDatabase("RecruiterInfo");
//        MongoCollection<Document> collection = database.getCollection("JobData");
//
//        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
//                        new Document("text",
//                                new Document("query", "java")
//                                        .append("path", Arrays.asList("desc", "profile", "techs")))),
//                new Document("$sort",
//                        new Document("exp", 1L)),
//                new Document("$limit", 4L)));
//
//
//
//        result.forEach(doc -> posts.add(converter.read(Post.class,doc)));
//
//
//        return posts;
//    }
//}
