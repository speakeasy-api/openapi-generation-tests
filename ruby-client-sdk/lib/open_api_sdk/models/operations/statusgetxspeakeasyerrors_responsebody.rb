# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
    STATUS_GET_X_SPEAKEASY_ERRORS_RESPONSE_BODY_SERVERS = [
      'http://localhost:35456'
    ].freeze
  
    # Not Implemented
    class StatusGetXSpeakeasyErrorsResponseBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :code, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('code') } }

      field :message, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('message') } }

      field :type, T.nilable(::OpenApiSDK::Shared::ErrorType), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('type'), 'decoder': Utils.enum_from_string(::OpenApiSDK::Shared::ErrorType, true) } }


      sig { params(code: T.nilable(::String), message: T.nilable(::String), type: T.nilable(::OpenApiSDK::Shared::ErrorType)).void }
      def initialize(code: nil, message: nil, type: nil)
        @code = code
        @message = message
        @type = type
      end
    end
  end
end