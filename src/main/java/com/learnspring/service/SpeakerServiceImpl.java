package com.learnspring.service;

import com.learnspring.model.Speaker;
import com.learnspring.repository.HibernateSpeakerRepImpl;
import com.learnspring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepImpl();
    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
