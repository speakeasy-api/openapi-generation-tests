# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    SERVER_WITH_PROTOCOL_TEMPLATE_SERVER_MAIN = 'main'
    SERVER_WITH_PROTOCOL_TEMPLATE_SERVERS = {

      SERVER_WITH_PROTOCOL_TEMPLATE_SERVER_MAIN: '{protocol}://{hostname}:{port}'
    }.freeze

    class ServerWithProtocolTemplateResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :content_type, String

      field :status_code, Integer

      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
      end
    end
  end
end