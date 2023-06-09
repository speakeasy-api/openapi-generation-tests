# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations
    # SELECT_SERVER_WITH_ID_SERVER_VALID - The default server.
    SELECT_SERVER_WITH_ID_SERVER_VALID = 'valid'
    # SELECT_SERVER_WITH_ID_SERVER_BROKEN - A server url to a non-existent server.
    SELECT_SERVER_WITH_ID_SERVER_BROKEN = 'broken'
    SELECT_SERVER_WITH_ID_SERVERS = {
      # The default server.
      SELECT_SERVER_WITH_ID_SERVER_VALID: 'http://localhost:35123',
      # A server url to a non-existent server.
      SELECT_SERVER_WITH_ID_SERVER_BROKEN: 'http://broken'
    }.freeze

    class SelectServerWithIDResponse < OpenApiSDK::Utils::FieldAugmented
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
