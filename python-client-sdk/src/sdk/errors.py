"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from .sdkconfiguration import SDKConfiguration
from sdk import utils
from sdk.models import errors, operations
from typing import Optional

class Errors:
    r"""Endpoints for testing error responses."""
    sdk_configuration: SDKConfiguration

    def __init__(self, sdk_config: SDKConfiguration) -> None:
        self.sdk_configuration = sdk_config
        
    
    
    def connection_error_get(self, server_url: Optional[str] = None) -> operations.ConnectionErrorGetResponse:
        base_url = utils.template_url(operations.CONNECTION_ERROR_GET_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/anything/connectionError'
        headers = {}
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        if callable(self.sdk_configuration.security):
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security())
        else:
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security)
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.ConnectionErrorGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            pass
        elif http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def status_get_error(self, status_code: int) -> operations.StatusGetErrorResponse:
        request = operations.StatusGetErrorRequest(
            status_code=status_code,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = utils.generate_url(operations.StatusGetErrorRequest, base_url, '/status/{statusCode}', request, self.sdk_configuration.globals)
        headers = {}
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        if callable(self.sdk_configuration.security):
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security())
        else:
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security)
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.StatusGetErrorResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code in [200, 300]:
            pass
        elif http_res.status_code == 400 or http_res.status_code >= 400 and http_res.status_code < 500 or http_res.status_code == 500 or http_res.status_code >= 500 and http_res.status_code < 600:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)

        return res

    
    
    def status_get_x_speakeasy_errors(self, status_code: int, server_url: Optional[str] = None) -> operations.StatusGetXSpeakeasyErrorsResponse:
        request = operations.StatusGetXSpeakeasyErrorsRequest(
            status_code=status_code,
        )
        
        base_url = utils.template_url(operations.STATUS_GET_X_SPEAKEASY_ERRORS_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = utils.generate_url(operations.StatusGetXSpeakeasyErrorsRequest, base_url, '/errors/{statusCode}', request, self.sdk_configuration.globals)
        headers = {}
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = self.sdk_configuration.user_agent
        
        if callable(self.sdk_configuration.security):
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security())
        else:
            client = utils.configure_security_client(self.sdk_configuration.client, self.sdk_configuration.security)
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.StatusGetXSpeakeasyErrorsResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code in [200, 300]:
            pass
        elif http_res.status_code == 400 or http_res.status_code == 401 or http_res.status_code >= 400 and http_res.status_code < 500:
            raise errors.SDKError('API error occurred', http_res.status_code, http_res.text, http_res)
        elif http_res.status_code == 500:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, errors.Error)
                out.raw_response = http_res
                raise out
            else:
                raise errors.SDKError(f'unknown content-type received: {content_type}', http_res.status_code, http_res.text, http_res)
        elif http_res.status_code == 501:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, errors.StatusGetXSpeakeasyErrorsResponseBody)
                out.raw_response = http_res
                raise out
            else:
                raise errors.SDKError(f'unknown content-type received: {content_type}', http_res.status_code, http_res.text, http_res)

        return res

    