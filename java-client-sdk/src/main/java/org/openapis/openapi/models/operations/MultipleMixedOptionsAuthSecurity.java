/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class MultipleMixedOptionsAuthSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=x-api-key")
    private Optional<? extends String> apiKeyAuthNew;

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic")
    private Optional<? extends org.openapis.openapi.models.shared.SchemeBasicAuth> basicAuth;

    public MultipleMixedOptionsAuthSecurity(
            Optional<? extends String> apiKeyAuthNew,
            Optional<? extends org.openapis.openapi.models.shared.SchemeBasicAuth> basicAuth) {
        Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.apiKeyAuthNew = apiKeyAuthNew;
        this.basicAuth = basicAuth;
    }

    public Optional<? extends String> apiKeyAuthNew() {
        return apiKeyAuthNew;
    }

    public Optional<? extends org.openapis.openapi.models.shared.SchemeBasicAuth> basicAuth() {
        return basicAuth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MultipleMixedOptionsAuthSecurity withApiKeyAuthNew(String apiKeyAuthNew) {
        Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
        this.apiKeyAuthNew = Optional.ofNullable(apiKeyAuthNew);
        return this;
    }

    public MultipleMixedOptionsAuthSecurity withApiKeyAuthNew(Optional<? extends String> apiKeyAuthNew) {
        Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
        this.apiKeyAuthNew = apiKeyAuthNew;
        return this;
    }

    public MultipleMixedOptionsAuthSecurity withBasicAuth(org.openapis.openapi.models.shared.SchemeBasicAuth basicAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.basicAuth = Optional.ofNullable(basicAuth);
        return this;
    }

    public MultipleMixedOptionsAuthSecurity withBasicAuth(Optional<? extends org.openapis.openapi.models.shared.SchemeBasicAuth> basicAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.basicAuth = basicAuth;
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
        MultipleMixedOptionsAuthSecurity other = (MultipleMixedOptionsAuthSecurity) o;
        return 
            java.util.Objects.deepEquals(this.apiKeyAuthNew, other.apiKeyAuthNew) &&
            java.util.Objects.deepEquals(this.basicAuth, other.basicAuth);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKeyAuthNew,
            basicAuth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MultipleMixedOptionsAuthSecurity.class,
                "apiKeyAuthNew", apiKeyAuthNew,
                "basicAuth", basicAuth);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> apiKeyAuthNew = Optional.empty();
 
        private Optional<? extends org.openapis.openapi.models.shared.SchemeBasicAuth> basicAuth = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKeyAuthNew(String apiKeyAuthNew) {
            Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
            this.apiKeyAuthNew = Optional.ofNullable(apiKeyAuthNew);
            return this;
        }

        public Builder apiKeyAuthNew(Optional<? extends String> apiKeyAuthNew) {
            Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
            this.apiKeyAuthNew = apiKeyAuthNew;
            return this;
        }

        public Builder basicAuth(org.openapis.openapi.models.shared.SchemeBasicAuth basicAuth) {
            Utils.checkNotNull(basicAuth, "basicAuth");
            this.basicAuth = Optional.ofNullable(basicAuth);
            return this;
        }

        public Builder basicAuth(Optional<? extends org.openapis.openapi.models.shared.SchemeBasicAuth> basicAuth) {
            Utils.checkNotNull(basicAuth, "basicAuth");
            this.basicAuth = basicAuth;
            return this;
        }
        
        public MultipleMixedOptionsAuthSecurity build() {
            return new MultipleMixedOptionsAuthSecurity(
                apiKeyAuthNew,
                basicAuth);
        }
    }
}
