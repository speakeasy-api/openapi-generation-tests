# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class DuplicateParamRequest < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :duplicate_param_request, String, { 'path_param': { 'field_name': 'duplicateParamRequest', 'style': 'simple', 'explode': false } }


      sig { params(duplicate_param_request: String).void }
      def initialize(duplicate_param_request: nil)
        @duplicate_param_request = duplicate_param_request
      end
    end

    # OK
    class DuplicateParamDuplicateParamResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :url, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('url') } }


      sig { params(url: T.nilable(String)).void }
      def initialize(url: nil)
        @url = url
      end
    end


    class DuplicateParamResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # OK
      field :duplicate_param_response, T.nilable(Operations::DuplicateParamDuplicateParamResponse)
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, duplicate_param_response: T.nilable(Operations::DuplicateParamDuplicateParamResponse), raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, duplicate_param_response: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @duplicate_param_response = duplicate_param_response
        @raw_response = raw_response
      end
    end
  end
end
