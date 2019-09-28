package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class SrcRelTypeKey extends RowIdObject {
    private String srcRelDesc;
    private String authority;
    private String srcRelCd;
    private String mdmRelDesc;
    private String comments;
    private String relSrcNm;
}
