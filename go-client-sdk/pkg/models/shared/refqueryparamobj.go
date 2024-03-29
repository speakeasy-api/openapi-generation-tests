// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type RefQueryParamObj struct {
	Bool bool    `queryParam:"name=bool"`
	Int  int64   `queryParam:"name=int"`
	Num  float64 `queryParam:"name=num"`
	Str  string  `queryParam:"name=str"`
}

func (o *RefQueryParamObj) GetBool() bool {
	if o == nil {
		return false
	}
	return o.Bool
}

func (o *RefQueryParamObj) GetInt() int64 {
	if o == nil {
		return 0
	}
	return o.Int
}

func (o *RefQueryParamObj) GetNum() float64 {
	if o == nil {
		return 0.0
	}
	return o.Num
}

func (o *RefQueryParamObj) GetStr() string {
	if o == nil {
		return ""
	}
	return o.Str
}
