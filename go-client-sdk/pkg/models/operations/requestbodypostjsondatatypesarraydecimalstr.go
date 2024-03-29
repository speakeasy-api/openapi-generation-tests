// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"github.com/ericlagergren/decimal"
	"net/http"
	"openapi/v2/pkg/utils"
)

// RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody - OK
type RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody struct {
	Data string         `json:"data"`
	JSON []*decimal.Big `json:"json"`
}

func (r RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(r, "", false)
}

func (r *RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &r, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody) GetData() string {
	if o == nil {
		return ""
	}
	return o.Data
}

func (o *RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody) GetJSON() []*decimal.Big {
	if o == nil {
		return []*decimal.Big{}
	}
	return o.JSON
}

type RequestBodyPostJSONDataTypesArrayDecimalStrResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody
}

func (o *RequestBodyPostJSONDataTypesArrayDecimalStrResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostJSONDataTypesArrayDecimalStrResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostJSONDataTypesArrayDecimalStrResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostJSONDataTypesArrayDecimalStrResponse) GetObject() *RequestBodyPostJSONDataTypesArrayDecimalStrResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}
