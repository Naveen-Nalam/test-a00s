package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class RelTypCd extends RowIdObject {
    private String relTypCd;
    private String relTypDesc;
}
