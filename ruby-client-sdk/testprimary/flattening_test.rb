# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# frozen_string_literal: true

require_relative '../lib/openapi'
require 'rack'
module OpenApiSDK
  class TestFlattening < Minitest::Test
    def test_component_body_and_param_no_conflict
      record_test('flattening-component-body-and-param-no-conflict')

      @sdk = OpenApiSDK::SDK.new
      refute_nil @sdk

      obj = create_simple_object

      res = @sdk.flattening.component_body_and_param_no_conflict('param test', obj)
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      refute_nil res.res
      assert_equal(res.res.args['paramStr'], 'param test')
      compare_simple_object(res.res.json, obj)
    end

    def test_component_body_and_param_conflict
      record_test('flattening-component-body-and-param-conflict')

      @sdk = OpenApiSDK::SDK.new
      refute_nil @sdk

      obj = create_simple_object

      res = @sdk.flattening.component_body_and_param_conflict(obj, 'param test')
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      refute_nil res.res
      assert_equal(res.res.args['str'], 'param test')
      compare_simple_object(res.res.json, obj)
    end

    def test_inline_body_and_param_conflict
      record_test('flattening-inline-body-and-param-conflict')

      @sdk = OpenApiSDK::SDK.new
      refute_nil @sdk


      res = @sdk.flattening.inline_body_and_param_conflict(
        Operations::InlineBodyAndParamConflictRequestBody.new(
          str_: 'body test'
        ),
        'param test'
      )
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      refute_nil res.res
      assert_equal(res.res.args['str'], 'param test')
      assert_equal(res.res.json.str_, 'body test')
    end

    def test_inline_body_and_param_no_conflict
      record_test('flattening-inline-body-and-param-no-conflict')

      @sdk = OpenApiSDK::SDK.new
      refute_nil @sdk


      res = @sdk.flattening.inline_body_and_param_no_conflict(
        Operations::InlineBodyAndParamNoConflictRequestBody.new(
          body_str: 'body test'
        ),
        'param test'
      )
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      refute_nil res.res
      assert_equal(res.res.args['paramStr'], 'param test')
      assert_equal(res.res.json.body_str, 'body test')
    end

    def test_conflicting_params
      record_test('flattening-conflicting-params')

      @sdk = OpenApiSDK::SDK.new
      refute_nil @sdk


      res = @sdk.flattening.conflicting_params('pathParam', 'queryParam')
      refute_nil res
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      refute_nil res.res
      assert_match(%r{/pathParam?}, res.res.url)
      assert_equal(res.res.args['str'], 'queryParam')
    end

  end
end
