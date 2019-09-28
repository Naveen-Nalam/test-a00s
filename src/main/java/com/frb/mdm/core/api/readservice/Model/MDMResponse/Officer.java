package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;


@Data
public class Officer extends RowIdObject {
    private String empStatus;
    private String regionNm;
    private String personId;
    private String grpInitFlg;
    private String initials;
    private String grpngNm;
    private String frstNm;
    private String deptNm;
    private String superRegionNm;
    private String lastNm;
    private String supPersonId;
    private String jobFn;
}
