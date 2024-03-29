// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type ReadOnlyObject struct {
	Bool   bool    `json:"bool"`
	Num    float64 `json:"num"`
	String string  `json:"string"`
}

func (o *ReadOnlyObject) GetBool() bool {
	if o == nil {
		return false
	}
	return o.Bool
}

func (o *ReadOnlyObject) GetNum() float64 {
	if o == nil {
		return 0.0
	}
	return o.Num
}

func (o *ReadOnlyObject) GetString() string {
	if o == nil {
		return ""
	}
	return o.String
}
