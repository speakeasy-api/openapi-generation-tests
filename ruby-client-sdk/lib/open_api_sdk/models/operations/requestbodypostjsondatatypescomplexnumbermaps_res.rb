# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class RequestBodyPostJsonDataTypesComplexNumberMapsRes < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :json, ::OpenApiSDK::Shared::ComplexNumberMaps, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('json') } }


      sig { params(json: ::OpenApiSDK::Shared::ComplexNumberMaps).void }
      def initialize(json: nil)
        @json = json
      end
    end
  end
end