/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class AnyOfMultiMatchMember2 {

    @JsonProperty("description")
    private String description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    private Optional<String> details;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public AnyOfMultiMatchMember2(
            @JsonProperty("description") String description,
            @JsonProperty("details") Optional<String> details,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(name, "name");
        this.description = description;
        this.details = details;
        this.name = name;
    }
    
    public AnyOfMultiMatchMember2(
            String description,
            String name) {
        this(description, Optional.empty(), name);
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> details() {
        return details;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AnyOfMultiMatchMember2 withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AnyOfMultiMatchMember2 withDetails(String details) {
        Utils.checkNotNull(details, "details");
        this.details = Optional.ofNullable(details);
        return this;
    }

    public AnyOfMultiMatchMember2 withDetails(Optional<String> details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    public AnyOfMultiMatchMember2 withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        AnyOfMultiMatchMember2 other = (AnyOfMultiMatchMember2) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.details, other.details) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            details,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AnyOfMultiMatchMember2.class,
                "description", description,
                "details", details,
                "name", name);
    }
    
    public final static class Builder {
 
        private String description;
 
        private Optional<String> details = Optional.empty();
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder details(String details) {
            Utils.checkNotNull(details, "details");
            this.details = Optional.ofNullable(details);
            return this;
        }

        public Builder details(Optional<String> details) {
            Utils.checkNotNull(details, "details");
            this.details = details;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public AnyOfMultiMatchMember2 build() {
            return new AnyOfMultiMatchMember2(
                description,
                details,
                name);
        }
    }
}
