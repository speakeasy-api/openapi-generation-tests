// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"openapi/v2/pkg/utils"
)

type DeepObjectWithTypeAnyType string

const (
	DeepObjectWithTypeAnyTypeSimpleObject DeepObjectWithTypeAnyType = "simpleObject"
	DeepObjectWithTypeAnyTypeStr          DeepObjectWithTypeAnyType = "str"
)

type DeepObjectWithTypeAny struct {
	SimpleObject *SimpleObject
	Str          *string

	Type DeepObjectWithTypeAnyType
}

func CreateDeepObjectWithTypeAnySimpleObject(simpleObject SimpleObject) DeepObjectWithTypeAny {
	typ := DeepObjectWithTypeAnyTypeSimpleObject

	return DeepObjectWithTypeAny{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func CreateDeepObjectWithTypeAnyStr(str string) DeepObjectWithTypeAny {
	typ := DeepObjectWithTypeAnyTypeStr

	return DeepObjectWithTypeAny{
		Str:  &str,
		Type: typ,
	}
}

func (u *DeepObjectWithTypeAny) UnmarshalJSON(data []byte) error {

	simpleObject := SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = DeepObjectWithTypeAnyTypeSimpleObject
		return nil
	}

	str := ""
	if err := utils.UnmarshalJSON(data, &str, "", true, true); err == nil {
		u.Str = &str
		u.Type = DeepObjectWithTypeAnyTypeStr
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u DeepObjectWithTypeAny) MarshalJSON() ([]byte, error) {
	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	if u.Str != nil {
		return utils.MarshalJSON(u.Str, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}

type DeepObjectWithType struct {
	Any  DeepObjectWithTypeAny   `json:"any"`
	Arr  []SimpleObject          `json:"arr"`
	Bool bool                    `json:"bool"`
	Int  int64                   `json:"int"`
	Map  map[string]SimpleObject `json:"map"`
	Num  float64                 `json:"num"`
	// A simple object that uses all our supported primitive types and enums and has optional properties.
	Obj  SimpleObject `json:"obj"`
	Str  string       `json:"str"`
	Type *string      `json:"type,omitempty"`
}

func (o *DeepObjectWithType) GetAny() DeepObjectWithTypeAny {
	if o == nil {
		return DeepObjectWithTypeAny{}
	}
	return o.Any
}

func (o *DeepObjectWithType) GetArr() []SimpleObject {
	if o == nil {
		return []SimpleObject{}
	}
	return o.Arr
}

func (o *DeepObjectWithType) GetBool() bool {
	if o == nil {
		return false
	}
	return o.Bool
}

func (o *DeepObjectWithType) GetInt() int64 {
	if o == nil {
		return 0
	}
	return o.Int
}

func (o *DeepObjectWithType) GetMap() map[string]SimpleObject {
	if o == nil {
		return map[string]SimpleObject{}
	}
	return o.Map
}

func (o *DeepObjectWithType) GetNum() float64 {
	if o == nil {
		return 0.0
	}
	return o.Num
}

func (o *DeepObjectWithType) GetObj() SimpleObject {
	if o == nil {
		return SimpleObject{}
	}
	return o.Obj
}

func (o *DeepObjectWithType) GetStr() string {
	if o == nil {
		return ""
	}
	return o.Str
}

func (o *DeepObjectWithType) GetType() *string {
	if o == nil {
		return nil
	}
	return o.Type
}
