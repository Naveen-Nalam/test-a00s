package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.Link;
import com.frb.mdm.core.api.readservice.Model.Common.RecordDetails;
import lombok.Data;

import java.util.List;

@Data
public class PrtyID extends RecordDetails {
    private List<Link> link;
    private List<PrtyIDItem> item;
}
