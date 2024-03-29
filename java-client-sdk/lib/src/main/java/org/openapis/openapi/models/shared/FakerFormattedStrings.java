/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FakerFormattedStrings - A set of strings with format values that lead to relevant examples being generated for them
 */

public class FakerFormattedStrings {
    /**
     * A field that will have an address generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addressFormat")
    public String addressFormat;

    public FakerFormattedStrings withAddressFormat(String addressFormat) {
        this.addressFormat = addressFormat;
        return this;
    }
    
    /**
     * A field that will have a directory path generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("directoryFormat")
    public String directoryFormat;

    public FakerFormattedStrings withDirectoryFormat(String directoryFormat) {
        this.directoryFormat = directoryFormat;
        return this;
    }
    
    /**
     * A field that will have a domain name generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domainFormat")
    public String domainFormat;

    public FakerFormattedStrings withDomainFormat(String domainFormat) {
        this.domainFormat = domainFormat;
        return this;
    }
    
    /**
     * A field that will have an email address generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailFormat")
    public String emailFormat;

    public FakerFormattedStrings withEmailFormat(String emailFormat) {
        this.emailFormat = emailFormat;
        return this;
    }
    
    /**
     * A field that will have a filename generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filenameFormat")
    public String filenameFormat;

    public FakerFormattedStrings withFilenameFormat(String filenameFormat) {
        this.filenameFormat = filenameFormat;
        return this;
    }
    
    /**
     * A field that will have a file path generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filepathFormat")
    public String filepathFormat;

    public FakerFormattedStrings withFilepathFormat(String filepathFormat) {
        this.filepathFormat = filepathFormat;
        return this;
    }
    
    /**
     * A field that will have a image url generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("imageFormat")
    public String imageFormat;

    public FakerFormattedStrings withImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    
    /**
     * A field that will have an IPv4 address generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipv4Format")
    public String ipv4Format;

    public FakerFormattedStrings withIpv4Format(String ipv4Format) {
        this.ipv4Format = ipv4Format;
        return this;
    }
    
    /**
     * A field that will have an IPv6 address generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipv6Format")
    public String ipv6Format;

    public FakerFormattedStrings withIpv6Format(String ipv6Format) {
        this.ipv6Format = ipv6Format;
        return this;
    }
    
    /**
     * A field that will have a JSON generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jsonFormat")
    public String jsonFormat;

    public FakerFormattedStrings withJsonFormat(String jsonFormat) {
        this.jsonFormat = jsonFormat;
        return this;
    }
    
    /**
     * A field that will have a MAC address generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("macFormat")
    public String macFormat;

    public FakerFormattedStrings withMacFormat(String macFormat) {
        this.macFormat = macFormat;
        return this;
    }
    
    /**
     * A field that will have a fake password generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passwordFormat")
    public String passwordFormat;

    public FakerFormattedStrings withPasswordFormat(String passwordFormat) {
        this.passwordFormat = passwordFormat;
        return this;
    }
    
    /**
     * A field that will have a phone number generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phoneFormat")
    public String phoneFormat;

    public FakerFormattedStrings withPhoneFormat(String phoneFormat) {
        this.phoneFormat = phoneFormat;
        return this;
    }
    
    /**
     * A field that will have a timezone generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezoneFormat")
    public String timezoneFormat;

    public FakerFormattedStrings withTimezoneFormat(String timezoneFormat) {
        this.timezoneFormat = timezoneFormat;
        return this;
    }
    
    /**
     * A field that will have random words generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unknownFormat")
    public String unknownFormat;

    public FakerFormattedStrings withUnknownFormat(String unknownFormat) {
        this.unknownFormat = unknownFormat;
        return this;
    }
    
    /**
     * A field that will have a URL generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("urlFormat")
    public String urlFormat;

    public FakerFormattedStrings withUrlFormat(String urlFormat) {
        this.urlFormat = urlFormat;
        return this;
    }
    
    /**
     * A field that will have a UUID generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuidFormat")
    public String uuidFormat;

    public FakerFormattedStrings withUuidFormat(String uuidFormat) {
        this.uuidFormat = uuidFormat;
        return this;
    }
    
    /**
     * A field that will have a postal code generated as example
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("zipcodeFormat")
    public String zipcodeFormat;

    public FakerFormattedStrings withZipcodeFormat(String zipcodeFormat) {
        this.zipcodeFormat = zipcodeFormat;
        return this;
    }
    
    public FakerFormattedStrings(){}
}
