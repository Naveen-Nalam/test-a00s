package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrefTypCd extends RowIdObject {
    private String prefTypCd;
    private String prefTypDesc;
}
