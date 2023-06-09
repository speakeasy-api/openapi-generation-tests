<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use \OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class DeepObjectQueryParamsMapRequest
{
    /**
     * $mapParam
     * 
     * @var array<string, string> $mapParam
     */
	#[SpeakeasyMetadata('queryParam:style=deepObject,explode=true,name=mapParam')]
    public array $mapParam;
    
    /**
     * $mapArrParam
     * 
     * @var ?array<string, array<string>> $mapArrParam
     */
	#[SpeakeasyMetadata('queryParam:style=deepObject,explode=true,name=mapArrParam')]
    public ?array $mapArrParam = null;
    
	public function __construct()
	{
		$this->mapParam = [];
		$this->mapArrParam = null;
	}
}
