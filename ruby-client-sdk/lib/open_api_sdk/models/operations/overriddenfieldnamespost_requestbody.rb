# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class OverriddenFieldNamesPostRequestBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :in_int, T.nilable(::Integer), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('int') } }

      field :in_str, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('str') } }


      sig { params(in_int: T.nilable(::Integer), in_str: T.nilable(::String)).void }
      def initialize(in_int: nil, in_str: nil)
        @in_int = in_int
        @in_str = in_str
      end
    end
  end
end