// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"bytes"
	"encoding/json"
	"errors"
)

type WeaklyTypedOneOfReadWriteObjectInputType string

const (
	WeaklyTypedOneOfReadWriteObjectInputTypeSimpleObject         WeaklyTypedOneOfReadWriteObjectInputType = "simpleObject"
	WeaklyTypedOneOfReadWriteObjectInputTypeReadWriteObjectInput WeaklyTypedOneOfReadWriteObjectInputType = "readWriteObjectInput"
)

type WeaklyTypedOneOfReadWriteObjectInput struct {
	SimpleObject         *SimpleObject
	ReadWriteObjectInput *ReadWriteObjectInput

	Type WeaklyTypedOneOfReadWriteObjectInputType
}

func CreateWeaklyTypedOneOfReadWriteObjectInputSimpleObject(simpleObject SimpleObject) WeaklyTypedOneOfReadWriteObjectInput {
	typ := WeaklyTypedOneOfReadWriteObjectInputTypeSimpleObject

	return WeaklyTypedOneOfReadWriteObjectInput{
		SimpleObject: &simpleObject,
		Type:         typ,
	}
}

func CreateWeaklyTypedOneOfReadWriteObjectInputReadWriteObjectInput(readWriteObjectInput ReadWriteObjectInput) WeaklyTypedOneOfReadWriteObjectInput {
	typ := WeaklyTypedOneOfReadWriteObjectInputTypeReadWriteObjectInput

	return WeaklyTypedOneOfReadWriteObjectInput{
		ReadWriteObjectInput: &readWriteObjectInput,
		Type:                 typ,
	}
}

func (u *WeaklyTypedOneOfReadWriteObjectInput) UnmarshalJSON(data []byte) error {
	var d *json.Decoder

	readWriteObjectInput := new(ReadWriteObjectInput)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&readWriteObjectInput); err == nil {
		u.ReadWriteObjectInput = readWriteObjectInput
		u.Type = WeaklyTypedOneOfReadWriteObjectInputTypeReadWriteObjectInput
		return nil
	}

	simpleObject := new(SimpleObject)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&simpleObject); err == nil {
		u.SimpleObject = simpleObject
		u.Type = WeaklyTypedOneOfReadWriteObjectInputTypeSimpleObject
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u WeaklyTypedOneOfReadWriteObjectInput) MarshalJSON() ([]byte, error) {
	if u.ReadWriteObjectInput != nil {
		return json.Marshal(u.ReadWriteObjectInput)
	}

	if u.SimpleObject != nil {
		return json.Marshal(u.SimpleObject)
	}

	return nil, errors.New("could not marshal union type: all fields are null")

}