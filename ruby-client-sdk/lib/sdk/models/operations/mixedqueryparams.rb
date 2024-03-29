# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'
require_relative '../shared/simpleobject'

module OpenApiSDK
  module Operations

    class MixedQueryParamsRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # A simple object that uses all our supported primitive types and enums and has optional properties.
      field :deep_object_param, Shared::SimpleObject, { 'query_param': { 'field_name': 'deepObjectParam', 'style': 'deepObject', 'explode': true } }
      # A simple object that uses all our supported primitive types and enums and has optional properties.
      field :form_param, Shared::SimpleObject, { 'query_param': { 'field_name': 'formParam', 'style': 'form', 'explode': true } }
      # A simple object that uses all our supported primitive types and enums and has optional properties.
      field :json_param, Shared::SimpleObject, { 'query_param': { 'field_name': 'jsonParam', 'serialization': 'json' } }


      sig { params(deep_object_param: Shared::SimpleObject, form_param: Shared::SimpleObject, json_param: Shared::SimpleObject).void }
      def initialize(deep_object_param: nil, form_param: nil, json_param: nil)
        @deep_object_param = deep_object_param
        @form_param = form_param
        @json_param = json_param
      end
    end

    # OK
    class MixedQueryParamsRes < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :args, T::Hash[Symbol, String], { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('args') } }

      field :url, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('url') } }


      sig { params(args: T::Hash[Symbol, String], url: String).void }
      def initialize(args: nil, url: nil)
        @args = args
        @url = url
      end
    end


    class MixedQueryParamsResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :res, T.nilable(Operations::MixedQueryParamsRes)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), res: T.nilable(Operations::MixedQueryParamsRes)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, res: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @res = res
      end
    end
  end
end
