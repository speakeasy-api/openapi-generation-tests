# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Shared

    class NullableOneOfTypeInObject < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :nullable_one_of_one, T::Boolean, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('NullableOneOfOne') } }

      field :nullable_one_of_two, Object, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('NullableOneOfTwo') } }

      field :one_of_one, T::Boolean, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('OneOfOne') } }


      sig { params(nullable_one_of_one: T::Boolean, nullable_one_of_two: Object, one_of_one: T::Boolean).void }
      def initialize(nullable_one_of_one: nil, nullable_one_of_two: nil, one_of_one: nil)
        @nullable_one_of_one = nullable_one_of_one
        @nullable_one_of_two = nullable_one_of_two
        @one_of_one = one_of_one
      end
    end
  end
end
