//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi.Models.Operations
{
    using Newtonsoft.Json;
    using Openapi.Models.Operations;
    using Openapi.Utils;
    using System.Collections.Generic;
    
    /// <summary>
    /// OK
    /// </summary>
    public class PaginationLimitOffsetDeepOutputsPageBodyRes
    {

        [JsonProperty("pageInfo")]
        public PageInfo PageInfo { get; set; } = default!;

        [JsonProperty("resultArray")]
        public List<long> ResultArray { get; set; } = default!;
    }
}