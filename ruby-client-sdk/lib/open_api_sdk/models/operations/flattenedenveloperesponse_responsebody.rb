# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class FlattenedEnvelopeResponseResponseBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :message, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('message') } }


      sig { params(message: ::String).void }
      def initialize(message: nil)
        @message = message
      end
    end
  end
end