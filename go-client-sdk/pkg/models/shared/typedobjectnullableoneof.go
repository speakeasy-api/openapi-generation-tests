// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"bytes"
	"encoding/json"
	"errors"
)

type TypedObjectNullableOneOfType string

const (
	TypedObjectNullableOneOfTypeTypedObject1 TypedObjectNullableOneOfType = "typedObject1"
	TypedObjectNullableOneOfTypeTypedObject2 TypedObjectNullableOneOfType = "typedObject2"
)

type TypedObjectNullableOneOf struct {
	TypedObject1 *TypedObject1
	TypedObject2 *TypedObject2

	Type TypedObjectNullableOneOfType
}

func CreateTypedObjectNullableOneOfTypedObject1(typedObject1 TypedObject1) TypedObjectNullableOneOf {
	typ := TypedObjectNullableOneOfTypeTypedObject1

	return TypedObjectNullableOneOf{
		TypedObject1: &typedObject1,
		Type:         typ,
	}
}

func CreateTypedObjectNullableOneOfTypedObject2(typedObject2 TypedObject2) TypedObjectNullableOneOf {
	typ := TypedObjectNullableOneOfTypeTypedObject2

	return TypedObjectNullableOneOf{
		TypedObject2: &typedObject2,
		Type:         typ,
	}
}

func (u *TypedObjectNullableOneOf) UnmarshalJSON(data []byte) error {
	var d *json.Decoder

	typedObject1 := new(TypedObject1)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&typedObject1); err == nil {
		u.TypedObject1 = typedObject1
		u.Type = TypedObjectNullableOneOfTypeTypedObject1
		return nil
	}

	typedObject2 := new(TypedObject2)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&typedObject2); err == nil {
		u.TypedObject2 = typedObject2
		u.Type = TypedObjectNullableOneOfTypeTypedObject2
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u TypedObjectNullableOneOf) MarshalJSON() ([]byte, error) {
	if u.TypedObject1 != nil {
		return json.Marshal(u.TypedObject1)
	}

	if u.TypedObject2 != nil {
		return json.Marshal(u.TypedObject2)
	}

	return json.Marshal(nil)

}