// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

type CreateFileFile struct {
	Content  []byte `multipartForm:"content"`
	FileName string `multipartForm:"name=file"`
}

func (o *CreateFileFile) GetContent() []byte {
	if o == nil {
		return []byte{}
	}
	return o.Content
}

func (o *CreateFileFile) GetFileName() string {
	if o == nil {
		return ""
	}
	return o.FileName
}

type CreateFileRequestBody struct {
	File *CreateFileFile `multipartForm:"file"`
}

func (o *CreateFileRequestBody) GetFile() *CreateFileFile {
	if o == nil {
		return nil
	}
	return o.File
}

type CreateFileResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// OK
	FileResource *shared.FileResource
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

func (o *CreateFileResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *CreateFileResponse) GetFileResource() *shared.FileResource {
	if o == nil {
		return nil
	}
	return o.FileResource
}

func (o *CreateFileResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *CreateFileResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}
