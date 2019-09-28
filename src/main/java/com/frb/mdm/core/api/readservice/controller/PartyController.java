package com.frb.mdm.core.api.readservice.controller;

import com.frb.mdm.core.api.readservice.Mapper.PartyMapper;
import com.frb.mdm.core.api.readservice.Model.ApiOutputResponse.GetPartyDetailsResponseDTO;
import com.frb.mdm.core.api.readservice.Model.ApiOutputResponse.PartyDetailsApiResponse;
import com.frb.mdm.core.api.readservice.Model.ApiOutputResponse.PartyDetailsDTO;
import com.frb.mdm.core.api.readservice.Model.MDMResponse.Party;
import com.frb.mdm.core.api.readservice.service.PartyService;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyController {

    private static final Logger log = LoggerFactory.getLogger(PartyController.class);

    private PartyMapper partyMapper = Mappers.getMapper(PartyMapper.class);

    @Autowired
    private PartyService partyService;

    @GetMapping("/party")
    public PartyDetailsApiResponse getPartyDetails() {
        try {
            Party party = this.partyService.getPartyDetails();
            return partyMapper.partyToPartyDetailsApiResponse(party);
        }
        catch (NullPointerException ex){
            String message = "No data available";
            this.log.error(message);
            throw new NullPointerException(message);
        }
    }

}
