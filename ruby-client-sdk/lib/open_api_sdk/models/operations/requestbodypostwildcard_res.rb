# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
  
    # OK
    class RequestBodyPostWildcardRes < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :data, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('data') } }

      field :headers, T.nilable(T::Hash[Symbol, ::Object]), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('headers') } }


      sig { params(data: T.nilable(::String), headers: T.nilable(T::Hash[Symbol, ::Object])).void }
      def initialize(data: nil, headers: nil)
        @data = data
        @headers = headers
      end
    end
  end
end