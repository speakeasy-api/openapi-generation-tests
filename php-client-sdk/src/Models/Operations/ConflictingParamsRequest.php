<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use \OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class ConflictingParamsRequest
{
	#[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=str')]
    public string $strPathParameter;
    
	#[SpeakeasyMetadata('queryParam:style=form,explode=true,name=str')]
    public string $strQueryParameter;
    
	public function __construct()
	{
		$this->strPathParameter = "";
		$this->strQueryParameter = "";
	}
}
