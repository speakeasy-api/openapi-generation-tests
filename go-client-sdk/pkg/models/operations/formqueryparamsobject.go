// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

type FormQueryParamsObjectRequest struct {
	// A simple object that uses all our supported primitive types and enums and has optional properties.
	ObjParamExploded shared.SimpleObject `queryParam:"style=form,explode=true,name=objParamExploded"`
	// A simple object that uses all our supported primitive types and enums and has optional properties.
	ObjParam *shared.SimpleObject `queryParam:"style=form,explode=false,name=objParam"`
}

type FormQueryParamsObjectResArgs struct {
	Any        string  `json:"any"`
	Bigint     *string `json:"bigint,omitempty"`
	BigintStr  *string `json:"bigintStr,omitempty"`
	Bool       string  `json:"bool"`
	BoolOpt    *string `json:"boolOpt,omitempty"`
	Date       string  `json:"date"`
	DateTime   string  `json:"dateTime"`
	Enum       string  `json:"enum"`
	Float32    string  `json:"float32"`
	Int        string  `json:"int"`
	Int32      string  `json:"int32"`
	Int32Enum  string  `json:"int32Enum"`
	IntEnum    string  `json:"intEnum"`
	IntOptNull *string `json:"intOptNull,omitempty"`
	Num        string  `json:"num"`
	NumOptNull *string `json:"numOptNull,omitempty"`
	ObjParam   string  `json:"objParam"`
	Str        string  `json:"str"`
	StrOpt     *string `json:"strOpt,omitempty"`
}

// FormQueryParamsObjectRes - OK
type FormQueryParamsObjectRes struct {
	Args FormQueryParamsObjectResArgs `json:"args"`
	URL  string                       `json:"url"`
}

type FormQueryParamsObjectResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *FormQueryParamsObjectRes
}
