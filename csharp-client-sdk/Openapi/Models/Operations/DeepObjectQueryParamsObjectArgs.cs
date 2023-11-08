
//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi.Models.Operations
{
    using Newtonsoft.Json;
    using System.Collections.Generic;
    
    public class DeepObjectQueryParamsObjectArgs
    {

        [JsonProperty("objArrParam[arr]")]
        public List<string> ObjArrParamArr { get; set; } = default!;

        [JsonProperty("objParam[any]")]
        public string ObjParamAny { get; set; } = default!;

        [JsonProperty("objParam[bigintStr]")]
        public string? ObjParamBigintStr { get; set; }

        [JsonProperty("objParam[bigint]")]
        public string? ObjParamBigint { get; set; }

        [JsonProperty("objParam[boolOpt]")]
        public string ObjParamBoolOpt { get; set; } = default!;

        [JsonProperty("objParam[bool]")]
        public string ObjParamBool { get; set; } = default!;

        [JsonProperty("objParam[dateTime]")]
        public string ObjParamDateTime { get; set; } = default!;

        [JsonProperty("objParam[date]")]
        public string ObjParamDate { get; set; } = default!;

        [JsonProperty("objParam[decimalStr]")]
        public string? ObjParamDecimalStr { get; set; }

        [JsonProperty("objParam[decimal]")]
        public string? ObjParamDecimal { get; set; }

        [JsonProperty("objParam[enum]")]
        public string ObjParamEnum { get; set; } = default!;

        [JsonProperty("objParam[float32]")]
        public string ObjParamFloat32 { get; set; } = default!;

        [JsonProperty("objParam[int32Enum]")]
        public string ObjParamInt32Enum { get; set; } = default!;

        [JsonProperty("objParam[int32]")]
        public string ObjParamInt32 { get; set; } = default!;

        [JsonProperty("objParam[intEnum]")]
        public string ObjParamIntEnum { get; set; } = default!;

        [JsonProperty("objParam[int]")]
        public string ObjParamInt { get; set; } = default!;

        [JsonProperty("objParam[num]")]
        public string ObjParamNum { get; set; } = default!;

        [JsonProperty("objParam[strOpt]")]
        public string ObjParamStrOpt { get; set; } = default!;

        [JsonProperty("objParam[str]")]
        public string ObjParamStr { get; set; } = default!;
    }
}