# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class AuthenticatedRequestSecurity < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :client_credentials, ::String, { 'security': { 'scheme': true, 'type': 'oauth2', 'field_name': 'Authorization' } }


      sig { params(client_credentials: ::String).void }
      def initialize(client_credentials: nil)
        @client_credentials = client_credentials
      end
    end
  end
end