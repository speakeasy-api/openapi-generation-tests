/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.openapis.openapi.models.shared.TypedObjectOneOf;
import org.openapis.openapi.utils.Utils;


public class RequestBodyPostApplicationJsonArrayOfUnionsRequestBody {

    @JsonProperty("dates")
    private List<LocalDate> dates;

    @JsonProperty("unions")
    private List<TypedObjectOneOf> unions;

    @JsonCreator
    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBody(
            @JsonProperty("dates") List<LocalDate> dates,
            @JsonProperty("unions") List<TypedObjectOneOf> unions) {
        Utils.checkNotNull(dates, "dates");
        Utils.checkNotNull(unions, "unions");
        this.dates = dates;
        this.unions = unions;
    }

    @JsonIgnore
    public List<LocalDate> dates() {
        return dates;
    }

    @JsonIgnore
    public List<TypedObjectOneOf> unions() {
        return unions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBody withDates(List<LocalDate> dates) {
        Utils.checkNotNull(dates, "dates");
        this.dates = dates;
        return this;
    }

    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBody withUnions(List<TypedObjectOneOf> unions) {
        Utils.checkNotNull(unions, "unions");
        this.unions = unions;
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
        RequestBodyPostApplicationJsonArrayOfUnionsRequestBody other = (RequestBodyPostApplicationJsonArrayOfUnionsRequestBody) o;
        return 
            Objects.deepEquals(this.dates, other.dates) &&
            Objects.deepEquals(this.unions, other.unions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dates,
            unions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPostApplicationJsonArrayOfUnionsRequestBody.class,
                "dates", dates,
                "unions", unions);
    }
    
    public final static class Builder {
 
        private List<LocalDate> dates;
 
        private List<TypedObjectOneOf> unions;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dates(List<LocalDate> dates) {
            Utils.checkNotNull(dates, "dates");
            this.dates = dates;
            return this;
        }

        public Builder unions(List<TypedObjectOneOf> unions) {
            Utils.checkNotNull(unions, "unions");
            this.unions = unions;
            return this;
        }
        
        public RequestBodyPostApplicationJsonArrayOfUnionsRequestBody build() {
            return new RequestBodyPostApplicationJsonArrayOfUnionsRequestBody(
                dates,
                unions);
        }
    }
}
