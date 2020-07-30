package com.bida.springHomeWork.demo.service;

import com.bida.springHomeWork.demo.domain.Producer;
import com.bida.springHomeWork.demo.repository.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepository;

    public List<Producer> findAllProducer(){
        return producerRepository.findAll();
    }


    public void saveProducer(Producer producer){
        producerRepository.saveAndFlush(producer);
    }

    public void deleteProducer(Long id){
        producerRepository.deleteById(id);
    }
}
