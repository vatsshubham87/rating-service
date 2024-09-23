package com.rating.Rating.Service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rating.Rating.Service.entities.Rating;
import com.rating.Rating.Service.services.RatingService;

@RestController
@RequestMapping("ratings")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @PostMapping("/create")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating)
    {
        Rating Rating1 = ratingService.createRating(rating);
        return new ResponseEntity<Rating>(Rating1, HttpStatus.CREATED);
    } 

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings()
    {
        List<Rating> ratings = ratingService.getRatings();
        return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
    }


    @DeleteMapping("{ratingId}")
    public ResponseEntity<Object> deleteRating(@PathVariable String ratingId)
    {
        ratingService.deleteRating(ratingId);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId)
    {
        List<Rating> ratings = ratingService.getRatingsByHotelId(hotelId);
        return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId)
    {
        List<Rating> ratings = ratingService.getRatingsByUserId(userId);
        return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
    }
    
}
