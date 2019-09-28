package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyNmItem extends RowIdObject {
    private String srcNm;
    private String nmVal;
    private NmTypCd nmTypCd;
}
