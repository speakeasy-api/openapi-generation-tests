# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'
module OpenApiSDK
  extend T::Sig

  class SDK
    extend T::Sig

    attr_accessor :generation, :errors, :unions, :flattening, :globals, :parameters, :hooks, :nest_first, :nested, :nested_first, :nested_second, :auth, :request_bodies, :response_bodies, :servers, :telemetry, :auth_new, :resource, :documentation, :first, :second, :pagination, :retries

    attr_accessor :security, :language, :sdk_version, :gen_version

    sig do
      params(security: T.nilable(Shared::Security),
             global_path_param: ::Integer,
             global_query_param: ::String,
             hostname: T.nilable(::String),
             port: T.nilable(::String),
             something: T.nilable(::OpenApiSDK::ServerVariables::ServerSomething),
             protocol: T.nilable(::String),
             server_idx: Integer,
             server_url: String,
             url_params: T::Hash[Symbol, String],
             client: Faraday::Request).void
    end
    def initialize(security: nil,
                   global_path_param: nil,
                   global_query_param: nil,
                   hostname: nil,
                   port: nil,
                   something: nil,
                   protocol: nil,
                   server_idx: nil,
                   server_url: nil,
                   url_params: nil,
                   client: nil)

      ## Instantiates the SDK configuring it with the provided parameters.
      # @param [Shared::Security] security The security details required for authentication
      # @param [::Integer] global_path_param: Configures the global_path_param parameter for all supported operations
      # @param [::String] global_query_param: Configures the global_query_param parameter for all supported operations
      # @param [T.nilable(::String)] hostname: Allows setting the hostname variable for url substitution
      # @param [T.nilable(::String)] port: Allows setting the port variable for url substitution
      # @param [T.nilable(::OpenApiSDK::ServerVariables::ServerSomething)] something: Allows setting the something variable for url substitution
      # @param [T.nilable(::String)] protocol: Allows setting the protocol variable for url substitution
      # @param [Integer] server_idx The index of the server to use for all operations
      # @param [String] server_url The server URL to use for all operations
      # @param [Hash<Symbol, String>] url_params Parameters to optionally template the server URL with
      # @param [Faraday::Request] client The faraday HTTP client to use for all operations

      if client.nil?
        client = Faraday.new(request: {
                          params_encoder: Faraday::FlatParamsEncoder
                        }) do |f|
          f.request :multipart, {}
          # f.response :logger
        end
      end

      if !server_url.nil?
        if !url_params.nil?
          server_url = Utils.template_url(server_url, url_params)
        end
      end
      server_idx = 0 if server_idx.nil?
      server_defaults = [
        {
        },
        {
        },
        {
            'hostname': hostname || 'localhost',
            'port': port || '35123',
        },
        {
            'something': something || 'something',
        },
        {
            'hostname': hostname || 'localhost',
            'port': port || '35123',
            'protocol': protocol || 'http',
        },
      ]

      
      globals = {
        'parameters': {
          'queryParam': {
            'global_query_param': global_query_param
          },
          'pathParam': {
            'global_path_param': global_path_param
          }
        }
      }

      @sdk_configuration = SDKConfiguration.new(client, security, server_url, server_idx, server_defaults, globals)
      init_sdks
    end

    sig { params(params: T.nilable(T::Hash[Symbol, String])).void }
    def config_server_url(params)
      if !params.nil?
        @server_url = Utils.template_url(@server_url, params)
      end
      init_sdks
    end

    sig { params(security: ::OpenApiSDK::Shared::Security).void }
    def config_security(security)
      @security = security
      @sdk_configuration.security = security
    end

    sig { void }
    def init_sdks
      @generation = Generation.new(@sdk_configuration)
      @errors = Errors.new(@sdk_configuration)
      @unions = Unions.new(@sdk_configuration)
      @flattening = Flattening.new(@sdk_configuration)
      @globals = Globals.new(@sdk_configuration)
      @parameters = Parameters.new(@sdk_configuration)
      @hooks = Hooks.new(@sdk_configuration)
      @nest_first = NestFirst.new(@sdk_configuration)
      @nested = Nested.new(@sdk_configuration)
      @nested_first = NestedFirst.new(@sdk_configuration)
      @nested_second = NestedSecond.new(@sdk_configuration)
      @auth = Auth.new(@sdk_configuration)
      @request_bodies = RequestBodies.new(@sdk_configuration)
      @response_bodies = ResponseBodies.new(@sdk_configuration)
      @servers = Servers.new(@sdk_configuration)
      @telemetry = Telemetry.new(@sdk_configuration)
      @auth_new = AuthNew.new(@sdk_configuration)
      @resource = Resource.new(@sdk_configuration)
      @documentation = Documentation.new(@sdk_configuration)
      @first = First.new(@sdk_configuration)
      @second = Second.new(@sdk_configuration)
      @pagination = Pagination.new(@sdk_configuration)
      @retries = Retries.new(@sdk_configuration)
    end

    
    sig { params(request: T.nilable(::OpenApiSDK::Shared::ConflictingEnum)).returns(::OpenApiSDK::Operations::ConflictingEnumResponse) }
    def conflicting_enum(request)
      # conflicting_enum - Test potential namespace conflicts with java.lang.Object
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/conflictingEnum/"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request, :json)
      headers['content-type'] = req_content_type
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

      res = ::OpenApiSDK::Operations::ConflictingEnumResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      
      res
    end

    
    sig { params(request: ::String).returns(::OpenApiSDK::Operations::PutAnythingIgnoredGenerationResponse) }
    def put_anything_ignored_generation(request)

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/anything/ignoredGeneration"
      headers = {}
      req_content_type, data, form = Utils.serialize_request_body(request, :request, :json)
      headers['content-type'] = req_content_type
      raise StandardError, 'request body is required' if data.nil? && form.nil?
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.put(url) do |req|
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

      res = ::OpenApiSDK::Operations::PutAnythingIgnoredGenerationResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, ::OpenApiSDK::Operations::PutAnythingIgnoredGenerationResponseBody)
          res.object = out
        end
      end
      res
    end

    
    sig { returns(::OpenApiSDK::Operations::ResponseBodyJsonGetResponse) }
    def response_body_json_get

      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/json"
      headers = {}
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = ::OpenApiSDK::Operations::ResponseBodyJsonGetResponse.new(
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
  end
end