
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
    using Openapi.Utils;
    using System.Collections.Generic;
    
    public class DeepObjectQueryParamsMapRequest
    {

        [SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=mapParam")]
        public Dictionary<string, string> MapParam { get; set; } = default!;

        [SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=mapArrParam")]
        public Dictionary<string, List<string>>? MapArrParam { get; set; }
    }
}