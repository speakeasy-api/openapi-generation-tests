# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# typed: true
# frozen_string_literal: true

require 'sorbet-runtime'
require 'faraday'

module OpenApiSDK
  module Shared
    # A set of strings with format values that lead to relevant examples being generated for them
    class FakerFormattedStrings < OpenApiSDK::Utils::FieldAugmented
      extend T::Sig

      # A field that will have an address generated as example
      field :address_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('addressFormat') } }
      # A field that will have a directory path generated as example
      field :directory_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('directoryFormat') } }
      # A field that will have a domain name generated as example
      field :domain_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('domainFormat') } }
      # A field that will have an email address generated as example
      field :email_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('emailFormat') } }
      # A field that will have a filename generated as example
      field :filename_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('filenameFormat') } }
      # A field that will have a file path generated as example
      field :filepath_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('filepathFormat') } }
      # A field that will have a image url generated as example
      field :image_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('imageFormat') } }
      # A field that will have an IPv4 address generated as example
      field :ipv4_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('ipv4Format') } }
      # A field that will have an IPv6 address generated as example
      field :ipv6_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('ipv6Format') } }
      # A field that will have a JSON generated as example
      field :json_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('jsonFormat') } }
      # A field that will have a MAC address generated as example
      field :mac_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('macFormat') } }
      # A field that will have a fake password generated as example
      field :password_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('passwordFormat') } }
      # A field that will have a phone number generated as example
      field :phone_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('phoneFormat') } }
      # A field that will have a timezone generated as example
      field :timezone_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('timezoneFormat') } }
      # A field that will have random words generated as example
      field :unknown_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('unknownFormat') } }
      # A field that will have a URL generated as example
      field :url_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('urlFormat') } }
      # A field that will have a UUID generated as example
      field :uuid_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('uuidFormat') } }
      # A field that will have a postal code generated as example
      field :zipcode_format, T.nilable(String), { 'format_json': { 'letter_case': OpenApiSDK::Utils.field_name('zipcodeFormat') } }


      sig { params(address_format: T.nilable(String), directory_format: T.nilable(String), domain_format: T.nilable(String), email_format: T.nilable(String), filename_format: T.nilable(String), filepath_format: T.nilable(String), image_format: T.nilable(String), ipv4_format: T.nilable(String), ipv6_format: T.nilable(String), json_format: T.nilable(String), mac_format: T.nilable(String), password_format: T.nilable(String), phone_format: T.nilable(String), timezone_format: T.nilable(String), unknown_format: T.nilable(String), url_format: T.nilable(String), uuid_format: T.nilable(String), zipcode_format: T.nilable(String)).void }
      def initialize(address_format: nil, directory_format: nil, domain_format: nil, email_format: nil, filename_format: nil, filepath_format: nil, image_format: nil, ipv4_format: nil, ipv6_format: nil, json_format: nil, mac_format: nil, password_format: nil, phone_format: nil, timezone_format: nil, unknown_format: nil, url_format: nil, uuid_format: nil, zipcode_format: nil)
        @address_format = address_format
        @directory_format = directory_format
        @domain_format = domain_format
        @email_format = email_format
        @filename_format = filename_format
        @filepath_format = filepath_format
        @image_format = image_format
        @ipv4_format = ipv4_format
        @ipv6_format = ipv6_format
        @json_format = json_format
        @mac_format = mac_format
        @password_format = password_format
        @phone_format = phone_format
        @timezone_format = timezone_format
        @unknown_format = unknown_format
        @url_format = url_format
        @uuid_format = uuid_format
        @zipcode_format = zipcode_format
      end
    end
  end
end