# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Shared
  

    class Security < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :api_key_auth, T.nilable(::String), { 'security': { 'scheme': true, 'type': 'apiKey', 'sub_type': 'header', 'field_name': 'Authorization' } }

      field :oauth2, T.nilable(::String), { 'security': { 'scheme': true, 'type': 'oauth2', 'field_name': 'Authorization' } }


      sig { params(api_key_auth: T.nilable(::String), oauth2: T.nilable(::String)).void }
      def initialize(api_key_auth: nil, oauth2: nil)
        @api_key_auth = api_key_auth
        @oauth2 = oauth2
      end
    end
  end
end