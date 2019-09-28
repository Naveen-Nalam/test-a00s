package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.RowIdObject;
import lombok.Data;

@Data
public class PrtyRoleItem extends RowIdObject {
    private PrtyRoleCd prtyRoleCd;
}
