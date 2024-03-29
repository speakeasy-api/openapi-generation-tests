// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
)

type TypedObject2Type string

const (
	TypedObject2TypeObj2 TypedObject2Type = "obj2"
)

func (e TypedObject2Type) ToPointer() *TypedObject2Type {
	return &e
}

func (e *TypedObject2Type) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "obj2":
		*e = TypedObject2Type(v)
		return nil
	default:
		return fmt.Errorf("invalid value for TypedObject2Type: %v", v)
	}
}

type TypedObject2 struct {
	Type  TypedObject2Type `json:"type"`
	Value string           `json:"value"`
}

func (o *TypedObject2) GetType() TypedObject2Type {
	if o == nil {
		return TypedObject2Type("")
	}
	return o.Type
}

func (o *TypedObject2) GetValue() string {
	if o == nil {
		return ""
	}
	return o.Value
}
