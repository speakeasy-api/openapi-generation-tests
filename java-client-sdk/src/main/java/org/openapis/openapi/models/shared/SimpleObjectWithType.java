/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
/**
 * SimpleObjectWithType - A simple object that uses all our supported primitive types and enums and has optional properties.
 * https://docs.speakeasyapi.dev - A link to the external docs.
 */

public class SimpleObjectWithType {

    /**
     * An any property.
     */
    @JsonProperty("any")
    private java.lang.Object any;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bigint")
    private Optional<? extends BigInteger> bigint;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bigintStr")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Optional<? extends BigInteger> bigintStr;

    /**
     * A boolean property.
     */
    @JsonProperty("bool")
    private boolean bool;

    /**
     * An optional boolean property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("boolOpt")
    private Optional<? extends Boolean> boolOpt;

    /**
     * A date property.
     */
    @JsonProperty("date")
    private LocalDate date;

    /**
     * A date-time property.
     */
    @JsonProperty("dateTime")
    private OffsetDateTime dateTime;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decimal")
    private Optional<? extends BigDecimal> decimal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decimalStr")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Optional<? extends BigDecimal> decimalStr;

    /**
     * A string based enum
     */
    @JsonProperty("enum")
    private Enum enum_;

    /**
     * A float32 property.
     */
    @JsonProperty("float32")
    private float float32;

    /**
     * A float64 string
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("float64Str")
    private Optional<? extends String> float64Str;

    /**
     * An integer property.
     */
    @JsonProperty("int")
    private long int_;

    /**
     * An int32 property.
     */
    @JsonProperty("int32")
    private int int32;

    /**
     * An int32 enum property.
     */
    @JsonProperty("int32Enum")
    private SimpleObjectWithTypeInt32Enum int32Enum;

    /**
     * An int64 string
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("int64Str")
    private Optional<? extends String> int64Str;

    /**
     * An integer enum property.
     */
    @JsonProperty("intEnum")
    private SimpleObjectWithTypeIntEnum intEnum;

    /**
     * An optional integer property will be null for tests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("intOptNull")
    private Optional<? extends Long> intOptNull;

    /**
     * A number property.
     */
    @JsonProperty("num")
    private double num;

    /**
     * An optional number property will be null for tests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numOptNull")
    private Optional<? extends Double> numOptNull;

    /**
     * A string property.
     */
    @JsonProperty("str")
    private String str;

    /**
     * An optional string property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("strOpt")
    private Optional<? extends String> strOpt;

    @JsonProperty("type")
    private String type;

    @JsonCreator
    public SimpleObjectWithType(
            @JsonProperty("any") java.lang.Object any,
            @JsonProperty("bigint") Optional<? extends BigInteger> bigint,
            @JsonProperty("bigintStr") Optional<? extends BigInteger> bigintStr,
            @JsonProperty("bool") boolean bool,
            @JsonProperty("boolOpt") Optional<? extends Boolean> boolOpt,
            @JsonProperty("date") LocalDate date,
            @JsonProperty("dateTime") OffsetDateTime dateTime,
            @JsonProperty("decimal") Optional<? extends BigDecimal> decimal,
            @JsonProperty("decimalStr") Optional<? extends BigDecimal> decimalStr,
            @JsonProperty("enum") Enum enum_,
            @JsonProperty("float32") float float32,
            @JsonProperty("float64Str") Optional<? extends String> float64Str,
            @JsonProperty("int") long int_,
            @JsonProperty("int32") int int32,
            @JsonProperty("int32Enum") SimpleObjectWithTypeInt32Enum int32Enum,
            @JsonProperty("int64Str") Optional<? extends String> int64Str,
            @JsonProperty("intEnum") SimpleObjectWithTypeIntEnum intEnum,
            @JsonProperty("intOptNull") Optional<? extends Long> intOptNull,
            @JsonProperty("num") double num,
            @JsonProperty("numOptNull") Optional<? extends Double> numOptNull,
            @JsonProperty("str") String str,
            @JsonProperty("strOpt") Optional<? extends String> strOpt,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(any, "any");
        Utils.checkNotNull(bigint, "bigint");
        Utils.checkNotNull(bigintStr, "bigintStr");
        Utils.checkNotNull(bool, "bool");
        Utils.checkNotNull(boolOpt, "boolOpt");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(dateTime, "dateTime");
        Utils.checkNotNull(decimal, "decimal");
        Utils.checkNotNull(decimalStr, "decimalStr");
        Utils.checkNotNull(enum_, "enum_");
        Utils.checkNotNull(float32, "float32");
        Utils.checkNotNull(float64Str, "float64Str");
        Utils.checkNotNull(int_, "int_");
        Utils.checkNotNull(int32, "int32");
        Utils.checkNotNull(int32Enum, "int32Enum");
        Utils.checkNotNull(int64Str, "int64Str");
        Utils.checkNotNull(intEnum, "intEnum");
        Utils.checkNotNull(intOptNull, "intOptNull");
        Utils.checkNotNull(num, "num");
        Utils.checkNotNull(numOptNull, "numOptNull");
        Utils.checkNotNull(str, "str");
        Utils.checkNotNull(strOpt, "strOpt");
        Utils.checkNotNull(type, "type");
        this.any = any;
        this.bigint = bigint;
        this.bigintStr = bigintStr;
        this.bool = bool;
        this.boolOpt = boolOpt;
        this.date = date;
        this.dateTime = dateTime;
        this.decimal = decimal;
        this.decimalStr = decimalStr;
        this.enum_ = enum_;
        this.float32 = float32;
        this.float64Str = float64Str;
        this.int_ = int_;
        this.int32 = int32;
        this.int32Enum = int32Enum;
        this.int64Str = int64Str;
        this.intEnum = intEnum;
        this.intOptNull = intOptNull;
        this.num = num;
        this.numOptNull = numOptNull;
        this.str = str;
        this.strOpt = strOpt;
        this.type = type;
    }
    
    public SimpleObjectWithType(
            java.lang.Object any,
            boolean bool,
            LocalDate date,
            OffsetDateTime dateTime,
            Enum enum_,
            float float32,
            long int_,
            int int32,
            SimpleObjectWithTypeInt32Enum int32Enum,
            SimpleObjectWithTypeIntEnum intEnum,
            double num,
            String str,
            String type) {
        this(any, Optional.empty(), Optional.empty(), bool, Optional.empty(), date, dateTime, Optional.empty(), Optional.empty(), enum_, float32, Optional.empty(), int_, int32, int32Enum, Optional.empty(), intEnum, Optional.empty(), num, Optional.empty(), str, Optional.empty(), type);
    }

    /**
     * An any property.
     */
    @JsonIgnore
    public java.lang.Object any() {
        return any;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigInteger> bigint() {
        return (Optional<BigInteger>) bigint;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigInteger> bigintStr() {
        return (Optional<BigInteger>) bigintStr;
    }

    /**
     * A boolean property.
     */
    @JsonIgnore
    public boolean bool() {
        return bool;
    }

    /**
     * An optional boolean property.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> boolOpt() {
        return (Optional<Boolean>) boolOpt;
    }

    /**
     * A date property.
     */
    @JsonIgnore
    public LocalDate date() {
        return date;
    }

    /**
     * A date-time property.
     */
    @JsonIgnore
    public OffsetDateTime dateTime() {
        return dateTime;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> decimal() {
        return (Optional<BigDecimal>) decimal;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> decimalStr() {
        return (Optional<BigDecimal>) decimalStr;
    }

    /**
     * A string based enum
     */
    @JsonIgnore
    public Enum enum_() {
        return enum_;
    }

    /**
     * A float32 property.
     */
    @JsonIgnore
    public float float32() {
        return float32;
    }

    /**
     * A float64 string
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> float64Str() {
        return (Optional<String>) float64Str;
    }

    /**
     * An integer property.
     */
    @JsonIgnore
    public long int_() {
        return int_;
    }

    /**
     * An int32 property.
     */
    @JsonIgnore
    public int int32() {
        return int32;
    }

    /**
     * An int32 enum property.
     */
    @JsonIgnore
    public SimpleObjectWithTypeInt32Enum int32Enum() {
        return int32Enum;
    }

    /**
     * An int64 string
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> int64Str() {
        return (Optional<String>) int64Str;
    }

    /**
     * An integer enum property.
     */
    @JsonIgnore
    public SimpleObjectWithTypeIntEnum intEnum() {
        return intEnum;
    }

    /**
     * An optional integer property will be null for tests.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> intOptNull() {
        return (Optional<Long>) intOptNull;
    }

    /**
     * A number property.
     */
    @JsonIgnore
    public double num() {
        return num;
    }

    /**
     * An optional number property will be null for tests.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> numOptNull() {
        return (Optional<Double>) numOptNull;
    }

    /**
     * A string property.
     */
    @JsonIgnore
    public String str() {
        return str;
    }

    /**
     * An optional string property.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> strOpt() {
        return (Optional<String>) strOpt;
    }

    @JsonIgnore
    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An any property.
     */
    public SimpleObjectWithType withAny(java.lang.Object any) {
        Utils.checkNotNull(any, "any");
        this.any = any;
        return this;
    }

    public SimpleObjectWithType withBigint(BigInteger bigint) {
        Utils.checkNotNull(bigint, "bigint");
        this.bigint = Optional.ofNullable(bigint);
        return this;
    }

    public SimpleObjectWithType withBigint(long bigint) {
        this.bigint = Optional.of(BigInteger.valueOf(bigint));
        return this;
    }

    public SimpleObjectWithType withBigint(Optional<? extends BigInteger> bigint) {
        Utils.checkNotNull(bigint, "bigint");
        this.bigint = bigint;
        return this;
    }

    public SimpleObjectWithType withBigintStr(BigInteger bigintStr) {
        Utils.checkNotNull(bigintStr, "bigintStr");
        this.bigintStr = Optional.ofNullable(bigintStr);
        return this;
    }

    public SimpleObjectWithType withBigintStr(long bigintStr) {
        this.bigintStr = Optional.of(BigInteger.valueOf(bigintStr));
        return this;
    }

    public SimpleObjectWithType withBigintStr(Optional<? extends BigInteger> bigintStr) {
        Utils.checkNotNull(bigintStr, "bigintStr");
        this.bigintStr = bigintStr;
        return this;
    }

    /**
     * A boolean property.
     */
    public SimpleObjectWithType withBool(boolean bool) {
        Utils.checkNotNull(bool, "bool");
        this.bool = bool;
        return this;
    }

    /**
     * An optional boolean property.
     */
    public SimpleObjectWithType withBoolOpt(boolean boolOpt) {
        Utils.checkNotNull(boolOpt, "boolOpt");
        this.boolOpt = Optional.ofNullable(boolOpt);
        return this;
    }

    /**
     * An optional boolean property.
     */
    public SimpleObjectWithType withBoolOpt(Optional<? extends Boolean> boolOpt) {
        Utils.checkNotNull(boolOpt, "boolOpt");
        this.boolOpt = boolOpt;
        return this;
    }

    /**
     * A date property.
     */
    public SimpleObjectWithType withDate(LocalDate date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * A date-time property.
     */
    public SimpleObjectWithType withDateTime(OffsetDateTime dateTime) {
        Utils.checkNotNull(dateTime, "dateTime");
        this.dateTime = dateTime;
        return this;
    }

    public SimpleObjectWithType withDecimal(BigDecimal decimal) {
        Utils.checkNotNull(decimal, "decimal");
        this.decimal = Optional.ofNullable(decimal);
        return this;
    }

    public SimpleObjectWithType withDecimal(double decimal) {
        this.decimal = Optional.of(BigDecimal.valueOf(decimal));
        return this;
    }

    public SimpleObjectWithType withDecimal(Optional<? extends BigDecimal> decimal) {
        Utils.checkNotNull(decimal, "decimal");
        this.decimal = decimal;
        return this;
    }

    public SimpleObjectWithType withDecimalStr(BigDecimal decimalStr) {
        Utils.checkNotNull(decimalStr, "decimalStr");
        this.decimalStr = Optional.ofNullable(decimalStr);
        return this;
    }

    public SimpleObjectWithType withDecimalStr(double decimalStr) {
        this.decimalStr = Optional.of(BigDecimal.valueOf(decimalStr));
        return this;
    }

    public SimpleObjectWithType withDecimalStr(Optional<? extends BigDecimal> decimalStr) {
        Utils.checkNotNull(decimalStr, "decimalStr");
        this.decimalStr = decimalStr;
        return this;
    }

    /**
     * A string based enum
     */
    public SimpleObjectWithType withEnum(Enum enum_) {
        Utils.checkNotNull(enum_, "enum_");
        this.enum_ = enum_;
        return this;
    }

    /**
     * A float32 property.
     */
    public SimpleObjectWithType withFloat32(float float32) {
        Utils.checkNotNull(float32, "float32");
        this.float32 = float32;
        return this;
    }

    /**
     * A float64 string
     */
    public SimpleObjectWithType withFloat64Str(String float64Str) {
        Utils.checkNotNull(float64Str, "float64Str");
        this.float64Str = Optional.ofNullable(float64Str);
        return this;
    }

    /**
     * A float64 string
     */
    public SimpleObjectWithType withFloat64Str(Optional<? extends String> float64Str) {
        Utils.checkNotNull(float64Str, "float64Str");
        this.float64Str = float64Str;
        return this;
    }

    /**
     * An integer property.
     */
    public SimpleObjectWithType withInt(long int_) {
        Utils.checkNotNull(int_, "int_");
        this.int_ = int_;
        return this;
    }

    /**
     * An int32 property.
     */
    public SimpleObjectWithType withInt32(int int32) {
        Utils.checkNotNull(int32, "int32");
        this.int32 = int32;
        return this;
    }

    /**
     * An int32 enum property.
     */
    public SimpleObjectWithType withInt32Enum(SimpleObjectWithTypeInt32Enum int32Enum) {
        Utils.checkNotNull(int32Enum, "int32Enum");
        this.int32Enum = int32Enum;
        return this;
    }

    /**
     * An int64 string
     */
    public SimpleObjectWithType withInt64Str(String int64Str) {
        Utils.checkNotNull(int64Str, "int64Str");
        this.int64Str = Optional.ofNullable(int64Str);
        return this;
    }

    /**
     * An int64 string
     */
    public SimpleObjectWithType withInt64Str(Optional<? extends String> int64Str) {
        Utils.checkNotNull(int64Str, "int64Str");
        this.int64Str = int64Str;
        return this;
    }

    /**
     * An integer enum property.
     */
    public SimpleObjectWithType withIntEnum(SimpleObjectWithTypeIntEnum intEnum) {
        Utils.checkNotNull(intEnum, "intEnum");
        this.intEnum = intEnum;
        return this;
    }

    /**
     * An optional integer property will be null for tests.
     */
    public SimpleObjectWithType withIntOptNull(long intOptNull) {
        Utils.checkNotNull(intOptNull, "intOptNull");
        this.intOptNull = Optional.ofNullable(intOptNull);
        return this;
    }

    /**
     * An optional integer property will be null for tests.
     */
    public SimpleObjectWithType withIntOptNull(Optional<? extends Long> intOptNull) {
        Utils.checkNotNull(intOptNull, "intOptNull");
        this.intOptNull = intOptNull;
        return this;
    }

    /**
     * A number property.
     */
    public SimpleObjectWithType withNum(double num) {
        Utils.checkNotNull(num, "num");
        this.num = num;
        return this;
    }

    /**
     * An optional number property will be null for tests.
     */
    public SimpleObjectWithType withNumOptNull(double numOptNull) {
        Utils.checkNotNull(numOptNull, "numOptNull");
        this.numOptNull = Optional.ofNullable(numOptNull);
        return this;
    }

    /**
     * An optional number property will be null for tests.
     */
    public SimpleObjectWithType withNumOptNull(Optional<? extends Double> numOptNull) {
        Utils.checkNotNull(numOptNull, "numOptNull");
        this.numOptNull = numOptNull;
        return this;
    }

    /**
     * A string property.
     */
    public SimpleObjectWithType withStr(String str) {
        Utils.checkNotNull(str, "str");
        this.str = str;
        return this;
    }

    /**
     * An optional string property.
     */
    public SimpleObjectWithType withStrOpt(String strOpt) {
        Utils.checkNotNull(strOpt, "strOpt");
        this.strOpt = Optional.ofNullable(strOpt);
        return this;
    }

    /**
     * An optional string property.
     */
    public SimpleObjectWithType withStrOpt(Optional<? extends String> strOpt) {
        Utils.checkNotNull(strOpt, "strOpt");
        this.strOpt = strOpt;
        return this;
    }

    public SimpleObjectWithType withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        SimpleObjectWithType other = (SimpleObjectWithType) o;
        return 
            java.util.Objects.deepEquals(this.any, other.any) &&
            java.util.Objects.deepEquals(this.bigint, other.bigint) &&
            java.util.Objects.deepEquals(this.bigintStr, other.bigintStr) &&
            java.util.Objects.deepEquals(this.bool, other.bool) &&
            java.util.Objects.deepEquals(this.boolOpt, other.boolOpt) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.dateTime, other.dateTime) &&
            java.util.Objects.deepEquals(this.decimal, other.decimal) &&
            java.util.Objects.deepEquals(this.decimalStr, other.decimalStr) &&
            java.util.Objects.deepEquals(this.enum_, other.enum_) &&
            java.util.Objects.deepEquals(this.float32, other.float32) &&
            java.util.Objects.deepEquals(this.float64Str, other.float64Str) &&
            java.util.Objects.deepEquals(this.int_, other.int_) &&
            java.util.Objects.deepEquals(this.int32, other.int32) &&
            java.util.Objects.deepEquals(this.int32Enum, other.int32Enum) &&
            java.util.Objects.deepEquals(this.int64Str, other.int64Str) &&
            java.util.Objects.deepEquals(this.intEnum, other.intEnum) &&
            java.util.Objects.deepEquals(this.intOptNull, other.intOptNull) &&
            java.util.Objects.deepEquals(this.num, other.num) &&
            java.util.Objects.deepEquals(this.numOptNull, other.numOptNull) &&
            java.util.Objects.deepEquals(this.str, other.str) &&
            java.util.Objects.deepEquals(this.strOpt, other.strOpt) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            any,
            bigint,
            bigintStr,
            bool,
            boolOpt,
            date,
            dateTime,
            decimal,
            decimalStr,
            enum_,
            float32,
            float64Str,
            int_,
            int32,
            int32Enum,
            int64Str,
            intEnum,
            intOptNull,
            num,
            numOptNull,
            str,
            strOpt,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SimpleObjectWithType.class,
                "any", any,
                "bigint", bigint,
                "bigintStr", bigintStr,
                "bool", bool,
                "boolOpt", boolOpt,
                "date", date,
                "dateTime", dateTime,
                "decimal", decimal,
                "decimalStr", decimalStr,
                "enum_", enum_,
                "float32", float32,
                "float64Str", float64Str,
                "int_", int_,
                "int32", int32,
                "int32Enum", int32Enum,
                "int64Str", int64Str,
                "intEnum", intEnum,
                "intOptNull", intOptNull,
                "num", num,
                "numOptNull", numOptNull,
                "str", str,
                "strOpt", strOpt,
                "type", type);
    }
    
    public final static class Builder {
 
        private java.lang.Object any;
 
        private Optional<? extends BigInteger> bigint = Optional.empty();
 
        private Optional<? extends BigInteger> bigintStr = Optional.empty();
 
        private Boolean bool;
 
        private Optional<? extends Boolean> boolOpt = Optional.empty();
 
        private LocalDate date;
 
        private OffsetDateTime dateTime;
 
        private Optional<? extends BigDecimal> decimal = Optional.empty();
 
        private Optional<? extends BigDecimal> decimalStr = Optional.empty();
 
        private Enum enum_;
 
        private Float float32;
 
        private Optional<? extends String> float64Str = Optional.empty();
 
        private Long int_;
 
        private Integer int32;
 
        private SimpleObjectWithTypeInt32Enum int32Enum;
 
        private Optional<? extends String> int64Str = Optional.empty();
 
        private SimpleObjectWithTypeIntEnum intEnum;
 
        private Optional<? extends Long> intOptNull = Optional.empty();
 
        private Double num;
 
        private Optional<? extends Double> numOptNull = Optional.empty();
 
        private String str;
 
        private Optional<? extends String> strOpt = Optional.empty();
 
        private String type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An any property.
         */
        public Builder any(java.lang.Object any) {
            Utils.checkNotNull(any, "any");
            this.any = any;
            return this;
        }

        public Builder bigint(BigInteger bigint) {
            Utils.checkNotNull(bigint, "bigint");
            this.bigint = Optional.ofNullable(bigint);
            return this;
        }

        public Builder bigint(long bigint) {
            this.bigint = Optional.of(BigInteger.valueOf(bigint));
            return this;
        }

        public Builder bigint(Optional<? extends BigInteger> bigint) {
            Utils.checkNotNull(bigint, "bigint");
            this.bigint = bigint;
            return this;
        }

        public Builder bigintStr(BigInteger bigintStr) {
            Utils.checkNotNull(bigintStr, "bigintStr");
            this.bigintStr = Optional.ofNullable(bigintStr);
            return this;
        }

        public Builder bigintStr(long bigintStr) {
            this.bigintStr = Optional.of(BigInteger.valueOf(bigintStr));
            return this;
        }

        public Builder bigintStr(Optional<? extends BigInteger> bigintStr) {
            Utils.checkNotNull(bigintStr, "bigintStr");
            this.bigintStr = bigintStr;
            return this;
        }

        /**
         * A boolean property.
         */
        public Builder bool(boolean bool) {
            Utils.checkNotNull(bool, "bool");
            this.bool = bool;
            return this;
        }

        /**
         * An optional boolean property.
         */
        public Builder boolOpt(boolean boolOpt) {
            Utils.checkNotNull(boolOpt, "boolOpt");
            this.boolOpt = Optional.ofNullable(boolOpt);
            return this;
        }

        /**
         * An optional boolean property.
         */
        public Builder boolOpt(Optional<? extends Boolean> boolOpt) {
            Utils.checkNotNull(boolOpt, "boolOpt");
            this.boolOpt = boolOpt;
            return this;
        }

        /**
         * A date property.
         */
        public Builder date(LocalDate date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * A date-time property.
         */
        public Builder dateTime(OffsetDateTime dateTime) {
            Utils.checkNotNull(dateTime, "dateTime");
            this.dateTime = dateTime;
            return this;
        }

        public Builder decimal(BigDecimal decimal) {
            Utils.checkNotNull(decimal, "decimal");
            this.decimal = Optional.ofNullable(decimal);
            return this;
        }

        public Builder decimal(double decimal) {
            this.decimal = Optional.of(BigDecimal.valueOf(decimal));
            return this;
        }

        public Builder decimal(Optional<? extends BigDecimal> decimal) {
            Utils.checkNotNull(decimal, "decimal");
            this.decimal = decimal;
            return this;
        }

        public Builder decimalStr(BigDecimal decimalStr) {
            Utils.checkNotNull(decimalStr, "decimalStr");
            this.decimalStr = Optional.ofNullable(decimalStr);
            return this;
        }

        public Builder decimalStr(double decimalStr) {
            this.decimalStr = Optional.of(BigDecimal.valueOf(decimalStr));
            return this;
        }

        public Builder decimalStr(Optional<? extends BigDecimal> decimalStr) {
            Utils.checkNotNull(decimalStr, "decimalStr");
            this.decimalStr = decimalStr;
            return this;
        }

        /**
         * A string based enum
         */
        public Builder enum_(Enum enum_) {
            Utils.checkNotNull(enum_, "enum_");
            this.enum_ = enum_;
            return this;
        }

        /**
         * A float32 property.
         */
        public Builder float32(float float32) {
            Utils.checkNotNull(float32, "float32");
            this.float32 = float32;
            return this;
        }

        /**
         * A float64 string
         */
        public Builder float64Str(String float64Str) {
            Utils.checkNotNull(float64Str, "float64Str");
            this.float64Str = Optional.ofNullable(float64Str);
            return this;
        }

        /**
         * A float64 string
         */
        public Builder float64Str(Optional<? extends String> float64Str) {
            Utils.checkNotNull(float64Str, "float64Str");
            this.float64Str = float64Str;
            return this;
        }

        /**
         * An integer property.
         */
        public Builder int_(long int_) {
            Utils.checkNotNull(int_, "int_");
            this.int_ = int_;
            return this;
        }

        /**
         * An int32 property.
         */
        public Builder int32(int int32) {
            Utils.checkNotNull(int32, "int32");
            this.int32 = int32;
            return this;
        }

        /**
         * An int32 enum property.
         */
        public Builder int32Enum(SimpleObjectWithTypeInt32Enum int32Enum) {
            Utils.checkNotNull(int32Enum, "int32Enum");
            this.int32Enum = int32Enum;
            return this;
        }

        /**
         * An int64 string
         */
        public Builder int64Str(String int64Str) {
            Utils.checkNotNull(int64Str, "int64Str");
            this.int64Str = Optional.ofNullable(int64Str);
            return this;
        }

        /**
         * An int64 string
         */
        public Builder int64Str(Optional<? extends String> int64Str) {
            Utils.checkNotNull(int64Str, "int64Str");
            this.int64Str = int64Str;
            return this;
        }

        /**
         * An integer enum property.
         */
        public Builder intEnum(SimpleObjectWithTypeIntEnum intEnum) {
            Utils.checkNotNull(intEnum, "intEnum");
            this.intEnum = intEnum;
            return this;
        }

        /**
         * An optional integer property will be null for tests.
         */
        public Builder intOptNull(long intOptNull) {
            Utils.checkNotNull(intOptNull, "intOptNull");
            this.intOptNull = Optional.ofNullable(intOptNull);
            return this;
        }

        /**
         * An optional integer property will be null for tests.
         */
        public Builder intOptNull(Optional<? extends Long> intOptNull) {
            Utils.checkNotNull(intOptNull, "intOptNull");
            this.intOptNull = intOptNull;
            return this;
        }

        /**
         * A number property.
         */
        public Builder num(double num) {
            Utils.checkNotNull(num, "num");
            this.num = num;
            return this;
        }

        /**
         * An optional number property will be null for tests.
         */
        public Builder numOptNull(double numOptNull) {
            Utils.checkNotNull(numOptNull, "numOptNull");
            this.numOptNull = Optional.ofNullable(numOptNull);
            return this;
        }

        /**
         * An optional number property will be null for tests.
         */
        public Builder numOptNull(Optional<? extends Double> numOptNull) {
            Utils.checkNotNull(numOptNull, "numOptNull");
            this.numOptNull = numOptNull;
            return this;
        }

        /**
         * A string property.
         */
        public Builder str(String str) {
            Utils.checkNotNull(str, "str");
            this.str = str;
            return this;
        }

        /**
         * An optional string property.
         */
        public Builder strOpt(String strOpt) {
            Utils.checkNotNull(strOpt, "strOpt");
            this.strOpt = Optional.ofNullable(strOpt);
            return this;
        }

        /**
         * An optional string property.
         */
        public Builder strOpt(Optional<? extends String> strOpt) {
            Utils.checkNotNull(strOpt, "strOpt");
            this.strOpt = strOpt;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public SimpleObjectWithType build() {
            return new SimpleObjectWithType(
                any,
                bigint,
                bigintStr,
                bool,
                boolOpt,
                date,
                dateTime,
                decimal,
                decimalStr,
                enum_,
                float32,
                float64Str,
                int_,
                int32,
                int32Enum,
                int64Str,
                intEnum,
                intOptNull,
                num,
                numOptNull,
                str,
                strOpt,
                type);
        }
    }
}
