# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class HeaderParamsArrayRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :x_header_array, T::Array[String], { 'header': { 'field_name': 'X-Header-Array', 'style': 'simple', 'explode': false } }


      sig { params(x_header_array: T::Array[String]).void }
      def initialize(x_header_array: nil)
        @x_header_array = x_header_array
      end
    end


    class Headers < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :x_header_array, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('X-Header-Array') } }


      sig { params(x_header_array: String).void }
      def initialize(x_header_array: nil)
        @x_header_array = x_header_array
      end
    end

    # OK
    class HeaderParamsArrayRes < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :headers, Operations::Headers, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('headers') } }


      sig { params(headers: Operations::Headers).void }
      def initialize(headers: nil)
        @headers = headers
      end
    end


    class HeaderParamsArrayResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :res, T.nilable(Operations::HeaderParamsArrayRes)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), res: T.nilable(Operations::HeaderParamsArrayRes)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, res: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @res = res
      end
    end
  end
end
