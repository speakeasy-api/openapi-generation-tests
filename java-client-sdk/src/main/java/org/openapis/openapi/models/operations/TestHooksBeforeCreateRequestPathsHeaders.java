/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


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


public class TestHooksBeforeCreateRequestPathsHeaders {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Old-Pathname")
    private Optional<String> oldPathname;

    @JsonCreator
    public TestHooksBeforeCreateRequestPathsHeaders(
            @JsonProperty("Old-Pathname") Optional<String> oldPathname) {
        Utils.checkNotNull(oldPathname, "oldPathname");
        this.oldPathname = oldPathname;
    }
    
    public TestHooksBeforeCreateRequestPathsHeaders() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> oldPathname() {
        return oldPathname;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TestHooksBeforeCreateRequestPathsHeaders withOldPathname(String oldPathname) {
        Utils.checkNotNull(oldPathname, "oldPathname");
        this.oldPathname = Optional.ofNullable(oldPathname);
        return this;
    }

    public TestHooksBeforeCreateRequestPathsHeaders withOldPathname(Optional<String> oldPathname) {
        Utils.checkNotNull(oldPathname, "oldPathname");
        this.oldPathname = oldPathname;
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
        TestHooksBeforeCreateRequestPathsHeaders other = (TestHooksBeforeCreateRequestPathsHeaders) o;
        return 
            Objects.deepEquals(this.oldPathname, other.oldPathname);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            oldPathname);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TestHooksBeforeCreateRequestPathsHeaders.class,
                "oldPathname", oldPathname);
    }
    
    public final static class Builder {
 
        private Optional<String> oldPathname = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder oldPathname(String oldPathname) {
            Utils.checkNotNull(oldPathname, "oldPathname");
            this.oldPathname = Optional.ofNullable(oldPathname);
            return this;
        }

        public Builder oldPathname(Optional<String> oldPathname) {
            Utils.checkNotNull(oldPathname, "oldPathname");
            this.oldPathname = oldPathname;
            return this;
        }
        
        public TestHooksBeforeCreateRequestPathsHeaders build() {
            return new TestHooksBeforeCreateRequestPathsHeaders(
                oldPathname);
        }
    }
}
