package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

import java.util.Date;

@Data
public class PrtyIDItem extends RowIdObject {
    private String validIDFlg;
    private Date issuedDt;
    private String issuedBy;
    private String idVal;
    private Date expDt;
    private String srcNm;
    private IdTypCd idTypCd;
}
