// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

type ObjArrParam struct {
	Arr []string `queryParam:"name=arr"`
}

func (o *ObjArrParam) GetArr() []string {
	if o == nil {
		return nil
	}
	return o.Arr
}

type DeepObjectQueryParamsObjectRequest struct {
	// A simple object that uses all our supported primitive types and enums and has optional properties.
	ObjParam    shared.SimpleObject `queryParam:"style=deepObject,explode=true,name=objParam"`
	ObjArrParam *ObjArrParam        `queryParam:"style=deepObject,explode=true,name=objArrParam"`
}

func (o *DeepObjectQueryParamsObjectRequest) GetObjParam() shared.SimpleObject {
	if o == nil {
		return shared.SimpleObject{}
	}
	return o.ObjParam
}

func (o *DeepObjectQueryParamsObjectRequest) GetObjArrParam() *ObjArrParam {
	if o == nil {
		return nil
	}
	return o.ObjArrParam
}

type DeepObjectQueryParamsObjectArgs struct {
	ObjArrParamArr     []string `json:"objArrParam[arr]"`
	ObjParamAny        string   `json:"objParam[any]"`
	ObjParamBigintStr  *string  `json:"objParam[bigintStr],omitempty"`
	ObjParamBigint     *string  `json:"objParam[bigint],omitempty"`
	ObjParamBoolOpt    string   `json:"objParam[boolOpt]"`
	ObjParamBool       string   `json:"objParam[bool]"`
	ObjParamDateTime   string   `json:"objParam[dateTime]"`
	ObjParamDate       string   `json:"objParam[date]"`
	ObjParamDecimalStr *string  `json:"objParam[decimalStr],omitempty"`
	ObjParamDecimal    *string  `json:"objParam[decimal],omitempty"`
	ObjParamEnum       string   `json:"objParam[enum]"`
	ObjParamFloat32    string   `json:"objParam[float32]"`
	ObjParamInt32Enum  string   `json:"objParam[int32Enum]"`
	ObjParamInt32      string   `json:"objParam[int32]"`
	ObjParamIntEnum    string   `json:"objParam[intEnum]"`
	ObjParamInt        string   `json:"objParam[int]"`
	ObjParamNum        string   `json:"objParam[num]"`
	ObjParamStrOpt     string   `json:"objParam[strOpt]"`
	ObjParamStr        string   `json:"objParam[str]"`
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjArrParamArr() []string {
	if o == nil {
		return []string{}
	}
	return o.ObjArrParamArr
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamAny() string {
	if o == nil {
		return ""
	}
	return o.ObjParamAny
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamBigintStr() *string {
	if o == nil {
		return nil
	}
	return o.ObjParamBigintStr
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamBigint() *string {
	if o == nil {
		return nil
	}
	return o.ObjParamBigint
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamBoolOpt() string {
	if o == nil {
		return ""
	}
	return o.ObjParamBoolOpt
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamBool() string {
	if o == nil {
		return ""
	}
	return o.ObjParamBool
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamDateTime() string {
	if o == nil {
		return ""
	}
	return o.ObjParamDateTime
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamDate() string {
	if o == nil {
		return ""
	}
	return o.ObjParamDate
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamDecimalStr() *string {
	if o == nil {
		return nil
	}
	return o.ObjParamDecimalStr
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamDecimal() *string {
	if o == nil {
		return nil
	}
	return o.ObjParamDecimal
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamEnum() string {
	if o == nil {
		return ""
	}
	return o.ObjParamEnum
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamFloat32() string {
	if o == nil {
		return ""
	}
	return o.ObjParamFloat32
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamInt32Enum() string {
	if o == nil {
		return ""
	}
	return o.ObjParamInt32Enum
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamInt32() string {
	if o == nil {
		return ""
	}
	return o.ObjParamInt32
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamIntEnum() string {
	if o == nil {
		return ""
	}
	return o.ObjParamIntEnum
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamInt() string {
	if o == nil {
		return ""
	}
	return o.ObjParamInt
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamNum() string {
	if o == nil {
		return ""
	}
	return o.ObjParamNum
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamStrOpt() string {
	if o == nil {
		return ""
	}
	return o.ObjParamStrOpt
}

func (o *DeepObjectQueryParamsObjectArgs) GetObjParamStr() string {
	if o == nil {
		return ""
	}
	return o.ObjParamStr
}

// DeepObjectQueryParamsObjectRes - OK
type DeepObjectQueryParamsObjectRes struct {
	Args DeepObjectQueryParamsObjectArgs `json:"args"`
	URL  string                          `json:"url"`
}

func (o *DeepObjectQueryParamsObjectRes) GetArgs() DeepObjectQueryParamsObjectArgs {
	if o == nil {
		return DeepObjectQueryParamsObjectArgs{}
	}
	return o.Args
}

func (o *DeepObjectQueryParamsObjectRes) GetURL() string {
	if o == nil {
		return ""
	}
	return o.URL
}

type DeepObjectQueryParamsObjectResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *DeepObjectQueryParamsObjectRes
}

func (o *DeepObjectQueryParamsObjectResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *DeepObjectQueryParamsObjectResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *DeepObjectQueryParamsObjectResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *DeepObjectQueryParamsObjectResponse) GetRes() *DeepObjectQueryParamsObjectRes {
	if o == nil {
		return nil
	}
	return o.Res
}
