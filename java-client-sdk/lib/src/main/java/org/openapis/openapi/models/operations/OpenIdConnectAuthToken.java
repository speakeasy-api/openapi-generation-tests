/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OpenIdConnectAuthToken - Successful authentication.
 */

public class OpenIdConnectAuthToken {
    @JsonProperty("authenticated")
    public Boolean authenticated;

    public OpenIdConnectAuthToken withAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }
    
    @JsonProperty("token")
    public String token;

    public OpenIdConnectAuthToken withToken(String token) {
        this.token = token;
        return this;
    }
    
    public OpenIdConnectAuthToken(@JsonProperty("authenticated") Boolean authenticated, @JsonProperty("token") String token) {
        this.authenticated = authenticated;
        this.token = token;
  }
}