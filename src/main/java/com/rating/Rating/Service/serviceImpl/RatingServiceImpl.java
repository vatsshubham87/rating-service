package com.rating.Rating.Service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.Rating.Service.entities.Rating;
import com.rating.Rating.Service.repositories.RatingRepository;
import com.rating.Rating.Service.services.RatingService;


@Service
public class RatingServiceImpl implements RatingService{
    
  @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating Rating) {

      return ratingRepository.save(Rating);
    }

    @Override
    public List<Rating> getRatings() {
        
        return ratingRepository.findAll();
    }

    @Override
    public void deleteRating(String id) {
        
        ratingRepository.deleteById(id);
    }

    @Override
    public Rating updateRating(Rating Rating) {
        return null;
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
       
       List<Rating> ratings =  ratingRepository.findByHotelId(hotelId);
       return ratings;

    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        
        List<Rating> ratings = ratingRepository.findByUserId(userId);
        return ratings;
    }

}
