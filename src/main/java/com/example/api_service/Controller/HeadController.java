package com.example.api_service.Controller;

import com.example.api_service.Model.RequestDTO;
import com.example.api_service.Model.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;


@RestController
public class HeadController {

    //    Randomized TRUE / FALSE
    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
        //I tried another approaches here, still the same result
    }

    //    Randomized INT in lim1-lim2
    public int getRandomInt(int start, int end) {
        int number = ThreadLocalRandom.current().nextInt(start, end);
        return number;
    }

    //    Logging init
    private Logger log = LoggerFactory.getLogger(HeadController.class);
//    ObjectMapper mapper = new ObjectMapper();

    //    POST - request clearance - handler declaration
    @PostMapping(value = "/info/postBalances", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object request_clearance(@RequestBody RequestDTO requestDTO) {
        ResponseDTO response = new ResponseDTO();
        response.setInternal_ID(getRandomInt(1000, 2000));
        response.setIs_clearance_allowed(getRandomBoolean());
        response.setIs_passed_check(getRandomBoolean());
        log.info(String.format("[API] Returned: %s", response));
        return response;
    }
}



