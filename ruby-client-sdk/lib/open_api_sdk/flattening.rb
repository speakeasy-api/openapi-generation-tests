# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'

module OpenApiSDK
  extend T::Sig
  class Flattening
    extend T::Sig
    # Endpoints for testing flattening through request body and parameter combinations.

    sig { params(sdk_config: SDKConfiguration).void }
    def initialize(sdk_config)
      @sdk_configuration = sdk_config
    end


    sig { params(simple_object: ::OpenApiSDK::Shared::SimpleObject, str_: ::String).returns(::OpenApiSDK::Operations::ComponentBodyAndParamConflictResponse) }
    def component_body_and_param_conflict(simple_object, str_)

      request = ::OpenApiSDK::Operations::ComponentBodyAndParamConflictRequest.new(
        
        simple_object: simple_object,
        str_: str_
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/flattening/componentBodyAndParamConflict"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :simple_object, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::ComponentBodyAndParamConflictRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        req.params = query_params
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

      res = ::OpenApiSDK::Operations::ComponentBodyAndParamConflictResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::ComponentBodyAndParamConflictRes)
          res.res = out
        end
      end
      res
    end


    sig { params(param_str: ::String, simple_object: ::OpenApiSDK::Shared::SimpleObject).returns(::OpenApiSDK::Operations::ComponentBodyAndParamNoConflictResponse) }
    def component_body_and_param_no_conflict(param_str, simple_object)

      request = ::OpenApiSDK::Operations::ComponentBodyAndParamNoConflictRequest.new(
        
        param_str: param_str,
        simple_object: simple_object
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/flattening/componentBodyAndParamNoConflict"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :simple_object, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::ComponentBodyAndParamNoConflictRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        req.params = query_params
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

      res = ::OpenApiSDK::Operations::ComponentBodyAndParamNoConflictResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::ComponentBodyAndParamNoConflictRes)
          res.res = out
        end
      end
      res
    end


    sig { params(str_path_parameter: ::String, str_query_parameter: ::String).returns(::OpenApiSDK::Operations::ConflictingParamsResponse) }
    def conflicting_params(str_path_parameter, str_query_parameter)

      request = ::OpenApiSDK::Operations::ConflictingParamsRequest.new(
        
        str_path_parameter: str_path_parameter,
        str_query_parameter: str_query_parameter
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = Utils.generate_url(
        ::OpenApiSDK::Operations::ConflictingParamsRequest,
        base_url,
        '/anything/flattening/conflictingParams/{str}',
        request,
        @sdk_configuration.globals
      )
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::ConflictingParamsRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::ConflictingParamsResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::ConflictingParamsRes)
          res.res = out
        end
      end
      res
    end


    sig { params(request_body: ::OpenApiSDK::Operations::InlineBodyAndParamConflictRequestBody, str_: ::String).returns(::OpenApiSDK::Operations::InlineBodyAndParamConflictResponse) }
    def inline_body_and_param_conflict(request_body, str_)

      request = ::OpenApiSDK::Operations::InlineBodyAndParamConflictRequest.new(
        
        request_body: request_body,
        str_: str_
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/flattening/inlineBodyAndParamConflict"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request_body, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::InlineBodyAndParamConflictRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        req.params = query_params
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

      res = ::OpenApiSDK::Operations::InlineBodyAndParamConflictResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::InlineBodyAndParamConflictRes)
          res.res = out
        end
      end
      res
    end


    sig { params(request_body: ::OpenApiSDK::Operations::InlineBodyAndParamNoConflictRequestBody, param_str: ::String).returns(::OpenApiSDK::Operations::InlineBodyAndParamNoConflictResponse) }
    def inline_body_and_param_no_conflict(request_body, param_str)

      request = ::OpenApiSDK::Operations::InlineBodyAndParamNoConflictRequest.new(
        
        request_body: request_body,
        param_str: param_str
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/flattening/inlineBodyAndParamNoConflict"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request_body, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::InlineBodyAndParamNoConflictRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        req.params = query_params
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

      res = ::OpenApiSDK::Operations::InlineBodyAndParamNoConflictResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::InlineBodyAndParamNoConflictRes)
          res.res = out
        end
      end
      res
    end
  end
end