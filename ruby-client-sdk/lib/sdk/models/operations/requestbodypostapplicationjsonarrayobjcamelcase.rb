# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'
require_relative '../shared/arrobjvaluecamelcase'

module OpenApiSDK
  module Operations

    class RequestBodyPostApplicationJsonArrayObjCamelCaseResponse < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :content_type, String

      field :status_code, Integer
      # OK
      field :arr_obj_value_camel_case, T.nilable(Shared::ArrObjValueCamelCase)

      field :raw_response, T.nilable(Faraday::Response)


      sig { params(content_type: String, status_code: Integer, arr_obj_value_camel_case: T.nilable(Shared::ArrObjValueCamelCase), raw_response: T.nilable(Faraday::Response)).void }
      def initialize(content_type: nil, status_code: nil, arr_obj_value_camel_case: nil, raw_response: nil)
        @content_type = content_type
        @status_code = status_code
        @arr_obj_value_camel_case = arr_obj_value_camel_case
        @raw_response = raw_response
      end
    end
  end
end