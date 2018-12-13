package com.justLearnIT.controller;


import com.justLearnIT.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin
@RestController
@RequestMapping("/home")
public class HomeController {

    private final HomeService homeService;

    public HomeController(@Autowired HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public ResponseEntity<?> getPage() {
        return new ResponseEntity(homeService.getAnnouncement(), HttpStatus.OK);
    }
}
