# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class GlobalsHiddenPostRequestBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :other, ::Integer, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('other') } }

      field :test, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('test') } }


      sig { params(other: ::Integer, test: ::String).void }
      def initialize(other: nil, test: nil)
        @other = other
        @test = test
      end
    end
  end
end