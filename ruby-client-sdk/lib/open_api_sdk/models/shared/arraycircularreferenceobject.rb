# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Shared
  

    class ArrayCircularReferenceObject < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :circular, T::Array[::OpenApiSDK::Shared::ArrayCircularReferenceObject], { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('circular') } }


      sig { params(circular: T::Array[::OpenApiSDK::Shared::ArrayCircularReferenceObject]).void }
      def initialize(circular: nil)
        @circular = circular
      end
    end
  end
end