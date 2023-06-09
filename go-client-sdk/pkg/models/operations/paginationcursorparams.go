// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

var PaginationCursorParamsServerList = []string{
	"http://localhost:35456",
}

type PaginationCursorParamsRequest struct {
	Cursor int64 `queryParam:"style=form,explode=true,name=cursor"`
}

// PaginationCursorParamsRes - OK
type PaginationCursorParamsRes struct {
	NumPages    int64   `json:"numPages"`
	ResultArray []int64 `json:"resultArray"`
}

type PaginationCursorParamsResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *PaginationCursorParamsRes

	Next func() (*PaginationCursorParamsResponse, error)
}
