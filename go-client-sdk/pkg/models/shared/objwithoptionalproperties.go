// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package shared

type ObjWithOptionalProperties struct {
	OptInt *int64  `json:"optInt,omitempty"`
	OptStr *string `json:"optStr,omitempty"`
}

func (o *ObjWithOptionalProperties) GetOptInt() *int64 {
	if o == nil {
		return nil
	}
	return o.OptInt
}

func (o *ObjWithOptionalProperties) GetOptStr() *string {
	if o == nil {
		return nil
	}
	return o.OptStr
}