# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Shared
  

    class Slides < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :title, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('title') } }

      field :type, ::String, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('type') } }

      field :items, T.nilable(T::Array[::String]), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('items') } }


      sig { params(title: ::String, type: ::String, items: T.nilable(T::Array[::String])).void }
      def initialize(title: nil, type: nil, items: nil)
        @title = title
        @type = type
        @items = items
      end
    end
  end
end