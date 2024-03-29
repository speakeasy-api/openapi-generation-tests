// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package tests

import (
	"context"
	"net/http"
	"testing"

	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"

	sdk "openapi"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func TestBasicAuth(t *testing.T) {
	recordTest("auth-basic-auth")

	s := sdk.New()

	res, err := s.AuthNew.BasicAuthNew(context.Background(), shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Username: "testUser",
			Password: "testPass",
		},
	}, operations.BasicAuthNewSecurity{
		Username: "testUser",
		Password: "testPass",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestAPIKeyAuthGlobal(t *testing.T) {
	recordTest("auth-api-key-auth-global")

	s := sdk.New(sdk.WithSecurity(shared.Security{
		APIKeyAuthNew: sdk.String("test_api_key"),
	}))

	res, err := s.AuthNew.APIKeyAuthGlobalNew(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestAPIKeyAuthOperation(t *testing.T) {
	recordTest("auth-api-key-auth-operation")

	s := sdk.New()

	res, err := s.Auth.APIKeyAuth(context.Background(), operations.APIKeyAuthSecurity{
		APIKeyAuth: "Bearer testToken",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
	assert.True(t, res.Token.Authenticated)
	assert.Equal(t, "testToken", res.Token.Token)
}

func TestBearerAuthOperation_WithPrefix(t *testing.T) {
	recordTest("auth-bearer-auth-operation-with-prefix")

	s := sdk.New()

	res, err := s.Auth.BearerAuth(context.Background(), operations.BearerAuthSecurity{
		BearerAuth: "Bearer testToken",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
	assert.True(t, res.Token.Authenticated)
	assert.Equal(t, "testToken", res.Token.Token)
}

func TestBearerAuthOperation_WithoutPrefix(t *testing.T) {
	recordTest("auth-bearer-auth-operation-without-prefix")

	s := sdk.New()

	res, err := s.Auth.BearerAuth(context.Background(), operations.BearerAuthSecurity{
		BearerAuth: "testToken",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
	assert.True(t, res.Token.Authenticated)
	assert.Equal(t, "testToken", res.Token.Token)
}

func TestOauth2Auth(t *testing.T) {
	recordTest("auth-oauth2-auth")

	s := sdk.New()

	res, err := s.AuthNew.Oauth2AuthNew(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.Oauth2AuthNewSecurity{
		Oauth2: "Bearer testToken",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestOpenIdConnectAuth(t *testing.T) {
	recordTest("auth-open-id-connect-auth")

	s := sdk.New()

	res, err := s.AuthNew.OpenIDConnectAuthNew(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.OpenIDConnectAuthNewSecurity{
		OpenIDConnect: "Bearer testToken",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleSimpleSchemeAuth(t *testing.T) {
	recordTest("auth-multiple-simple-scheme-auth")

	s := sdk.New()

	res, err := s.AuthNew.MultipleSimpleSchemeAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.MultipleSimpleSchemeAuthSecurity{
		APIKeyAuthNew: "test_api_key",
		Oauth2:        "Bearer testToken",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleMixedSchemeAuth(t *testing.T) {
	recordTest("auth-multiple-mixed-scheme-auth")

	s := sdk.New()

	res, err := s.AuthNew.MultipleMixedSchemeAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
		},
		BasicAuth: &shared.BasicAuth{
			Username: "testUser",
			Password: "testPass",
		},
	}, operations.MultipleMixedSchemeAuthSecurity{
		APIKeyAuthNew: "test_api_key",
		BasicAuth: shared.SchemeBasicAuth{
			Username: "testUser",
			Password: "testPass",
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleSimpleOptionsAuth_FirstOption(t *testing.T) {
	recordTest("auth-multiple-simple-options-auth-first-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleSimpleOptionsAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
		},
	}, operations.MultipleSimpleOptionsAuthSecurity{
		APIKeyAuthNew: sdk.String("test_api_key"),
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleSimpleOptionsAuth_SecondOption(t *testing.T) {
	recordTest("auth-multiple-simple-options-auth-second-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleSimpleOptionsAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.MultipleSimpleOptionsAuthSecurity{
		Oauth2: sdk.String("Bearer testToken"),
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleMixedOptionsAuth_FirstOption(t *testing.T) {
	recordTest("auth-multiple-mixed-options-auth-first-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleMixedOptionsAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
		},
	}, operations.MultipleMixedOptionsAuthSecurity{
		APIKeyAuthNew: sdk.String("test_api_key"),
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleMixedOptionsAuth_SecondOption(t *testing.T) {
	recordTest("auth-multiple-mixed-options-auth-second-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleMixedOptionsAuth(context.Background(), shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Username: "testUser",
			Password: "testPass",
		},
	}, operations.MultipleMixedOptionsAuthSecurity{
		BasicAuth: &shared.SchemeBasicAuth{
			Username: "testUser",
			Password: "testPass",
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleOptionsWithSimpleSchemesAuth_FirstOption(t *testing.T) {
	recordTest("auth-multiple-options-with-simple-schemes-auth-first-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleOptionsWithSimpleSchemesAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.MultipleOptionsWithSimpleSchemesAuthSecurity{
		Option1: &operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1{
			APIKeyAuthNew: "test_api_key",
			Oauth2:        "Bearer testToken",
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleOptionsWithSimpleSchemesAuth_SecondOption(t *testing.T) {
	recordTest("auth-multiple-options-with-simple-schemes-auth-second-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleOptionsWithSimpleSchemesAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.MultipleOptionsWithSimpleSchemesAuthSecurity{
		Option2: &operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption2{
			APIKeyAuthNew: "test_api_key",
			OpenIDConnect: "Bearer testToken",
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleOptionsWithMixedSchemesAuth_FirstOption(t *testing.T) {
	recordTest("auth-multiple-options-with-mixed-schemes-auth-first-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleOptionsWithMixedSchemesAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
			{
				HeaderName:    "Authorization",
				ExpectedValue: "Bearer testToken",
			},
		},
	}, operations.MultipleOptionsWithMixedSchemesAuthSecurity{
		Option1: &operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1{
			APIKeyAuthNew: "test_api_key",
			Oauth2:        "Bearer testToken",
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestMultipleOptionsWithMixedSchemesAuth_SecondOption(t *testing.T) {
	recordTest("auth-multiple-options-with-mixed-schemes-auth-second-option")

	s := sdk.New()

	res, err := s.AuthNew.MultipleOptionsWithMixedSchemesAuth(context.Background(), shared.AuthServiceRequestBody{
		HeaderAuth: []shared.HeaderAuth{
			{
				HeaderName:    "x-api-key",
				ExpectedValue: "test_api_key",
			},
		},
		BasicAuth: &shared.BasicAuth{
			Username: "testUser",
			Password: "testPass",
		},
	}, operations.MultipleOptionsWithMixedSchemesAuthSecurity{
		Option2: &operations.MultipleOptionsWithMixedSchemesAuthSecurityOption2{
			BasicAuth: shared.SchemeBasicAuth{
				Username: "testUser",
				Password: "testPass",
			},
			APIKeyAuthNew: "test_api_key",
		},
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
}

func TestFunctionCallbacksForOAuthSupport_GlobalSecurity(t *testing.T) {
	recordTest("auth-function-callbacks-oauth-global-security")

	s := sdk.New(sdk.WithSecuritySource(func(ctx context.Context) (shared.Security, error) {
		return shared.Security{
			Oauth2: sdk.String("Bearer global"),
		}, nil
	}))

	res, err := s.Auth.GlobalBearerAuth(context.Background())
	require.NoError(t, err)
	require.NotNil(t, res)
	require.NotNil(t, res.Token)
	assert.Equal(t, "global", res.Token.Token)
}

func TestFunctionCallbacksForOAuthSupport_OperationLevelSecurityOverrides(t *testing.T) {
	recordTest("auth-function-callbacks-oauth-global-security-with-local-override")

	s := sdk.New(sdk.WithSecuritySource(func(ctx context.Context) (shared.Security, error) {
		return shared.Security{
			Oauth2: sdk.String("Bearer global"),
		}, nil
	}))

	res, err := s.Auth.Oauth2Auth(context.Background(), operations.Oauth2AuthSecurity{
		Oauth2: "Bearer local",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	require.NotNil(t, res.Token)
	assert.Equal(t, "local", res.Token.Token)
}

func TestFunctionCallbacksForOAuthSupport_ParamOverrides(t *testing.T) {
	recordTest("auth-function-callbacks-oauth-global-security-with-param-override")

	s := sdk.New(sdk.WithSecuritySource(func(ctx context.Context) (shared.Security, error) {
		return shared.Security{
			Oauth2: sdk.String("Bearer global"),
		}, nil
	}))

	res, err := s.Auth.Oauth2Override(context.Background(), operations.Oauth2OverrideSecurity{
		Oauth2: "Bearer overrideHeaders",
	})
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, http.StatusOK, res.StatusCode)
	require.NotNil(t, res.Token)
	assert.Equal(t, "overrideHeaders", res.Token.Token)
}
