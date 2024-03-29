// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type FormQueryParamsMapRequest struct {
	MapParam         map[string]string `queryParam:"style=form,explode=false,name=mapParam"`
	MapParamExploded map[string]int64  `queryParam:"style=form,explode=true,name=mapParamExploded"`
}

func (o *FormQueryParamsMapRequest) GetMapParam() map[string]string {
	if o == nil {
		return nil
	}
	return o.MapParam
}

func (o *FormQueryParamsMapRequest) GetMapParamExploded() map[string]int64 {
	if o == nil {
		return nil
	}
	return o.MapParamExploded
}

// FormQueryParamsMapRes - OK
type FormQueryParamsMapRes struct {
	Args map[string]string `json:"args"`
	URL  string            `json:"url"`
}

func (o *FormQueryParamsMapRes) GetArgs() map[string]string {
	if o == nil {
		return map[string]string{}
	}
	return o.Args
}

func (o *FormQueryParamsMapRes) GetURL() string {
	if o == nil {
		return ""
	}
	return o.URL
}

type FormQueryParamsMapResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *FormQueryParamsMapRes
}

func (o *FormQueryParamsMapResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *FormQueryParamsMapResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *FormQueryParamsMapResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *FormQueryParamsMapResponse) GetRes() *FormQueryParamsMapRes {
	if o == nil {
		return nil
	}
	return o.Res
}
