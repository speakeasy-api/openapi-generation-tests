// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type DeprecatedOperationWithCommentsGetRequest struct {
	// This is a string parameter
	//
	// Deprecated field: This parameter is deprecated. Use NewParameter instead.
	DeprecatedParameter *string `queryParam:"style=form,explode=true,name=deprecatedParameter"`
	// This is a string parameter
	NewParameter *string `queryParam:"style=form,explode=true,name=newParameter"`
}

func (o *DeprecatedOperationWithCommentsGetRequest) GetDeprecatedParameter() *string {
	if o == nil {
		return nil
	}
	return o.DeprecatedParameter
}

func (o *DeprecatedOperationWithCommentsGetRequest) GetNewParameter() *string {
	if o == nil {
		return nil
	}
	return o.NewParameter
}

type DeprecatedOperationWithCommentsGetResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
}

func (o *DeprecatedOperationWithCommentsGetResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *DeprecatedOperationWithCommentsGetResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *DeprecatedOperationWithCommentsGetResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}