// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

var PaginationCursorBodyServerList = []string{
	"http://localhost:35456",
}

type PaginationCursorBodyRequestBody struct {
	Cursor int64 `json:"cursor"`
}

// PaginationCursorBodyRes - OK
type PaginationCursorBodyRes struct {
	NumPages    int64   `json:"numPages"`
	ResultArray []int64 `json:"resultArray"`
}

type PaginationCursorBodyResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *PaginationCursorBodyRes

	Next func() (*PaginationCursorBodyResponse, error)
}
