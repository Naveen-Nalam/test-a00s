package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class Address extends RowIdObject {
    private String cntyNm;
    private String pstlExtn;
    private String srcPstlExtn;
    private String srcPstlCd;
    private String longitude;
    private String srcCityNm;
    private String addrTypCd;
    private String latitude;
    private String cityNm;
    private String streetTyp;
    private String srcAddrLine1;
    private String stateProvNm;
    private String validAddrFlg;
    private String srcState;
    private String streetNm;
    private String addrLine1;
    private String procStatDesc;
    private String stateProvCd;
    private String srcCntry;
    private String houseNbr;
    private String pstlCd;
    private String cntryCd;
}
