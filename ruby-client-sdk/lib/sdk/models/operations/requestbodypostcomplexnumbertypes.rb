# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'
require_relative '../shared/complexnumbertypes'

module OpenApiSDK
  module Operations

    class RequestBodyPostComplexNumberTypesRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :complex_number_types, Shared::ComplexNumberTypes, { 'request': { 'media_type': 'application/json' } }

      field :path_big_int, Integer, { 'path_param': { 'field_name': 'pathBigInt', 'style': 'simple', 'explode': false } }

      field :path_big_int_str, String, { 'path_param': { 'field_name': 'pathBigIntStr', 'style': 'simple', 'explode': false } }

      field :path_decimal, Float, { 'path_param': { 'field_name': 'pathDecimal', 'style': 'simple', 'explode': false } }

      field :path_decimal_str, String, { 'path_param': { 'field_name': 'pathDecimalStr', 'style': 'simple', 'explode': false } }

      field :query_big_int, Integer, { 'query_param': { 'field_name': 'queryBigInt', 'style': 'form', 'explode': true } }

      field :query_big_int_str, String, { 'query_param': { 'field_name': 'queryBigIntStr', 'style': 'form', 'explode': true } }

      field :query_decimal, Float, { 'query_param': { 'field_name': 'queryDecimal', 'style': 'form', 'explode': true } }

      field :query_decimal_str, String, { 'query_param': { 'field_name': 'queryDecimalStr', 'style': 'form', 'explode': true } }


      sig { params(complex_number_types: Shared::ComplexNumberTypes, path_big_int: Integer, path_big_int_str: String, path_decimal: Float, path_decimal_str: String, query_big_int: Integer, query_big_int_str: String, query_decimal: Float, query_decimal_str: String).void }
      def initialize(complex_number_types: nil, path_big_int: nil, path_big_int_str: nil, path_decimal: nil, path_decimal_str: nil, query_big_int: nil, query_big_int_str: nil, query_decimal: nil, query_decimal_str: nil)
        @complex_number_types = complex_number_types
        @path_big_int = path_big_int
        @path_big_int_str = path_big_int_str
        @path_decimal = path_decimal
        @path_decimal_str = path_decimal_str
        @query_big_int = query_big_int
        @query_big_int_str = query_big_int_str
        @query_decimal = query_decimal
        @query_decimal_str = query_decimal_str
      end
    end

    # OK
    class RequestBodyPostComplexNumberTypesResponseBody < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :json, Shared::ComplexNumberTypes, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('json') } }

      field :url, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('url') } }


      sig { params(json: Shared::ComplexNumberTypes, url: String).void }
      def initialize(json: nil, url: nil)
        @json = json
        @url = url
      end
    end


    class RequestBodyPostComplexNumberTypesResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # OK
      field :object, T.nilable(Operations::RequestBodyPostComplexNumberTypesResponseBody)
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, object: T.nilable(Operations::RequestBodyPostComplexNumberTypesResponseBody), raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, object: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @object = object
        @raw_response = raw_response
      end
    end
  end
end
