package com.frb.mdm.core.api.readservice.Mapper;

import com.frb.mdm.core.api.readservice.Model.ApiOutputResponse.*;
import com.frb.mdm.core.api.readservice.Model.MDMResponse.AltSrcIDItem;
import com.frb.mdm.core.api.readservice.Model.MDMResponse.PrtyAcctsItem;
import com.frb.mdm.core.api.readservice.Model.MDMResponse.PrtyIDItem;
import com.frb.mdm.core.api.readservice.Model.MDMResponse.PrtyRoleItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PartyMappersRepository {
    @Mappings({
            @Mapping(source = "source.idTypCd.idTypCd", target = "idTypeCode"),
            @Mapping(source = "source.idTypCd.idTypDesc", target = "idTypeDesc"),
            @Mapping(source = "source.validIDFlg", target = "validIdFlg"),
            @Mapping(source = "source.idVal", target = "idValue"),
            @Mapping(source = "source.issuedBy", target = "issuedBy"),
    })
    PartyIDDTO partyIDItemToPartyIDDTO(PrtyIDItem source);

    @Mappings({
            @Mapping(source = "source.srcIdTypCd.srcIdTypeCd", target = "altSrcIDCode"),
            @Mapping(source = "source.srcIdTypCd.srcIdDesc", target = "altSrcIDDesc"),
            @Mapping(source = "source.srcIdVal", target = "altSrcIDValue")
    })
    AltSrcIDDTO partyIDAltSrcTOAltSrcIDDTO(AltSrcIDItem source);

    @Mappings({
            @Mapping(source = "source.prtyRoleCd.prtyRoleCd", target = "roleCode"),
            @Mapping(source = "source.prtyRoleCd.prtyRoleDesc", target = "roleDesc")
    })
    PartyRoleDTO partyRoleToPartyRoleDTO(PrtyRoleItem source);

    @Mappings({
            @Mapping(source = "source.srcRelTypeKey.srcRelCd", target = "sourceRelCode"),
            @Mapping(source = "source.srcRelTypeKey.mdmRelDesc", target = "MDMRelDesc"),
            @Mapping(ignore = true, target = "hubStateInd"),
            @Mapping(source = "source.srcRelTypeKey.authority", target = "authority"),
            @Mapping(source = "source", target = "accountDetails", qualifiedByName = "accountDetailsDTOMapper"),
            @Mapping(source = "source.srcRelTypeKey.srcRelDesc", target = "sourceRelDesc")
    })
    PartyAccountRelDTO partyAccItemTOPartyAccountRelDTO(PrtyAcctsItem source);

    @Mappings({
            @Mapping(ignore = true, target = "acctID"),
            @Mapping(source = "source.account.acctNbr", target = "acctNbr"),
            @Mapping(source = "source.account.acctNm", target = "acctName"),
            @Mapping(source = "source.account.acctTypCd.acctTypCd", target = "acctTypeCode"),
            @Mapping(source = "source.account.acctTypCd.acctTypDesc", target = "acctTypeDesc"),
            @Mapping(source = "source.account.acctStatInd.acctStatInd", target = "acctStatusCode"),
            @Mapping(source = "source.account.acctStatInd.acctStatDesc", target = "acctStatusDesc"),
            @Mapping(source = "source.account.prdKey.prdCd", target = "prdCode"),
            @Mapping(source = "source.account.prdKey.prdDesc", target = "prdDesc"),
            @Mapping(source = "source.account.prdKey.prdCtgry", target = "productCategory"),
            @Mapping(source = "source.account.acctCrtDt", target = "acctCreateDate"),
            @Mapping(source = "source.account.srcNm", target = "sourceName"),
            @Mapping(source = "source.account.custodianNm", target = "custodianName"),
            @Mapping(source = "source.account.srcAcctPrfxCd", target = "acctPrefixCode")
    })
    AccountDetailsDTO partyAccToAccountDetailsDTO(PrtyAcctsItem source);

    @Named("accountDetailsDTOMapper")
    default List<AccountDetailsDTO> partyAccListToPartyAccountRelDTOList(List<PrtyAcctsItem> sourceList) {
        List<AccountDetailsDTO> outputList = new ArrayList<AccountDetailsDTO>();
        sourceList.forEach(item -> {
            outputList.add(partyAccToAccountDetailsDTO(item));
        });
        return outputList;
    }
}
