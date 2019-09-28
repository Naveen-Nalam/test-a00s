package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PhoneItem extends RowIdObject {
    private String phnNbr;
    private String validPhnFlg;
    private String srcNm;
    private String phnExt;
    private PhnTypCd phnTypCd;
}
