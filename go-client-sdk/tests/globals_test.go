// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package tests

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	openapi "openapi/v2"
	"openapi/v2/pkg/utils"
	"testing"
)

func TestGlobals_GlobalsOptionalHiddenPathParameterOperationRequired(t *testing.T) {
	recordTest("globals-optional-hidden-path-parameter-operation-required")

	ctx := context.Background()

	s := openapi.New(
		openapi.WithServerURL(utils.GetEnv("TEST_SERVER_URL", "")),
		openapi.WithGlobalOptionalHiddenPathParam("<value>"),
		openapi.WithClient(createTestHTTPClient("globalsOptionalHiddenPathParameterOperationRequired")),
	)

	res, err := s.Globals.GlobalsOptionalHiddenPathParameterOperationRequired(ctx)
	require.NoError(t, err)
	assert.Equal(t, 200, res.StatusCode)

}

func TestGlobals_GlobalsOptionalHiddenPathParameterPathRequired(t *testing.T) {
	recordTest("globals-optional-hidden-path-parameter-path-required")

	ctx := context.Background()

	s := openapi.New(
		openapi.WithServerURL(utils.GetEnv("TEST_SERVER_URL", "")),
		openapi.WithGlobalOptionalHiddenPathParam("<value>"),
		openapi.WithClient(createTestHTTPClient("globalsOptionalHiddenPathParameterPathRequired")),
	)

	res, err := s.Globals.GlobalsOptionalHiddenPathParameterPathRequired(ctx)
	require.NoError(t, err)
	assert.Equal(t, 200, res.StatusCode)

}

func TestGlobals_GlobalsOptionalPathParameterOperationRequired(t *testing.T) {
	recordTest("globals-optional-path-parameter-operation-required")

	ctx := context.Background()

	s := openapi.New(
		openapi.WithServerURL(utils.GetEnv("TEST_SERVER_URL", "")),
		openapi.WithClient(createTestHTTPClient("globalsOptionalPathParameterOperationRequired")),
	)

	res, err := s.Globals.GlobalsOptionalPathParameterOperationRequired(ctx, openapi.String("<value>"))
	require.NoError(t, err)
	assert.Equal(t, 200, res.StatusCode)

}

func TestGlobals_GlobalsOptionalPathParameterPathRequired(t *testing.T) {
	recordTest("globals-optional-path-parameter-path-required")

	ctx := context.Background()

	s := openapi.New(
		openapi.WithServerURL(utils.GetEnv("TEST_SERVER_URL", "")),
		openapi.WithClient(createTestHTTPClient("globalsOptionalPathParameterPathRequired")),
	)

	res, err := s.Globals.GlobalsOptionalPathParameterPathRequired(ctx, openapi.String("<value>"))
	require.NoError(t, err)
	assert.Equal(t, 200, res.StatusCode)

}