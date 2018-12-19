package com.justLearnIT.service;

import com.justLearnIT.model.Announcement;

public interface HomeAnnouncementService {

    Announcement getAnnouncementByName(String name);
}
