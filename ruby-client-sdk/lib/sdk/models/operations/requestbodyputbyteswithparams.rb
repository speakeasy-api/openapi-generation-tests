# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class RequestBodyPutBytesWithParamsRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :query_string_param, String, { 'query_param': { 'field_name': 'queryStringParam', 'style': 'form', 'explode': true } }

      field :request_body, String, { 'request': { 'media_type': 'application/octet-stream' } }


      sig { params(query_string_param: String, request_body: String).void }
      def initialize(query_string_param: nil, request_body: nil)
        @query_string_param = query_string_param
        @request_body = request_body
      end
    end


    class RequestBodyPutBytesWithParamsResArgs < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :query_string_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('queryStringParam') } }


      sig { params(query_string_param: String).void }
      def initialize(query_string_param: nil)
        @query_string_param = query_string_param
      end
    end

    # OK
    class RequestBodyPutBytesWithParamsRes < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :args, Operations::RequestBodyPutBytesWithParamsResArgs, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('args') } }

      field :data, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('data') } }


      sig { params(args: Operations::RequestBodyPutBytesWithParamsResArgs, data: String).void }
      def initialize(args: nil, data: nil)
        @args = args
        @data = data
      end
    end


    class RequestBodyPutBytesWithParamsResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :content_type, String

      field :status_code, Integer

      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :res, T.nilable(Operations::RequestBodyPutBytesWithParamsRes)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), res: T.nilable(Operations::RequestBodyPutBytesWithParamsRes)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, res: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @res = res
      end
    end
  end
end