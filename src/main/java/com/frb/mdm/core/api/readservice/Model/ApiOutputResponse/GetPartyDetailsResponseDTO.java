package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPartyDetailsResponseDTO {
    private PartyDetailsDTO partyDetails;
}
