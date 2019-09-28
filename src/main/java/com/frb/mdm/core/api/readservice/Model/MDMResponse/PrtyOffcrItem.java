package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyOffcrItem extends RowIdObject {
    private RelTypCd relTypCd;
    @JsonProperty("Officer")
    private Officer officer;
}
