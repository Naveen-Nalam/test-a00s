package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AltSrcIDDTO {
    @JsonProperty("AltSrcIDCode")
    private String altSrcIDCode;
    @JsonProperty("AltSrcIDDesc")
    private String altSrcIDDesc;
    @JsonProperty("AltSrcIDValue")
    private String altSrcIDValue;

}
