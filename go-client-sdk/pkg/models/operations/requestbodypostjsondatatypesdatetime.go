// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"time"
)

// RequestBodyPostJSONDataTypesDateTime200ApplicationJSON - OK
type RequestBodyPostJSONDataTypesDateTime200ApplicationJSON struct {
	JSON time.Time `json:"json"`
}

func (o *RequestBodyPostJSONDataTypesDateTime200ApplicationJSON) GetJSON() time.Time {
	if o == nil {
		return time.Time{}
	}
	return o.JSON
}

type RequestBodyPostJSONDataTypesDateTimeResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	RequestBodyPostJSONDataTypesDateTime200ApplicationJSONObject *RequestBodyPostJSONDataTypesDateTime200ApplicationJSON
}

func (o *RequestBodyPostJSONDataTypesDateTimeResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostJSONDataTypesDateTimeResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostJSONDataTypesDateTimeResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostJSONDataTypesDateTimeResponse) GetRequestBodyPostJSONDataTypesDateTime200ApplicationJSONObject() *RequestBodyPostJSONDataTypesDateTime200ApplicationJSON {
	if o == nil {
		return nil
	}
	return o.RequestBodyPostJSONDataTypesDateTime200ApplicationJSONObject
}