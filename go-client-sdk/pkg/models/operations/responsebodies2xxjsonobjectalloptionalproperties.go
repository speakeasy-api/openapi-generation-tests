// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"net/http"
)

// ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody - OK
type ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody struct {
	Data *string `json:"data,omitempty"`
}

func (o *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody) GetData() *string {
	if o == nil {
		return nil
	}
	return o.Data
}

type ResponseBodies2xxJSONObjectAllOptionalPropertiesResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody
}

func (o *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponse) GetObject() *ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}