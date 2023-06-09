"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from .sdkconfiguration import SDKConfiguration
from sdk import utils
from sdk.models import operations
from typing import Optional

class Globals:
    r"""Endpoints for testing global parameters."""
    sdk_configuration: SDKConfiguration

    def __init__(self, sdk_config: SDKConfiguration) -> None:
        self.sdk_configuration = sdk_config
        
    
    def global_path_parameter_get(self, global_path_param: Optional[int] = None) -> operations.GlobalPathParameterGetResponse:
        request = operations.GlobalPathParameterGetRequest(
            global_path_param=global_path_param,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = utils.generate_url(operations.GlobalPathParameterGetRequest, base_url, '/anything/globals/pathParameter/{globalPathParam}', request, self.sdk_configuration.globals)
        headers = {}
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.GlobalPathParameterGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.GlobalPathParameterGetRes])
                res.res = out

        return res

    
    def globals_query_parameter_get(self, global_query_param: Optional[str] = None) -> operations.GlobalsQueryParameterGetResponse:
        request = operations.GlobalsQueryParameterGetRequest(
            global_query_param=global_query_param,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/globals/queryParameter'
        headers = {}
        query_params = utils.get_query_params(operations.GlobalsQueryParameterGetRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, params=query_params, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.GlobalsQueryParameterGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.GlobalsQueryParameterGetRes])
                res.res = out

        return res

    