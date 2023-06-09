<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use \OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class JsonQueryParamsObjectRequest
{
	#[SpeakeasyMetadata('queryParam:serialization=json,name=deepObjParam')]
    public \OpenAPI\OpenAPI\Models\Shared\DeepObject $deepObjParam;
    
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * 
     * @var \OpenAPI\OpenAPI\Models\Shared\SimpleObject $simpleObjParam
     */
	#[SpeakeasyMetadata('queryParam:serialization=json,name=simpleObjParam')]
    public \OpenAPI\OpenAPI\Models\Shared\SimpleObject $simpleObjParam;
    
	public function __construct()
	{
		$this->deepObjParam = new \OpenAPI\OpenAPI\Models\Shared\DeepObject();
		$this->simpleObjParam = new \OpenAPI\OpenAPI\Models\Shared\SimpleObject();
	}
}
