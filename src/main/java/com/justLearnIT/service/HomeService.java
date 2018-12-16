package com.justLearnIT.service;

import com.justLearnIT.model.Announcement;
import com.justLearnIT.model.TipOfADay;

import java.util.List;

public interface HomeService {

    List<Announcement> getAnnouncements();

    Announcement getAnnouncementByName(String name);

    TipOfADay getRandTip();
}
