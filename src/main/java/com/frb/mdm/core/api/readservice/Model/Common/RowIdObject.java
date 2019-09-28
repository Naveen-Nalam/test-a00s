package com.frb.mdm.core.api.readservice.Model.Common;

import lombok.Data;

import java.util.List;

@Data
public class RowIdObject {
    private List<Link> link;
    private String rowidObject;
    private String label;
}
