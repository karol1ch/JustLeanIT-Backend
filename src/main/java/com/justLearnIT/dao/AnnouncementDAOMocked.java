package com.justLearnIT.dao;

import com.justLearnIT.model.Announcement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class AnnouncementDAOMocked implements AnnouncementDAO {

    private List<Announcement> announcements = Arrays.asList(
            new Announcement("a1", "a1 - krótki opis", "a1 - długi opis"),
            new Announcement("a2", "a2 - krótki opis", "a2 - długi opis"),
            new Announcement("a3", "a3 - krótki opis", "a3 - długi opis"),
            new Announcement("a4", "a4 - krótki opis", "a4 - długi opis"),
            new Announcement("a5", "a5 - krótki opis", "a5 - długi opis"),
            new Announcement("a6", "a6 - krótki opis", "a6 - długi opis"),
            new Announcement("a7", "a7 - krótki opis", "a7 - długi opis"),
            new Announcement("a8", "a8 - krótki opis", "a8 - długi opis"),
            new Announcement("a9", "a9 - krótki opis", "a9 - długi opis"),
            new Announcement("a10", "a10 - krótki opis", "a10 - długi opis"),
            new Announcement("a11", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a12", "a7 - krótki opis", "a7 - długi opis"),
            new Announcement("a13", "a8 - krótki opis", "a8 - długi opis"),
            new Announcement("a14", "a9 - krótki opis", "a9 - długi opis"),
            new Announcement("a15", "a10 - krótki opis", "a10 - długi opis"),
            new Announcement("a16", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a17", "a7 - krótki opis", "a7 - długi opis"),
            new Announcement("a18", "a8 - krótki opis", "a8 - długi opis"),
            new Announcement("a19", "a9 - krótki opis", "a9 - długi opis"),
            new Announcement("a20", "a10 - krótki opis", "a10 - długi opis"),
            new Announcement("a21", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a22", "a7 - krótki opis", "a7 - długi opis"),
            new Announcement("a23", "a8 - krótki opis", "a8 - długi opis"),
            new Announcement("a24", "a9 - krótki opis", "a9 - długi opis"),
            new Announcement("a25", "a10 - krótki opis", "a10 - długi opis"),
            new Announcement("a26", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a27", "a12 - krótki opis", "a12 - długi opis"),
            new Announcement("a28", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a29", "a7 - krótki opis", "a7 - długi opis"),
            new Announcement("a30", "a8 - krótki opis", "a8 - długi opis"),
            new Announcement("a31", "a9 - krótki opis", "a9 - długi opis"),
            new Announcement("a32", "a10 - krótki opis", "a10 - długi opis"),
            new Announcement("a33", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a34", "a7 - krótki opis", "a7 - długi opis"),
            new Announcement("a35", "a8 - krótki opis", "a8 - długi opis"),
            new Announcement("a36", "a9 - krótki opis", "a9 - długi opis"),
            new Announcement("a37", "a10 - krótki opis", "a10 - długi opis"),
            new Announcement("a38", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a39", "a11 - krótki opis", "a11 - długi opis"),
            new Announcement("a40", "a12 - krótki opis", "a12 - długi opis")
    );

    @Override
    public List<Announcement> getAnnouncements() {
        List list = new ArrayList();
        list.addAll(announcements);
        Collections.reverse(list);
        return list;
    }

    @Override
    public Announcement getAnnouncementByName(String name) {
        return announcements.get(1);
    }
}
