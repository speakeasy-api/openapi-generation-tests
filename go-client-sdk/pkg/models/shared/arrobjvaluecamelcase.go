// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type ArrObjValueCamelCase struct {
	JSON     []SimpleObjectCamelCase `json:"json,omitempty"`
	Required interface{}             `json:"required,omitempty"`
}

func (o *ArrObjValueCamelCase) GetJSON() []SimpleObjectCamelCase {
	if o == nil {
		return nil
	}
	return o.JSON
}

func (o *ArrObjValueCamelCase) GetRequired() interface{} {
	if o == nil {
		return nil
	}
	return o.Required
}
