// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"bytes"
	"encoding/json"
	"errors"
)

type NullableOneOfRefInObjectNullableOneOfTwoType string

const (
	NullableOneOfRefInObjectNullableOneOfTwoTypeTypedObject1 NullableOneOfRefInObjectNullableOneOfTwoType = "typedObject1"
	NullableOneOfRefInObjectNullableOneOfTwoTypeTypedObject2 NullableOneOfRefInObjectNullableOneOfTwoType = "typedObject2"
)

type NullableOneOfRefInObjectNullableOneOfTwo struct {
	TypedObject1 *TypedObject1
	TypedObject2 *TypedObject2

	Type NullableOneOfRefInObjectNullableOneOfTwoType
}

func CreateNullableOneOfRefInObjectNullableOneOfTwoTypedObject1(typedObject1 TypedObject1) NullableOneOfRefInObjectNullableOneOfTwo {
	typ := NullableOneOfRefInObjectNullableOneOfTwoTypeTypedObject1

	return NullableOneOfRefInObjectNullableOneOfTwo{
		TypedObject1: &typedObject1,
		Type:         typ,
	}
}

func CreateNullableOneOfRefInObjectNullableOneOfTwoTypedObject2(typedObject2 TypedObject2) NullableOneOfRefInObjectNullableOneOfTwo {
	typ := NullableOneOfRefInObjectNullableOneOfTwoTypeTypedObject2

	return NullableOneOfRefInObjectNullableOneOfTwo{
		TypedObject2: &typedObject2,
		Type:         typ,
	}
}

func (u *NullableOneOfRefInObjectNullableOneOfTwo) UnmarshalJSON(data []byte) error {
	var d *json.Decoder

	typedObject1 := new(TypedObject1)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&typedObject1); err == nil {
		u.TypedObject1 = typedObject1
		u.Type = NullableOneOfRefInObjectNullableOneOfTwoTypeTypedObject1
		return nil
	}

	typedObject2 := new(TypedObject2)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&typedObject2); err == nil {
		u.TypedObject2 = typedObject2
		u.Type = NullableOneOfRefInObjectNullableOneOfTwoTypeTypedObject2
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u NullableOneOfRefInObjectNullableOneOfTwo) MarshalJSON() ([]byte, error) {
	if u.TypedObject1 != nil {
		return json.Marshal(u.TypedObject1)
	}

	if u.TypedObject2 != nil {
		return json.Marshal(u.TypedObject2)
	}

	return json.Marshal(nil)

}

type NullableOneOfRefInObject struct {
	NullableOneOfOne *TypedObject1                             `json:"NullableOneOfOne"`
	NullableOneOfTwo *NullableOneOfRefInObjectNullableOneOfTwo `json:"NullableOneOfTwo"`
	OneOfOne         TypedObject1                              `json:"OneOfOne"`
}

func (o *NullableOneOfRefInObject) GetNullableOneOfOne() *TypedObject1 {
	if o == nil {
		return nil
	}
	return o.NullableOneOfOne
}

func (o *NullableOneOfRefInObject) GetNullableOneOfTwo() *NullableOneOfRefInObjectNullableOneOfTwo {
	if o == nil {
		return nil
	}
	return o.NullableOneOfTwo
}

func (o *NullableOneOfRefInObject) GetOneOfOne() TypedObject1 {
	if o == nil {
		return TypedObject1{}
	}
	return o.OneOfOne
}