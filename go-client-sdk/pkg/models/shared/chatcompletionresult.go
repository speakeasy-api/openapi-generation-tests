// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"openapi/v3/pkg/utils"
)

type ChatCompletionResultType string

const (
	ChatCompletionResultTypeChatCompletionEvent ChatCompletionResultType = "chatCompletionEvent"
	ChatCompletionResultTypeSentinelEvent       ChatCompletionResultType = "sentinelEvent"
)

type ChatCompletionResult struct {
	ChatCompletionEvent *ChatCompletionEvent
	SentinelEvent       *SentinelEvent

	Type ChatCompletionResultType
}

func CreateChatCompletionResultChatCompletionEvent(chatCompletionEvent ChatCompletionEvent) ChatCompletionResult {
	typ := ChatCompletionResultTypeChatCompletionEvent

	return ChatCompletionResult{
		ChatCompletionEvent: &chatCompletionEvent,
		Type:                typ,
	}
}

func CreateChatCompletionResultSentinelEvent(sentinelEvent SentinelEvent) ChatCompletionResult {
	typ := ChatCompletionResultTypeSentinelEvent

	return ChatCompletionResult{
		SentinelEvent: &sentinelEvent,
		Type:          typ,
	}
}

func (u *ChatCompletionResult) UnmarshalJSON(data []byte) error {

	chatCompletionEvent := ChatCompletionEvent{}
	if err := utils.UnmarshalJSON(data, &chatCompletionEvent, "", true, true); err == nil {
		u.ChatCompletionEvent = &chatCompletionEvent
		u.Type = ChatCompletionResultTypeChatCompletionEvent
		return nil
	}

	sentinelEvent := SentinelEvent{}
	if err := utils.UnmarshalJSON(data, &sentinelEvent, "", true, true); err == nil {
		u.SentinelEvent = &sentinelEvent
		u.Type = ChatCompletionResultTypeSentinelEvent
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u ChatCompletionResult) MarshalJSON() ([]byte, error) {
	if u.ChatCompletionEvent != nil {
		return utils.MarshalJSON(u.ChatCompletionEvent, "", true)
	}

	if u.SentinelEvent != nil {
		return utils.MarshalJSON(u.SentinelEvent, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}