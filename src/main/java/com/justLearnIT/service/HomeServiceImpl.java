package com.justLearnIT.service;

import com.justLearnIT.dao.AnnouncementDAO;
import com.justLearnIT.dao.TipOfADayDAO;
import com.justLearnIT.model.Announcement;
import com.justLearnIT.model.TipOfADay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    private final AnnouncementDAO announcementDAO;

    private final TipOfADayDAO tipOfADayDAO;

    private TipOfADay current;

    public HomeServiceImpl(@Autowired AnnouncementDAO announcementDAO, @Autowired TipOfADayDAO tipOfADayDAO) {
        this.announcementDAO = announcementDAO;
        this.tipOfADayDAO = tipOfADayDAO;
        this.current = this.tipOfADayDAO.getRandTip();
    }


    @Override
    public List<Announcement> getAnnouncements() {
        return announcementDAO.getAnnouncements();
    }


    @Override
    public TipOfADay getRandTip() {
        return current;
    }
    
    @Scheduled(cron = "0 0 2 * * *")
    private void randTip(){
        current = tipOfADayDAO.getRandTip();
    }
}
