# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class GlobalsQueryParameterGetRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :global_query_param, T.nilable(String), { 'query_param': { 'field_name': 'globalQueryParam', 'style': 'form', 'explode': true } }


      sig { params(global_query_param: T.nilable(String)).void }
      def initialize(global_query_param: nil)
        @global_query_param = global_query_param
      end
    end


    class Args < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :global_query_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('globalQueryParam') } }


      sig { params(global_query_param: String).void }
      def initialize(global_query_param: nil)
        @global_query_param = global_query_param
      end
    end

    # OK
    class GlobalsQueryParameterGetRes < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :args, Operations::Args, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('args') } }


      sig { params(args: Operations::Args).void }
      def initialize(args: nil)
        @args = args
      end
    end


    class GlobalsQueryParameterGetResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :res, T.nilable(Operations::GlobalsQueryParameterGetRes)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), res: T.nilable(Operations::GlobalsQueryParameterGetRes)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, res: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @res = res
      end
    end
  end
end
