
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
    
    public class PipeDelimitedQueryParamsArrayArgs
    {

        [JsonProperty("arrParam")]
        public string ArrParam { get; set; } = default!;

        [JsonProperty("arrParamExploded")]
        public List<string> ArrParamExploded { get; set; } = default!;
    }
}