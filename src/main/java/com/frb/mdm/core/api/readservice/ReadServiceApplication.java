package com.frb.mdm.core.api.readservice;

import com.frb.mdm.core.api.readservice.Model.Customer;
import com.frb.mdm.core.api.readservice.config.GlobalProperties;
import com.frb.mdm.core.api.readservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalProperties.class)
public class ReadServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReadServiceApplication.class, args);
	}


    @Autowired
    DataSource dataSource;

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("DATASOURCE = " + dataSource);

        /// Get dbcp2 datasource settings
        // BasicDataSource newds = (BasicDataSource) dataSource;
        // System.out.println("BasicDataSource = " + newds.getInitialSize());

        System.out.println("Display all customers...");
        List<Customer> list = customerRepository.findAll();
        list.forEach(x -> System.out.println(x));

        System.out.println("Done!");

    }


}
