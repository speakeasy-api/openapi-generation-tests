// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type NullableOptionalObj struct {
}

type NullableRequiredObj struct {
}

type RequiredObj struct {
}

type NullableRequiredEmptyObjectPostRequestBody struct {
	NullableOptionalObj *NullableOptionalObj `json:"NullableOptionalObj,omitempty"`
	NullableRequiredObj *NullableRequiredObj `json:"NullableRequiredObj"`
	RequiredObj         RequiredObj          `json:"RequiredObj"`
}

func (o *NullableRequiredEmptyObjectPostRequestBody) GetNullableOptionalObj() *NullableOptionalObj {
	if o == nil {
		return nil
	}
	return o.NullableOptionalObj
}

func (o *NullableRequiredEmptyObjectPostRequestBody) GetNullableRequiredObj() *NullableRequiredObj {
	if o == nil {
		return nil
	}
	return o.NullableRequiredObj
}

func (o *NullableRequiredEmptyObjectPostRequestBody) GetRequiredObj() RequiredObj {
	if o == nil {
		return RequiredObj{}
	}
	return o.RequiredObj
}

type NullableRequiredEmptyObjectPostResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *string
}

func (o *NullableRequiredEmptyObjectPostResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *NullableRequiredEmptyObjectPostResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *NullableRequiredEmptyObjectPostResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *NullableRequiredEmptyObjectPostResponse) GetRes() *string {
	if o == nil {
		return nil
	}
	return o.Res
}
