# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Shared
  

    class OneOfCircularReferenceObject < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :child, ::Object, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('child') } }


      sig { params(child: ::Object).void }
      def initialize(child: nil)
        @child = child
      end
    end
  end
end