# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'

module OpenApiSDK
  extend T::Sig
  class Retries
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

    sig { params(request_id: String, num_retries: T.nilable(Integer), server_url: T.nilable(String)).returns(Utils::FieldAugmented) }
    def retries_get(request_id, num_retries = nil, server_url = nil)

      request = Operations::RetriesGetRequest.new(
        request_id: request_id,
        num_retries: num_retries
      )
      base_url = Operations::RETRIES_GET_SERVERS[0]
      base_url = server_url if !server_url.nil?
      url = "#{base_url.delete_suffix('/')}/retries"
      headers = {}
      query_params = Utils.get_query_params(Operations::RetriesGetRequest, request, @globals)
      headers['Accept'] = 'application/json'
      headers['x-speakeasy-user-agent'] = "speakeasy-sdk/#{@language} #{@sdk_version} #{@gen_version} #{@openapi_doc_version}"

      r = @client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk.security) if !@sdk.nil? && !@sdk.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = Operations::RetriesGetResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
        if Utils.match_content_type(content_type, 'application/json')
          out = Utils.unmarshal_complex(r.env.response_body, Operations::RetriesGetRetries)
          res.retries = out
        end
      end
      res
    end
  end
end