// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
)

type TypedObject3Type string

const (
	TypedObject3TypeObj3 TypedObject3Type = "obj3"
)

func (e TypedObject3Type) ToPointer() *TypedObject3Type {
	return &e
}

func (e *TypedObject3Type) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "obj3":
		*e = TypedObject3Type(v)
		return nil
	default:
		return fmt.Errorf("invalid value for TypedObject3Type: %v", v)
	}
}

type TypedObject3 struct {
	Type  TypedObject3Type `json:"type"`
	Value string           `json:"value"`
}

func (o *TypedObject3) GetType() TypedObject3Type {
	if o == nil {
		return TypedObject3Type("")
	}
	return o.Type
}

func (o *TypedObject3) GetValue() string {
	if o == nil {
		return ""
	}
	return o.Value
}
