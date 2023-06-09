// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type InlineBodyAndParamNoConflictRequestBody struct {
	BodyStr string `json:"bodyStr"`
}

type InlineBodyAndParamNoConflictRequest struct {
	RequestBody InlineBodyAndParamNoConflictRequestBody `request:"mediaType=application/json"`
	ParamStr    string                                  `queryParam:"style=form,explode=true,name=paramStr"`
}

type InlineBodyAndParamNoConflictResJSON struct {
	BodyStr string `json:"bodyStr"`
}

// InlineBodyAndParamNoConflictRes - OK
type InlineBodyAndParamNoConflictRes struct {
	Args map[string]string                   `json:"args"`
	JSON InlineBodyAndParamNoConflictResJSON `json:"json"`
}

type InlineBodyAndParamNoConflictResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *InlineBodyAndParamNoConflictRes
}
