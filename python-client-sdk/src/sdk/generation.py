"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from .sdkconfiguration import SDKConfiguration
from datetime import date
from sdk import utils
from sdk.models import operations, shared
from typing import Optional

class Generation:
    r"""Endpoints for purely testing valid generation behavior."""
    sdk_configuration: SDKConfiguration

    def __init__(self, sdk_config: SDKConfiguration) -> None:
        self.sdk_configuration = sdk_config
        
    
    def anchor_types_get(self) -> operations.AnchorTypesGetResponse:
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/anchorTypes'
        headers = {}
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.AnchorTypesGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.TypeFromAnchor])
                res.type_from_anchor = out

        return res

    
    def circular_reference_get(self) -> operations.CircularReferenceGetResponse:
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/circularReference'
        headers = {}
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.CircularReferenceGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[shared.ValidCircularReferenceObject])
                res.valid_circular_reference_object = out

        return res

    
    def deprecated_in_schema_with_comments_get(self, request: shared.ObjectWithDeprecatedField) -> operations.DeprecatedInSchemaWithCommentsGetResponse:
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/deprecatedInSchemaWithComments'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request", 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        if data is None and form is None:
            raise Exception('request body is required')
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('POST', url, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.DeprecatedInSchemaWithCommentsGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        

        return res

    
    def deprecated_no_comments_get(self, deprecated_parameter: Optional[str] = None) -> operations.DeprecatedNoCommentsGetResponse:
        r"""Deprecated: this method will be removed in a future release, please migrate away from it as soon as possible"""
        request = operations.DeprecatedNoCommentsGetRequest(
            deprecated_parameter=deprecated_parameter,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/deprecatedNoComments'
        headers = {}
        query_params = utils.get_query_params(operations.DeprecatedNoCommentsGetRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, params=query_params, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.DeprecatedNoCommentsGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        

        return res

    
    def deprecated_with_comments_get(self, deprecated_parameter: Optional[str] = None, new_parameter: Optional[str] = None) -> operations.DeprecatedWithCommentsGetResponse:
        r"""This is an endpoint setup to test deprecation with comments

        Deprecated: this method will be removed in a future release, please migrate away from it as soon as possible. Use simple_path_parameter_objects instead
        """
        request = operations.DeprecatedWithCommentsGetRequest(
            deprecated_parameter=deprecated_parameter,
            new_parameter=new_parameter,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/deprecatedWithComments'
        headers = {}
        query_params = utils.get_query_params(operations.DeprecatedWithCommentsGetRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, params=query_params, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.DeprecatedWithCommentsGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        

        return res

    
    def empty_object_get(self, empty_object: shared.EmptyObjectParam) -> operations.EmptyObjectGetResponse:
        request = operations.EmptyObjectGetRequest(
            empty_object=empty_object,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = utils.generate_url(operations.EmptyObjectGetRequest, base_url, '/anything/{emptyObject}', request, self.sdk_configuration.globals)
        headers = {}
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.EmptyObjectGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        

        return res

    
    def empty_response_object_with_comment_get(self) -> operations.EmptyResponseObjectWithCommentGetResponse:
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/emptyResponseObjectWithComment'
        headers = {}
        headers['Accept'] = 'application/octet-stream'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.EmptyResponseObjectWithCommentGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/octet-stream'):
                res.body = http_res.content

        return res

    
    def global_name_overridden(self) -> operations.GetGlobalNameOverrideResponse:
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/globalNameOverride'
        headers = {}
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.GetGlobalNameOverrideResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.GetGlobalNameOverride200ApplicationJSON])
                res.get_global_name_override_200_application_json_object = out

        return res

    
    def ignored_generation_get(self) -> operations.IgnoredGenerationGetResponse:
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/ignoredGeneration'
        headers = {}
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.IgnoredGenerationGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.IgnoredGenerationGet200ApplicationJSON])
                res.ignored_generation_get_200_application_json_object = out

        return res

    
    def ignores_post(self, request_body: Optional[operations.IgnoresPostApplicationJSON] = None, test_param: Optional[str] = None) -> operations.IgnoresPostResponse:
        request = operations.IgnoresPostRequest(
            request_body=request_body,
            test_param=test_param,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/ignores'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request_body", 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        query_params = utils.get_query_params(operations.IgnoresPostRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('POST', url, params=query_params, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.IgnoresPostResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[shared.HTTPBinSimpleJSONObject])
                res.http_bin_simple_json_object = out

        return res

    
    def name_override(self, test_query_param: str) -> operations.NameOverrideGetResponse:
        request = operations.NameOverrideGetRequest(
            test_query_param=test_query_param,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/nameOverride'
        headers = {}
        query_params = utils.get_query_params(operations.NameOverrideGetRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, params=query_params, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.NameOverrideGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.OverriddenResponse])
                res.overridden_response = out

        return res

    
    def typed_parameter_generation_get(self, bigint: Optional[int] = None, date_: Optional[date] = None, obj: Optional[operations.TypedParameterGenerationGetObj] = None) -> operations.TypedParameterGenerationGetResponse:
        request = operations.TypedParameterGenerationGetRequest(
            bigint=bigint,
            date_=date_,
            obj=obj,
        )
        
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/typedParameterGeneration'
        headers = {}
        query_params = utils.get_query_params(operations.TypedParameterGenerationGetRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = '*/*'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = self.sdk_configuration.security_client
        
        http_res = client.request('GET', url, params=query_params, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.TypedParameterGenerationGetResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        

        return res

    
    def usage_example_post(self, request: operations.UsageExamplePostRequest, security: operations.UsageExamplePostSecurity) -> operations.UsageExamplePostResponse:
        r"""An operation used for testing usage examples
        An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly
        https://docs.example.com - Usage example docs
        """
        base_url = utils.template_url(*self.sdk_configuration.get_server_details())
        
        url = base_url + '/anything/usageExample'
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request, "request_body", 'json')
        if req_content_type not in ('multipart/form-data', 'multipart/mixed'):
            headers['content-type'] = req_content_type
        query_params = utils.get_query_params(operations.UsageExamplePostRequest, request, self.sdk_configuration.globals)
        headers['Accept'] = 'application/json'
        headers['x-speakeasy-user-agent'] = f'speakeasy-sdk/{self.sdk_configuration.language} {self.sdk_configuration.sdk_version} {self.sdk_configuration.gen_version} {self.sdk_configuration.openapi_doc_version}'
        
        client = utils.configure_security_client(self.sdk_configuration.client, security)
        
        http_res = client.request('POST', url, params=query_params, data=data, files=form, headers=headers)
        content_type = http_res.headers.get('Content-Type')

        res = operations.UsageExamplePostResponse(status_code=http_res.status_code, content_type=content_type, raw_response=http_res)
        
        if http_res.status_code == 200:
            if utils.match_content_type(content_type, 'application/json'):
                out = utils.unmarshal_json(http_res.text, Optional[operations.UsageExamplePost200ApplicationJSON])
                res.usage_example_post_200_application_json_object = out

        return res

    