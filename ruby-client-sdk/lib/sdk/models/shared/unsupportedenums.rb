# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Shared

    class UnsupportedEnums < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :boolean_enum, T::Boolean, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('booleanEnum') } }

      field :number_enum, Float, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('numberEnum') } }


      sig { params(boolean_enum: T::Boolean, number_enum: Float).void }
      def initialize(boolean_enum: nil, number_enum: nil)
        @boolean_enum = boolean_enum
        @number_enum = number_enum
      end
    end
  end
end
