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


public class MultipleOptionsWithMixedSchemesAuthSecurity {

    @SpeakeasyMetadata("security:option=true")
    private Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption1> option1;

    @SpeakeasyMetadata("security:option=true")
    private Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption2> option2;

    public MultipleOptionsWithMixedSchemesAuthSecurity(
            Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption1> option1,
            Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption2> option2) {
        Utils.checkNotNull(option1, "option1");
        Utils.checkNotNull(option2, "option2");
        this.option1 = option1;
        this.option2 = option2;
    }

    public Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption1> option1() {
        return option1;
    }

    public Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption2> option2() {
        return option2;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MultipleOptionsWithMixedSchemesAuthSecurity withOption1(MultipleOptionsWithMixedSchemesAuthSecurityOption1 option1) {
        Utils.checkNotNull(option1, "option1");
        this.option1 = Optional.ofNullable(option1);
        return this;
    }

    public MultipleOptionsWithMixedSchemesAuthSecurity withOption1(Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption1> option1) {
        Utils.checkNotNull(option1, "option1");
        this.option1 = option1;
        return this;
    }

    public MultipleOptionsWithMixedSchemesAuthSecurity withOption2(MultipleOptionsWithMixedSchemesAuthSecurityOption2 option2) {
        Utils.checkNotNull(option2, "option2");
        this.option2 = Optional.ofNullable(option2);
        return this;
    }

    public MultipleOptionsWithMixedSchemesAuthSecurity withOption2(Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption2> option2) {
        Utils.checkNotNull(option2, "option2");
        this.option2 = option2;
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
        MultipleOptionsWithMixedSchemesAuthSecurity other = (MultipleOptionsWithMixedSchemesAuthSecurity) o;
        return 
            java.util.Objects.deepEquals(this.option1, other.option1) &&
            java.util.Objects.deepEquals(this.option2, other.option2);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            option1,
            option2);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MultipleOptionsWithMixedSchemesAuthSecurity.class,
                "option1", option1,
                "option2", option2);
    }
    
    public final static class Builder {
 
        private Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption1> option1 = Optional.empty();
 
        private Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption2> option2 = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder option1(MultipleOptionsWithMixedSchemesAuthSecurityOption1 option1) {
            Utils.checkNotNull(option1, "option1");
            this.option1 = Optional.ofNullable(option1);
            return this;
        }

        public Builder option1(Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption1> option1) {
            Utils.checkNotNull(option1, "option1");
            this.option1 = option1;
            return this;
        }

        public Builder option2(MultipleOptionsWithMixedSchemesAuthSecurityOption2 option2) {
            Utils.checkNotNull(option2, "option2");
            this.option2 = Optional.ofNullable(option2);
            return this;
        }

        public Builder option2(Optional<? extends MultipleOptionsWithMixedSchemesAuthSecurityOption2> option2) {
            Utils.checkNotNull(option2, "option2");
            this.option2 = option2;
            return this;
        }
        
        public MultipleOptionsWithMixedSchemesAuthSecurity build() {
            return new MultipleOptionsWithMixedSchemesAuthSecurity(
                option1,
                option2);
        }
    }
}
