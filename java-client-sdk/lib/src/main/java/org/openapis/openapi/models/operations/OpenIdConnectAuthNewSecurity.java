/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class OpenIdConnectAuthNewSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=openIdConnect,name=Authorization")
    public String openIdConnect;

    public OpenIdConnectAuthNewSecurity withOpenIdConnect(String openIdConnect) {
        this.openIdConnect = openIdConnect;
        return this;
    }
    
    public OpenIdConnectAuthNewSecurity(@JsonProperty("openIdConnect") String openIdConnect) {
        this.openIdConnect = openIdConnect;
  }
}
