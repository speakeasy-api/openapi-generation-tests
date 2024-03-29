/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class DifferentFileName {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;

    public DifferentFileName withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=differentFileName")
    public String fileName;

    public DifferentFileName withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    
    public DifferentFileName(@JsonProperty("content") byte[] content, @JsonProperty("fileName") String fileName) {
        this.content = content;
        this.fileName = fileName;
  }
}
