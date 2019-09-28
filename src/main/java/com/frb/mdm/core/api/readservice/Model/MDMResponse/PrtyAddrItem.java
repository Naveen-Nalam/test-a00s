package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyAddrItem extends RowIdObject {
    private String srcNm;
    private String priLglAddrFlg;
    private AddrTypCd addrTypCd;
    @JsonProperty("Address")
    private Address address;
    private String priMailAddrFlg;
}
