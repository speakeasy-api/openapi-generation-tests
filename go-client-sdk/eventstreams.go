// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package openapi

import (
	"bytes"
	"context"
	"fmt"
	"io"
	"net/http"
	"net/url"
	"openapi/v2/internal/hooks"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/sdkerrors"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types/stream"
	"openapi/v2/pkg/utils"
)

// Eventstreams - Endpoints for testing server-sent events streaming
type Eventstreams struct {
	sdkConfiguration sdkConfiguration
}

func newEventstreams(sdkConfig sdkConfiguration) *Eventstreams {
	return &Eventstreams{
		sdkConfiguration: sdkConfig,
	}
}

func (s *Eventstreams) Chat(ctx context.Context, request operations.ChatRequestBody, opts ...operations.Option) (*operations.ChatResponse, error) {
	hookCtx := hooks.HookContext{OperationID: "chat"}

	o := operations.Options{}
	supportedOptions := []string{
		operations.SupportedOptionServerURL,
		operations.SupportedOptionAcceptHeaderOverride,
	}

	for _, opt := range opts {
		if err := opt(&o, supportedOptions...); err != nil {
			return nil, fmt.Errorf("error applying option: %w", err)
		}
	}
	baseURL := utils.ReplaceParameters(operations.ChatServerList[0], map[string]string{})
	if o.ServerURL != nil {
		baseURL = *o.ServerURL
	}

	opURL, err := url.JoinPath(baseURL, "/eventstreams/chat")
	if err != nil {
		return nil, fmt.Errorf("error generating URL: %w", err)
	}

	bodyReader, reqContentType, err := utils.SerializeRequestBody(ctx, request, false, false, "Request", "json", `request:"mediaType=application/json"`)
	if err != nil {
		return nil, err
	}

	req, err := http.NewRequestWithContext(ctx, "POST", opURL, bodyReader)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}
	if o.AcceptHeaderOverride != nil {
		req.Header.Set("Accept", string(*o.AcceptHeaderOverride))
	} else {
		req.Header.Set("Accept", "application/json;q=1, text/event-stream;q=0")
	}

	req.Header.Set("X-Speakeasy-User-Agent", s.sdkConfiguration.UserAgent)
	req.Header.Set("Content-Type", reqContentType)

	req, err = s.sdkConfiguration.Hooks.BeforeRequest(hooks.BeforeRequestContext{hookCtx}, req)
	if err != nil {
		return nil, err
	}

	client := s.sdkConfiguration.SecurityClient

	httpRes, err := client.Do(req)
	if err != nil || httpRes == nil {
		if err != nil {
			err = fmt.Errorf("error sending request: %w", err)
		} else {
			err = fmt.Errorf("error sending request: no response")
		}

		_, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, nil, err)
		return nil, err
	} else if utils.MatchStatusCodes([]string{"4XX", "5XX"}, httpRes.StatusCode) {
		httpRes, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, httpRes, nil)
		if err != nil {
			return nil, err
		}
	} else {
		httpRes, err = s.sdkConfiguration.Hooks.AfterSuccess(hooks.AfterSuccessContext{hookCtx}, httpRes)
		if err != nil {
			return nil, err
		}
	}
	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.ChatResponse{
		StatusCode:  httpRes.StatusCode,
		ContentType: contentType,
		RawResponse: httpRes,
	}

	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.ChatCompletionResult
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out, ""); err != nil {
				return nil, err
			}

			res.ChatCompletionResult = out
		case utils.MatchContentType(contentType, `text/event-stream`):
			out := stream.NewEventStream(httpRes.Body, func(se []byte) (shared.ChatCompletionStream, error) {
				var e shared.ChatCompletionStream
				if err := utils.UnmarshalJsonFromResponseBody(bytes.NewBuffer(se), &e, ""); err != nil {
					return shared.ChatCompletionStream{}, err
				}
				return e, nil
			})
			res.ChatCompletionStream = out
		default:
			rawBody, err := io.ReadAll(httpRes.Body)
			if err != nil {
				return nil, fmt.Errorf("error reading response body: %w", err)
			}

			return nil, sdkerrors.NewSDKError(fmt.Sprintf("unknown content-type received: %s", contentType), httpRes.StatusCode, string(rawBody), httpRes)
		}
	case httpRes.StatusCode >= 400 && httpRes.StatusCode < 500:
		fallthrough
	case httpRes.StatusCode >= 500 && httpRes.StatusCode < 600:
		rawBody, err := io.ReadAll(httpRes.Body)
		if err != nil {
			return nil, fmt.Errorf("error reading response body: %w", err)
		}

		return nil, sdkerrors.NewSDKError("API error occurred", httpRes.StatusCode, string(rawBody), httpRes)
	}

	return res, nil
}

func (s *Eventstreams) DifferentDataSchemas(ctx context.Context, opts ...operations.Option) (*operations.DifferentDataSchemasResponse, error) {
	hookCtx := hooks.HookContext{OperationID: "differentDataSchemas"}

	o := operations.Options{}
	supportedOptions := []string{
		operations.SupportedOptionServerURL,
	}

	for _, opt := range opts {
		if err := opt(&o, supportedOptions...); err != nil {
			return nil, fmt.Errorf("error applying option: %w", err)
		}
	}
	baseURL := utils.ReplaceParameters(operations.DifferentDataSchemasServerList[0], map[string]string{})
	if o.ServerURL != nil {
		baseURL = *o.ServerURL
	}

	opURL, err := url.JoinPath(baseURL, "/eventstreams/differentdataschemas")
	if err != nil {
		return nil, fmt.Errorf("error generating URL: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "POST", opURL, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}
	req.Header.Set("Accept", "text/event-stream")
	req.Header.Set("X-Speakeasy-User-Agent", s.sdkConfiguration.UserAgent)

	req, err = s.sdkConfiguration.Hooks.BeforeRequest(hooks.BeforeRequestContext{hookCtx}, req)
	if err != nil {
		return nil, err
	}

	client := s.sdkConfiguration.SecurityClient

	httpRes, err := client.Do(req)
	if err != nil || httpRes == nil {
		if err != nil {
			err = fmt.Errorf("error sending request: %w", err)
		} else {
			err = fmt.Errorf("error sending request: no response")
		}

		_, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, nil, err)
		return nil, err
	} else if utils.MatchStatusCodes([]string{"4XX", "5XX"}, httpRes.StatusCode) {
		httpRes, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, httpRes, nil)
		if err != nil {
			return nil, err
		}
	} else {
		httpRes, err = s.sdkConfiguration.Hooks.AfterSuccess(hooks.AfterSuccessContext{hookCtx}, httpRes)
		if err != nil {
			return nil, err
		}
	}
	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.DifferentDataSchemasResponse{
		StatusCode:  httpRes.StatusCode,
		ContentType: contentType,
		RawResponse: httpRes,
	}

	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `text/event-stream`):
			out := stream.NewEventStream(httpRes.Body, func(se []byte) (shared.DifferentDataSchemas, error) {
				var e shared.DifferentDataSchemas
				if err := utils.UnmarshalJsonFromResponseBody(bytes.NewBuffer(se), &e, ""); err != nil {
					return shared.DifferentDataSchemas{}, err
				}
				return e, nil
			})
			res.DifferentDataSchemas = out
		default:
			rawBody, err := io.ReadAll(httpRes.Body)
			if err != nil {
				return nil, fmt.Errorf("error reading response body: %w", err)
			}

			return nil, sdkerrors.NewSDKError(fmt.Sprintf("unknown content-type received: %s", contentType), httpRes.StatusCode, string(rawBody), httpRes)
		}
	case httpRes.StatusCode >= 400 && httpRes.StatusCode < 500:
		fallthrough
	case httpRes.StatusCode >= 500 && httpRes.StatusCode < 600:
		rawBody, err := io.ReadAll(httpRes.Body)
		if err != nil {
			return nil, fmt.Errorf("error reading response body: %w", err)
		}

		return nil, sdkerrors.NewSDKError("API error occurred", httpRes.StatusCode, string(rawBody), httpRes)
	}

	return res, nil
}

func (s *Eventstreams) JSON(ctx context.Context, opts ...operations.Option) (*operations.JSONResponse, error) {
	hookCtx := hooks.HookContext{OperationID: "json"}

	o := operations.Options{}
	supportedOptions := []string{
		operations.SupportedOptionServerURL,
	}

	for _, opt := range opts {
		if err := opt(&o, supportedOptions...); err != nil {
			return nil, fmt.Errorf("error applying option: %w", err)
		}
	}
	baseURL := utils.ReplaceParameters(operations.JSONServerList[0], map[string]string{})
	if o.ServerURL != nil {
		baseURL = *o.ServerURL
	}

	opURL, err := url.JoinPath(baseURL, "/eventstreams/json")
	if err != nil {
		return nil, fmt.Errorf("error generating URL: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "POST", opURL, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}
	req.Header.Set("Accept", "text/event-stream")
	req.Header.Set("X-Speakeasy-User-Agent", s.sdkConfiguration.UserAgent)

	req, err = s.sdkConfiguration.Hooks.BeforeRequest(hooks.BeforeRequestContext{hookCtx}, req)
	if err != nil {
		return nil, err
	}

	client := s.sdkConfiguration.SecurityClient

	httpRes, err := client.Do(req)
	if err != nil || httpRes == nil {
		if err != nil {
			err = fmt.Errorf("error sending request: %w", err)
		} else {
			err = fmt.Errorf("error sending request: no response")
		}

		_, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, nil, err)
		return nil, err
	} else if utils.MatchStatusCodes([]string{"4XX", "5XX"}, httpRes.StatusCode) {
		httpRes, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, httpRes, nil)
		if err != nil {
			return nil, err
		}
	} else {
		httpRes, err = s.sdkConfiguration.Hooks.AfterSuccess(hooks.AfterSuccessContext{hookCtx}, httpRes)
		if err != nil {
			return nil, err
		}
	}
	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.JSONResponse{
		StatusCode:  httpRes.StatusCode,
		ContentType: contentType,
		RawResponse: httpRes,
	}

	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `text/event-stream`):
			out := stream.NewEventStream(httpRes.Body, func(se []byte) (shared.JSONEvent, error) {
				var e shared.JSONEvent
				if err := utils.UnmarshalJsonFromResponseBody(bytes.NewBuffer(se), &e, ""); err != nil {
					return shared.JSONEvent{}, err
				}
				return e, nil
			})
			res.JSONEvent = out
		default:
			rawBody, err := io.ReadAll(httpRes.Body)
			if err != nil {
				return nil, fmt.Errorf("error reading response body: %w", err)
			}

			return nil, sdkerrors.NewSDKError(fmt.Sprintf("unknown content-type received: %s", contentType), httpRes.StatusCode, string(rawBody), httpRes)
		}
	case httpRes.StatusCode >= 400 && httpRes.StatusCode < 500:
		fallthrough
	case httpRes.StatusCode >= 500 && httpRes.StatusCode < 600:
		rawBody, err := io.ReadAll(httpRes.Body)
		if err != nil {
			return nil, fmt.Errorf("error reading response body: %w", err)
		}

		return nil, sdkerrors.NewSDKError("API error occurred", httpRes.StatusCode, string(rawBody), httpRes)
	}

	return res, nil
}

func (s *Eventstreams) Multiline(ctx context.Context, opts ...operations.Option) (*operations.MultilineResponse, error) {
	hookCtx := hooks.HookContext{OperationID: "multiline"}

	o := operations.Options{}
	supportedOptions := []string{
		operations.SupportedOptionServerURL,
	}

	for _, opt := range opts {
		if err := opt(&o, supportedOptions...); err != nil {
			return nil, fmt.Errorf("error applying option: %w", err)
		}
	}
	baseURL := utils.ReplaceParameters(operations.MultilineServerList[0], map[string]string{})
	if o.ServerURL != nil {
		baseURL = *o.ServerURL
	}

	opURL, err := url.JoinPath(baseURL, "/eventstreams/multiline")
	if err != nil {
		return nil, fmt.Errorf("error generating URL: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "POST", opURL, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}
	req.Header.Set("Accept", "text/event-stream")
	req.Header.Set("X-Speakeasy-User-Agent", s.sdkConfiguration.UserAgent)

	req, err = s.sdkConfiguration.Hooks.BeforeRequest(hooks.BeforeRequestContext{hookCtx}, req)
	if err != nil {
		return nil, err
	}

	client := s.sdkConfiguration.SecurityClient

	httpRes, err := client.Do(req)
	if err != nil || httpRes == nil {
		if err != nil {
			err = fmt.Errorf("error sending request: %w", err)
		} else {
			err = fmt.Errorf("error sending request: no response")
		}

		_, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, nil, err)
		return nil, err
	} else if utils.MatchStatusCodes([]string{"4XX", "5XX"}, httpRes.StatusCode) {
		httpRes, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, httpRes, nil)
		if err != nil {
			return nil, err
		}
	} else {
		httpRes, err = s.sdkConfiguration.Hooks.AfterSuccess(hooks.AfterSuccessContext{hookCtx}, httpRes)
		if err != nil {
			return nil, err
		}
	}
	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.MultilineResponse{
		StatusCode:  httpRes.StatusCode,
		ContentType: contentType,
		RawResponse: httpRes,
	}

	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `text/event-stream`):
			out := stream.NewEventStream(httpRes.Body, func(se []byte) (shared.TextEvent, error) {
				var e shared.TextEvent
				if err := utils.UnmarshalJsonFromResponseBody(bytes.NewBuffer(se), &e, ""); err != nil {
					return shared.TextEvent{}, err
				}
				return e, nil
			})
			res.TextEvent = out
		default:
			rawBody, err := io.ReadAll(httpRes.Body)
			if err != nil {
				return nil, fmt.Errorf("error reading response body: %w", err)
			}

			return nil, sdkerrors.NewSDKError(fmt.Sprintf("unknown content-type received: %s", contentType), httpRes.StatusCode, string(rawBody), httpRes)
		}
	case httpRes.StatusCode >= 400 && httpRes.StatusCode < 500:
		fallthrough
	case httpRes.StatusCode >= 500 && httpRes.StatusCode < 600:
		rawBody, err := io.ReadAll(httpRes.Body)
		if err != nil {
			return nil, fmt.Errorf("error reading response body: %w", err)
		}

		return nil, sdkerrors.NewSDKError("API error occurred", httpRes.StatusCode, string(rawBody), httpRes)
	}

	return res, nil
}

func (s *Eventstreams) Rich(ctx context.Context, opts ...operations.Option) (*operations.RichResponse, error) {
	hookCtx := hooks.HookContext{OperationID: "rich"}

	o := operations.Options{}
	supportedOptions := []string{
		operations.SupportedOptionServerURL,
	}

	for _, opt := range opts {
		if err := opt(&o, supportedOptions...); err != nil {
			return nil, fmt.Errorf("error applying option: %w", err)
		}
	}
	baseURL := utils.ReplaceParameters(operations.RichServerList[0], map[string]string{})
	if o.ServerURL != nil {
		baseURL = *o.ServerURL
	}

	opURL, err := url.JoinPath(baseURL, "/eventstreams/rich")
	if err != nil {
		return nil, fmt.Errorf("error generating URL: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "POST", opURL, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}
	req.Header.Set("Accept", "text/event-stream")
	req.Header.Set("X-Speakeasy-User-Agent", s.sdkConfiguration.UserAgent)

	req, err = s.sdkConfiguration.Hooks.BeforeRequest(hooks.BeforeRequestContext{hookCtx}, req)
	if err != nil {
		return nil, err
	}

	client := s.sdkConfiguration.SecurityClient

	httpRes, err := client.Do(req)
	if err != nil || httpRes == nil {
		if err != nil {
			err = fmt.Errorf("error sending request: %w", err)
		} else {
			err = fmt.Errorf("error sending request: no response")
		}

		_, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, nil, err)
		return nil, err
	} else if utils.MatchStatusCodes([]string{"4XX", "5XX"}, httpRes.StatusCode) {
		httpRes, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, httpRes, nil)
		if err != nil {
			return nil, err
		}
	} else {
		httpRes, err = s.sdkConfiguration.Hooks.AfterSuccess(hooks.AfterSuccessContext{hookCtx}, httpRes)
		if err != nil {
			return nil, err
		}
	}
	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.RichResponse{
		StatusCode:  httpRes.StatusCode,
		ContentType: contentType,
		RawResponse: httpRes,
	}

	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `text/event-stream`):
			out := stream.NewEventStream(httpRes.Body, func(se []byte) (shared.RichStream, error) {
				var e shared.RichStream
				if err := utils.UnmarshalJsonFromResponseBody(bytes.NewBuffer(se), &e, ""); err != nil {
					return shared.RichStream{}, err
				}
				return e, nil
			})
			res.RichStream = out
		default:
			rawBody, err := io.ReadAll(httpRes.Body)
			if err != nil {
				return nil, fmt.Errorf("error reading response body: %w", err)
			}

			return nil, sdkerrors.NewSDKError(fmt.Sprintf("unknown content-type received: %s", contentType), httpRes.StatusCode, string(rawBody), httpRes)
		}
	case httpRes.StatusCode >= 400 && httpRes.StatusCode < 500:
		fallthrough
	case httpRes.StatusCode >= 500 && httpRes.StatusCode < 600:
		rawBody, err := io.ReadAll(httpRes.Body)
		if err != nil {
			return nil, fmt.Errorf("error reading response body: %w", err)
		}

		return nil, sdkerrors.NewSDKError("API error occurred", httpRes.StatusCode, string(rawBody), httpRes)
	}

	return res, nil
}

func (s *Eventstreams) Text(ctx context.Context, opts ...operations.Option) (*operations.TextResponse, error) {
	hookCtx := hooks.HookContext{OperationID: "text"}

	o := operations.Options{}
	supportedOptions := []string{
		operations.SupportedOptionServerURL,
	}

	for _, opt := range opts {
		if err := opt(&o, supportedOptions...); err != nil {
			return nil, fmt.Errorf("error applying option: %w", err)
		}
	}
	baseURL := utils.ReplaceParameters(operations.TextServerList[0], map[string]string{})
	if o.ServerURL != nil {
		baseURL = *o.ServerURL
	}

	opURL, err := url.JoinPath(baseURL, "/eventstreams/text")
	if err != nil {
		return nil, fmt.Errorf("error generating URL: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "POST", opURL, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}
	req.Header.Set("Accept", "text/event-stream")
	req.Header.Set("X-Speakeasy-User-Agent", s.sdkConfiguration.UserAgent)

	req, err = s.sdkConfiguration.Hooks.BeforeRequest(hooks.BeforeRequestContext{hookCtx}, req)
	if err != nil {
		return nil, err
	}

	client := s.sdkConfiguration.SecurityClient

	httpRes, err := client.Do(req)
	if err != nil || httpRes == nil {
		if err != nil {
			err = fmt.Errorf("error sending request: %w", err)
		} else {
			err = fmt.Errorf("error sending request: no response")
		}

		_, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, nil, err)
		return nil, err
	} else if utils.MatchStatusCodes([]string{"4XX", "5XX"}, httpRes.StatusCode) {
		httpRes, err = s.sdkConfiguration.Hooks.AfterError(hooks.AfterErrorContext{hookCtx}, httpRes, nil)
		if err != nil {
			return nil, err
		}
	} else {
		httpRes, err = s.sdkConfiguration.Hooks.AfterSuccess(hooks.AfterSuccessContext{hookCtx}, httpRes)
		if err != nil {
			return nil, err
		}
	}
	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.TextResponse{
		StatusCode:  httpRes.StatusCode,
		ContentType: contentType,
		RawResponse: httpRes,
	}

	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `text/event-stream`):
			out := stream.NewEventStream(httpRes.Body, func(se []byte) (shared.TextEvent, error) {
				var e shared.TextEvent
				if err := utils.UnmarshalJsonFromResponseBody(bytes.NewBuffer(se), &e, ""); err != nil {
					return shared.TextEvent{}, err
				}
				return e, nil
			})
			res.TextEvent = out
		default:
			rawBody, err := io.ReadAll(httpRes.Body)
			if err != nil {
				return nil, fmt.Errorf("error reading response body: %w", err)
			}

			return nil, sdkerrors.NewSDKError(fmt.Sprintf("unknown content-type received: %s", contentType), httpRes.StatusCode, string(rawBody), httpRes)
		}
	case httpRes.StatusCode >= 400 && httpRes.StatusCode < 500:
		fallthrough
	case httpRes.StatusCode >= 500 && httpRes.StatusCode < 600:
		rawBody, err := io.ReadAll(httpRes.Body)
		if err != nil {
			return nil, fmt.Errorf("error reading response body: %w", err)
		}

		return nil, sdkerrors.NewSDKError("API error occurred", httpRes.StatusCode, string(rawBody), httpRes)
	}

	return res, nil
}