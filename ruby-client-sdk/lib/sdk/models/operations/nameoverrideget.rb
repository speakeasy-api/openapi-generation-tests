# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'
require_relative '../shared/simpleobject'

module OpenApiSDK
  module Operations

    class NameOverrideGetRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :test_query_param, String, { 'query_param': { 'field_name': 'nameOverride', 'style': 'form', 'explode': true } }


      sig { params(test_query_param: String).void }
      def initialize(test_query_param: nil)
        @test_query_param = test_query_param
      end
    end

    # A successful response that contains the simpleObject sent in the request body
    class OverriddenResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # A simple object that uses all our supported primitive types and enums and has optional properties.
      # https://docs.speakeasyapi.dev - A link to the external docs.
      field :json, T.nilable(Shared::SimpleObject), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('json') } }


      sig { params(json: T.nilable(Shared::SimpleObject)).void }
      def initialize(json: nil)
        @json = json
      end
    end


    class NameOverrideGetResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :content_type, String

      field :status_code, Integer
      # A successful response that contains the simpleObject sent in the request body
      field :overridden_response, T.nilable(Operations::OverriddenResponse)

      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, overridden_response: T.nilable(Operations::OverriddenResponse), raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, overridden_response: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @overridden_response = overridden_response
        @raw_response = raw_response
      end
    end
  end
end
