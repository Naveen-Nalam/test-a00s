package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrdKey extends RowIdObject {
    private String prdDesc;
    private String prdSrc;
    private String hostDesc;
    private String busPersInd;
    private String prdCd;
    private String prdGLCd;
    private String prdStatInd;
    private String prdCtgry;
}
