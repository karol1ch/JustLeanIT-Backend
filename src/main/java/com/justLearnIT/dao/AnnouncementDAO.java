package com.justLearnIT.dao;

import com.justLearnIT.model.Announcement;


import java.util.List;

public interface AnnouncementDAO {

    List getAnnouncements();

    Announcement getAnnouncementByName(String name);


    void saveOrUpdate(Announcement category);

}
