package org.example.recapdependency.services;

import org.springframework.stereotype.Service;

@Service
public class greetingServiceImpl implements greetingService {
    @Override
    public String sayGreet() {
        return "Hello from Base Service!!!";
    }
}
