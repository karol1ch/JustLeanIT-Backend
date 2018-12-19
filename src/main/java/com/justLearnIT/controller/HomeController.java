package com.justLearnIT.controller;


import com.justLearnIT.model.Announcement;
import com.justLearnIT.model.PaginatedResponse;
import com.justLearnIT.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
        return new ResponseEntity(homeService.getAnnouncements(), HttpStatus.OK);
    }

    @GetMapping("/page={pageNumber}")
    public ResponseEntity<?> getAnnouncementPage(@PathVariable("pageNumber") int pageNumber) {
        PaginatedResponse<Announcement> response = new PaginatedResponse<>(homeService.getAnnouncements(), pageNumber);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("/dzban")
    public ResponseEntity<?> getTip(){

        return new ResponseEntity(homeService.getRandTip(), HttpStatus.OK);
    }
}
