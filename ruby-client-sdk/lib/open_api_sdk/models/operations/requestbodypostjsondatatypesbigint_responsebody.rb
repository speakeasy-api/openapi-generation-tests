# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class RequestBodyPostJsonDataTypesBigIntResponseBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :data, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('data') } }

      field :json, ::Integer, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('json') } }


      sig { params(data: ::String, json: ::Integer).void }
      def initialize(data: nil, json: nil)
        @data = data
        @json = json
      end
    end
  end
end