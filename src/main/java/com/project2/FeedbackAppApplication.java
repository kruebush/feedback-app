package com.project2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FeedbackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackAppApplication.class, args);
	}
	@GetMapping("/givefeedback")
	public String giveFeedback() {
		return "Give your Feedback";
	}
	@GetMapping("/thanksforfeedback")
	public String thanksforFeedback() {
		return "Thanks for your Feedback";
	}
	
}
