package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;


@Data
public class PrtySupType extends RowIdObject {
    private String prtySuptypDesc;
    private String prtySuptypCd;
}
