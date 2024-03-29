# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class FormQueryParamsPrimitiveRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :bool_param, T::Boolean, { 'query_param': { 'field_name': 'boolParam', 'style': 'form', 'explode': true } }

      field :int_param, Integer, { 'query_param': { 'field_name': 'intParam', 'style': 'form', 'explode': true } }

      field :num_param, Float, { 'query_param': { 'field_name': 'numParam', 'style': 'form', 'explode': true } }

      field :str_param, String, { 'query_param': { 'field_name': 'strParam', 'style': 'form', 'explode': true } }


      sig { params(bool_param: T::Boolean, int_param: Integer, num_param: Float, str_param: String).void }
      def initialize(bool_param: nil, int_param: nil, num_param: nil, str_param: nil)
        @bool_param = bool_param
        @int_param = int_param
        @num_param = num_param
        @str_param = str_param
      end
    end


    class FormQueryParamsPrimitiveArgs < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :bool_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('boolParam') } }

      field :int_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('intParam') } }

      field :num_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('numParam') } }

      field :str_param, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('strParam') } }


      sig { params(bool_param: String, int_param: String, num_param: String, str_param: String).void }
      def initialize(bool_param: nil, int_param: nil, num_param: nil, str_param: nil)
        @bool_param = bool_param
        @int_param = int_param
        @num_param = num_param
        @str_param = str_param
      end
    end

    # OK
    class FormQueryParamsPrimitiveRes < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :args, Operations::FormQueryParamsPrimitiveArgs, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('args') } }

      field :url, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('url') } }


      sig { params(args: Operations::FormQueryParamsPrimitiveArgs, url: String).void }
      def initialize(args: nil, url: nil)
        @args = args
        @url = url
      end
    end


    class FormQueryParamsPrimitiveResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)
      # OK
      field :res, T.nilable(Operations::FormQueryParamsPrimitiveRes)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response), res: T.nilable(Operations::FormQueryParamsPrimitiveRes)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil, res: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
        @res = res
      end
    end
  end
end
