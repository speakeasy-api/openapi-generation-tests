# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
    MULTIPLE_SIMPLE_OPTIONS_AUTH_SECURITY_SERVERS = [
      'http://localhost:35456'
    ].freeze
  

    class MultipleSimpleOptionsAuthSecurity < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :api_key_auth_new, T.nilable(::String), { 'security': { 'scheme': true, 'type': 'apiKey', 'sub_type': 'header', 'field_name': 'x-api-key' } }

      field :oauth2, T.nilable(::String), { 'security': { 'scheme': true, 'type': 'oauth2', 'field_name': 'Authorization' } }


      sig { params(api_key_auth_new: T.nilable(::String), oauth2: T.nilable(::String)).void }
      def initialize(api_key_auth_new: nil, oauth2: nil)
        @api_key_auth_new = api_key_auth_new
        @oauth2 = oauth2
      end
    end
  end
end