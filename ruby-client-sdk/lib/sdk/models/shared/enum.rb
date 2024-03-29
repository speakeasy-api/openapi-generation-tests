# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Shared
    # Enum - A string based enum
    class Enum < T::Enum
      enums do
        ONE = new('one')
        TWO = new('two')
        THREE = new('three')
        FOUR_AND_MORE = new('four_and_more')
      end
    end

  end
end
