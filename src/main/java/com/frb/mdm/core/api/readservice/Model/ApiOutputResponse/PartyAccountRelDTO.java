package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartyAccountRelDTO {
    @JsonProperty("HubStateInd")
    private String hubStateInd;
    @JsonProperty("SourceRelCode")
    private String sourceRelCode;
    @JsonProperty("SourceRelDesc")
    private String sourceRelDesc;
    @JsonProperty("MDMRelDesc")
    private String mDMRelDesc;
    @JsonProperty("Authority")
    private String authority;
    @JsonProperty("AccountDetails")
    private AccountDetailsDTO accountDetails;
}
