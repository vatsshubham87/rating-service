package com.rating.Rating.Service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("user_ratings")
public class Rating {
    
   @Id
   private String RatingId;
   private String userId;
   private String hotelId;
   private int rating;
   private String feedback;
}