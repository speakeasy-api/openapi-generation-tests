# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Shared
  

    class ComplexNumberArrays < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :bigint_array, T.nilable(T::Array[::Integer]), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('bigintArray') } }

      field :bigint_str_array, T.nilable(T::Array[::String]), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('bigintStrArray') } }

      field :decimal_array, T.nilable(T::Array[::Float]), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('decimalArray') } }

      field :decimal_str_array, T.nilable(T::Array[::String]), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('decimalStrArray') } }


      sig { params(bigint_array: T.nilable(T::Array[::Integer]), bigint_str_array: T.nilable(T::Array[::String]), decimal_array: T.nilable(T::Array[::Float]), decimal_str_array: T.nilable(T::Array[::String])).void }
      def initialize(bigint_array: nil, bigint_str_array: nil, decimal_array: nil, decimal_str_array: nil)
        @bigint_array = bigint_array
        @bigint_str_array = bigint_str_array
        @decimal_array = decimal_array
        @decimal_str_array = decimal_str_array
      end
    end
  end
end