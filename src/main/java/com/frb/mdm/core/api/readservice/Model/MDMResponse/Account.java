package com.frb.mdm.core.api.readservice.Model.MDMResponse;

import com.frb.mdm.core.api.readservice.Model.Common.Link;
import lombok.Data;

import java.util.List;

@Data
public class Account {
    private List<Link> link;
    private String rowidObject;
}
