<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use OpenAPI\OpenAPI\Models\Shared;
class CircularReferenceOneDegreeResponseBody
{
    /**
     *
     * @var Shared\FigmaComponentNode $json
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('json')]
    #[\Speakeasy\Serializer\Annotation\Type('\OpenAPI\OpenAPI\Models\Shared\FigmaComponentNode')]
    public Shared\FigmaComponentNode $json;

    /**
     * @param  Shared\FigmaComponentNode  $json
     */
    public function __construct(Shared\FigmaComponentNode $json)
    {
        $this->json = $json;
    }
}