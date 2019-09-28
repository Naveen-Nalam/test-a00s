package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class AltSrcIDItem extends RowIdObject {
    private String srcIdVal;
    private SrcIdTypCd srcIdTypCd;
}
