/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.shared.BinaryString;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class RequestBodyPutMultipartFileRefRequestBody {

    @SpeakeasyMetadata("multipartForm:file,name=file")
    private Optional<? extends BinaryString> file;

    @JsonCreator
    public RequestBodyPutMultipartFileRefRequestBody(
            Optional<? extends BinaryString> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
    }
    
    public RequestBodyPutMultipartFileRefRequestBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BinaryString> file() {
        return (Optional<BinaryString>) file;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPutMultipartFileRefRequestBody withFile(BinaryString file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public RequestBodyPutMultipartFileRefRequestBody withFile(Optional<? extends BinaryString> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
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
        RequestBodyPutMultipartFileRefRequestBody other = (RequestBodyPutMultipartFileRefRequestBody) o;
        return 
            Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            file);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPutMultipartFileRefRequestBody.class,
                "file", file);
    }
    
    public final static class Builder {
 
        private Optional<? extends BinaryString> file = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder file(BinaryString file) {
            Utils.checkNotNull(file, "file");
            this.file = Optional.ofNullable(file);
            return this;
        }

        public Builder file(Optional<? extends BinaryString> file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public RequestBodyPutMultipartFileRefRequestBody build() {
            return new RequestBodyPutMultipartFileRefRequestBody(
                file);
        }
    }
}
