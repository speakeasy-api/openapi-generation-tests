"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from .sdkconfiguration import SDKConfiguration
from sdk import utils
from sdk.models import errors, operations, shared
from typing import Optional

class AuthNew:
    r"""Endpoints for testing authentication."""
    sdk_configuration: SDKConfiguration

    def __init__(self, sdk_config: SDKConfiguration) -> None:
        self.sdk_configuration = sdk_config
        
    
    
    def api_key_auth_global_new(self, request: shared.AuthServiceRequestBody, server_url: Optional[str] = None) -> operations.APIKeyAuthGlobalNewResponse:
        base_url = utils.template_url(operations.API_KEY_AUTH_GLOBAL_NEW_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#apiKeyAuthGlobal'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        if callable(self.sdk_configuration.security):
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security())
        else:
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.APIKeyAuthGlobalNewResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def auth_global(self, request: shared.AuthServiceRequestBody, server_url: Optional[str] = None) -> operations.AuthGlobalResponse:
        base_url = utils.template_url(operations.AUTH_GLOBAL_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#authGlobal'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        if callable(self.sdk_configuration.security):
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security())
        else:
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.AuthGlobalResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def basic_auth_new(self, request: shared.AuthServiceRequestBody, security: operations.BasicAuthNewSecurity, server_url: Optional[str] = None) -> operations.BasicAuthNewResponse:
        base_url = utils.template_url(operations.BASIC_AUTH_NEW_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#basicAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.BasicAuthNewResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def multiple_mixed_options_auth(self, request: shared.AuthServiceRequestBody, security: operations.MultipleMixedOptionsAuthSecurity, server_url: Optional[str] = None) -> operations.MultipleMixedOptionsAuthResponse:
        base_url = utils.template_url(operations.MULTIPLE_MIXED_OPTIONS_AUTH_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#multipleMixedOptionsAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.MultipleMixedOptionsAuthResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def multiple_mixed_scheme_auth(self, request: shared.AuthServiceRequestBody, security: operations.MultipleMixedSchemeAuthSecurity, server_url: Optional[str] = None) -> operations.MultipleMixedSchemeAuthResponse:
        base_url = utils.template_url(operations.MULTIPLE_MIXED_SCHEME_AUTH_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#multipleMixedSchemeAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.MultipleMixedSchemeAuthResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def multiple_options_with_mixed_schemes_auth(self, request: shared.AuthServiceRequestBody, security: operations.MultipleOptionsWithMixedSchemesAuthSecurity, server_url: Optional[str] = None) -> operations.MultipleOptionsWithMixedSchemesAuthResponse:
        base_url = utils.template_url(operations.MULTIPLE_OPTIONS_WITH_MIXED_SCHEMES_AUTH_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#multipleOptionsWithMixedSchemesAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.MultipleOptionsWithMixedSchemesAuthResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def multiple_options_with_simple_schemes_auth(self, request: shared.AuthServiceRequestBody, security: operations.MultipleOptionsWithSimpleSchemesAuthSecurity, server_url: Optional[str] = None) -> operations.MultipleOptionsWithSimpleSchemesAuthResponse:
        base_url = utils.template_url(operations.MULTIPLE_OPTIONS_WITH_SIMPLE_SCHEMES_AUTH_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#multipleOptionsWithSimpleSchemesAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.MultipleOptionsWithSimpleSchemesAuthResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def multiple_simple_options_auth(self, request: shared.AuthServiceRequestBody, security: operations.MultipleSimpleOptionsAuthSecurity, server_url: Optional[str] = None) -> operations.MultipleSimpleOptionsAuthResponse:
        base_url = utils.template_url(operations.MULTIPLE_SIMPLE_OPTIONS_AUTH_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#multipleSimpleOptionsAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.MultipleSimpleOptionsAuthResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def multiple_simple_scheme_auth(self, request: shared.AuthServiceRequestBody, security: operations.MultipleSimpleSchemeAuthSecurity, server_url: Optional[str] = None) -> operations.MultipleSimpleSchemeAuthResponse:
        base_url = utils.template_url(operations.MULTIPLE_SIMPLE_SCHEME_AUTH_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#multipleSimpleSchemeAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.MultipleSimpleSchemeAuthResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def oauth2_auth_new(self, request: shared.AuthServiceRequestBody, security: operations.Oauth2AuthNewSecurity, server_url: Optional[str] = None) -> operations.Oauth2AuthNewResponse:
        base_url = utils.template_url(operations.OAUTH2_AUTH_NEW_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#oauth2Auth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.Oauth2AuthNewResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def open_id_connect_auth_new(self, request: shared.AuthServiceRequestBody, security: operations.OpenIDConnectAuthNewSecurity, server_url: Optional[str] = None) -> operations.OpenIDConnectAuthNewResponse:
        base_url = utils.template_url(operations.OPEN_ID_CONNECT_AUTH_NEW_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/auth#openIdConnectAuth'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", False, False, 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.OpenIDConnectAuthNewResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    