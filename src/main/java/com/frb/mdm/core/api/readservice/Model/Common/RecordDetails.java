package com.frb.mdm.core.api.readservice.Model.Common;


import lombok.Data;

@Data
public class RecordDetails {
    private Integer firstRecord;
    private Integer pageSize;
    private String searchToken;
}
