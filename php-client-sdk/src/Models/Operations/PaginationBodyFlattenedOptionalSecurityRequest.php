<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class PaginationBodyFlattenedOptionalSecurityRequest
{
    /**
     *
     * @var int $limit
     */
    #[SpeakeasyMetadata('queryParam:style=form,explode=true,name=limit')]
    public int $limit;

    /**
     *
     * @var int $offset
     */
    #[SpeakeasyMetadata('queryParam:style=form,explode=true,name=offset')]
    public int $offset;

    /**
     * @param  int  $limit
     * @param  int  $offset
     */
    public function __construct(int $limit, int $offset)
    {
        $this->limit = $limit;
        $this->offset = $offset;
    }
}