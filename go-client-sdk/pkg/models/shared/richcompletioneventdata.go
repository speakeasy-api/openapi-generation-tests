// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
)

type StopReason string

const (
	StopReasonStopSequence StopReason = "stop_sequence"
	StopReasonMaxTokens    StopReason = "max_tokens"
)

func (e StopReason) ToPointer() *StopReason {
	return &e
}
func (e *StopReason) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "stop_sequence":
		fallthrough
	case "max_tokens":
		*e = StopReason(v)
		return nil
	default:
		return fmt.Errorf("invalid value for StopReason: %v", v)
	}
}

type RichCompletionEventData struct {
	Completion string      `json:"completion"`
	Model      *string     `json:"model,omitempty"`
	StopReason *StopReason `json:"stop_reason"`
}

func (o *RichCompletionEventData) GetCompletion() string {
	if o == nil {
		return ""
	}
	return o.Completion
}

func (o *RichCompletionEventData) GetModel() *string {
	if o == nil {
		return nil
	}
	return o.Model
}

func (o *RichCompletionEventData) GetStopReason() *StopReason {
	if o == nil {
		return nil
	}
	return o.StopReason
}