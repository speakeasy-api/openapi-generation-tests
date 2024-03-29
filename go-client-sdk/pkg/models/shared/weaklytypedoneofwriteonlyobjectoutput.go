// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"openapi/v2/pkg/utils"
)

type WeaklyTypedOneOfWriteOnlyObjectOutputType string

const (
	WeaklyTypedOneOfWriteOnlyObjectOutputTypeSimpleObject          WeaklyTypedOneOfWriteOnlyObjectOutputType = "simpleObject"
	WeaklyTypedOneOfWriteOnlyObjectOutputTypeWriteOnlyObjectOutput WeaklyTypedOneOfWriteOnlyObjectOutputType = "writeOnlyObject_output"
)

type WeaklyTypedOneOfWriteOnlyObjectOutput struct {
	SimpleObject          *SimpleObject
	WriteOnlyObjectOutput *WriteOnlyObjectOutput

	Type WeaklyTypedOneOfWriteOnlyObjectOutputType
}

func CreateWeaklyTypedOneOfWriteOnlyObjectOutputSimpleObject(simpleObject SimpleObject) WeaklyTypedOneOfWriteOnlyObjectOutput {
	typ := WeaklyTypedOneOfWriteOnlyObjectOutputTypeSimpleObject

	return WeaklyTypedOneOfWriteOnlyObjectOutput{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func CreateWeaklyTypedOneOfWriteOnlyObjectOutputWriteOnlyObjectOutput(writeOnlyObjectOutput WriteOnlyObjectOutput) WeaklyTypedOneOfWriteOnlyObjectOutput {
	typ := WeaklyTypedOneOfWriteOnlyObjectOutputTypeWriteOnlyObjectOutput

	return WeaklyTypedOneOfWriteOnlyObjectOutput{
		WriteOnlyObjectOutput: &writeOnlyObjectOutput,
		Type:                  typ,
	}
}

func (u *WeaklyTypedOneOfWriteOnlyObjectOutput) UnmarshalJSON(data []byte) error {

	writeOnlyObjectOutput := WriteOnlyObjectOutput{}
	if err := utils.UnmarshalJSON(data, &writeOnlyObjectOutput, "", true, true); err == nil {
		u.WriteOnlyObjectOutput = &writeOnlyObjectOutput
		u.Type = WeaklyTypedOneOfWriteOnlyObjectOutputTypeWriteOnlyObjectOutput
		return nil
	}

	simpleObject := SimpleObject{}
	if err := utils.UnmarshalJSON(data, &simpleObject, "", true, true); err == nil {
		u.SimpleObject = &simpleObject
		u.Type = WeaklyTypedOneOfWriteOnlyObjectOutputTypeSimpleObject
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u WeaklyTypedOneOfWriteOnlyObjectOutput) MarshalJSON() ([]byte, error) {
	if u.SimpleObject != nil {
		return utils.MarshalJSON(u.SimpleObject, "", true)
	}

	if u.WriteOnlyObjectOutput != nil {
		return utils.MarshalJSON(u.WriteOnlyObjectOutput, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}
