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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class RichCompletionEventData {

    @JsonProperty("completion")
    private String completion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    private Optional<String> model;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("stop_reason")
    private Optional<? extends StopReason> stopReason;

    @JsonCreator
    public RichCompletionEventData(
            @JsonProperty("completion") String completion,
            @JsonProperty("model") Optional<String> model,
            @JsonProperty("stop_reason") Optional<? extends StopReason> stopReason) {
        Utils.checkNotNull(completion, "completion");
        Utils.checkNotNull(model, "model");
        Utils.checkNotNull(stopReason, "stopReason");
        this.completion = completion;
        this.model = model;
        this.stopReason = stopReason;
    }
    
    public RichCompletionEventData(
            String completion) {
        this(completion, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String completion() {
        return completion;
    }

    @JsonIgnore
    public Optional<String> model() {
        return model;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StopReason> stopReason() {
        return (Optional<StopReason>) stopReason;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RichCompletionEventData withCompletion(String completion) {
        Utils.checkNotNull(completion, "completion");
        this.completion = completion;
        return this;
    }

    public RichCompletionEventData withModel(String model) {
        Utils.checkNotNull(model, "model");
        this.model = Optional.ofNullable(model);
        return this;
    }

    public RichCompletionEventData withModel(Optional<String> model) {
        Utils.checkNotNull(model, "model");
        this.model = model;
        return this;
    }

    public RichCompletionEventData withStopReason(StopReason stopReason) {
        Utils.checkNotNull(stopReason, "stopReason");
        this.stopReason = Optional.ofNullable(stopReason);
        return this;
    }

    public RichCompletionEventData withStopReason(Optional<? extends StopReason> stopReason) {
        Utils.checkNotNull(stopReason, "stopReason");
        this.stopReason = stopReason;
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
        RichCompletionEventData other = (RichCompletionEventData) o;
        return 
            Objects.deepEquals(this.completion, other.completion) &&
            Objects.deepEquals(this.model, other.model) &&
            Objects.deepEquals(this.stopReason, other.stopReason);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            completion,
            model,
            stopReason);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RichCompletionEventData.class,
                "completion", completion,
                "model", model,
                "stopReason", stopReason);
    }
    
    public final static class Builder {
 
        private String completion;
 
        private Optional<String> model = Optional.empty();
 
        private Optional<? extends StopReason> stopReason = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder completion(String completion) {
            Utils.checkNotNull(completion, "completion");
            this.completion = completion;
            return this;
        }

        public Builder model(String model) {
            Utils.checkNotNull(model, "model");
            this.model = Optional.ofNullable(model);
            return this;
        }

        public Builder model(Optional<String> model) {
            Utils.checkNotNull(model, "model");
            this.model = model;
            return this;
        }

        public Builder stopReason(StopReason stopReason) {
            Utils.checkNotNull(stopReason, "stopReason");
            this.stopReason = Optional.ofNullable(stopReason);
            return this;
        }

        public Builder stopReason(Optional<? extends StopReason> stopReason) {
            Utils.checkNotNull(stopReason, "stopReason");
            this.stopReason = stopReason;
            return this;
        }
        
        public RichCompletionEventData build() {
            return new RichCompletionEventData(
                completion,
                model,
                stopReason);
        }
    }
}
