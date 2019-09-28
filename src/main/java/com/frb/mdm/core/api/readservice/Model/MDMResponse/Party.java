package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class Party extends RowIdObject {
    private String EmplyrPosn;
    private String emplyrNm;
    private String validTaxIDFlg;
    private String taxIdNbr;
    private String lastNm;
    private String brthDt;
    private String taxIdType;
    private String boClassCd;
    private String midNm;
    private String srcNm;
    private String matchDOB;
    private String custCreateDt;
    private String maidenNm;
    private String resCntryCd;
    @JsonProperty("prtyNm")
    private String partyName;
    private String frstNm;
    private GndrCd gndrCd;
    private PrtySupType prtySupType;
    private PrtyType prtyType;
    private PrtySubType prtySubType;
    @JsonProperty("PrtyID")
    private PrtyID prtyID;
    @JsonProperty("PrtyRole")
    private PrtyRole prtyRole;
    @JsonProperty("PrtyOffcr")
    private PrtyOffcr prtyOffcr;
    @JsonProperty("PrtyAccts")
    private PrtyAccts prtyAccts;
    @JsonProperty("PrtyAddr")
    private PrtyAddr prtyAddr;
    @JsonProperty("PrtyColln")
    private PrtyColln prtyColln;
    @JsonProperty("Phone")
    private Phone Phone;
    @JsonProperty("AltSrcID")
    private AltSrcID altSrcID;
    @JsonProperty("PrtyNm")
    private PrtyNm prtyNm;
    @JsonProperty("ElecAddr")
    private ElecAddr elecAddr;
    @JsonProperty("PrtyPref")
    private PrtyPref prtyPref;
}
