// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package tests

import (
	"context"
	"net/http"
	"testing"

	sdk "openapi/v2"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func TestSelectGlobalServerByNameWithTemplatesDefault(t *testing.T) {
	recordTest("servers-select-global-server-by-name-with-templates-defaults")

	assert.Equal(t, "TEMPLATED", sdk.ServerTEMPLATED)
	s := sdk.New(sdk.WithServer(sdk.ServerTEMPLATED))

	res, err := s.Servers.SelectGlobalServer(context.Background())
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestSelectGlobalServerByNameWithTemplatesValid(t *testing.T) {
	recordTest("servers-select-global-server-by-name-with-templates-valid")

	assert.Equal(t, "http://{hostname}:{port}", sdk.ServerList[sdk.ServerTEMPLATED])
	s := sdk.New(sdk.WithTemplatedServerURL(
		sdk.ServerList[sdk.ServerTEMPLATED],
		map[string]string{"hostname": "localhost", "port": "35123"},
	))

	res, err := s.Servers.SelectGlobalServer(context.Background())
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestSelectGlobalServerByNameWithTemplatesBroken(t *testing.T) {
	recordTest("servers-select-global-server-by-name-with-templates-broken")

	s := sdk.New(sdk.WithTemplatedServerURL(
		sdk.ServerTEMPLATED,
		map[string]string{"hostname": "broken", "port": "12345"},
	))

	res, err := s.Servers.SelectGlobalServer(context.Background())
	assert.Error(t, err)
	assert.Nil(t, res)
}