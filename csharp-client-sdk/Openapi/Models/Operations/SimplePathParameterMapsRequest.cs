
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
    
    public class SimplePathParameterMapsRequest
    {

        [SpeakeasyMetadata("pathParam:style=simple,explode=false,name=mapParam")]
        public Dictionary<string, string> MapParam { get; set; } = default!;

        [SpeakeasyMetadata("pathParam:style=simple,explode=true,name=mapParamExploded")]
        public Dictionary<string, long> MapParamExploded { get; set; } = default!;
    }
}