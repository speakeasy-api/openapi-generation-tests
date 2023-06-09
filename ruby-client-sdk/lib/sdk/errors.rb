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
    sig { params(sdk: OpenApiSDK::SDK, client: Faraday::Connection, server_url: String, language: String, sdk_version: String, gen_version: String, openapi_doc_version: String, gbls: T::Hash[Symbol, T::Hash[Symbol, T::Hash[Symbol, Object]]]).void }
    def initialize(sdk, client, server_url, language, sdk_version, gen_version, openapi_doc_version, gbls)
      @sdk = sdk
      @client = client
      @server_url = server_url
      @language = language
      @sdk_version = sdk_version
      @gen_version = gen_version
      @openapi_doc_version = openapi_doc_version
      @globals = gbls
    end

    sig { params(server_url: T.nilable(String)).returns(Utils::FieldAugmented) }
    def connection_error_get(server_url = nil)

      base_url = Operations::CONNECTION_ERROR_GET_SERVERS[0]
      base_url = server_url if !server_url.nil?
      url = "#{base_url.delete_suffix('/')}/anything/connectionError"
      headers = {}
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = "speakeasy-sdk/#{@language} #{@sdk_version} #{@gen_version} #{@openapi_doc_version}"

      r = @client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk.security) if !@sdk.nil? && !@sdk.security.nil?
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
    def status_get(status_code)

      request = Operations::StatusGetRequest.new(
        status_code: status_code
      )
      base_url = @server_url
      url = Utils.generate_url(
        Operations::StatusGetRequest,
        base_url,
        '/status/{statusCode}',
        request,
        @globals
      )
      headers = {}
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = "speakeasy-sdk/#{@language} #{@sdk_version} #{@gen_version} #{@openapi_doc_version}"

      r = @client.get(url) do |req|
        req.headers = headers
        Utils.configure_request_security(req, @sdk.security) if !@sdk.nil? && !@sdk.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = Operations::StatusGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if [200, 300, 400, 500].include?(r.status)
      end
      res
    end
  end
end
