package com.rating.Rating.Service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rating.Rating.Service.entities.Rating;

@Service
public interface RatingService {


 public Rating createRating(Rating Rating);

    public List<Rating> getRatings();

    public void deleteRating(String id);

    public Rating updateRating(Rating Rating);

    public List<Rating> getRatingsByHotelId(String hotelId);

    public List<Rating> getRatingsByUserId(String userId);


}
