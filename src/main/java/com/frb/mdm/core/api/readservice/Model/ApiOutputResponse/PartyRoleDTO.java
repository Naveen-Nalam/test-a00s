package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartyRoleDTO {
    @JsonProperty("RoleCode")
    private String roleCode;
    @JsonProperty("RoleDesc")
    private String roleDesc;
}
