package com.example.demo.service;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public DemoModel saveUser(DemoModel user) {
        return demoRepository.save(user);
    }

    public DemoModel findUserByUsername(String username) {
        return demoRepository.findByUsername(username);
    }
}
