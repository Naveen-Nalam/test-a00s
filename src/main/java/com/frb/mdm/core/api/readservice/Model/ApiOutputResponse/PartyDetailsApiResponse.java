package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PartyDetailsApiResponse {
    @JsonProperty("GetPartyDetailsResponse")
    private GetPartyDetailsResponseDTO getPartyDetailsResponseDTO;
}
