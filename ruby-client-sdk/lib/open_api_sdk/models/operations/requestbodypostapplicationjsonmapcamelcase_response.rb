# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
    REQUEST_BODY_POST_APPLICATION_JSON_MAP_CAMEL_CASE_RESPONSE_SERVERS = [
      'http://localhost:35456'
    ].freeze
  

    class RequestBodyPostApplicationJsonMapCamelCaseResponse < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, ::String
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, ::Faraday::Response
      # HTTP response status code for this operation
      field :status_code, ::Integer
      # OK
      field :res, T.nilable(T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObjectCamelCase])


      sig { params(content_type: ::String, raw_response: ::Faraday::Response, status_code: ::Integer, res: T.nilable(T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObjectCamelCase])).void }
      def initialize(content_type: nil, raw_response: nil, status_code: nil, res: nil)
        @content_type = content_type
        @raw_response = raw_response
        @status_code = status_code
        @res = res
      end
    end
  end
end