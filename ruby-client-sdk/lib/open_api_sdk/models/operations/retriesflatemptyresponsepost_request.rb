# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
    RETRIES_FLAT_EMPTY_RESPONSE_POST_REQUEST_SERVERS = [
      'http://localhost:35456'
    ].freeze
  

    class RetriesFlatEmptyResponsePostRequest < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :request_id, ::String, { 'query_param': { 'field_name': 'request-id', 'style': 'form', 'explode': true } }

      field :num_retries, T.nilable(::Integer), { 'query_param': { 'field_name': 'num-retries', 'style': 'form', 'explode': true } }

      field :request_body, T.nilable(::OpenApiSDK::Operations::RetriesFlatEmptyResponsePostRequestBody), { 'request': { 'media_type': 'application/json' } }


      sig { params(request_id: ::String, num_retries: T.nilable(::Integer), request_body: T.nilable(::OpenApiSDK::Operations::RetriesFlatEmptyResponsePostRequestBody)).void }
      def initialize(request_id: nil, num_retries: nil, request_body: nil)
        @request_id = request_id
        @num_retries = num_retries
        @request_body = request_body
      end
    end
  end
end