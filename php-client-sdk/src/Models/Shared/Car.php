<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


class Car
{
    /**
     *
     * @var string $vehicleType
     */
    #[\JMS\Serializer\Annotation\SerializedName('vehicleType')]
    public string $vehicleType;

    /**
     *
     * @var string $wheelsType
     */
    #[\JMS\Serializer\Annotation\SerializedName('wheelsType')]
    public string $wheelsType;

    /**
     * @param  string  $vehicleType
     * @param  string  $wheelsType
     */
    public function __construct(string $vehicleType, string $wheelsType)
    {
        $this->vehicleType = $vehicleType;
        $this->wheelsType = $wheelsType;
    }
}