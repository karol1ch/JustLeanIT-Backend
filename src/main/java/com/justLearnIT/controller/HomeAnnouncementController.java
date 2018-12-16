package com.justLearnIT.controller;

import com.justLearnIT.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/home/{name}")
public class HomeAnnouncementController {

    private final HomeService homeService;

    public HomeAnnouncementController(@Autowired HomeService learningCategoryService) {
        this.homeService = learningCategoryService;
    }

    @GetMapping
    public ResponseEntity<?> getAnnouncement(@PathVariable("name") String annName){
        return new ResponseEntity(homeService.getAnnouncementByName(annName), HttpStatus.OK);
    }

}
