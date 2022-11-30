package com.tweety.tweetservice.controller;

import com.tweety.tweetservice.dto.CreateTweetDto;
import com.tweety.tweetservice.dto.TweetInListDto;
import com.tweety.tweetservice.dto.UserIdListDto;
import com.tweety.tweetservice.model.Tweet;
import com.tweety.tweetservice.service.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/tweets")
public class TweetController {

    private TweetService tweetService;

    @PostMapping("")
    public ResponseEntity<Void> createTweet(
            @RequestBody CreateTweetDto dto
    ) {
        Tweet tweet = tweetService.createTweet(dto);
        return new ResponseEntity<>(
                HttpStatus.CREATED
        );
    }

    @GetMapping("")
    public ResponseEntity<List<TweetInListDto>> getTweets(
            @RequestBody UserIdListDto dto
            ) {
        return new ResponseEntity<>(
                tweetService.getUserTweets(dto),
                HttpStatus.OK
        );
    }

    @GetMapping("/test")
    public ResponseEntity<List<Tweet>> getAllTweetsForTest() {
        return new ResponseEntity<>(
                tweetService.getAllTweets(),
                HttpStatus.OK
        );
    }
}
