// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"openapi/v2/pkg/utils"
)

type WeaklyTypedOneOfWriteOnlyObjectType string

const (
	WeaklyTypedOneOfWriteOnlyObjectTypeSimpleObject    WeaklyTypedOneOfWriteOnlyObjectType = "simpleObject"
	WeaklyTypedOneOfWriteOnlyObjectTypeWriteOnlyObject WeaklyTypedOneOfWriteOnlyObjectType = "writeOnlyObject"
)

type WeaklyTypedOneOfWriteOnlyObject struct {
	SimpleObject    *SimpleObject
	WriteOnlyObject *WriteOnlyObject

	Type WeaklyTypedOneOfWriteOnlyObjectType
}

func CreateWeaklyTypedOneOfWriteOnlyObjectSimpleObject(simpleObject SimpleObject) WeaklyTypedOneOfWriteOnlyObject {
	typ := WeaklyTypedOneOfWriteOnlyObjectTypeSimpleObject

	return WeaklyTypedOneOfWriteOnlyObject{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func CreateWeaklyTypedOneOfWriteOnlyObjectWriteOnlyObject(writeOnlyObject WriteOnlyObject) WeaklyTypedOneOfWriteOnlyObject {
	typ := WeaklyTypedOneOfWriteOnlyObjectTypeWriteOnlyObject

	return WeaklyTypedOneOfWriteOnlyObject{
		WriteOnlyObject: &writeOnlyObject,
		Type:            typ,
	}
}

func (u *WeaklyTypedOneOfWriteOnlyObject) UnmarshalJSON(data []byte) error {

	writeOnlyObject := WriteOnlyObject{}
	if err := utils.UnmarshalJSON(data, &writeOnlyObject, "", true, true); err == nil {
		u.WriteOnlyObject = &writeOnlyObject
		u.Type = WeaklyTypedOneOfWriteOnlyObjectTypeWriteOnlyObject
		return nil
	}

	simpleObject := SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = WeaklyTypedOneOfWriteOnlyObjectTypeSimpleObject
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u WeaklyTypedOneOfWriteOnlyObject) MarshalJSON() ([]byte, error) {
	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	if u.WriteOnlyObject != nil {
		return utils.MarshalJSON(u.WriteOnlyObject, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}
