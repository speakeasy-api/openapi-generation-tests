/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class CreateFileRequestBody {

    @SpeakeasyMetadata("multipartForm:file")
    private Optional<? extends CreateFileFile> file;

    public CreateFileRequestBody(
            Optional<? extends CreateFileFile> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
    }

    public Optional<? extends CreateFileFile> file() {
        return file;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateFileRequestBody withFile(CreateFileFile file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public CreateFileRequestBody withFile(Optional<? extends CreateFileFile> file) {
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
        CreateFileRequestBody other = (CreateFileRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            file);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateFileRequestBody.class,
                "file", file);
    }
    
    public final static class Builder {
 
        private Optional<? extends CreateFileFile> file = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder file(CreateFileFile file) {
            Utils.checkNotNull(file, "file");
            this.file = Optional.ofNullable(file);
            return this;
        }

        public Builder file(Optional<? extends CreateFileFile> file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public CreateFileRequestBody build() {
            return new CreateFileRequestBody(
                file);
        }
    }
}
