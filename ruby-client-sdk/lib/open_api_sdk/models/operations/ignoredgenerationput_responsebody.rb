# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class IgnoredGenerationPutResponseBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :json, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('json') } }


      sig { params(json: T.nilable(::String)).void }
      def initialize(json: nil)
        @json = json
      end
    end
  end
end