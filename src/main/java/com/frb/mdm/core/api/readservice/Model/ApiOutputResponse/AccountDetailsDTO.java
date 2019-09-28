package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDetailsDTO {
    @JsonProperty("AcctID")
    private String acctID;
    @JsonProperty("AcctNbr")
    private String acctNbr;
    @JsonProperty("AcctName")
    private String acctName;
    @JsonProperty("AcctTypeCode")
    private String acctTypeCode;
    @JsonProperty("AcctTypeDesc")
    private String acctTypeDesc;
    @JsonProperty("AcctStatusCode")
    private String acctStatusCode;
    @JsonProperty("AcctStatusDesc")
    private String acctStatusDesc;
    @JsonProperty("PrdCode")
    private String prdCode;
    @JsonProperty("PrdDesc")
    private String prdDesc;
    @JsonProperty("ProductCategory")
    private String productCategory;
    @JsonProperty("AcctCreateDate")
    private String acctCreateDate;
    @JsonProperty("SourceName")
    private String sourceName;
    @JsonProperty("CustodianName")
    private String custodianName;
    @JsonProperty("AcctPrefixCode")
    private String acctPrefixCode;
}
