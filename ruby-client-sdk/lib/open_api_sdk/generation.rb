# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'

module OpenApiSDK
  extend T::Sig
  class Generation
    extend T::Sig
    # Endpoints for purely testing valid generation behavior.

    sig { params(sdk_config: SDKConfiguration).void }
    def initialize(sdk_config)
      @sdk_configuration = sdk_config
    end


    sig { returns(::OpenApiSDK::Operations::AnchorTypesGetResponse) }
    def anchor_types_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/anchorTypes"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::AnchorTypesGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::AnchorTypesGetTypeFromAnchor)
          res.type_from_anchor = out
        end
      end
      res
    end


    sig { returns(::OpenApiSDK::Operations::ArrayCircularReferenceGetResponse) }
    def array_circular_reference_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/arrayCircularReference"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::ArrayCircularReferenceGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, T::Array[::OpenApiSDK::Shared::ArrayCircularReferenceObject])
          res.array_circular_reference_object = out
        end
      end
      res
    end


    sig { returns(::OpenApiSDK::Operations::CircularReferenceGetResponse) }
    def circular_reference_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/circularReference"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::CircularReferenceGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Shared::ValidCircularReferenceObject)
          res.valid_circular_reference_object = out
        end
      end
      res
    end


    sig { params(date_input: ::Date).returns(::OpenApiSDK::Operations::DateParamWithDefaultResponse) }
    def date_param_with_default(date_input)

      request = ::OpenApiSDK::Operations::DateParamWithDefaultRequest.new(
        
        date_input: date_input
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/dateParamWithDefault"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::DateParamWithDefaultRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::DateParamWithDefaultResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(date_time_input: ::DateTime).returns(::OpenApiSDK::Operations::DateTimeParamWithDefaultResponse) }
    def date_time_param_with_default(date_time_input)

      request = ::OpenApiSDK::Operations::DateTimeParamWithDefaultRequest.new(
        
        date_time_input: date_time_input
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/dateTimeParamWithDefault"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::DateTimeParamWithDefaultRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::DateTimeParamWithDefaultResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(decimal_input: ::Float).returns(::OpenApiSDK::Operations::DecimalParamWithDefaultResponse) }
    def decimal_param_with_default(decimal_input)

      request = ::OpenApiSDK::Operations::DecimalParamWithDefaultRequest.new(
        
        decimal_input: decimal_input
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/decimalParamWithDefault"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::DecimalParamWithDefaultRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::DecimalParamWithDefaultResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(request: ::OpenApiSDK::Shared::DeprecatedFieldInObject).returns(::OpenApiSDK::Operations::DeprecatedFieldInSchemaPostResponse) }
    def deprecated_field_in_schema_post(request)

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/deprecatedFieldInSchema"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      headers['Accept'] = '*/*'
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

      res = ::OpenApiSDK::Operations::DeprecatedFieldInSchemaPostResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { returns(::OpenApiSDK::Operations::DeprecatedObjectInSchemaGetResponse) }
    def deprecated_object_in_schema_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/deprecatedObjectInSchema"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::DeprecatedObjectInSchemaGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::DeprecatedObjectInSchemaGetResponseBody)
          res.object = out
        end
      end
      res
    end


    sig { params(deprecated_parameter: T.nilable(::String)).returns(::OpenApiSDK::Operations::DeprecatedOperationNoCommentsGetResponse) }
    def deprecated_operation_no_comments_get(deprecated_parameter = nil)
      # deprecated_operation_no_comments_get
      # 
      # @deprecated  method: This will be removed in a future release, please migrate away from it as soon as possible.
      request = ::OpenApiSDK::Operations::DeprecatedOperationNoCommentsGetRequest.new(
        
        deprecated_parameter: deprecated_parameter
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/deprecatedOperationNoComments"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::DeprecatedOperationNoCommentsGetRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::DeprecatedOperationNoCommentsGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(deprecated_parameter: T.nilable(::String), new_parameter: T.nilable(::String)).returns(::OpenApiSDK::Operations::DeprecatedOperationWithCommentsGetResponse) }
    def deprecated_operation_with_comments_get(deprecated_parameter = nil, new_parameter = nil)
      # deprecated_operation_with_comments_get - This is an endpoint setup to test deprecation with comments
      # 
      # @deprecated  method: This operation is deprecated. Use simple_path_parameter_objects instead.
      request = ::OpenApiSDK::Operations::DeprecatedOperationWithCommentsGetRequest.new(
        
        deprecated_parameter: deprecated_parameter,
        new_parameter: new_parameter
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/deprecatedOperationWithComments"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::DeprecatedOperationWithCommentsGetRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::DeprecatedOperationWithCommentsGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(empty_object: ::OpenApiSDK::Shared::EmptyObjectParam).returns(::OpenApiSDK::Operations::EmptyObjectGetResponse) }
    def empty_object_get(empty_object)

      request = ::OpenApiSDK::Operations::EmptyObjectGetRequest.new(
        
        empty_object: empty_object
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = Utils.generate_url(
        ::OpenApiSDK::Operations::EmptyObjectGetRequest,
        base_url,
        '/anything/{emptyObject}',
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

      res = ::OpenApiSDK::Operations::EmptyObjectGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { returns(::OpenApiSDK::Operations::EmptyResponseObjectWithCommentGetResponse) }
    def empty_response_object_with_comment_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/emptyResponseObjectWithComment"
      headers = {}
      headers['Accept'] = 'application/json;q=1, application/octet-stream;q=0'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::EmptyResponseObjectWithCommentGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        res.body = r.env.response_body if Utils.match_content_type(content_type, 'application/octet-stream')
      
      elsif r.status == 404
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::String)
          res.string = out
        end
      end
      res
    end


    sig { params(request: T.nilable(::OpenApiSDK::Shared::SimpleObject)).returns(::OpenApiSDK::Operations::GetGlobalNameOverrideResponse) }
    def global_name_overridden(request)

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/globalNameOverride"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request, :json)
      headers['content-type'] = req_content_type
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

      res = ::OpenApiSDK::Operations::GetGlobalNameOverrideResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::GetGlobalNameOverrideResponseBody)
          res.object = out
        end
      end
      res
    end


    sig { returns(::OpenApiSDK::Operations::IgnoredGenerationGetResponse) }
    def ignored_generation_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/ignoredGeneration"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::IgnoredGenerationGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::IgnoredGenerationGetResponseBody)
          res.object = out
        end
      end
      res
    end


    sig { params(request_body: ::OpenApiSDK::Operations::IgnoresPostRequestBody, test_param: T.nilable(::String)).returns(::OpenApiSDK::Operations::IgnoresPostResponse) }
    def ignores_post(request_body, test_param = nil)

      request = ::OpenApiSDK::Operations::IgnoresPostRequest.new(
        
        request_body: request_body,
        test_param: test_param
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/ignores"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request_body, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::IgnoresPostRequest, request, @sdk_configuration.globals)
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

      res = ::OpenApiSDK::Operations::IgnoresPostResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Shared::HttpBinSimpleJsonObject)
          res.http_bin_simple_json_object = out
        end
      end
      res
    end


    sig { params(test_enum_query_param: ::OpenApiSDK::Operations::EnumNameOverride, test_query_param: ::String).returns(::OpenApiSDK::Operations::NameOverrideGetResponse) }
    def name_override(test_enum_query_param, test_query_param)

      request = ::OpenApiSDK::Operations::NameOverrideGetRequest.new(
        
        test_enum_query_param: test_enum_query_param,
        test_query_param: test_query_param
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/nameOverride"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::NameOverrideGetRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::NameOverrideGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::NameOverrideGetOverriddenResponse)
          res.overridden_response = out
        end
      end
      res
    end


    sig { returns(::OpenApiSDK::Operations::ObjectCircularReferenceGetResponse) }
    def object_circular_reference_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/objectCircularReference"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::ObjectCircularReferenceGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Shared::ObjectCircularReferenceObject)
          res.object_circular_reference_object = out
        end
      end
      res
    end


    sig { returns(::OpenApiSDK::Operations::OneOfCircularReferenceGetResponse) }
    def one_of_circular_reference_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/oneOfCircularReference"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::OneOfCircularReferenceGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Shared::OneOfCircularReferenceObject)
          res.one_of_circular_reference_object = out
        end
      end
      res
    end


    sig { params(bigint: T.nilable(::Integer), date: T.nilable(::Date), decimal: T.nilable(::Float), obj: T.nilable(::OpenApiSDK::Operations::Obj)).returns(::OpenApiSDK::Operations::TypedParameterGenerationGetResponse) }
    def typed_parameter_generation_get(bigint = nil, date = nil, decimal = nil, obj = nil)

      request = ::OpenApiSDK::Operations::TypedParameterGenerationGetRequest.new(
        
        bigint: bigint,
        date: date,
        decimal: decimal,
        obj: obj
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/typedParameterGeneration"
      headers = {}
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::TypedParameterGenerationGetRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::TypedParameterGenerationGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end


    sig { params(request: T.nilable(::OpenApiSDK::Operations::UsageExamplePostRequest), security: ::OpenApiSDK::Operations::UsageExamplePostSecurity).returns(::OpenApiSDK::Operations::UsageExamplePostResponse) }
    def usage_example_post(request, security)
      # usage_example_post - An operation used for testing usage examples
      # An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly
      # https://docs.example.com - Usage example docs
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/usageExample"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request_body, :json)
      headers['content-type'] = req_content_type
      query_params = Utils.get_query_params(::OpenApiSDK::Operations::UsageExamplePostRequest, request, @sdk_configuration.globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.post(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, security) if !security.nil?
        if form
          req.body = Utils.encode_form(form)
        elsif Utils.match_content_type(req_content_type, 'application/x-www-form-urlencoded')
          req.body = URI.encode_www_form(data)
        else
          req.body = data
        end
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::UsageExamplePostResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::UsageExamplePostResponseBody)
          res.object = out
        end
      end
      res
    end
  end
end