# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class Oauth2AuthResponse < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, ::String
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, ::Faraday::Response
      # HTTP response status code for this operation
      field :status_code, ::Integer
      # Successful authentication.
      field :token, T.nilable(::OpenApiSDK::Operations::Oauth2AuthToken)


      sig { params(content_type: ::String, raw_response: ::Faraday::Response, status_code: ::Integer, token: T.nilable(::OpenApiSDK::Operations::Oauth2AuthToken)).void }
      def initialize(content_type: nil, raw_response: nil, status_code: nil, token: nil)
        @content_type = content_type
        @raw_response = raw_response
        @status_code = status_code
        @token = token
      end
    end
  end
end