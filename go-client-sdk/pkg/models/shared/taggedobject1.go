// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
)

type TaggedObject1Tag string

const (
	TaggedObject1TagTag1 TaggedObject1Tag = "tag1"
)

func (e TaggedObject1Tag) ToPointer() *TaggedObject1Tag {
	return &e
}
func (e *TaggedObject1Tag) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "tag1":
		*e = TaggedObject1Tag(v)
		return nil
	default:
		return fmt.Errorf("invalid value for TaggedObject1Tag: %v", v)
	}
}

type TaggedObject1 struct {
	ImageURL string           `json:"imageURL"`
	Tag      TaggedObject1Tag `json:"tag"`
}

func (o *TaggedObject1) GetImageURL() string {
	if o == nil {
		return ""
	}
	return o.ImageURL
}

func (o *TaggedObject1) GetTag() TaggedObject1Tag {
	if o == nil {
		return TaggedObject1Tag("")
	}
	return o.Tag
}