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
    using Openapi.Utils;
    
    public class PaginationBodyFlattenedWithSecurityRequest
    {

        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")]
        public long Limit { get; set; } = default!;

        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")]
        public long Offset { get; set; } = default!;
    }
}