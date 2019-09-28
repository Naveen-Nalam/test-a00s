package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyCollnItem extends RowIdObject {
    private String collAttrVal;
    private CollAttrCd collAttrCd;
}
