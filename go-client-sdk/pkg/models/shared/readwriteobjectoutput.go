// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

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
