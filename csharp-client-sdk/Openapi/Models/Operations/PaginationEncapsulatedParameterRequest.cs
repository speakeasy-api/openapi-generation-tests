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
    
    public class PaginationEncapsulatedParameterRequest
    {

        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")]
        public long? Cursor { get; set; }

        [SpeakeasyMetadata("header:style=simple,explode=false,name=headerParam")]
        public string? HeaderParam { get; set; }
    }
}