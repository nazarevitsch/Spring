package com.bida.springHomeWork.demo.web;

import com.bida.springHomeWork.demo.domain.Producer;
import com.bida.springHomeWork.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producers")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Producer> getProducers(){
        return producerService.findAllProducer();
    }
}
