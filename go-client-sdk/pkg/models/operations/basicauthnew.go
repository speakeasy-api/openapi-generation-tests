// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

var BasicAuthNewServerList = []string{
	"http://localhost:35456",
}

type BasicAuthNewSecurity struct {
	Password string `security:"scheme,type=http,subtype=basic,name=password"`
	Username string `security:"scheme,type=http,subtype=basic,name=username"`
}

type BasicAuthNewResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
}
