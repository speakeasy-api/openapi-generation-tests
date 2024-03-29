# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class MixedParametersCamelCaseRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :header_param, String, { 'header': { 'field_name': 'header_param', 'style': 'simple', 'explode': false } }

      field :path_param, String, { 'path_param': { 'field_name': 'path_param', 'style': 'simple', 'explode': false } }

      field :query_string_param, String, { 'query_param': { 'field_name': 'query_string_param', 'style': 'form', 'explode': true } }


      sig { params(header_param: String, path_param: String, query_string_param: String).void }
      def initialize(header_param: nil, path_param: nil, query_string_param: nil)
        @header_param = header_param
        @path_param = path_param
        @query_string_param = query_string_param
      end
    end


    class MixedParametersCamelCaseArgs < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :query_string_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('query_string_param') } }


      sig { params(query_string_param: String).void }
      def initialize(query_string_param: nil)
        @query_string_param = query_string_param
      end
    end


    class MixedParametersCamelCaseHeaders < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :header_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('Header-Param') } }


      sig { params(header_param: String).void }
      def initialize(header_param: nil)
        @header_param = header_param
      end
    end

    # OK
    class MixedParametersCamelCaseRes < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :args, Operations::MixedParametersCamelCaseArgs, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('args') } }

      field :headers, Operations::MixedParametersCamelCaseHeaders, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('headers') } }

      field :url, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('url') } }


      sig { params(args: Operations::MixedParametersCamelCaseArgs, headers: Operations::MixedParametersCamelCaseHeaders, url: String).void }
      def initialize(args: nil, headers: nil, url: nil)
        @args = args
        @headers = headers
        @url = url
      end
    end


    class MixedParametersCamelCaseResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :res, T.nilable(Operations::MixedParametersCamelCaseRes)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), res: T.nilable(Operations::MixedParametersCamelCaseRes)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, res: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @res = res
      end
    end
  end
end
