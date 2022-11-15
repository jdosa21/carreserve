package com.car.car.service;

import com.car.car.entity.Journal;
import com.car.car.entity.Reserve;
import com.car.car.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {
    @Autowired
    public JournalRepository journalRepository;

    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }
    public void create(Journal journal){
        journalRepository.save(journal);
    } // post한 내용 저장

    public List<Journal> journalList(){
        return journalRepository.findAll();
    }
}
