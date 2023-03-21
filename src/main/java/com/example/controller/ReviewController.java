package com.example.controller;

import com.example.entity.Review;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URL;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @PostMapping("/sortAndFilter")
    public Review[] getSortedAndFilteredReviews(@RequestBody String sortParam) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Review[] reviews =
                objectMapper.readValue(new URL("src/main/resources/reviews.json"), Review[].class);
        return reviews;
    }

    @GetMapping("/test")
    public int test() {
        return 1;
    }
}
