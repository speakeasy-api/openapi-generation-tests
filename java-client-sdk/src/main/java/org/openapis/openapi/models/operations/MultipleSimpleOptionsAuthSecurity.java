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


public class MultipleSimpleOptionsAuthSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=x-api-key")
    private Optional<? extends String> apiKeyAuthNew;

    @SpeakeasyMetadata("security:scheme=true,type=oauth2,name=Authorization")
    private Optional<? extends String> oauth2;

    public MultipleSimpleOptionsAuthSecurity(
            Optional<? extends String> apiKeyAuthNew,
            Optional<? extends String> oauth2) {
        Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
        Utils.checkNotNull(oauth2, "oauth2");
        this.apiKeyAuthNew = apiKeyAuthNew;
        this.oauth2 = oauth2;
    }

    public Optional<? extends String> apiKeyAuthNew() {
        return apiKeyAuthNew;
    }

    public Optional<? extends String> oauth2() {
        return oauth2;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MultipleSimpleOptionsAuthSecurity withApiKeyAuthNew(String apiKeyAuthNew) {
        Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
        this.apiKeyAuthNew = Optional.ofNullable(apiKeyAuthNew);
        return this;
    }

    public MultipleSimpleOptionsAuthSecurity withApiKeyAuthNew(Optional<? extends String> apiKeyAuthNew) {
        Utils.checkNotNull(apiKeyAuthNew, "apiKeyAuthNew");
        this.apiKeyAuthNew = apiKeyAuthNew;
        return this;
    }

    public MultipleSimpleOptionsAuthSecurity withOauth2(String oauth2) {
        Utils.checkNotNull(oauth2, "oauth2");
        this.oauth2 = Optional.ofNullable(oauth2);
        return this;
    }

    public MultipleSimpleOptionsAuthSecurity withOauth2(Optional<? extends String> oauth2) {
        Utils.checkNotNull(oauth2, "oauth2");
        this.oauth2 = oauth2;
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
        MultipleSimpleOptionsAuthSecurity other = (MultipleSimpleOptionsAuthSecurity) o;
        return 
            java.util.Objects.deepEquals(this.apiKeyAuthNew, other.apiKeyAuthNew) &&
            java.util.Objects.deepEquals(this.oauth2, other.oauth2);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKeyAuthNew,
            oauth2);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MultipleSimpleOptionsAuthSecurity.class,
                "apiKeyAuthNew", apiKeyAuthNew,
                "oauth2", oauth2);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> apiKeyAuthNew = Optional.empty();
 
        private Optional<? extends String> oauth2 = Optional.empty();  
        
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

        public Builder oauth2(String oauth2) {
            Utils.checkNotNull(oauth2, "oauth2");
            this.oauth2 = Optional.ofNullable(oauth2);
            return this;
        }

        public Builder oauth2(Optional<? extends String> oauth2) {
            Utils.checkNotNull(oauth2, "oauth2");
            this.oauth2 = oauth2;
            return this;
        }
        
        public MultipleSimpleOptionsAuthSecurity build() {
            return new MultipleSimpleOptionsAuthSecurity(
                apiKeyAuthNew,
                oauth2);
        }
    }
}
