/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.shared.ChatCompletionResult;
import org.openapis.openapi.models.shared.ChatCompletionStream;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class ChatResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Ok
     */
    private Optional<? extends List<ChatCompletionResult>> chatCompletionResult;

    @JsonCreator
    public ChatResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<ChatCompletionResult>> chatCompletionResult) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(chatCompletionResult, "chatCompletionResult");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.chatCompletionResult = chatCompletionResult;
    }
    
    public ChatResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Ok
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ChatCompletionResult>> chatCompletionResult() {
        return (Optional<List<ChatCompletionResult>>) chatCompletionResult;
    }

    public org.openapis.openapi.utils.EventStream<org.openapis.openapi.models.shared.ChatCompletionStream> events() {
        return new org.openapis.openapi.utils.EventStream<org.openapis.openapi.models.shared.ChatCompletionStream>(
            rawResponse.body(), 
            new TypeReference<ChatCompletionStream>() {}, 
            Utils.mapper());    
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ChatResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ChatResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ChatResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Ok
     */
    public ChatResponse withChatCompletionResult(List<ChatCompletionResult> chatCompletionResult) {
        Utils.checkNotNull(chatCompletionResult, "chatCompletionResult");
        this.chatCompletionResult = Optional.ofNullable(chatCompletionResult);
        return this;
    }

    /**
     * Ok
     */
    public ChatResponse withChatCompletionResult(Optional<? extends List<ChatCompletionResult>> chatCompletionResult) {
        Utils.checkNotNull(chatCompletionResult, "chatCompletionResult");
        this.chatCompletionResult = chatCompletionResult;
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
        ChatResponse other = (ChatResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.chatCompletionResult, other.chatCompletionResult);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            chatCompletionResult);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChatResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "chatCompletionResult", chatCompletionResult);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<ChatCompletionResult>> chatCompletionResult = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Ok
         */
        public Builder chatCompletionResult(List<ChatCompletionResult> chatCompletionResult) {
            Utils.checkNotNull(chatCompletionResult, "chatCompletionResult");
            this.chatCompletionResult = Optional.ofNullable(chatCompletionResult);
            return this;
        }

        /**
         * Ok
         */
        public Builder chatCompletionResult(Optional<? extends List<ChatCompletionResult>> chatCompletionResult) {
            Utils.checkNotNull(chatCompletionResult, "chatCompletionResult");
            this.chatCompletionResult = chatCompletionResult;
            return this;
        }
        
        public ChatResponse build() {
            return new ChatResponse(
                contentType,
                statusCode,
                rawResponse,
                chatCompletionResult);
        }
    }
}
