# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class DeepObjectQueryParamsObjectRequest < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # A simple object that uses all our supported primitive types and enums and has optional properties.
      field :obj_param, ::OpenApiSDK::Shared::SimpleObject, { 'query_param': { 'field_name': 'objParam', 'style': 'deepObject', 'explode': true } }

      field :obj_arr_param, T.nilable(::OpenApiSDK::Operations::ObjArrParam), { 'query_param': { 'field_name': 'objArrParam', 'style': 'deepObject', 'explode': true } }


      sig { params(obj_param: ::OpenApiSDK::Shared::SimpleObject, obj_arr_param: T.nilable(::OpenApiSDK::Operations::ObjArrParam)).void }
      def initialize(obj_param: nil, obj_arr_param: nil)
        @obj_param = obj_param
        @obj_arr_param = obj_arr_param
      end
    end
  end
end