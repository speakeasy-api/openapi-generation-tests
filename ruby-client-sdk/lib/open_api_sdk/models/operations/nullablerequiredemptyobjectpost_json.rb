# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  

    class NullableRequiredEmptyObjectPostJson < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :nullable_required_obj, ::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostNullableRequiredObj, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('NullableRequiredObj') } }

      field :required_obj, ::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostRequiredObj, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('RequiredObj') } }

      field :nullable_optional_obj, T.nilable(::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostNullableOptionalObj), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('NullableOptionalObj') } }


      sig { params(nullable_required_obj: ::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostNullableRequiredObj, required_obj: ::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostRequiredObj, nullable_optional_obj: T.nilable(::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostNullableOptionalObj)).void }
      def initialize(nullable_required_obj: nil, required_obj: nil, nullable_optional_obj: nil)
        @nullable_required_obj = nullable_required_obj
        @required_obj = required_obj
        @nullable_optional_obj = nullable_optional_obj
      end
    end
  end
end