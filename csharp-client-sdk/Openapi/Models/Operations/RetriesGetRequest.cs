
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
    
    public class RetriesGetRequest
    {

        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=request-id")]
        public string RequestId { get; set; } = default!;

        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=num-retries")]
        public long? NumRetries { get; set; }
    }
}