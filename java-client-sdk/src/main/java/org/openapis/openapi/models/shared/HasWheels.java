/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;


@JsonTypeInfo(use = Id.NAME, property = "wheelsType", include = As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({
    @Type(value = Car.class, name="four"),
    @Type(value = Bike.class, name="two")})
public interface HasWheels {

    String wheelsType();

}