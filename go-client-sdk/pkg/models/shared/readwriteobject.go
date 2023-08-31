// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type ReadWriteObjectInput struct {
	Num1 int64 `json:"num1"`
	Num2 int64 `json:"num2"`
	Num3 int64 `json:"num3"`
}

func (o *ReadWriteObjectInput) GetNum1() int64 {
	if o == nil {
		return 0
	}
	return o.Num1
}

func (o *ReadWriteObjectInput) GetNum2() int64 {
	if o == nil {
		return 0
	}
	return o.Num2
}

func (o *ReadWriteObjectInput) GetNum3() int64 {
	if o == nil {
		return 0
	}
	return o.Num3
}

// ReadWriteObjectOutput - OK
type ReadWriteObjectOutput struct {
	Num3 int64 `json:"num3"`
	Sum  int64 `json:"sum"`
}

func (o *ReadWriteObjectOutput) GetNum3() int64 {
	if o == nil {
		return 0
	}
	return o.Num3
}

func (o *ReadWriteObjectOutput) GetSum() int64 {
	if o == nil {
		return 0
	}
	return o.Sum
}