package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyPrefItem extends RowIdObject {
    private String prefVal;
    private PrefTypCd prefTypCd;
}
