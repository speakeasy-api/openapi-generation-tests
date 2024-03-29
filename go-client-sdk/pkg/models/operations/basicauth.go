// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type BasicAuthSecurity struct {
	Password string `security:"scheme,type=http,subtype=basic,name=password"`
	Username string `security:"scheme,type=http,subtype=basic,name=username"`
}

func (o *BasicAuthSecurity) GetPassword() string {
	if o == nil {
		return ""
	}
	return o.Password
}

func (o *BasicAuthSecurity) GetUsername() string {
	if o == nil {
		return ""
	}
	return o.Username
}

type BasicAuthRequest struct {
	Passwd string `pathParam:"style=simple,explode=false,name=passwd"`
	User   string `pathParam:"style=simple,explode=false,name=user"`
}

func (o *BasicAuthRequest) GetPasswd() string {
	if o == nil {
		return ""
	}
	return o.Passwd
}

func (o *BasicAuthRequest) GetUser() string {
	if o == nil {
		return ""
	}
	return o.User
}

// BasicAuthUser - Successful authentication.
type BasicAuthUser struct {
	Authenticated bool   `json:"authenticated"`
	User          string `json:"user"`
}

func (o *BasicAuthUser) GetAuthenticated() bool {
	if o == nil {
		return false
	}
	return o.Authenticated
}

func (o *BasicAuthUser) GetUser() string {
	if o == nil {
		return ""
	}
	return o.User
}

type BasicAuthResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// Successful authentication.
	User *BasicAuthUser
}

func (o *BasicAuthResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *BasicAuthResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *BasicAuthResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *BasicAuthResponse) GetUser() *BasicAuthUser {
	if o == nil {
		return nil
	}
	return o.User
}
