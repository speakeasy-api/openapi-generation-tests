/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;

/**
 * RequestBodyPutMultipartFileRefRes - OK
 */

public class RequestBodyPutMultipartFileRefRes {

    @JsonProperty("files")
    private Map<String, String> files;

    @JsonCreator
    public RequestBodyPutMultipartFileRefRes(
            @JsonProperty("files") Map<String, String> files) {
        files = Utils.emptyMapIfNull(files);
        this.files = files;
    }

    @JsonIgnore
    public Map<String, String> files() {
        return files;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPutMultipartFileRefRes withFiles(Map<String, String> files) {
        Utils.checkNotNull(files, "files");
        this.files = files;
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
        RequestBodyPutMultipartFileRefRes other = (RequestBodyPutMultipartFileRefRes) o;
        return 
            Objects.deepEquals(this.files, other.files);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            files);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPutMultipartFileRefRes.class,
                "files", files);
    }
    
    public final static class Builder {
 
        private Map<String, String> files;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder files(Map<String, String> files) {
            Utils.checkNotNull(files, "files");
            this.files = files;
            return this;
        }
        
        public RequestBodyPutMultipartFileRefRes build() {
            return new RequestBodyPutMultipartFileRefRes(
                files);
        }
    }
}
