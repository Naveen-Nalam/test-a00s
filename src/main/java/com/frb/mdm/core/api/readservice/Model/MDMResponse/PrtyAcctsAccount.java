package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

import java.util.Date;

@Data
public class PrtyAcctsAccount extends RowIdObject {
    private Date acctCloseDt;
    private String allHoldCd;
    private String acctCrtDt;
    private String taxIdNbr;
    private String brNbr;
    private String acctOrigOpenDt;
    private String custodianNm;
    private String vstngNm;
    private String taxIdType;
    private String boClassCd;
    private String srcNm;
    private String acctFndngDt;
    private String acctNbr;
    private String acctNm;
    private String srcAcctPrfxCd;
    private String validTaxIDFlg;
    private AcctStatInd acctStatInd;
    private PrdKey prdKey;
    private PrtyAcctTypCd acctTypCd;
}