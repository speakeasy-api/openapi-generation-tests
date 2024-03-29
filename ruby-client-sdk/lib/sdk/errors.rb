# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'

module OpenApiSDK
  extend T::Sig
  class Errors
    # Endpoints for testing error responses.
    extend T::Sig
    sig { params(sdk_config: SDKConfiguration).void }
    def initialize(sdk_config)
      @sdk_configuration = sdk_config
    end

    sig { params(server_url: T.nilable(String)).returns(Utils::FieldAugmented) }
    def connection_error_get(server_url = nil)

      base_url = Utils.template_url(Operations::CONNECTION_ERROR_GET_SERVERS[0], {
      })
      base_url = server_url if !server_url.nil?
      url = "#{base_url}/anything/connectionError"
      headers = {}
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = Operations::ConnectionErrorGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
      end
      res
    end

    sig { params(status_code: Integer).returns(Utils::FieldAugmented) }
    def status_get_error(status_code)

      request = Operations::StatusGetErrorRequest.new(
        
        status_code: status_code
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = Utils.generate_url(
        Operations::StatusGetErrorRequest,
        base_url,
        '/status/{statusCode}',
        request,
        @sdk_configuration.globals
      )
      headers = {}
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = Operations::StatusGetErrorResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if [200, 300, 400, 500].include?(r.status)
      end
      res
    end

    sig { params(status_code: Integer, server_url: T.nilable(String)).returns(Utils::FieldAugmented) }
    def status_get_x_speakeasy_errors(status_code, server_url = nil)

      request = Operations::StatusGetXSpeakeasyErrorsRequest.new(
        
        status_code: status_code
      )
      base_url = Utils.template_url(Operations::STATUS_GET_X_SPEAKEASY_ERRORS_SERVERS[0], {
      })
      base_url = server_url if !server_url.nil?
      url = Utils.generate_url(
        Operations::StatusGetXSpeakeasyErrorsRequest,
        base_url,
        '/errors/{statusCode}',
        request,
        @sdk_configuration.globals
      )
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = Operations::StatusGetXSpeakeasyErrorsResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if [200, 300, 400].include?(r.status)
      elsif r.status == 500
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, Shared::Error)
          res.error = out
        end
      elsif r.status == 501
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, Operations::StatusGetXSpeakeasyErrorsResponseBody)
          res.object = out
        end
      end
      res
    end
  end
end
