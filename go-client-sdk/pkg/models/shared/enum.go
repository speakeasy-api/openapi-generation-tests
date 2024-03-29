// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
)

// Enum - A string based enum
type Enum string

const (
	EnumOne         Enum = "one"
	EnumTwo         Enum = "two"
	EnumThree       Enum = "three"
	EnumFourAndMore Enum = "four_and_more"
)

func (e Enum) ToPointer() *Enum {
	return &e
}

func (e *Enum) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "one":
		fallthrough
	case "two":
		fallthrough
	case "three":
		fallthrough
	case "four_and_more":
		*e = Enum(v)
		return nil
	default:
		return fmt.Errorf("invalid value for Enum: %v", v)
	}
}
