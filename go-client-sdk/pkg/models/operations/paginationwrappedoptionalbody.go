// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

var PaginationWrappedOptionalBodyServerList = []string{
	"http://localhost:35456",
}

type PaginationWrappedOptionalBodySecurity struct {
	PaginationAuth *string `security:"scheme,type=apiKey,subtype=header,name=x-api-key"`
}

func (o *PaginationWrappedOptionalBodySecurity) GetPaginationAuth() *string {
	if o == nil {
		return nil
	}
	return o.PaginationAuth
}

type PaginationWrappedOptionalBodyRequest struct {
	IdempotencyKey    *string                   `header:"style=simple,explode=false,name=idempotency-key"`
	LimitOffsetConfig *shared.LimitOffsetConfig `request:"mediaType=application/json"`
	RequestID         *string                   `header:"style=simple,explode=false,name=request-id"`
}

func (o *PaginationWrappedOptionalBodyRequest) GetIdempotencyKey() *string {
	if o == nil {
		return nil
	}
	return o.IdempotencyKey
}

func (o *PaginationWrappedOptionalBodyRequest) GetLimitOffsetConfig() *shared.LimitOffsetConfig {
	if o == nil {
		return nil
	}
	return o.LimitOffsetConfig
}

func (o *PaginationWrappedOptionalBodyRequest) GetRequestID() *string {
	if o == nil {
		return nil
	}
	return o.RequestID
}

// PaginationWrappedOptionalBodyRes - OK
type PaginationWrappedOptionalBodyRes struct {
	Next        *string `json:"next,omitempty"`
	NumPages    int64   `json:"numPages"`
	ResultArray []int64 `json:"resultArray"`
}

func (o *PaginationWrappedOptionalBodyRes) GetNext() *string {
	if o == nil {
		return nil
	}
	return o.Next
}

func (o *PaginationWrappedOptionalBodyRes) GetNumPages() int64 {
	if o == nil {
		return 0
	}
	return o.NumPages
}

func (o *PaginationWrappedOptionalBodyRes) GetResultArray() []int64 {
	if o == nil {
		return []int64{}
	}
	return o.ResultArray
}

type PaginationWrappedOptionalBodyResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *PaginationWrappedOptionalBodyRes

	Next func() (*PaginationWrappedOptionalBodyResponse, error)
}

func (o *PaginationWrappedOptionalBodyResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *PaginationWrappedOptionalBodyResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *PaginationWrappedOptionalBodyResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *PaginationWrappedOptionalBodyResponse) GetRes() *PaginationWrappedOptionalBodyRes {
	if o == nil {
		return nil
	}
	return o.Res
}