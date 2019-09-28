package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public  class AcctStatInd extends RowIdObject {
    private String acctStatInd;
    private String acctStatDesc;
}
