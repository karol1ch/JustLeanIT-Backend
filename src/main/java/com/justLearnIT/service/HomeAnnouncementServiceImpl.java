package com.justLearnIT.service;

import com.justLearnIT.dao.AnnouncementDAO;
import com.justLearnIT.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeAnnouncementServiceImpl implements HomeAnnouncementService{

    private AnnouncementDAO announcementDAO;

    public HomeAnnouncementServiceImpl(@Autowired AnnouncementDAO announcementDAO){
        this.announcementDAO = announcementDAO;
    }

    @Override
    public Announcement getAnnouncementByName(String name) {
        return announcementDAO.getAnnouncementByName(name);
    }
}
