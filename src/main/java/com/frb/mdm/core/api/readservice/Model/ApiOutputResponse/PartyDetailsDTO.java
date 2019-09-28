package com.frb.mdm.core.api.readservice.Model.ApiOutputResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartyDetailsDTO {
    @JsonProperty("PrtyID")
    public String prtyID;
    @JsonProperty("PartyName")
    private String partyName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("PartySuperTypeCode")
    private String partySuperTypeCode;
    @JsonProperty("PartySuperTypeDesc")
    private String partySuperTypeDesc;
    @JsonProperty("TaxIDType")
    private String taxIDType;
    @JsonProperty("TaxID")
    private String taxID;
    @JsonProperty("BirthDate")
    private String birthDate;
    @JsonProperty("PartyTypeCode")
    private String partyTypeCode;
    @JsonProperty("PartyTypeDesc")
    private String partyTypeDesc;
    @JsonProperty("PartySubTypeCode")
    private String partySubTypeCode;
    @JsonProperty("PartySubTypeDesc")
    private String partySubTypeDesc;
    @JsonProperty("MaidenName")
    private String maidenName;
    @JsonProperty("GenderCode")
    private String genderCode;
    @JsonProperty("PartyStatusCode")
    private String partyStatusCode;
    @JsonProperty("PartyStatusDesc")
    private String partyStatusDesc;
    @JsonProperty("PartyCreateDate")
    private String partyCreateDate;
    @JsonProperty("W8Flg")
    private String w8Flg;
    @JsonProperty("EmplyrName")
    private String emplyrName;
    @JsonProperty("EmplymtPos")
    private String emplymtPos;
    @JsonProperty("PartyAccountRel")
    private List<PartyAccountRelDTO> partyAccountRel;
    @JsonProperty("PartyXREF")
    private List<PartyXREFDTO> partyXREF;
    @JsonProperty("PartyID")
    private List<PartyIDDTO> partyID;
    @JsonProperty("PartyRole")
    private List<PartyRoleDTO> partyRole;
    @JsonProperty("AltSrcID")
    private  List<AltSrcIDDTO> altSrcID;
}
