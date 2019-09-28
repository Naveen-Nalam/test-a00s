package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class GndrCd extends RowIdObject {
    private String gndrDesc;
    private String gndrCd;
}
