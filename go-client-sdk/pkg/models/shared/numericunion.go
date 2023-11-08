// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"errors"
	"github.com/ericlagergren/decimal"
	"math/big"
	"openapi/v2/pkg/utils"
)

type NumericUnionType string

const (
	NumericUnionTypeInteger NumericUnionType = "integer"
	NumericUnionTypeNumber  NumericUnionType = "number"
	NumericUnionTypeBigint  NumericUnionType = "bigint"
	NumericUnionTypeDecimal NumericUnionType = "decimal"
)

type NumericUnion struct {
	Integer *int64
	Number  *float64
	Bigint  *big.Int
	Decimal *decimal.Big

	Type NumericUnionType
}

func CreateNumericUnionInteger(integer int64) NumericUnion {
	typ := NumericUnionTypeInteger

	return NumericUnion{
		Integer: &integer,
		Type:    typ,
	}
}

func CreateNumericUnionNumber(number float64) NumericUnion {
	typ := NumericUnionTypeNumber

	return NumericUnion{
		Number: &number,
		Type:   typ,
	}
}

func CreateNumericUnionBigint(bigint *big.Int) NumericUnion {
	typ := NumericUnionTypeBigint

	return NumericUnion{
		Bigint: bigint,
		Type:   typ,
	}
}

func CreateNumericUnionDecimal(decimal *decimal.Big) NumericUnion {
	typ := NumericUnionTypeDecimal

	return NumericUnion{
		Decimal: decimal,
		Type:    typ,
	}
}

func (u *NumericUnion) UnmarshalJSON(data []byte) error {

	integer := int64(0)
	if err := utils.UnmarshalJSON(data, &integer, "", true, true); err == nil {
		u.Integer = &integer
		u.Type = NumericUnionTypeInteger
		return nil
	}

	number := float64(0)
	if err := utils.UnmarshalJSON(data, &number, "", true, true); err == nil {
		u.Number = &number
		u.Type = NumericUnionTypeNumber
		return nil
	}

	bigint := big.NewInt(0)
	if err := utils.UnmarshalJSON(data, &bigint, "", true, true); err == nil {
		u.Bigint = bigint
		u.Type = NumericUnionTypeBigint
		return nil
	}

	decimal := new(decimal.Big).SetFloat64(0.0)
	if err := utils.UnmarshalJSON(data, &decimal, "", true, true); err == nil {
		u.Decimal = decimal
		u.Type = NumericUnionTypeDecimal
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u NumericUnion) MarshalJSON() ([]byte, error) {
	if u.Integer != nil {
		return utils.MarshalJSON(u.Integer, "", true)
	}

	if u.Number != nil {
		return utils.MarshalJSON(u.Number, "", true)
	}

	if u.Bigint != nil {
		return utils.MarshalJSON(u.Bigint, "", true)
	}

	if u.Decimal != nil {
		return utils.MarshalJSON(u.Decimal, "", true)
	}

	return nil, errors.New("could not marshal union type: all fields are null")
}