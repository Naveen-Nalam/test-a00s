package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartyIDDTO {
    @JsonProperty("IdTypeCode")
    private String idTypeCode;
    @JsonProperty("IdTypeDesc")
    private String idTypeDesc;
    @JsonProperty("ValidIdFlg")
    private String validIdFlg;
    @JsonProperty("IdValue")
    private String idValue;
    @JsonProperty("IssuedBy")
    private String issuedBy;


}
