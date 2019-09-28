package com.frb.mdm.core.api.readservice.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Customer implements Serializable {

    int id;
    String name;


    public Customer(int id, String name) {

        this.id=id;
        this.name=name;
    }
}
