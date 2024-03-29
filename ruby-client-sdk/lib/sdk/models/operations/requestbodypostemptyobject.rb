# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Operations

    class Empty < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig



      
      def initialize; end
    end


    class EmptyWithEmptyProperties < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig



      
      def initialize; end
    end


    class RequestBodyPostEmptyObjectRequestBody < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :empty, T.nilable(Operations::Empty), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('empty') } }

      field :empty_with_empty_properties, T.nilable(Operations::EmptyWithEmptyProperties), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('emptyWithEmptyProperties') } }


      sig { params(empty: T.nilable(Operations::Empty), empty_with_empty_properties: T.nilable(Operations::EmptyWithEmptyProperties)).void }
      def initialize(empty: nil, empty_with_empty_properties: nil)
        @empty = empty
        @empty_with_empty_properties = empty_with_empty_properties
      end
    end


    class RequestBodyPostEmptyObjectEmpty < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig



      
      def initialize; end
    end


    class EmptyRespWithEmptyProperies < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig



      
      def initialize; end
    end

    # OK
    class RequestBodyPostEmptyObjectResponseBody < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :empty, T.nilable(Operations::RequestBodyPostEmptyObjectEmpty), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('empty') } }

      field :empty_resp_with_empty_properies, T.nilable(Operations::EmptyRespWithEmptyProperies), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('emptyRespWithEmptyProperies') } }


      sig { params(empty: T.nilable(Operations::RequestBodyPostEmptyObjectEmpty), empty_resp_with_empty_properies: T.nilable(Operations::EmptyRespWithEmptyProperies)).void }
      def initialize(empty: nil, empty_resp_with_empty_properies: nil)
        @empty = empty
        @empty_resp_with_empty_properies = empty_resp_with_empty_properies
      end
    end


    class RequestBodyPostEmptyObjectResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # HTTP response content type for this operation
      field :content_type, String
      # HTTP response status code for this operation
      field :status_code, Integer
      # OK
      field :object, T.nilable(Operations::RequestBodyPostEmptyObjectResponseBody)
      # Raw HTTP response; suitable for custom response parsing
      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, object: T.nilable(Operations::RequestBodyPostEmptyObjectResponseBody), raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, object: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @object = object
        @raw_response = raw_response
      end
    end
  end
end
