package com.justLearnIT.service;

import com.justLearnIT.dao.AnnouncementDAO;
import com.justLearnIT.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    private final AnnouncementDAO announcementDAO;

    public HomeServiceImpl(@Autowired AnnouncementDAO announcementDAO) {
        this.announcementDAO = announcementDAO;
    }

    @Override
    public List<Announcement> getAnnouncement() {
        return announcementDAO.getAnnouncement();
    }
}
