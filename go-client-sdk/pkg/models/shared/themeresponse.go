// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package shared

type ThemeResponse struct {
	JSON Theme `json:"json"`
}

func (o *ThemeResponse) GetJSON() Theme {
	if o == nil {
		return Theme{}
	}
	return o.JSON
}