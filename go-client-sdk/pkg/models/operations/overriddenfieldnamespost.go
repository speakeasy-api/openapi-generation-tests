// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"net/http"
)

type OverriddenFieldNamesPostRequestBody struct {
	InInt *int64  `json:"int,omitempty"`
	InStr *string `json:"str,omitempty"`
}

func (o *OverriddenFieldNamesPostRequestBody) GetInInt() *int64 {
	if o == nil {
		return nil
	}
	return o.InInt
}

func (o *OverriddenFieldNamesPostRequestBody) GetInStr() *string {
	if o == nil {
		return nil
	}
	return o.InStr
}

type OverriddenFieldNamesPostJSON struct {
	OutInt int64  `json:"int"`
	OutStr string `json:"str"`
}

func (o *OverriddenFieldNamesPostJSON) GetOutInt() int64 {
	if o == nil {
		return 0
	}
	return o.OutInt
}

func (o *OverriddenFieldNamesPostJSON) GetOutStr() string {
	if o == nil {
		return ""
	}
	return o.OutStr
}

// OverriddenFieldNamesPostResponseBody - OK
type OverriddenFieldNamesPostResponseBody struct {
	JSON OverriddenFieldNamesPostJSON `json:"json"`
}

func (o *OverriddenFieldNamesPostResponseBody) GetJSON() OverriddenFieldNamesPostJSON {
	if o == nil {
		return OverriddenFieldNamesPostJSON{}
	}
	return o.JSON
}

type OverriddenFieldNamesPostResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *OverriddenFieldNamesPostResponseBody
}

func (o *OverriddenFieldNamesPostResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *OverriddenFieldNamesPostResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *OverriddenFieldNamesPostResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *OverriddenFieldNamesPostResponse) GetObject() *OverriddenFieldNamesPostResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}