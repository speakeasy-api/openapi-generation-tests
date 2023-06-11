// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type RequestBodyPostEmptyObjectRequestBodyEmpty struct {
}

type RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties struct {
}

type RequestBodyPostEmptyObjectRequestBody struct {
	Empty                    *RequestBodyPostEmptyObjectRequestBodyEmpty                    `json:"empty,omitempty"`
	EmptyWithEmptyProperties *RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties `json:"emptyWithEmptyProperties,omitempty"`
}

type RequestBodyPostEmptyObject200ApplicationJSONEmpty struct {
}

type RequestBodyPostEmptyObject200ApplicationJSONEmptyRespWithEmptyProperies struct {
}

// RequestBodyPostEmptyObject200ApplicationJSON - OK
type RequestBodyPostEmptyObject200ApplicationJSON struct {
	Empty                       *RequestBodyPostEmptyObject200ApplicationJSONEmpty                       `json:"empty,omitempty"`
	EmptyRespWithEmptyProperies *RequestBodyPostEmptyObject200ApplicationJSONEmptyRespWithEmptyProperies `json:"emptyRespWithEmptyProperies,omitempty"`
}

type RequestBodyPostEmptyObjectResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	RequestBodyPostEmptyObject200ApplicationJSONObject *RequestBodyPostEmptyObject200ApplicationJSON
}