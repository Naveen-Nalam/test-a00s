package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyAcctsItem extends RowIdObject {
    private String relTypeCode;
    private String hierarchyCode;
    private String srcNm;
    private SrcRelTypeKey srcRelTypeKey;
    @JsonProperty("Account")
    private PrtyAcctsAccount account;
}
