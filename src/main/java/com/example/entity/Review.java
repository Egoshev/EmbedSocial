package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    private int id;
    private String reviewId;
    private String reviewFullText;
    private int numLikes;
    private int numComments;
    private int rating;
    private String reviewCreatedOn;
    private String reviewCreatedOnDate;
    private long reviewCreatedOnTime;
    private String reviewerId;
    private String reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private boolean isVerified;
    private String source;
    private String sourceName;
    private String sourceId;
    private String[] tags;
    private String href;
    private String logoHref;
    private String[] photos;
}
