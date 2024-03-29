# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class ArrayCircularReferenceGetResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # OK
      field :array_circular_reference_object, T.nilable(T::Array[Shared::ArrayCircularReferenceObject])
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, array_circular_reference_object: T.nilable(T::Array[Shared::ArrayCircularReferenceObject]), raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, array_circular_reference_object: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @array_circular_reference_object = array_circular_reference_object
        @raw_response = raw_response
      end
    end
  end
end
