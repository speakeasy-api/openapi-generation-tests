// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"errors"
	"fmt"
	"openapi/v2/pkg/utils"
)

type ConstDiscriminatedOneOfType string

const (
	ConstDiscriminatedOneOfTypeTag1 ConstDiscriminatedOneOfType = "tag1"
	ConstDiscriminatedOneOfTypeTag2 ConstDiscriminatedOneOfType = "tag2"
)

type ConstDiscriminatedOneOf struct {
	ConstObject1 *ConstObject1
	ConstObject2 *ConstObject2

	Type ConstDiscriminatedOneOfType
}

func CreateConstDiscriminatedOneOfTag1(tag1 ConstObject1) ConstDiscriminatedOneOf {
	typ := ConstDiscriminatedOneOfTypeTag1

	return ConstDiscriminatedOneOf{
		ConstObject1: &tag1,
		Type:         typ,
	}
}

func CreateConstDiscriminatedOneOfTag2(tag2 ConstObject2) ConstDiscriminatedOneOf {
	typ := ConstDiscriminatedOneOfTypeTag2

	return ConstDiscriminatedOneOf{
		ConstObject2: &tag2,
		Type:         typ,
	}
}

func (u *ConstDiscriminatedOneOf) UnmarshalJSON(data []byte) error {

	type discriminator struct {
		Tag string `json:"tag"`
	}

	dis := new(discriminator)
	if err := json.Unmarshal(data, &dis); err != nil {
		return fmt.Errorf("could not unmarshal discriminator: %w", err)
	}

	switch dis.Tag {
	case "tag1":
		constObject1 := new(ConstObject1)
		if err := utils.UnmarshalJSON(data, &constObject1, "", true, false); err != nil {
			return fmt.Errorf("could not unmarshal `%s` into expected (Tag == tag1) type ConstObject1 within ConstDiscriminatedOneOf: %w", string(data), err)
		}

		u.ConstObject1 = constObject1
		u.Type = ConstDiscriminatedOneOfTypeTag1
		return nil
	case "tag2":
		constObject2 := new(ConstObject2)
		if err := utils.UnmarshalJSON(data, &constObject2, "", true, false); err != nil {
			return fmt.Errorf("could not unmarshal `%s` into expected (Tag == tag2) type ConstObject2 within ConstDiscriminatedOneOf: %w", string(data), err)
		}

		u.ConstObject2 = constObject2
		u.Type = ConstDiscriminatedOneOfTypeTag2
		return nil
	}

	return fmt.Errorf("could not unmarshal `%s` into any supported union types for ConstDiscriminatedOneOf", string(data))
}

func (u ConstDiscriminatedOneOf) MarshalJSON() ([]byte, error) {
	if u.ConstObject1 != nil {
		return utils.MarshalJSON(u.ConstObject1, "", true)
	}

	if u.ConstObject2 != nil {
		return utils.MarshalJSON(u.ConstObject2, "", true)
	}

	return nil, errors.New("could not marshal union type ConstDiscriminatedOneOf: all fields are null")
}