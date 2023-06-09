# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'
require_relative '../shared/simpleobject'

module OpenApiSDK
  module Shared

    class DeepObjectWithType < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :any, Object, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('any') } }

      field :arr, T::Array[Shared::SimpleObject], { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('arr') } }

      field :bool, T::Boolean, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('bool') } }

      field :int, Integer, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('int') } }

      field :map, T::Hash[Symbol, Shared::SimpleObject], { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('map') } }

      field :num, Float, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('num') } }
      # A simple object that uses all our supported primitive types and enums and has optional properties.
      # https://docs.speakeasyapi.dev - A link to the external docs.
      field :obj, Shared::SimpleObject, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('obj') } }

      field :str_, String, { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('str') } }

      field :type, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('type') } }


      sig { params(any: Object, arr: T::Array[Shared::SimpleObject], bool: T::Boolean, int: Integer, map: T::Hash[Symbol, Shared::SimpleObject], num: Float, obj: Shared::SimpleObject, str_: String, type: T.nilable(String)).void }
      def initialize(any: nil, arr: nil, bool: nil, int: nil, map: nil, num: nil, obj: nil, str_: nil, type: nil)
        @any = any
        @arr = arr
        @bool = bool
        @int = int
        @map = map
        @num = num
        @obj = obj
        @str_ = str_
        @type = type
      end
    end
  end
end
