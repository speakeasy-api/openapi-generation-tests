/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;


public class ConstObject2 implements ConstDiscriminatedOneOf {

    @JsonProperty("profileId")
    private String profileId;

    @JsonProperty("tag")
    private String tag;

    @JsonCreator
    public ConstObject2(
            @JsonProperty("profileId") String profileId) {
        Utils.checkNotNull(profileId, "profileId");
        this.profileId = profileId;
        this.tag = Builder._SINGLETON_VALUE_Tag.value();
    }

    @JsonIgnore
    public String profileId() {
        return profileId;
    }

    @JsonIgnore
    @Override
    public String tag() {
        return Utils.discriminatorToString(tag);
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConstObject2 withProfileId(String profileId) {
        Utils.checkNotNull(profileId, "profileId");
        this.profileId = profileId;
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
        ConstObject2 other = (ConstObject2) o;
        return 
            Objects.deepEquals(this.profileId, other.profileId) &&
            Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profileId,
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConstObject2.class,
                "profileId", profileId,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private String profileId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder profileId(String profileId) {
            Utils.checkNotNull(profileId, "profileId");
            this.profileId = profileId;
            return this;
        }
        
        public ConstObject2 build() {
            return new ConstObject2(
                profileId);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Tag =
                new LazySingletonValue<>(
                        "tag",
                        "\"tag2\"",
                        new TypeReference<String>() {});
    }
}
