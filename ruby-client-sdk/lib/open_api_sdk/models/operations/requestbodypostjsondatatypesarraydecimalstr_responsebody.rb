# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class RequestBodyPostJsonDataTypesArrayDecimalStrResponseBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :data, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('data') } }

      field :json, T::Array[::String], { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('json') } }


      sig { params(data: ::String, json: T::Array[::String]).void }
      def initialize(data: nil, json: nil)
        @data = data
        @json = json
      end
    end
  end
end