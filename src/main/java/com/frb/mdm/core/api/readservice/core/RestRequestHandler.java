package com.frb.mdm.core.api.readservice.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestRequestHandler {
    private RestTemplate restTemplate;

    public RestRequestHandler() {
        this.restTemplate = new RestTemplate();
    }

    public <T> ResponseEntity<T> get(String url, Class<T> model)  {
        T response = this.restTemplate.getForObject(url, model);
        if(response != null) {
            return new ResponseEntity<T>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
