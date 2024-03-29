# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'faraday'
require 'faraday/multipart'
require 'sorbet-runtime'

module OpenApiSDK
  extend T::Sig
  class Documentation
    # Testing for documentation extensions and tooling.
    extend T::Sig
    sig { params(sdk_config: SDKConfiguration).void }
    def initialize(sdk_config)
      @sdk_configuration = sdk_config
    end

    sig { params(language: String).returns(Utils::FieldAugmented) }
    def get_documentation_per_language(language)
      # get_documentation_per_language - Gets documentation for some language, I guess.
      request = Operations::GetDocumentationPerLanguageRequest.new(
        
        language: language
      )
      url, params = @sdk_configuration.get_server_details
      base_url = Utils.template_url(url, params)
      url = "#{base_url}/docs/per-language-docs"
      headers = {}
      query_params = Utils.get_query_params(Operations::GetDocumentationPerLanguageRequest, request, @sdk_configuration.globals)
      headers['Accept'] = '*/*'
      headers['x-speakeasy-user-agent'] = @sdk_configuration.user_agent

      r = @sdk_configuration.client.get(url) do |req|
        req.headers = headers
        req.params = query_params
        Utils.configure_request_security(req, @sdk_configuration.security) if !@sdk_configuration.nil? && !@sdk_configuration.security.nil?
      end

      content_type = r.headers.fetch('Content-Type', 'application/octet-stream')

      res = Operations::GetDocumentationPerLanguageResponse.new(
        status_code: r.status, content_type: content_type, raw_response: r
      )
      if r.status == 200
      end
      res
    end
  end
end
