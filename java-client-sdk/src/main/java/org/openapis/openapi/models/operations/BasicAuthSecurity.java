/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class BasicAuthSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic,name=password")
    private String password;

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic,name=username")
    private String username;

    @JsonCreator
    public BasicAuthSecurity(
            String password,
            String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.username = username;
    }

    @JsonIgnore
    public String password() {
        return password;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BasicAuthSecurity withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public BasicAuthSecurity withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        BasicAuthSecurity other = (BasicAuthSecurity) o;
        return 
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BasicAuthSecurity.class,
                "password", password,
                "username", username);
    }
    
    public final static class Builder {
 
        private String password;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public BasicAuthSecurity build() {
            return new BasicAuthSecurity(
                password,
                username);
        }
    }
}
