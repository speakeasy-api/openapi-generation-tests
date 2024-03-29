<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI;

class Unions 
{

	private SDKConfiguration $sdkConfiguration;

	/**
	 * @param SDKConfiguration $sdkConfig
	 */
	public function __construct(SDKConfiguration $sdkConfig)
	{
		$this->sdkConfiguration = $sdkConfig;
	}
	
    /**
     * flattenedTypedObjectPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\FlattenedTypedObjectPostResponse
     */
	public function flattenedTypedObjectPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\FlattenedTypedObjectPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/flattenedTypedObject');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\FlattenedTypedObjectPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\FlattenedTypedObjectPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * mixedTypeOneOfPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\MixedTypeOneOfPostResponse
     */
	public function mixedTypeOneOfPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\MixedTypeOneOfPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/mixedTypeOneOf');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\MixedTypeOneOfPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\MixedTypeOneOfPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * nullableOneOfRefInObjectPost
     * 
     * @param \OpenAPI\OpenAPI\Models\Shared\NullableOneOfRefInObject $request
     * @return \OpenAPI\OpenAPI\Models\Operations\NullableOneOfRefInObjectPostResponse
     */
	public function nullableOneOfRefInObjectPost(
        \OpenAPI\OpenAPI\Models\Shared\NullableOneOfRefInObject $request,
    ): \OpenAPI\OpenAPI\Models\Operations\NullableOneOfRefInObjectPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/nullableOneOfRefInObject');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\NullableOneOfRefInObjectPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\NullableOneOfRefInObjectPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * nullableOneOfSchemaPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\NullableOneOfSchemaPostResponse
     */
	public function nullableOneOfSchemaPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\NullableOneOfSchemaPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/nullableOneOfSchema');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\NullableOneOfSchemaPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\NullableOneOfSchemaPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * nullableOneOfTypeInObjectPost
     * 
     * @param \OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject $request
     * @return \OpenAPI\OpenAPI\Models\Operations\NullableOneOfTypeInObjectPostResponse
     */
	public function nullableOneOfTypeInObjectPost(
        \OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject $request,
    ): \OpenAPI\OpenAPI\Models\Operations\NullableOneOfTypeInObjectPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/nullableOneOfInObject');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\NullableOneOfTypeInObjectPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\NullableOneOfTypeInObjectPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * nullableTypedObjectPost
     * 
     * @param \OpenAPI\OpenAPI\Models\Shared\TypedObject1 $request
     * @return \OpenAPI\OpenAPI\Models\Operations\NullableTypedObjectPostResponse
     */
	public function nullableTypedObjectPost(
        \OpenAPI\OpenAPI\Models\Shared\TypedObject1 $request,
    ): \OpenAPI\OpenAPI\Models\Operations\NullableTypedObjectPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/nullableTypedObject');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\NullableTypedObjectPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\NullableTypedObjectPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * primitiveTypeOneOfPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\PrimitiveTypeOneOfPostResponse
     */
	public function primitiveTypeOneOfPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\PrimitiveTypeOneOfPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/primitiveTypeOneOf');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\PrimitiveTypeOneOfPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\PrimitiveTypeOneOfPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * stronglyTypedOneOfPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\StronglyTypedOneOfPostResponse
     */
	public function stronglyTypedOneOfPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\StronglyTypedOneOfPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/stronglyTypedOneOf');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\StronglyTypedOneOfPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\StronglyTypedOneOfPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * typedObjectNullableOneOfPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\TypedObjectNullableOneOfPostResponse
     */
	public function typedObjectNullableOneOfPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\TypedObjectNullableOneOfPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/typedObjectNullableOneOf');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\TypedObjectNullableOneOfPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\TypedObjectNullableOneOfPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * typedObjectOneOfPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\TypedObjectOneOfPostResponse
     */
	public function typedObjectOneOfPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\TypedObjectOneOfPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/typedObjectOneOf');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\TypedObjectOneOfPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\TypedObjectOneOfPostRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * unionBigIntDecimal
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\UnionBigIntDecimalResponse
     */
	public function unionBigIntDecimal(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\UnionBigIntDecimalResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/unionBigIntDecimal');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\UnionBigIntDecimalResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\UnionBigIntDecimalRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * unionDateNull
     * 
     * @param \DateTime $request
     * @return \OpenAPI\OpenAPI\Models\Operations\UnionDateNullResponse
     */
	public function unionDateNull(
        \DateTime $request,
    ): \OpenAPI\OpenAPI\Models\Operations\UnionDateNullResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/unionDateNull');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\UnionDateNullResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\UnionDateNullRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * unionDateTimeBigInt
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\UnionDateTimeBigIntResponse
     */
	public function unionDateTimeBigInt(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\UnionDateTimeBigIntResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/unionDateTimeBigInt');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\UnionDateTimeBigIntResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\UnionDateTimeBigIntRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * unionDateTimeNull
     * 
     * @param \DateTime $request
     * @return \OpenAPI\OpenAPI\Models\Operations\UnionDateTimeNullResponse
     */
	public function unionDateTimeNull(
        \DateTime $request,
    ): \OpenAPI\OpenAPI\Models\Operations\UnionDateTimeNullResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/unionDateTimeNull');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\UnionDateTimeNullResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\UnionDateTimeNullRes', 'json');
            }
        }

        return $response;
    }
	
    /**
     * weaklyTypedOneOfPost
     * 
     * @param mixed $request
     * @return \OpenAPI\OpenAPI\Models\Operations\WeaklyTypedOneOfPostResponse
     */
	public function weaklyTypedOneOfPost(
        mixed $request,
    ): \OpenAPI\OpenAPI\Models\Operations\WeaklyTypedOneOfPostResponse
    {
        $baseUrl = Utils\Utils::templateUrl($this->sdkConfiguration->getServerUrl(), $this->sdkConfiguration->getServerDefaults());
        $url = Utils\Utils::generateUrl($baseUrl, '/anything/weaklyTypedOneOf');
        
        $options = ['http_errors' => false];
        $body = Utils\Utils::serializeRequestBody($request, "request", "json");
        if ($body === null) {
            throw new \Exception('Request body is required');
        }
        $options = array_merge_recursive($options, $body);
        $options['headers']['Accept'] = 'application/json';
        $options['headers']['x-speakeasy-user-agent'] = $this->sdkConfiguration->userAgent;
        
        $httpResponse = $this->sdkConfiguration->securityClient->request('POST', $url, $options);
        
        $contentType = $httpResponse->getHeader('Content-Type')[0] ?? '';

        $statusCode = $httpResponse->getStatusCode();

        $response = new \OpenAPI\OpenAPI\Models\Operations\WeaklyTypedOneOfPostResponse();
        $response->statusCode = $statusCode;
        $response->contentType = $contentType;
        $response->rawResponse = $httpResponse;
        
        if ($httpResponse->getStatusCode() === 200) {
            if (Utils\Utils::matchContentType($contentType, 'application/json')) {
                $serializer = Utils\JSON::createSerializer();
                $response->res = $serializer->deserialize((string)$httpResponse->getBody(), 'OpenAPI\OpenAPI\Models\Operations\WeaklyTypedOneOfPostRes', 'json');
            }
        }

        return $response;
    }
}