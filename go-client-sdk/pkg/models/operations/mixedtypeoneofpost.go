// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"errors"
	"net/http"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/utils"
)

type MixedTypeOneOfPostRequestBodyType string

const (
	MixedTypeOneOfPostRequestBodyTypeStr          MixedTypeOneOfPostRequestBodyType = "str"
	MixedTypeOneOfPostRequestBodyTypeInteger      MixedTypeOneOfPostRequestBodyType = "integer"
	MixedTypeOneOfPostRequestBodyTypeSimpleObject MixedTypeOneOfPostRequestBodyType = "simpleObject"
)

type MixedTypeOneOfPostRequestBody struct {
	Str          *string
	Integer      *int64
	SimpleObject *shared.SimpleObject

	Type MixedTypeOneOfPostRequestBodyType
}

func CreateMixedTypeOneOfPostRequestBodyStr(str string) MixedTypeOneOfPostRequestBody {
	typ := MixedTypeOneOfPostRequestBodyTypeStr

	return MixedTypeOneOfPostRequestBody{
		Str:  &str,
		Type: typ,
	}
}

func CreateMixedTypeOneOfPostRequestBodyInteger(integer int64) MixedTypeOneOfPostRequestBody {
	typ := MixedTypeOneOfPostRequestBodyTypeInteger

	return MixedTypeOneOfPostRequestBody{
		Integer: &integer,
		Type:    typ,
	}
}

func CreateMixedTypeOneOfPostRequestBodySimpleObject(simpleObject shared.SimpleObject) MixedTypeOneOfPostRequestBody {
	typ := MixedTypeOneOfPostRequestBodyTypeSimpleObject

	return MixedTypeOneOfPostRequestBody{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func (u *MixedTypeOneOfPostRequestBody) UnmarshalJSON(data []byte) error {

	simpleObject := shared.SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = MixedTypeOneOfPostRequestBodyTypeSimpleObject
		return nil
	}

	str := ""
	if err := utils.UnmarshalJSON(data, &str, "", true, true); err == nil {
		u.Str = &str
		u.Type = MixedTypeOneOfPostRequestBodyTypeStr
		return nil
	}

	integer := int64(0)
	if err := utils.UnmarshalJSON(data, &integer, "", true, true); err == nil {
		u.Integer = &integer
		u.Type = MixedTypeOneOfPostRequestBodyTypeInteger
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u MixedTypeOneOfPostRequestBody) MarshalJSON() ([]byte, error) {
	if u.Str != nil {
		return utils.MarshalJSON(u.Str, "", true)
	}

	if u.Integer != nil {
		return utils.MarshalJSON(u.Integer, "", true)
	}

	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}

type MixedTypeOneOfPostJSONType string

const (
	MixedTypeOneOfPostJSONTypeStr          MixedTypeOneOfPostJSONType = "str"
	MixedTypeOneOfPostJSONTypeInteger      MixedTypeOneOfPostJSONType = "integer"
	MixedTypeOneOfPostJSONTypeSimpleObject MixedTypeOneOfPostJSONType = "simpleObject"
)

type MixedTypeOneOfPostJSON struct {
	Str          *string
	Integer      *int64
	SimpleObject *shared.SimpleObject

	Type MixedTypeOneOfPostJSONType
}

func CreateMixedTypeOneOfPostJSONStr(str string) MixedTypeOneOfPostJSON {
	typ := MixedTypeOneOfPostJSONTypeStr

	return MixedTypeOneOfPostJSON{
		Str:  &str,
		Type: typ,
	}
}

func CreateMixedTypeOneOfPostJSONInteger(integer int64) MixedTypeOneOfPostJSON {
	typ := MixedTypeOneOfPostJSONTypeInteger

	return MixedTypeOneOfPostJSON{
		Integer: &integer,
		Type:    typ,
	}
}

func CreateMixedTypeOneOfPostJSONSimpleObject(simpleObject shared.SimpleObject) MixedTypeOneOfPostJSON {
	typ := MixedTypeOneOfPostJSONTypeSimpleObject

	return MixedTypeOneOfPostJSON{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func (u *MixedTypeOneOfPostJSON) UnmarshalJSON(data []byte) error {

	simpleObject := shared.SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = MixedTypeOneOfPostJSONTypeSimpleObject
		return nil
	}

	str := ""
	if err := utils.UnmarshalJSON(data, &str, "", true, true); err == nil {
		u.Str = &str
		u.Type = MixedTypeOneOfPostJSONTypeStr
		return nil
	}

	integer := int64(0)
	if err := utils.UnmarshalJSON(data, &integer, "", true, true); err == nil {
		u.Integer = &integer
		u.Type = MixedTypeOneOfPostJSONTypeInteger
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u MixedTypeOneOfPostJSON) MarshalJSON() ([]byte, error) {
	if u.Str != nil {
		return utils.MarshalJSON(u.Str, "", true)
	}

	if u.Integer != nil {
		return utils.MarshalJSON(u.Integer, "", true)
	}

	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}

// MixedTypeOneOfPostRes - OK
type MixedTypeOneOfPostRes struct {
	JSON MixedTypeOneOfPostJSON `json:"json"`
}

func (o *MixedTypeOneOfPostRes) GetJSON() MixedTypeOneOfPostJSON {
	if o == nil {
		return MixedTypeOneOfPostJSON{}
	}
	return o.JSON
}

type MixedTypeOneOfPostResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *MixedTypeOneOfPostRes
}

func (o *MixedTypeOneOfPostResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *MixedTypeOneOfPostResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *MixedTypeOneOfPostResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *MixedTypeOneOfPostResponse) GetRes() *MixedTypeOneOfPostRes {
	if o == nil {
		return nil
	}
	return o.Res
}
