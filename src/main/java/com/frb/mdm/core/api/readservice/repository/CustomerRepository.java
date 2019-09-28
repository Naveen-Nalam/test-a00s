package com.frb.mdm.core.api.readservice.repository;

import com.frb.mdm.core.api.readservice.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // thanks Java 8, look the custom RowMapper
    public List<Customer> findAll() {

        List<Customer> result = jdbcTemplate.query(
                "select  ca.catalog_name,s.id from INFORMATION_SCHEMA.CATALOGS ca, INFORMATION_SCHEMA.SCHEMATA" +
                        "  s where s.id=0 ",
                (rs, rowNum) -> new Customer(rs.getInt("id"),
                        rs.getString("catalog_name"))
        );

        /*List<Customer> result = jdbcTemplate.query(
                "SELECT * FROM INFORMATION_SCHEMA.USERS ",
                (rs, rowNum) -> new Customer(rs.getInt("ID"),
                        rs.getString("NAME"))
        );*/

//        select  ca.catalog_name,s.id from INFORMATION_SCHEMA.CATALOGS ca, INFORMATION_SCHEMA.SCHEMATA  s where s.id=0


        return result;

    }
}
