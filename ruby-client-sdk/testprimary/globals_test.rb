# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# frozen_string_literal: true

require_relative '../lib/openapi'
require 'rack'
module OpenApiSDK
  class TestGlobals < Minitest::Test

    def test_globals_query_parameter_get_uses_global
      record_test('globals-query-parameter-get-uses-global')

      @sdk = OpenApiSDK::SDK.new(global_query_param: 'test')
      refute_nil @sdk

      res = @sdk.globals.globals_query_parameter_get
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      assert_equal(res.res.args.global_query_param, 'test')
    end


    def test_globals_query_parameter_get_uses_local
      record_test('globals-query-parameter-get-uses-local')

      @sdk = OpenApiSDK::SDK.new(global_query_param: 'test')
      refute_nil @sdk

      res = @sdk.globals.globals_query_parameter_get('local')

      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      assert_equal(res.res.args.global_query_param, 'local')
    end

    def test_global_path_parameter_get_uses_global
      record_test('globals-path-parameter-get-uses-global')

      @sdk = OpenApiSDK::SDK.new(global_path_param: 1)
      refute_nil @sdk

      res = @sdk.globals.global_path_parameter_get
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      assert_equal(res.res.url, 'http://localhost:35123/anything/globals/pathParameter/1')
    end

    def test_global_path_parameter_get_uses_local
      record_test('globals-path-parameter-get-uses-local')

      @sdk = OpenApiSDK::SDK.new(global_path_param: 1)
      refute_nil @sdk

      res = @sdk.globals.global_path_parameter_get(2)
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      assert_equal(res.res.url, 'http://localhost:35123/anything/globals/pathParameter/2')
    end
  end
end
