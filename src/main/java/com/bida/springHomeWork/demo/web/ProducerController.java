package com.bida.springHomeWork.demo.web;

import com.bida.springHomeWork.demo.domain.Producer;
import com.bida.springHomeWork.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @ModelAttribute("producer")
    public Producer prod() {
        return new Producer();
    }

    @GetMapping("/producers")
    public String getProducers(Model model){
        model.addAttribute("producers", producerService.findAllProducer());
        return "producer";
    }

    @PostMapping("/producers")
    public String saveProducer(@ModelAttribute("producer") Producer producer, BindingResult result){
        System.out.println(producer);
        producerService.saveProducer(producer);
        return "redirect:/producers";
    }

    @GetMapping("/add_producer")
    public String createProducerPage(){
        return "add-producer";
    }

    @DeleteMapping("/producer/{id}")
    public ResponseEntity<Long> deleteProducer(@PathVariable("id") Long id){
        System.out.println("ID: " + id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
