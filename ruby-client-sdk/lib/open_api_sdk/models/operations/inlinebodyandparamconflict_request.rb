# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class InlineBodyAndParamConflictRequest < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :request_body, ::OpenApiSDK::Operations::InlineBodyAndParamConflictRequestBody, { 'request': { 'media_type': 'application/json' } }

      field :str_, ::String, { 'query_param': { 'field_name': 'str', 'style': 'form', 'explode': true } }


      sig { params(request_body: ::OpenApiSDK::Operations::InlineBodyAndParamConflictRequestBody, str_: ::String).void }
      def initialize(request_body: nil, str_: nil)
        @request_body = request_body
        @str_ = str_
      end
    end
  end
end