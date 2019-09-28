package com.frb.mdm.core.api.readservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration()
@PropertySource("classpath:global.properties")
@ConfigurationProperties(prefix ="global")
public  class GlobalProperties {
    private String message;
    private String mdmApiBaseUrl;

    public String getMdmApiBaseUrl() {
        return mdmApiBaseUrl;
    }

    public void setMdmApiBaseUrl(String mdmApiBaseUrl) {
        this.mdmApiBaseUrl = mdmApiBaseUrl;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
