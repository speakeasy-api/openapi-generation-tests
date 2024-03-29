// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"openapi/v2/pkg/utils"
)

type FlattenedTypedObject1Type string

const (
	FlattenedTypedObject1TypeTypedObject1 FlattenedTypedObject1Type = "typedObject1"
)

type FlattenedTypedObject1 struct {
	TypedObject1 *TypedObject1

	Type FlattenedTypedObject1Type
}

func CreateFlattenedTypedObject1TypedObject1(typedObject1 TypedObject1) FlattenedTypedObject1 {
	typ := FlattenedTypedObject1TypeTypedObject1

	return FlattenedTypedObject1{
		TypedObject1: &typedObject1,
		Type:         typ,
	}
}

func (u *FlattenedTypedObject1) UnmarshalJSON(data []byte) error {

	typedObject1 := TypedObject1{}
	if err := utils.UnmarshalJSON(data, &typedObject1, "", true, true); err == nil {
		u.TypedObject1 = &typedObject1
		u.Type = FlattenedTypedObject1TypeTypedObject1
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u FlattenedTypedObject1) MarshalJSON() ([]byte, error) {
	if u.TypedObject1 != nil {
		return utils.MarshalJSON(u.TypedObject1, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}
