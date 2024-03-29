// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"openapi/v2/pkg/utils"
)

type WeaklyTypedOneOfReadWriteObjectType string

const (
	WeaklyTypedOneOfReadWriteObjectTypeSimpleObject    WeaklyTypedOneOfReadWriteObjectType = "simpleObject"
	WeaklyTypedOneOfReadWriteObjectTypeReadWriteObject WeaklyTypedOneOfReadWriteObjectType = "readWriteObject"
)

type WeaklyTypedOneOfReadWriteObject struct {
	SimpleObject    *SimpleObject
	ReadWriteObject *ReadWriteObject

	Type WeaklyTypedOneOfReadWriteObjectType
}

func CreateWeaklyTypedOneOfReadWriteObjectSimpleObject(simpleObject SimpleObject) WeaklyTypedOneOfReadWriteObject {
	typ := WeaklyTypedOneOfReadWriteObjectTypeSimpleObject

	return WeaklyTypedOneOfReadWriteObject{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func CreateWeaklyTypedOneOfReadWriteObjectReadWriteObject(readWriteObject ReadWriteObject) WeaklyTypedOneOfReadWriteObject {
	typ := WeaklyTypedOneOfReadWriteObjectTypeReadWriteObject

	return WeaklyTypedOneOfReadWriteObject{
		ReadWriteObject: &readWriteObject,
		Type:            typ,
	}
}

func (u *WeaklyTypedOneOfReadWriteObject) UnmarshalJSON(data []byte) error {

	readWriteObject := ReadWriteObject{}
	if err := utils.UnmarshalJSON(data, &readWriteObject, "", true, true); err == nil {
		u.ReadWriteObject = &readWriteObject
		u.Type = WeaklyTypedOneOfReadWriteObjectTypeReadWriteObject
		return nil
	}

	simpleObject := SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = WeaklyTypedOneOfReadWriteObjectTypeSimpleObject
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u WeaklyTypedOneOfReadWriteObject) MarshalJSON() ([]byte, error) {
	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	if u.ReadWriteObject != nil {
		return utils.MarshalJSON(u.ReadWriteObject, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}
