# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Shared

    class ArrayCircularReferenceObject < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :circular, T::Array[Shared::ArrayCircularReferenceObject], { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('circular') } }


      sig { params(circular: T::Array[Shared::ArrayCircularReferenceObject]).void }
      def initialize(circular: nil)
        @circular = circular
      end
    end
  end
end