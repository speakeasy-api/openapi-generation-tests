
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
    
    public class SimplePathParameterPrimitivesRequest
    {

        [SpeakeasyMetadata("pathParam:style=simple,explode=false,name=boolParam")]
        public bool BoolParam { get; set; } = default!;

        [SpeakeasyMetadata("pathParam:style=simple,explode=false,name=intParam")]
        public long IntParam { get; set; } = default!;

        [SpeakeasyMetadata("pathParam:style=simple,explode=false,name=numParam")]
        public double NumParam { get; set; } = default!;

        [SpeakeasyMetadata("pathParam:style=simple,explode=false,name=strParam")]
        public string StrParam { get; set; } = default!;
    }
}