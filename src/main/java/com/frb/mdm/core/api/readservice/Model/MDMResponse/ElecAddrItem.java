package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class ElecAddrItem extends RowIdObject {
    private String elecAddr;
    private String srcNm;
    private String validEmailFlg;
    private ElecAddrTypCd elecAddrTypCd;
}
