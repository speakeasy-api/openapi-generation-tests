/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

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

public class Obj2 {

    @JsonProperty("field1")
    private String field1;

    @JsonProperty("field2")
    private boolean field2;

    @JsonCreator
    public Obj2(
            @JsonProperty("field1") String field1,
            @JsonProperty("field2") boolean field2) {
        Utils.checkNotNull(field1, "field1");
        Utils.checkNotNull(field2, "field2");
        this.field1 = field1;
        this.field2 = field2;
    }

    @JsonIgnore
    public String field1() {
        return field1;
    }

    @JsonIgnore
    public boolean field2() {
        return field2;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Obj2 withField1(String field1) {
        Utils.checkNotNull(field1, "field1");
        this.field1 = field1;
        return this;
    }

    public Obj2 withField2(boolean field2) {
        Utils.checkNotNull(field2, "field2");
        this.field2 = field2;
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
        Obj2 other = (Obj2) o;
        return 
            java.util.Objects.deepEquals(this.field1, other.field1) &&
            java.util.Objects.deepEquals(this.field2, other.field2);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            field1,
            field2);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Obj2.class,
                "field1", field1,
                "field2", field2);
    }
    
    public final static class Builder {
 
        private String field1;
 
        private Boolean field2;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder field1(String field1) {
            Utils.checkNotNull(field1, "field1");
            this.field1 = field1;
            return this;
        }

        public Builder field2(boolean field2) {
            Utils.checkNotNull(field2, "field2");
            this.field2 = field2;
            return this;
        }
        
        public Obj2 build() {
            return new Obj2(
                field1,
                field2);
        }
    }
}
