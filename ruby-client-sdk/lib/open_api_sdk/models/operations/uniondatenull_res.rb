# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class UnionDateNullRes < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :json, ::Date, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('json'), 'decoder': Utils.date_from_iso_format(false) } }


      sig { params(json: ::Date).void }
      def initialize(json: nil)
        @json = json
      end
    end
  end
end