/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BasicAuth {
    @JsonProperty("password")
    public String password;

    public BasicAuth withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("username")
    public String username;

    public BasicAuth withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public BasicAuth(@JsonProperty("username") String username, @JsonProperty("password") String password) {
        this.username = username;
        this.password = password;
  }
}
