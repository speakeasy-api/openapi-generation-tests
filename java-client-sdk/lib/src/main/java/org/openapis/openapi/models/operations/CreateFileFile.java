/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class CreateFileFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;

    public CreateFileFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=file")
    public String fileName;

    public CreateFileFile withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    
    public CreateFileFile(@JsonProperty("content") byte[] content, @JsonProperty("fileName") String fileName) {
        this.content = content;
        this.fileName = fileName;
  }
}