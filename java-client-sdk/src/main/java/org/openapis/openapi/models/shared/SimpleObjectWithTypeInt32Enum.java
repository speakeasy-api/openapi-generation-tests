/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;

/**
 * SimpleObjectWithTypeInt32Enum - An int32 enum property.
 */
public enum SimpleObjectWithTypeInt32Enum {
    FIFTY_FIVE(55),
    SIXTY_NINE(69),
    ONE_HUNDRED_AND_EIGHTY_ONE(181);

    @JsonValue
    private final int value;

    private SimpleObjectWithTypeInt32Enum(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
}