// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/utils"
)

// RequestBodyPostJSONDataTypesArrayDateResponseBody - OK
type RequestBodyPostJSONDataTypesArrayDateResponseBody struct {
	Data string       `json:"data"`
	JSON []types.Date `json:"json"`
}

func (r RequestBodyPostJSONDataTypesArrayDateResponseBody) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(r, "", false)
}

func (r *RequestBodyPostJSONDataTypesArrayDateResponseBody) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &r, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *RequestBodyPostJSONDataTypesArrayDateResponseBody) GetData() string {
	if o == nil {
		return ""
	}
	return o.Data
}

func (o *RequestBodyPostJSONDataTypesArrayDateResponseBody) GetJSON() []types.Date {
	if o == nil {
		return []types.Date{}
	}
	return o.JSON
}

type RequestBodyPostJSONDataTypesArrayDateResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *RequestBodyPostJSONDataTypesArrayDateResponseBody
}

func (o *RequestBodyPostJSONDataTypesArrayDateResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostJSONDataTypesArrayDateResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostJSONDataTypesArrayDateResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostJSONDataTypesArrayDateResponse) GetObject() *RequestBodyPostJSONDataTypesArrayDateResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}
