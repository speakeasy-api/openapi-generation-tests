// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"net/http"
)

var PaginationEncapsulatedParameterServerList = []string{
	"http://localhost:35456",
}

type PaginationEncapsulatedParameterRequest struct {
	Cursor      *int64  `queryParam:"style=form,explode=true,name=cursor"`
	HeaderParam *string `header:"style=simple,explode=false,name=headerParam"`
}

func (o *PaginationEncapsulatedParameterRequest) GetCursor() *int64 {
	if o == nil {
		return nil
	}
	return o.Cursor
}

func (o *PaginationEncapsulatedParameterRequest) GetHeaderParam() *string {
	if o == nil {
		return nil
	}
	return o.HeaderParam
}

// PaginationEncapsulatedParameterRes - OK
type PaginationEncapsulatedParameterRes struct {
	Next        *string `json:"next,omitempty"`
	NumPages    int64   `json:"numPages"`
	ResultArray []int64 `json:"resultArray"`
}

func (o *PaginationEncapsulatedParameterRes) GetNext() *string {
	if o == nil {
		return nil
	}
	return o.Next
}

func (o *PaginationEncapsulatedParameterRes) GetNumPages() int64 {
	if o == nil {
		return 0
	}
	return o.NumPages
}

func (o *PaginationEncapsulatedParameterRes) GetResultArray() []int64 {
	if o == nil {
		return []int64{}
	}
	return o.ResultArray
}

type PaginationEncapsulatedParameterResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *PaginationEncapsulatedParameterRes

	Next func() (*PaginationEncapsulatedParameterResponse, error)
}

func (o *PaginationEncapsulatedParameterResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *PaginationEncapsulatedParameterResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *PaginationEncapsulatedParameterResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *PaginationEncapsulatedParameterResponse) GetRes() *PaginationEncapsulatedParameterRes {
	if o == nil {
		return nil
	}
	return o.Res
}