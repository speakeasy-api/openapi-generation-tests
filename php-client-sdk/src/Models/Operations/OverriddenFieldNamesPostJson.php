<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class OverriddenFieldNamesPostJson
{
    /**
     *
     * @var int $outInt
     */
    #[\JMS\Serializer\Annotation\SerializedName('int')]
    public int $outInt;

    /**
     *
     * @var string $outStr
     */
    #[\JMS\Serializer\Annotation\SerializedName('str')]
    public string $outStr;

    /**
     * @param  ?int  $outInt
     * @param  ?string  $outStr
     */
    public function __construct(?int $outInt = null, ?string $outStr = null)
    {
        $this->outInt = $outInt;
        $this->outStr = $outStr;
    }
}