# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class HeaderParamsArrayHeaders < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :x_header_array, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('X-Header-Array') } }


      sig { params(x_header_array: ::String).void }
      def initialize(x_header_array: nil)
        @x_header_array = x_header_array
      end
    end
  end
end