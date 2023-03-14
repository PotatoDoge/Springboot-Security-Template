package com.prueba.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping("/api/v1/demo")
public class DemoController {

    /**
     * TESTING PURPOSES ONLY
     * You can only access this endpoint if the user is authenticated and authorized
     * @return message
     */
    @GetMapping
    public ResponseEntity<?> sayHello(){
        return ResponseEntity.ok("Hello world from secure endpoint");
    }

}
