package com.justLearnIT.controller;

import com.justLearnIT.service.HomeAnnouncementService;
import com.justLearnIT.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/home/{announcementName}")
public class HomeAnnouncementController {

    private final HomeAnnouncementService homeAnnouncementService;

    public HomeAnnouncementController(@Autowired HomeAnnouncementService homeAnnouncementService) {
        this.homeAnnouncementService = homeAnnouncementService;
    }

    @GetMapping
    public ResponseEntity<?> getAnnouncement(@PathVariable("announcementName") String announcementName){

        return new ResponseEntity(homeAnnouncementService.getAnnouncementByName(announcementName), HttpStatus.OK);
    }

}
