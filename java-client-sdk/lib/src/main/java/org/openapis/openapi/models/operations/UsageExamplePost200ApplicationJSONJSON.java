/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsageExamplePost200ApplicationJSONJSON {
    /**
     * A field called email that will have emails generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;

    public UsageExamplePost200ApplicationJSONJSON withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * A field formatted as an email that will have emails generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("formatEmail")
    public String formatEmail;

    public UsageExamplePost200ApplicationJSONJSON withFormatEmail(String formatEmail) {
        this.formatEmail = formatEmail;
        return this;
    }
    
    /**
     * A field formatted as a uri that will have uris generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("formatUri")
    public String formatUri;

    public UsageExamplePost200ApplicationJSONJSON withFormatUri(String formatUri) {
        this.formatUri = formatUri;
        return this;
    }
    
    /**
     * A field formatted as a uuid that will have uuids generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("formatUuid")
    public String formatUuid;

    public UsageExamplePost200ApplicationJSONJSON withFormatUuid(String formatUuid) {
        this.formatUuid = formatUuid;
        return this;
    }
    
    /**
     * A field formatted as a hostname that will have hostnames generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hostname")
    public String hostname;

    public UsageExamplePost200ApplicationJSONJSON withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    
    /**
     * A field formatted as an ipv4 that will have ipv4s generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipv4")
    public String ipv4;

    public UsageExamplePost200ApplicationJSONJSON withIpv4(String ipv4) {
        this.ipv4 = ipv4;
        return this;
    }
    
    /**
     * A field formatted as an ipv6 that will have ipv6s generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipv6")
    public String ipv6;

    public UsageExamplePost200ApplicationJSONJSON withIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("simpleObject")
    public org.openapis.openapi.models.shared.SimpleObject simpleObject;

    public UsageExamplePost200ApplicationJSONJSON withSimpleObject(org.openapis.openapi.models.shared.SimpleObject simpleObject) {
        this.simpleObject = simpleObject;
        return this;
    }
    
    /**
     * A field formatted as an unknown that will have random strings generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unknown")
    public String unknown;

    public UsageExamplePost200ApplicationJSONJSON withUnknown(String unknown) {
        this.unknown = unknown;
        return this;
    }
    
    /**
     * A field called uri that will have uris generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uri")
    public String uri;

    public UsageExamplePost200ApplicationJSONJSON withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
    /**
     * A field called uuid that will have uuids generated as examples
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    public String uuid;

    public UsageExamplePost200ApplicationJSONJSON withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
    public UsageExamplePost200ApplicationJSONJSON(){}
}
