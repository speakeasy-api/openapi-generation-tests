// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package shared

import (
	"errors"
	"fmt"
	"openapi/v2/pkg/utils"
)

type DeepObjectWithNonStandardTypeNameAnyType string

const (
	DeepObjectWithNonStandardTypeNameAnyTypeSimpleObject DeepObjectWithNonStandardTypeNameAnyType = "simpleObject"
	DeepObjectWithNonStandardTypeNameAnyTypeStr          DeepObjectWithNonStandardTypeNameAnyType = "str"
)

type DeepObjectWithNonStandardTypeNameAny struct {
	SimpleObject *SimpleObject
	Str          *string

	Type DeepObjectWithNonStandardTypeNameAnyType
}

func CreateDeepObjectWithNonStandardTypeNameAnySimpleObject(simpleObject SimpleObject) DeepObjectWithNonStandardTypeNameAny {
	typ := DeepObjectWithNonStandardTypeNameAnyTypeSimpleObject

	return DeepObjectWithNonStandardTypeNameAny{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func CreateDeepObjectWithNonStandardTypeNameAnyStr(str string) DeepObjectWithNonStandardTypeNameAny {
	typ := DeepObjectWithNonStandardTypeNameAnyTypeStr

	return DeepObjectWithNonStandardTypeNameAny{
		Str:  &str,
		Type: typ,
	}
}

func (u *DeepObjectWithNonStandardTypeNameAny) UnmarshalJSON(data []byte) error {

	var simpleObject SimpleObject = SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = DeepObjectWithNonStandardTypeNameAnyTypeSimpleObject
		return nil
	}

	var str string = ""
	if err := utils.UnmarshalJSON(data, &str, "", true, true); err == nil {
		u.Str = &str
		u.Type = DeepObjectWithNonStandardTypeNameAnyTypeStr
		return nil
	}

	return fmt.Errorf("could not unmarshal `%s` into any supported union types for DeepObjectWithNonStandardTypeNameAny", string(data))
}

func (u DeepObjectWithNonStandardTypeNameAny) MarshalJSON() ([]byte, error) {
	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	if u.Str != nil {
		return utils.MarshalJSON(u.Str, "", true)
	}

	return nil, errors.New("could not marshal union type DeepObjectWithNonStandardTypeNameAny: all fields are null")
}

type DeepObjectWithNonStandardTypeName struct {
	Any  DeepObjectWithNonStandardTypeNameAny `json:"any"`
	Arr  []SimpleObject                       `json:"arr"`
	Bool bool                                 `json:"bool"`
	Int  int64                                `json:"int"`
	Map  map[string]SimpleObject              `json:"map"`
	Num  float64                              `json:"num"`
	// A simple object that uses all our supported primitive types and enums and has optional properties.
	Obj     SimpleObject `json:"obj"`
	ObjType *string      `json:"obj.type,omitempty"`
	Str     string       `json:"str"`
	Type    *string      `json:"type,omitempty"`
}

func (o *DeepObjectWithNonStandardTypeName) GetAny() DeepObjectWithNonStandardTypeNameAny {
	if o == nil {
		return DeepObjectWithNonStandardTypeNameAny{}
	}
	return o.Any
}

func (o *DeepObjectWithNonStandardTypeName) GetArr() []SimpleObject {
	if o == nil {
		return []SimpleObject{}
	}
	return o.Arr
}

func (o *DeepObjectWithNonStandardTypeName) GetBool() bool {
	if o == nil {
		return false
	}
	return o.Bool
}

func (o *DeepObjectWithNonStandardTypeName) GetInt() int64 {
	if o == nil {
		return 0
	}
	return o.Int
}

func (o *DeepObjectWithNonStandardTypeName) GetMap() map[string]SimpleObject {
	if o == nil {
		return map[string]SimpleObject{}
	}
	return o.Map
}

func (o *DeepObjectWithNonStandardTypeName) GetNum() float64 {
	if o == nil {
		return 0.0
	}
	return o.Num
}

func (o *DeepObjectWithNonStandardTypeName) GetObj() SimpleObject {
	if o == nil {
		return SimpleObject{}
	}
	return o.Obj
}

func (o *DeepObjectWithNonStandardTypeName) GetObjType() *string {
	if o == nil {
		return nil
	}
	return o.ObjType
}

func (o *DeepObjectWithNonStandardTypeName) GetStr() string {
	if o == nil {
		return ""
	}
	return o.Str
}

func (o *DeepObjectWithNonStandardTypeName) GetType() *string {
	if o == nil {
		return nil
	}
	return o.Type
}