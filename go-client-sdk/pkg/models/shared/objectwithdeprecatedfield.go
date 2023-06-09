// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
)

// ObjectWithDeprecatedFieldDeprecatedEnum
//
// Deprecated: this type will be removed in a future release, please migrate away from it as soon as possible.
type ObjectWithDeprecatedFieldDeprecatedEnum string

const (
	ObjectWithDeprecatedFieldDeprecatedEnumA ObjectWithDeprecatedFieldDeprecatedEnum = "a"
	ObjectWithDeprecatedFieldDeprecatedEnumB ObjectWithDeprecatedFieldDeprecatedEnum = "b"
	ObjectWithDeprecatedFieldDeprecatedEnumC ObjectWithDeprecatedFieldDeprecatedEnum = "c"
)

func (e ObjectWithDeprecatedFieldDeprecatedEnum) ToPointer() *ObjectWithDeprecatedFieldDeprecatedEnum {
	return &e
}

func (e *ObjectWithDeprecatedFieldDeprecatedEnum) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "a":
		fallthrough
	case "b":
		fallthrough
	case "c":
		*e = ObjectWithDeprecatedFieldDeprecatedEnum(v)
		return nil
	default:
		return fmt.Errorf("invalid value for ObjectWithDeprecatedFieldDeprecatedEnum: %v", v)
	}
}

// ObjectWithDeprecatedField
//
// Deprecated: this type will be removed in a future release, please migrate away from it as soon as possible.
type ObjectWithDeprecatedField struct {
	// Deprecated: this field will be removed in a future release, please migrate away from it as soon as possible.
	DeprecatedEnum *ObjectWithDeprecatedFieldDeprecatedEnum `json:"deprecatedEnum,omitempty"`
	// Deprecated: this field will be removed in a future release, please migrate away from it as soon as possible. Use NewField instead.
	DeprecatedField *string `json:"deprecatedField,omitempty"`
	NewField        *string `json:"newField,omitempty"`
}
