package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.Link;
import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

import java.util.List;

@Data
public class PhnTypCd extends RowIdObject {
    private String phnTypCd;
    private String phnTypDesc;
}
