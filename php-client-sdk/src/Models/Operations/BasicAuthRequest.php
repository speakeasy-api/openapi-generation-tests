<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use \OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class BasicAuthRequest
{
	#[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=passwd')]
    public string $passwd;
    
	#[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=user')]
    public string $user;
    
	public function __construct()
	{
		$this->passwd = "";
		$this->user = "";
	}
}
