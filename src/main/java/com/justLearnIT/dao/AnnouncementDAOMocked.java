package com.justLearnIT.dao;

import com.justLearnIT.model.Announcement;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class AnnouncementDAOMocked implements AnnouncementDAO {

    private List<Announcement> announcements = Arrays.asList(
            new Announcement("a1", "a1 - krótki opis", "a1 - długi opis"),
            new Announcement("a2", "a2 - krótki opis", "a2 - długi opis"),
            new Announcement("a3", "a3 - krótki opis", "a3 - długi opis"),
            new Announcement("a4", "a4 - krótki opis", "a4 - długi opis"),
            new Announcement("a5", "a5 - krótki opis", "a5 - długi opis"),
            new Announcement("a6", "a6 - krótki opis", "a6 - długi opis")
    );

    @Override
    public List<Announcement> getAnnouncement() {
        return announcements;
    }
}
