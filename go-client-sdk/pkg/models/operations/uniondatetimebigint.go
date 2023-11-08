// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"errors"
	"math/big"
	"net/http"
	"openapi/v2/pkg/utils"
	"time"
)

type UnionDateTimeBigIntRequestBodyType string

const (
	UnionDateTimeBigIntRequestBodyTypeDateTime UnionDateTimeBigIntRequestBodyType = "date-time"
	UnionDateTimeBigIntRequestBodyTypeBigint   UnionDateTimeBigIntRequestBodyType = "bigint"
)

type UnionDateTimeBigIntRequestBody struct {
	DateTime *time.Time
	Bigint   *big.Int

	Type UnionDateTimeBigIntRequestBodyType
}

func CreateUnionDateTimeBigIntRequestBodyDateTime(dateTime time.Time) UnionDateTimeBigIntRequestBody {
	typ := UnionDateTimeBigIntRequestBodyTypeDateTime

	return UnionDateTimeBigIntRequestBody{
		DateTime: &dateTime,
		Type:     typ,
	}
}

func CreateUnionDateTimeBigIntRequestBodyBigint(bigint *big.Int) UnionDateTimeBigIntRequestBody {
	typ := UnionDateTimeBigIntRequestBodyTypeBigint

	return UnionDateTimeBigIntRequestBody{
		Bigint: bigint,
		Type:   typ,
	}
}

func (u *UnionDateTimeBigIntRequestBody) UnmarshalJSON(data []byte) error {

	dateTime := time.Time{}
	if err := utils.UnmarshalJSON(data, &dateTime, "", true, true); err == nil {
		u.DateTime = &dateTime
		u.Type = UnionDateTimeBigIntRequestBodyTypeDateTime
		return nil
	}

	bigint := big.NewInt(0)
	if err := utils.UnmarshalJSON(data, &bigint, "", true, true); err == nil {
		u.Bigint = bigint
		u.Type = UnionDateTimeBigIntRequestBodyTypeBigint
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u UnionDateTimeBigIntRequestBody) MarshalJSON() ([]byte, error) {
	if u.DateTime != nil {
		return utils.MarshalJSON(u.DateTime, "", true)
	}

	if u.Bigint != nil {
		return utils.MarshalJSON(u.Bigint, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}

type UnionDateTimeBigIntJSONType string

const (
	UnionDateTimeBigIntJSONTypeDateTime UnionDateTimeBigIntJSONType = "date-time"
	UnionDateTimeBigIntJSONTypeBigint   UnionDateTimeBigIntJSONType = "bigint"
)

type UnionDateTimeBigIntJSON struct {
	DateTime *time.Time
	Bigint   *big.Int

	Type UnionDateTimeBigIntJSONType
}

func CreateUnionDateTimeBigIntJSONDateTime(dateTime time.Time) UnionDateTimeBigIntJSON {
	typ := UnionDateTimeBigIntJSONTypeDateTime

	return UnionDateTimeBigIntJSON{
		DateTime: &dateTime,
		Type:     typ,
	}
}

func CreateUnionDateTimeBigIntJSONBigint(bigint *big.Int) UnionDateTimeBigIntJSON {
	typ := UnionDateTimeBigIntJSONTypeBigint

	return UnionDateTimeBigIntJSON{
		Bigint: bigint,
		Type:   typ,
	}
}

func (u *UnionDateTimeBigIntJSON) UnmarshalJSON(data []byte) error {

	dateTime := time.Time{}
	if err := utils.UnmarshalJSON(data, &dateTime, "", true, true); err == nil {
		u.DateTime = &dateTime
		u.Type = UnionDateTimeBigIntJSONTypeDateTime
		return nil
	}

	bigint := big.NewInt(0)
	if err := utils.UnmarshalJSON(data, &bigint, "", true, true); err == nil {
		u.Bigint = bigint
		u.Type = UnionDateTimeBigIntJSONTypeBigint
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u UnionDateTimeBigIntJSON) MarshalJSON() ([]byte, error) {
	if u.DateTime != nil {
		return utils.MarshalJSON(u.DateTime, "", true)
	}

	if u.Bigint != nil {
		return utils.MarshalJSON(u.Bigint, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}

// UnionDateTimeBigIntRes - OK
type UnionDateTimeBigIntRes struct {
	JSON UnionDateTimeBigIntJSON `json:"json"`
}

func (o *UnionDateTimeBigIntRes) GetJSON() UnionDateTimeBigIntJSON {
	if o == nil {
		return UnionDateTimeBigIntJSON{}
	}
	return o.JSON
}

type UnionDateTimeBigIntResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *UnionDateTimeBigIntRes
}

func (o *UnionDateTimeBigIntResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *UnionDateTimeBigIntResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *UnionDateTimeBigIntResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *UnionDateTimeBigIntResponse) GetRes() *UnionDateTimeBigIntRes {
	if o == nil {
		return nil
	}
	return o.Res
}