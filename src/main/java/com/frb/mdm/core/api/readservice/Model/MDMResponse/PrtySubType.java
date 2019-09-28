package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtySubType extends RowIdObject {
    private String prtySubtypDesc;
    private String prtySubtypCd;
}
