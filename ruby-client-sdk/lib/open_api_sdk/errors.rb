# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'

module OpenApiSDK
  extend T::Sig
  class Errors
    extend T::Sig
    
    # CONNECTION_ERROR_GET_SERVERS contains the list of server urls available to the SDK.
    CONNECTION_ERROR_GET_SERVERS = [
      'http://somebrokenapi.broken', 
    ].freeze
    
    # ERROR_UNION_DISCRIMINATED_POST_SERVERS contains the list of server urls available to the SDK.
    ERROR_UNION_DISCRIMINATED_POST_SERVERS = [
      'http://localhost:35456', 
    ].freeze
    
    # ERROR_UNION_POST_SERVERS contains the list of server urls available to the SDK.
    ERROR_UNION_POST_SERVERS = [
      'http://localhost:35456', 
    ].freeze
    
    # STATUS_GET_X_SPEAKEASY_ERRORS_SERVERS contains the list of server urls available to the SDK.
    STATUS_GET_X_SPEAKEASY_ERRORS_SERVERS = [
      'http://localhost:35456', 
    ].freeze
    # Endpoints for testing error responses.

    sig { params(sdk_config: SDKConfiguration).void }
    def initialize(sdk_config)
      @sdk_configuration = sdk_config
    end


    sig { params(server_url: T.nilable(String)).returns(::OpenApiSDK::Operations::ConnectionErrorGetResponse) }
    def connection_error_get(server_url = nil)

      base_url = Utils.template_url(CONNECTION_ERROR_GET_SERVERS[0], {
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

      res = ::OpenApiSDK::Operations::ConnectionErrorGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(request: ::Object, server_url: T.nilable(String)).returns(::OpenApiSDK::Operations::ErrorUnionDiscriminatedPostResponse) }
    def error_union_discriminated_post(request, server_url = nil)

      base_url = Utils.template_url(ERROR_UNION_DISCRIMINATED_POST_SERVERS[0], {
      })
      base_url = server_url if !server_url.nil?
      url = "#{base_url}/errors/400#errorUnionDiscriminated"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
        if form
          req.body = Utils.encode_form(form)
        elsif Utils.match_content_type(req_content_type, 'application/x-www-form-urlencoded')
          req.body = URI.encode_www_form(data)
        else
          req.body = data
        end
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::ErrorUnionDiscriminatedPostResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
      elsif r.status >= 400 && r.status < 500
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::Object)
          res.one_of = out
        end
      end
      res
    end


    sig { params(request: ::Object, server_url: T.nilable(String)).returns(::OpenApiSDK::Operations::ErrorUnionPostResponse) }
    def error_union_post(request, server_url = nil)

      base_url = Utils.template_url(ERROR_UNION_POST_SERVERS[0], {
      })
      base_url = server_url if !server_url.nil?
      url = "#{base_url}/errors/500#errorUnion"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
        if form
          req.body = Utils.encode_form(form)
        elsif Utils.match_content_type(req_content_type, 'application/x-www-form-urlencoded')
          req.body = URI.encode_www_form(data)
        else
          req.body = data
        end
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::ErrorUnionPostResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
      elsif r.status == 500
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::Object)
          res.one_of = out
        end
      end
      res
    end


    sig { params(status_code: ::Integer).returns(::OpenApiSDK::Operations::StatusGetErrorResponse) }
    def status_get_error(status_code)

      request = ::OpenApiSDK::Operations::StatusGetErrorRequest.new(
        
        status_code: status_code
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = Utils.generate_url(
        ::OpenApiSDK::Operations::StatusGetErrorRequest,
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

      res = ::OpenApiSDK::Operations::StatusGetErrorResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(status_code: ::Integer, server_url: T.nilable(String)).returns(::OpenApiSDK::Operations::StatusGetXSpeakeasyErrorsResponse) }
    def status_get_x_speakeasy_errors(status_code, server_url = nil)

      request = ::OpenApiSDK::Operations::StatusGetXSpeakeasyErrorsRequest.new(
        
        status_code: status_code
      )
      base_url = Utils.template_url(STATUS_GET_X_SPEAKEASY_ERRORS_SERVERS[0], {
      })
      base_url = server_url if !server_url.nil?
      url = Utils.generate_url(
        ::OpenApiSDK::Operations::StatusGetXSpeakeasyErrorsRequest,
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

      res = ::OpenApiSDK::Operations::StatusGetXSpeakeasyErrorsResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if [200, 300, 400].include?(r.status)
      elsif r.status == 500
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Shared::Error)
          res.error = out
        end
      elsif r.status == 501
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::StatusGetXSpeakeasyErrorsResponseBody)
          res.object = out
        end
      end
      res
    end
  end
end