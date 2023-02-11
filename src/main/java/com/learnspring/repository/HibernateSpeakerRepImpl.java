package com.learnspring.repository;

import com.learnspring.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Barack");
        speaker.setLastName("Obama");

        speakers.add(speaker);

        return speakers;

    }
}
