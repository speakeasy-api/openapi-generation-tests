# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class UpdateResourceRequest < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :augment, ::String, { 'query_param': { 'field_name': 'augment', 'style': 'form', 'explode': true } }

      field :resource_id, ::String, { 'path_param': { 'field_name': 'resourceId', 'style': 'simple', 'explode': false } }


      sig { params(augment: ::String, resource_id: ::String).void }
      def initialize(augment: nil, resource_id: nil)
        @augment = augment
        @resource_id = resource_id
      end
    end
  end
end