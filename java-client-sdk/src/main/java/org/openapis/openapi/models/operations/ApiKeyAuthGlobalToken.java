/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;
/**
 * ApiKeyAuthGlobalToken - Successful authentication.
 */

public class ApiKeyAuthGlobalToken {

    @JsonProperty("authenticated")
    private boolean authenticated;

    @JsonProperty("token")
    private String token;

    @JsonCreator
    public ApiKeyAuthGlobalToken(
            @JsonProperty("authenticated") boolean authenticated,
            @JsonProperty("token") String token) {
        Utils.checkNotNull(authenticated, "authenticated");
        Utils.checkNotNull(token, "token");
        this.authenticated = authenticated;
        this.token = token;
    }

    @JsonIgnore
    public boolean authenticated() {
        return authenticated;
    }

    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApiKeyAuthGlobalToken withAuthenticated(boolean authenticated) {
        Utils.checkNotNull(authenticated, "authenticated");
        this.authenticated = authenticated;
        return this;
    }

    public ApiKeyAuthGlobalToken withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiKeyAuthGlobalToken other = (ApiKeyAuthGlobalToken) o;
        return 
            java.util.Objects.deepEquals(this.authenticated, other.authenticated) &&
            java.util.Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authenticated,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiKeyAuthGlobalToken.class,
                "authenticated", authenticated,
                "token", token);
    }
    
    public final static class Builder {
 
        private Boolean authenticated;
 
        private String token;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder authenticated(boolean authenticated) {
            Utils.checkNotNull(authenticated, "authenticated");
            this.authenticated = authenticated;
            return this;
        }

        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public ApiKeyAuthGlobalToken build() {
            return new ApiKeyAuthGlobalToken(
                authenticated,
                token);
        }
    }
}
