# Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

# typed: true
# frozen_string_literal: true


module OpenApiSDK
  module Operations
    PAGINATION_LIMIT_OFFSET_OPTIONAL_PAGE_PARAMS_RES_SERVERS = [
      'http://localhost:35456'
    ].freeze
  
    # OK
    class PaginationLimitOffsetOptionalPageParamsRes < ::OpenApiSDK::Utils::FieldAugmented
      extend T::Sig


      field :num_pages, ::Integer, { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('numPages') } }

      field :result_array, T::Array[::Integer], { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('resultArray') } }

      field :next_, T.nilable(::String), { 'format_json': { 'letter_case': ::OpenApiSDK::Utils.field_name('next') } }


      sig { params(num_pages: ::Integer, result_array: T::Array[::Integer], next_: T.nilable(::String)).void }
      def initialize(num_pages: nil, result_array: nil, next_: nil)
        @num_pages = num_pages
        @result_array = result_array
        @next_ = next_
      end
    end
  end
end