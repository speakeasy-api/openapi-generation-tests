# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Shared

    class ArrObjValue < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :json, T.nilable(T::Array[Shared::SimpleObject]), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('json') } }

      field :required, T.nilable(Object), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('required') } }


      sig { params(json: T.nilable(T::Array[Shared::SimpleObject]), required: T.nilable(Object)).void }
      def initialize(json: nil, required: nil)
        @json = json
        @required = required
      end
    end
  end
end
