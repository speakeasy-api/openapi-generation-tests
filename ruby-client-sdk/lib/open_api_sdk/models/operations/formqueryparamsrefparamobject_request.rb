# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class FormQueryParamsRefParamObjectRequest < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :ref_obj_param, T.nilable(::OpenApiSDK::Shared::RefQueryParamObj), { 'query_param': { 'field_name': 'refObjParam', 'style': 'form', 'explode': false } }

      field :ref_obj_param_exploded, T.nilable(::OpenApiSDK::Shared::RefQueryParamObjExploded), { 'query_param': { 'field_name': 'refObjParamExploded', 'style': 'form', 'explode': true } }


      sig { params(ref_obj_param: T.nilable(::OpenApiSDK::Shared::RefQueryParamObj), ref_obj_param_exploded: T.nilable(::OpenApiSDK::Shared::RefQueryParamObjExploded)).void }
      def initialize(ref_obj_param: nil, ref_obj_param_exploded: nil)
        @ref_obj_param = ref_obj_param
        @ref_obj_param_exploded = ref_obj_param_exploded
      end
    end
  end
end