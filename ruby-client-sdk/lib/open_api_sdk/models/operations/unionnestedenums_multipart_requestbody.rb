# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class UnionNestedEnumsMultipartRequestBody < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :enums, ::Object, { 'multipart_form': { 'field_name': 'enums', 'json': true } }


      sig { params(enums: ::Object).void }
      def initialize(enums: nil)
        @enums = enums
      end
    end
  end
end