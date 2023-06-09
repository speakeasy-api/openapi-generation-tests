// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
	"math/big"
	"openapi/pkg/types"
	"time"
)

// SimpleObjectWithTypeInt32Enum - An int32 enum property.
type SimpleObjectWithTypeInt32Enum int

const (
	SimpleObjectWithTypeInt32EnumFiftyFive              SimpleObjectWithTypeInt32Enum = 55
	SimpleObjectWithTypeInt32EnumSixtyNine              SimpleObjectWithTypeInt32Enum = 69
	SimpleObjectWithTypeInt32EnumOneHundredAndEightyOne SimpleObjectWithTypeInt32Enum = 181
)

func (e SimpleObjectWithTypeInt32Enum) ToPointer() *SimpleObjectWithTypeInt32Enum {
	return &e
}

func (e *SimpleObjectWithTypeInt32Enum) UnmarshalJSON(data []byte) error {
	var v int
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case 55:
		fallthrough
	case 69:
		fallthrough
	case 181:
		*e = SimpleObjectWithTypeInt32Enum(v)
		return nil
	default:
		return fmt.Errorf("invalid value for SimpleObjectWithTypeInt32Enum: %v", v)
	}
}

// SimpleObjectWithTypeIntEnum - An integer enum property.
type SimpleObjectWithTypeIntEnum int64

const (
	SimpleObjectWithTypeIntEnumFirst  SimpleObjectWithTypeIntEnum = 1
	SimpleObjectWithTypeIntEnumSecond SimpleObjectWithTypeIntEnum = 2
	SimpleObjectWithTypeIntEnumThird  SimpleObjectWithTypeIntEnum = 3
)

func (e SimpleObjectWithTypeIntEnum) ToPointer() *SimpleObjectWithTypeIntEnum {
	return &e
}

func (e *SimpleObjectWithTypeIntEnum) UnmarshalJSON(data []byte) error {
	var v int64
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case 1:
		fallthrough
	case 2:
		fallthrough
	case 3:
		*e = SimpleObjectWithTypeIntEnum(v)
		return nil
	default:
		return fmt.Errorf("invalid value for SimpleObjectWithTypeIntEnum: %v", v)
	}
}

// SimpleObjectWithType - A simple object that uses all our supported primitive types and enums and has optional properties.
// https://docs.speakeasyapi.dev - A link to the external docs.
type SimpleObjectWithType struct {
	// An any property.
	Any       interface{}   `json:"any"`
	Bigint    *big.Int      `json:"bigint,omitempty"`
	BigintStr *types.BigInt `json:"bigintStr,omitempty"`
	// A boolean property.
	Bool bool `json:"bool"`
	// An optional boolean property.
	BoolOpt *bool `json:"boolOpt,omitempty"`
	// A date property.
	Date types.Date `json:"date"`
	// A date-time property.
	DateTime time.Time `json:"dateTime"`
	// An string based enum
	Enum Enum `json:"enum"`
	// A float32 property.
	Float32 float64 `json:"float32"`
	// An integer property.
	Int int64 `json:"int"`
	// An int32 property.
	Int32 int `json:"int32"`
	// An int32 enum property.
	Int32Enum SimpleObjectWithTypeInt32Enum `json:"int32Enum"`
	// An integer enum property.
	IntEnum SimpleObjectWithTypeIntEnum `json:"intEnum"`
	// An optional integer property will be null for tests.
	IntOptNull *int64 `json:"intOptNull,omitempty"`
	// A number property.
	Num float64 `json:"num"`
	// An optional number property will be null for tests.
	NumOptNull *float64 `json:"numOptNull,omitempty"`
	// A string property.
	Str string `json:"str"`
	// An optional string property.
	StrOpt *string `json:"strOpt,omitempty"`
	Type   string  `json:"type"`
}
