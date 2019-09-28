package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyAcctTypCd extends RowIdObject {
    private String acctTypCd;
    private String acctTypDesc;
}
