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

public class ArrayCircularReferenceObject {

    @JsonProperty("circular")
    private java.util.List<ArrayCircularReferenceObject> circular;

    @JsonCreator
    public ArrayCircularReferenceObject(
            @JsonProperty("circular") java.util.List<ArrayCircularReferenceObject> circular) {
        Utils.checkNotNull(circular, "circular");
        this.circular = circular;
    }

    @JsonIgnore
    public java.util.List<ArrayCircularReferenceObject> circular() {
        return circular;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ArrayCircularReferenceObject withCircular(java.util.List<ArrayCircularReferenceObject> circular) {
        Utils.checkNotNull(circular, "circular");
        this.circular = circular;
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
        ArrayCircularReferenceObject other = (ArrayCircularReferenceObject) o;
        return 
            java.util.Objects.deepEquals(this.circular, other.circular);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            circular);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ArrayCircularReferenceObject.class,
                "circular", circular);
    }
    
    public final static class Builder {
 
        private java.util.List<ArrayCircularReferenceObject> circular;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder circular(java.util.List<ArrayCircularReferenceObject> circular) {
            Utils.checkNotNull(circular, "circular");
            this.circular = circular;
            return this;
        }
        
        public ArrayCircularReferenceObject build() {
            return new ArrayCircularReferenceObject(
                circular);
        }
    }
}
