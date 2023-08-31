# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'
require_relative '../shared/writeonlyobject'

module OpenApiSDK
  module Operations
    REQUEST_BODY_WRITE_ONLY_OUTPUT_SERVERS = [
      'http://localhost:35456'
    ].freeze

    class RequestBodyWriteOnlyOutputResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :content_type, String

      field :status_code, Integer

      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :write_only_object, T.nilable(Shared::WriteOnlyObjectOutput)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), write_only_object: T.nilable(Shared::WriteOnlyObjectOutput)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, write_only_object: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @write_only_object = write_only_object
      end
    end
  end
end