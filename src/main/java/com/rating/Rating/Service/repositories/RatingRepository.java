package com.rating.Rating.Service.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rating.Rating.Service.entities.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String>{
   
   List<Rating> findByUserId(String userId);

   List<Rating> findByHotelId(String hotelId);

   

}
