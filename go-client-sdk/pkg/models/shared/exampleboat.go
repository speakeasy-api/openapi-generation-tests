// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
	"time"
)

type ExampleBoatType string

const (
	ExampleBoatTypeBoat ExampleBoatType = "boat"
)

func (e ExampleBoatType) ToPointer() *ExampleBoatType {
	return &e
}

func (e *ExampleBoatType) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "boat":
		*e = ExampleBoatType(v)
		return nil
	default:
		return fmt.Errorf("invalid value for ExampleBoatType: %v", v)
	}
}

type ExampleBoat struct {
	CreatedAt *time.Time      `json:"createdAt,omitempty"`
	Length    float64         `json:"length"`
	Name      string          `json:"name"`
	Type      ExampleBoatType `json:"type"`
	UpdatedAt *time.Time      `json:"updatedAt,omitempty"`
}

func (o *ExampleBoat) GetCreatedAt() *time.Time {
	if o == nil {
		return nil
	}
	return o.CreatedAt
}

func (o *ExampleBoat) GetLength() float64 {
	if o == nil {
		return 0.0
	}
	return o.Length
}

func (o *ExampleBoat) GetName() string {
	if o == nil {
		return ""
	}
	return o.Name
}

func (o *ExampleBoat) GetType() ExampleBoatType {
	if o == nil {
		return ExampleBoatType("")
	}
	return o.Type
}

func (o *ExampleBoat) GetUpdatedAt() *time.Time {
	if o == nil {
		return nil
	}
	return o.UpdatedAt
}