
//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi.Models.Shared
{
    using Newtonsoft.Json;
    using System.Collections.Generic;
    
    public class MapObjValue
    {

        [JsonProperty("json")]
        public Dictionary<string, SimpleObject>? Json { get; set; }

        [JsonProperty("required")]
        public object? Required { get; set; }
    }
}