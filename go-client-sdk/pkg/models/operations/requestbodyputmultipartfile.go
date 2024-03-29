// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type File struct {
	Content  []byte `multipartForm:"content"`
	FileName string `multipartForm:"name=file"`
}

func (o *File) GetContent() []byte {
	if o == nil {
		return []byte{}
	}
	return o.Content
}

func (o *File) GetFileName() string {
	if o == nil {
		return ""
	}
	return o.FileName
}

type RequestBodyPutMultipartFileRequestBody struct {
	File *File `multipartForm:"file"`
}

func (o *RequestBodyPutMultipartFileRequestBody) GetFile() *File {
	if o == nil {
		return nil
	}
	return o.File
}

// RequestBodyPutMultipartFileRes - OK
type RequestBodyPutMultipartFileRes struct {
	Files map[string]string `json:"files"`
}

func (o *RequestBodyPutMultipartFileRes) GetFiles() map[string]string {
	if o == nil {
		return map[string]string{}
	}
	return o.Files
}

type RequestBodyPutMultipartFileResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *RequestBodyPutMultipartFileRes
}

func (o *RequestBodyPutMultipartFileResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPutMultipartFileResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPutMultipartFileResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPutMultipartFileResponse) GetRes() *RequestBodyPutMultipartFileRes {
	if o == nil {
		return nil
	}
	return o.Res
}
