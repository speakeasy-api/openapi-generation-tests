// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package tests

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"testing"
)

func TestSDK_ResponseBodyJSONGet_Test(t *testing.T) {
	recordTest("response-bodies-json-get")

	s := openapi.New(
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
	)

	ctx := context.Background()
	res, err := s.ResponseBodyJSONGet(ctx)
	require.NoError(t, err)
	require.NotNil(t, res)
	assert.Equal(t, 200, res.StatusCode)
	assert.Equal(t, shared.HTTPBinSimpleJSONObject{
		Slideshow: shared.Slideshow{
			Author: "Yours Truly",
			Date:   "date of publication",
			Slides: []shared.Slides{
				shared.Slides{
					Title: "Wake up to WonderWidgets!",
					Type:  "all",
				},
				shared.Slides{
					Items: []string{
						"Why <em>WonderWidgets</em> are great",
						"Who <em>buys</em> WonderWidgets",
					},
					Title: "Overview",
					Type:  "all",
				},
			},
			Title: "Sample Slide Show",
		},
	}, *res.HTTPBinSimpleJSONObject)
}