# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class ResponseBodyAdditionalPropertiesObjectPostResponseBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :json, T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject], { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('json') } }


      sig { params(json: T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject]).void }
      def initialize(json: nil)
        @json = json
      end
    end
  end
end