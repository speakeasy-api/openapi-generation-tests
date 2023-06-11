# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class DeleteResourceRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :resource_id, String, { 'path_param': { 'field_name': 'resourceId', 'style': 'simple', 'explode': false } }


      sig { params(resource_id: String).void }
      def initialize(resource_id: nil)
        @resource_id = resource_id
      end
    end


    class DeleteResourceResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :content_type, String

      field :status_code, Integer

      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @raw_response = raw_response
      end
    end
  end
end