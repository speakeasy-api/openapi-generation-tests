/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class DateTimeParamWithDefaultRequest {
    /**
     * A date time parameter with a default value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dateTimeInput")
    public OffsetDateTime dateTimeInput;

    public DateTimeParamWithDefaultRequest withDateTimeInput(OffsetDateTime dateTimeInput) {
        this.dateTimeInput = dateTimeInput;
        return this;
    }
    
    public DateTimeParamWithDefaultRequest(@JsonProperty("dateTimeInput") OffsetDateTime dateTimeInput) {
        this.dateTimeInput = dateTimeInput;
  }
}
