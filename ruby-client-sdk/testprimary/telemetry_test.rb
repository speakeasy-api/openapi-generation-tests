# Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

# frozen_string_literal: true

require_relative '../lib/openapi'
require 'rack'
module OpenApiSDK
  class TestTelmetry < Minitest::Test
    def setup
      @sdk = OpenApiSDK::SDK.new
    end

    def test_telemetry_user_agent_get
      record_test('telemetry-user-agent-get')

      res = @sdk.telemetry.telemetry_user_agent_get

      refute_nil(res)
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      assert_equal('speakeasy-sdk/ruby 2.1.1 2.188.3 0.1.0 openapi', res.res.headers['X-Speakeasy-User-Agent'])

    end

    def test_telemetry_speakeasy_user_agent_get
      record_test('telemetry-speakeasy-user-agent-get')

      user_agent = 'test user agent'

      res = @sdk.telemetry.telemetry_speakeasy_user_agent_get(user_agent)

      refute_nil(res)
      assert_equal(Rack::Utils.status_code(:ok), res.status_code)
      assert_equal(user_agent, res.res.headers['User-Agent'])
      assert_equal('speakeasy-sdk/ruby 2.1.1 2.188.3 0.1.0 openapi', res.res.headers['X-Speakeasy-User-Agent'])

    end
  end
end
