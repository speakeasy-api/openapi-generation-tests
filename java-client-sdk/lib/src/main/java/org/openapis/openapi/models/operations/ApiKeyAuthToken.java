/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiKeyAuthToken - Successful authentication.
 */

public class ApiKeyAuthToken {
    @JsonProperty("authenticated")
    public Boolean authenticated;

    public ApiKeyAuthToken withAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }
    
    @JsonProperty("token")
    public String token;

    public ApiKeyAuthToken withToken(String token) {
        this.token = token;
        return this;
    }
    
    public ApiKeyAuthToken(@JsonProperty("authenticated") Boolean authenticated, @JsonProperty("token") String token) {
        this.authenticated = authenticated;
        this.token = token;
  }
}
