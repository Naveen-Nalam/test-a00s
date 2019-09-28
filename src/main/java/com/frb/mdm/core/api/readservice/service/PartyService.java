package com.frb.mdm.core.api.readservice.service;

import com.frb.mdm.core.api.readservice.Model.MDMResponse.Party;
import com.frb.mdm.core.api.readservice.config.GlobalProperties;
import com.frb.mdm.core.api.readservice.core.RestRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
    @Autowired
    private GlobalProperties globalProperties;
    @Autowired
    private RestRequestHandler restRequestHandler;

    public Party getPartyDetails() {
        ResponseEntity response = this.restRequestHandler.get(globalProperties.getMdmApiBaseUrl(), Party.class);
        if(response.getStatusCode() == HttpStatus.OK) {
            return (Party) response.getBody();
        }
        else {
            return null;
        }
    }
}
