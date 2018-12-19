package com.justLearnIT.service;

import com.justLearnIT.model.Announcement;
import com.justLearnIT.model.TipOfADay;

import java.util.List;

public interface HomeService {

    List<Announcement> getAnnouncements();

    TipOfADay getRandTip();
}
