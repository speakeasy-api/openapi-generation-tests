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
import java.time.LocalDate;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class DateParamWithDefaultRequest {

    /**
     * A date parameter with a default value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dateInput")
    private LocalDate dateInput;

    @JsonCreator
    public DateParamWithDefaultRequest(
            LocalDate dateInput) {
        Utils.checkNotNull(dateInput, "dateInput");
        this.dateInput = dateInput;
    }

    /**
     * A date parameter with a default value
     */
    @JsonIgnore
    public LocalDate dateInput() {
        return dateInput;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A date parameter with a default value
     */
    public DateParamWithDefaultRequest withDateInput(LocalDate dateInput) {
        Utils.checkNotNull(dateInput, "dateInput");
        this.dateInput = dateInput;
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
        DateParamWithDefaultRequest other = (DateParamWithDefaultRequest) o;
        return 
            java.util.Objects.deepEquals(this.dateInput, other.dateInput);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dateInput);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DateParamWithDefaultRequest.class,
                "dateInput", dateInput);
    }
    
    public final static class Builder {
 
        private LocalDate dateInput;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A date parameter with a default value
         */
        public Builder dateInput(LocalDate dateInput) {
            Utils.checkNotNull(dateInput, "dateInput");
            this.dateInput = dateInput;
            return this;
        }
        
        public DateParamWithDefaultRequest build() {
            if (dateInput == null) {
                dateInput = _SINGLETON_VALUE_DateInput.value();
            }
            return new DateParamWithDefaultRequest(
                dateInput);
        }

        private static final LazySingletonValue<LocalDate> _SINGLETON_VALUE_DateInput =
                new LazySingletonValue<>(
                        "dateInput",
                        "\"2023-10-13\"",
                        new TypeReference<LocalDate>() {});
    }
}
