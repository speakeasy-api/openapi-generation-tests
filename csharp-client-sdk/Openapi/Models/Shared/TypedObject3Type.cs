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
    using Openapi.Utils;
    using System;
    
    public enum TypedObject3Type
    {
        [JsonProperty("obj3")]
        Obj3,
    }

    public static class TypedObject3TypeExtension
    {
        public static string Value(this TypedObject3Type value)
        {
            return ((JsonPropertyAttribute)value.GetType().GetMember(value.ToString())[0].GetCustomAttributes(typeof(JsonPropertyAttribute), false)[0]).PropertyName ?? value.ToString();
        }

        public static TypedObject3Type ToEnum(this string value)
        {
            foreach(var field in typeof(TypedObject3Type).GetFields())
            {
                var attributes = field.GetCustomAttributes(typeof(JsonPropertyAttribute), false);
                if (attributes.Length == 0)
                {
                    continue;
                }

                var attribute = attributes[0] as JsonPropertyAttribute;
                if (attribute != null && attribute.PropertyName == value)
                {
                    var enumVal = field.GetValue(null);

                    if (enumVal is TypedObject3Type)
                    {
                        return (TypedObject3Type)enumVal;
                    }
                }
            }

            throw new Exception($"Unknown value {value} for enum TypedObject3Type");
        }
    }

}