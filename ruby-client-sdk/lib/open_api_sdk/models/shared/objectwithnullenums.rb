# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Shared
  

    class ObjectWithNullEnums < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :null_enum, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('nullEnum') } }

      field :opt_null_enum, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('optNullEnum') } }


      sig { params(null_enum: ::String, opt_null_enum: T.nilable(::String)).void }
      def initialize(null_enum: nil, opt_null_enum: nil)
        @null_enum = null_enum
        @opt_null_enum = opt_null_enum
      end
    end
  end
end