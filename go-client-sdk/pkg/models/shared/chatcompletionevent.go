// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package shared

type Data struct {
	Content string `json:"content"`
}

func (o *Data) GetContent() string {
	if o == nil {
		return ""
	}
	return o.Content
}

// ChatCompletionEvent - Represents a chat completion event which contains printable content
type ChatCompletionEvent struct {
	Data Data `json:"data"`
}

func (o *ChatCompletionEvent) GetData() Data {
	if o == nil {
		return Data{}
	}
	return o.Data
}

func (o ChatCompletionEvent) GetEventEncoding(event string) (string, error) {
	return "application/json", nil
}