// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

type NullableRequiredSharedObjectPostRequestBody struct {
	NullableOptionalObj *shared.NullableObject `json:"NullableOptionalObj,omitempty"`
	NullableRequiredObj shared.NullableObject  `json:"NullableRequiredObj"`
}

func (o *NullableRequiredSharedObjectPostRequestBody) GetNullableOptionalObj() *shared.NullableObject {
	if o == nil {
		return nil
	}
	return o.NullableOptionalObj
}

func (o *NullableRequiredSharedObjectPostRequestBody) GetNullableRequiredObj() shared.NullableObject {
	if o == nil {
		return shared.NullableObject{}
	}
	return o.NullableRequiredObj
}

type NullableRequiredSharedObjectPostResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	NullableRequiredSharedObjectPost200ApplicationJSONString *string
}

func (o *NullableRequiredSharedObjectPostResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *NullableRequiredSharedObjectPostResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *NullableRequiredSharedObjectPostResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *NullableRequiredSharedObjectPostResponse) GetNullableRequiredSharedObjectPost200ApplicationJSONString() *string {
	if o == nil {
		return nil
	}
	return o.NullableRequiredSharedObjectPost200ApplicationJSONString
}