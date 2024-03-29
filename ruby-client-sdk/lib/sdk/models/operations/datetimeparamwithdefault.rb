# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class DateTimeParamWithDefaultRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # A date time parameter with a default value
      field :date_time_input, DateTime, { 'query_param': { 'field_name': 'dateTimeInput', 'style': 'form', 'explode': true } }


      sig { params(date_time_input: DateTime).void }
      def initialize(date_time_input: nil)
        @date_time_input = date_time_input
      end
    end


    class DateTimeParamWithDefaultResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # Raw HTTP response; suitable for custom response parsing
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
