package com.frb.mdm.core.api.readservice.Mapper;

import com.frb.mdm.core.api.readservice.Model.ApiOutputResponse.*;
import com.frb.mdm.core.api.readservice.Model.MDMResponse.*;
import org.mapstruct.factory.Mappers;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PartyMapper {
    PartyMappersRepository repository = Mappers.getMapper(PartyMappersRepository.class);

    @Mappings({
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.prtyID", ignore = true),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyName", source = "entity.partyName"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.firstName", source = "entity.frstNm"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.lastName", source = "entity.lastNm"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partySuperTypeCode", source = "entity.prtySupType.prtySuptypCd"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partySuperTypeDesc", source = "entity.prtySupType.prtySuptypDesc"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.taxIDType", source = "entity.taxIdType"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.taxID", source = "entity.taxIdNbr"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.birthDate", source = "entity.brthDt"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyTypeCode", source = "entity.prtyType.prtyTypCd"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partySubTypeCode", source = "entity.prtySubType.prtySubtypCd"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partySubTypeDesc", source = "entity.prtySubType.prtySubtypDesc"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.maidenName", source = "entity.maidenNm"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.genderCode", source = "entity.gndrCd.gndrCd"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyStatusCode", ignore = true),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyStatusDesc", ignore = true),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyCreateDate", ignore = true),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.w8Flg", ignore = true),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.emplyrName", source = "entity.emplyrNm"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.emplymtPos", source = "entity.emplyrPosn"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyAccountRel", source = "entity.prtyAccts.item", qualifiedByName ="PartyAccountRelDTOMapper"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.altSrcID", source = "entity.altSrcID.item", qualifiedByName = "AltSrcIDDTOMapper"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyID", source = "entity.prtyID.item", qualifiedByName = "PartyIDDTOMapper"),
            @Mapping(target = "getPartyDetailsResponseDTO.partyDetails.partyRole", source = "entity.prtyRole.item", qualifiedByName = "PartyRoleDTOMapper")
    })
    PartyDetailsApiResponse partyToPartyDetailsApiResponse(Party entity);

    @Named("PartyIDDTOMapper")
    default List<PartyIDDTO> partyIDItemsListToPartyIDDTOList(List<PrtyIDItem> sourceList) {
        List<PartyIDDTO> outputList = new ArrayList<PartyIDDTO>();
        sourceList.forEach(item -> {
           outputList.add(repository.partyIDItemToPartyIDDTO(item));
        });
        return outputList;
    }

    @Named("AltSrcIDDTOMapper")
    default List<AltSrcIDDTO> AltSrcIDToAltSrcIDDTO(List<AltSrcIDItem> sourceList) {
        List<AltSrcIDDTO> outputList = new ArrayList<AltSrcIDDTO>();
        sourceList.forEach(item -> {
            outputList.add(repository.partyIDAltSrcTOAltSrcIDDTO(item));
        });
        return outputList;
    }

    @Named("PartyRoleDTOMapper")
    default List<PartyRoleDTO> partyRoleToPartyRoleDTO(List<PrtyRoleItem> sourceList) {
        List<PartyRoleDTO> outputList = new ArrayList<PartyRoleDTO>();
        sourceList.forEach(item -> {
            outputList.add(repository.partyRoleToPartyRoleDTO(item));
        });
        return outputList;
    }

    @Named("PartyAccountRelDTOMapper")
    default List<PartyAccountRelDTO> partyAccItemTOPartyAccountRelDTO(List<PrtyAcctsItem> sourceList) {
        List<PartyAccountRelDTO> outputList = new ArrayList<PartyAccountRelDTO>();
        sourceList.forEach(item -> {
            outputList.add(repository.partyAccItemTOPartyAccountRelDTO(item));
        });
        return outputList;
    }
}
