// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

var PaginationLimitOffsetPageParamsServerList = []string{
	"http://localhost:35456",
}

type PaginationLimitOffsetPageParamsRequest struct {
	Page int64 `queryParam:"style=form,explode=true,name=page"`
}

// PaginationLimitOffsetPageParamsRes - OK
type PaginationLimitOffsetPageParamsRes struct {
	NumPages    int64   `json:"numPages"`
	ResultArray []int64 `json:"resultArray"`
}

type PaginationLimitOffsetPageParamsResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *PaginationLimitOffsetPageParamsRes

	Next func() (*PaginationLimitOffsetPageParamsResponse, error)
}