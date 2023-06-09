// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type RequestBodyPutMultipartFileRequestBodyFile struct {
	Content []byte `multipartForm:"content"`
	File    string `multipartForm:"name=file"`
}

type RequestBodyPutMultipartFileRequestBody struct {
	File *RequestBodyPutMultipartFileRequestBodyFile `multipartForm:"file"`
}

// RequestBodyPutMultipartFileRes - OK
type RequestBodyPutMultipartFileRes struct {
	Files map[string]string `json:"files"`
}

type RequestBodyPutMultipartFileResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *RequestBodyPutMultipartFileRes
}
