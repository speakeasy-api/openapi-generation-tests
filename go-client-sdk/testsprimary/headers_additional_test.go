// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package tests

import (
	"context"
	"openapi/pkg/models/operations"
	"testing"

	sdk "openapi"

	"github.com/stretchr/testify/require"
)

func TestHeadersOverrideRequestHeaders(t *testing.T) {
	recordTest("headers-override-request-headers")

	s := sdk.New()
	require.NotNil(t, s)

	res, err := s.Methods.MethodGet(context.Background(), operations.WithSetHeaders(map[string]string{
		"x-inject-header-1": "foo",
		"x-inject-header-2": "bar",
	}))

	require.NoError(t, err)
	require.Equal(t, 200, res.HTTPMeta.Response.StatusCode)
	require.NotNil(t, res.Object)
	require.Equal(t, &operations.MethodGetResponseBody{Status: sdk.String("OK")}, res.Object)

	require.Equal(t, "foo", res.HTTPMeta.Request.Header.Get("x-inject-header-1"))
	require.Equal(t, "bar", res.HTTPMeta.Request.Header.Get("x-inject-header-2"))
}