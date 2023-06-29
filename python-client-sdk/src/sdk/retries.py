"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from .sdkconfiguration import SDKConfiguration
from sdk import utils
from sdk.models import operations
from typing import Optional

class Retries:
    r"""Endpoints for testing retries."""
    sdk_configuration: SDKConfiguration

    def __init__(self, sdk_config: SDKConfiguration) -> None:
        self.sdk_configuration = sdk_config
        
    
    def retries_get(self, request_id: str, num_retries: Optional[int] = None, retries: Optional[utils.RetryConfig] = None, server_url: Optional[str] = None) -> operations.RetriesGetResponse:
        request = operations.RetriesGetRequest(
            request_id=request_id,
            num_retries=num_retries,
        )
        
        base_url = utils.template_url(operations.RETRIES_GET_SERVERS[0], {
        })
        if server_url is not None:
            base_url = server_url
        
        url = base_url + '/retries'
        headers = {}
        query_params = utils.get_query_params(operations.RetriesGetRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        retry_config = retries
        if retry_config is None:
            retry_config = utils.RetryConfig('backoff', utils.BackoffStrategy(10, 200, 1.5, 1000), True)

        def do_request():
            return client.request('GET', url, params=query_params, headers=headers)
        
        http_res = utils.retry(do_request, utils.Retries(retry_config, [
            '503'
        ]))
        content_type = http_res.headers.get('Content-Type')

        res = operations.RetriesGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.RetriesGetRetries])
                res.retries = out

        return res

    