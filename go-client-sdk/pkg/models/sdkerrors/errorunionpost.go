// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"errors"
	"fmt"
	"net/http"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/utils"
)

type ErrorUnionPostResponseBodyType string

const (
	ErrorUnionPostResponseBodyTypeErrorType1 ErrorUnionPostResponseBodyType = "errorType1"
	ErrorUnionPostResponseBodyTypeErrorType2 ErrorUnionPostResponseBodyType = "errorType2"
)

// ErrorUnionPostResponseBody - Internal Server Error
type ErrorUnionPostResponseBody struct {
	ErrorType1 *shared.ErrorType1
	ErrorType2 *shared.ErrorType2

	Type ErrorUnionPostResponseBodyType

	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response `json:"-"`
}

var _ error = &ErrorUnionPostResponseBody{}

func CreateErrorUnionPostResponseBodyErrorType1(errorType1 shared.ErrorType1) ErrorUnionPostResponseBody {
	typ := ErrorUnionPostResponseBodyTypeErrorType1

	return ErrorUnionPostResponseBody{
		ErrorType1: &errorType1,
		Type:       typ,
	}
}

func CreateErrorUnionPostResponseBodyErrorType2(errorType2 shared.ErrorType2) ErrorUnionPostResponseBody {
	typ := ErrorUnionPostResponseBodyTypeErrorType2

	return ErrorUnionPostResponseBody{
		ErrorType2: &errorType2,
		Type:       typ,
	}
}

func (u *ErrorUnionPostResponseBody) UnmarshalJSON(data []byte) error {

	var errorType1 shared.ErrorType1 = shared.ErrorType1{}
	if err := utils.UnmarshalJSON(data, &errorType1, "", true, true); err == nil {
		u.ErrorType1 = &errorType1
		u.Type = ErrorUnionPostResponseBodyTypeErrorType1
		return nil
	}

	var errorType2 shared.ErrorType2 = shared.ErrorType2{}
	if err := utils.UnmarshalJSON(data, &errorType2, "", true, true); err == nil {
		u.ErrorType2 = &errorType2
		u.Type = ErrorUnionPostResponseBodyTypeErrorType2
		return nil
	}

	return fmt.Errorf("could not unmarshal `%s` into any supported union types for ErrorUnionPostResponseBody", string(data))
}

func (u ErrorUnionPostResponseBody) MarshalJSON() ([]byte, error) {
	if u.ErrorType1 != nil {
		return utils.MarshalJSON(u.ErrorType1, "", true)
	}

	if u.ErrorType2 != nil {
		return utils.MarshalJSON(u.ErrorType2, "", true)
	}

	return nil, errors.New("could not marshal union type ErrorUnionPostResponseBody: all fields are null")
}

func (u ErrorUnionPostResponseBody) Error() string {
	switch u.Type {
	case ErrorUnionPostResponseBodyTypeErrorType1:
		data, _ := json.Marshal(u.ErrorType1)
		return string(data)
	case ErrorUnionPostResponseBodyTypeErrorType2:
		data, _ := json.Marshal(u.ErrorType2)
		return string(data)
	default:
		return "unknown error"
	}
}