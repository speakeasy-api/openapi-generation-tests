<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class PaginationWrappedOptionalBodyRequest
{
    /**
     *
     * @var ?string $idempotencyKey
     */
    #[SpeakeasyMetadata('header:style=simple,explode=false,name=idempotency-key')]
    public ?string $idempotencyKey = null;

    /**
     *
     * @var ?Shared\LimitOffsetConfig $limitOffsetConfig
     */
    #[SpeakeasyMetadata('request:mediaType=application/json')]
    public ?Shared\LimitOffsetConfig $limitOffsetConfig = null;

    /**
     *
     * @var ?string $requestId
     */
    #[SpeakeasyMetadata('header:style=simple,explode=false,name=request-id')]
    public ?string $requestId = null;

    /**
     * @param  ?string  $idempotencyKey
     * @param  ?Shared\LimitOffsetConfig  $limitOffsetConfig
     * @param  ?string  $requestId
     */
    public function __construct(?string $idempotencyKey = null, ?Shared\LimitOffsetConfig $limitOffsetConfig = null, ?string $requestId = null)
    {
        $this->idempotencyKey = $idempotencyKey;
        $this->limitOffsetConfig = $limitOffsetConfig;
        $this->requestId = $requestId;
    }
}