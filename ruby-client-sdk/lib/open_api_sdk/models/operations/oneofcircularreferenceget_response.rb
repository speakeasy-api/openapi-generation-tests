# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class OneOfCircularReferenceGetResponse < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, ::String
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, ::Faraday::Response
      # HTTP response status code for this operation
      field :status_code, ::Integer
      # OK
      field :one_of_circular_reference_object, T.nilable(::OpenApiSDK::Shared::OneOfCircularReferenceObject)


      sig { params(content_type: ::String, raw_response: ::Faraday::Response, status_code: ::Integer, one_of_circular_reference_object: T.nilable(::OpenApiSDK::Shared::OneOfCircularReferenceObject)).void }
      def initialize(content_type: nil, raw_response: nil, status_code: nil, one_of_circular_reference_object: nil)
        @content_type = content_type
        @raw_response = raw_response
        @status_code = status_code
        @one_of_circular_reference_object = one_of_circular_reference_object
      end
    end
  end
end