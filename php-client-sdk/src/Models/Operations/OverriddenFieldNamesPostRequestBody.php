<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class OverriddenFieldNamesPostRequestBody
{
    /**
     *
     * @var ?int $inInt
     */
    #[\JMS\Serializer\Annotation\SerializedName('int')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?int $inInt = null;

    /**
     *
     * @var ?string $inStr
     */
    #[\JMS\Serializer\Annotation\SerializedName('str')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $inStr = null;

    /**
     * @param  ?int  $inInt
     * @param  ?string  $inStr
     */
    public function __construct(?int $inInt = null, ?string $inStr = null)
    {
        $this->inInt = $inInt;
        $this->inStr = $inStr;
    }
}