/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;


public class ObjWithZeroValueComplexTypePtrs {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bigint")
    public Long bigint;

    public ObjWithZeroValueComplexTypePtrs withBigint(Long bigint) {
        this.bigint = bigint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bigintStr")
    public String bigintStr;

    public ObjWithZeroValueComplexTypePtrs withBigintStr(String bigintStr) {
        this.bigintStr = bigintStr;
        return this;
    }
    
    /**
     * A date property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("date")
    public LocalDate date;

    public ObjWithZeroValueComplexTypePtrs withDate(LocalDate date) {
        this.date = date;
        return this;
    }
    
    /**
     * A date-time property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("dateTime")
    public OffsetDateTime dateTime;

    public ObjWithZeroValueComplexTypePtrs withDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decimal")
    public Double decimal;

    public ObjWithZeroValueComplexTypePtrs withDecimal(Double decimal) {
        this.decimal = decimal;
        return this;
    }
    
    public ObjWithZeroValueComplexTypePtrs(){}
}
