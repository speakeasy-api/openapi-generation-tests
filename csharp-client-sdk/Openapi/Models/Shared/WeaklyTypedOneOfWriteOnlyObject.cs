
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
    using Newtonsoft.Json.Linq;
    using Newtonsoft.Json;
    using Openapi.Models.Shared;
    using Openapi.Utils;
    using System.Numerics;
    using System;
    

    public class WeaklyTypedOneOfWriteOnlyObjectType
    {
        private WeaklyTypedOneOfWriteOnlyObjectType(string value) { Value = value; }

        public string Value { get; private set; }
        public static WeaklyTypedOneOfWriteOnlyObjectType SimpleObject { get { return new WeaklyTypedOneOfWriteOnlyObjectType("simpleObject"); } }
        
        public static WeaklyTypedOneOfWriteOnlyObjectType WriteOnlyObject { get { return new WeaklyTypedOneOfWriteOnlyObjectType("writeOnlyObject"); } }
        
        public static WeaklyTypedOneOfWriteOnlyObjectType Null { get { return new WeaklyTypedOneOfWriteOnlyObjectType("null"); } } 

        public override string ToString() { return Value; }
        public static implicit operator String(WeaklyTypedOneOfWriteOnlyObjectType v) { return v.Value; }
        public static WeaklyTypedOneOfWriteOnlyObjectType FromString(string v) {
            switch(v) {
                case "simpleObject": return SimpleObject;
                case "writeOnlyObject": return WriteOnlyObject;
                case "null": return Null;
                default: throw new ArgumentException("Invalid value for WeaklyTypedOneOfWriteOnlyObjectType");
            }
        }
        public override bool Equals(object? obj)
        {
            if (obj == null || GetType() != obj.GetType())
            {
                return false;
            }
            return Value.Equals(((WeaklyTypedOneOfWriteOnlyObjectType)obj).Value);
        }

        public override int GetHashCode()
        {
            return Value.GetHashCode();
        }
    }
    

    [JsonConverter(typeof(WeaklyTypedOneOfWriteOnlyObject.WeaklyTypedOneOfWriteOnlyObjectConverter))]
    public class WeaklyTypedOneOfWriteOnlyObject {
        public WeaklyTypedOneOfWriteOnlyObject(WeaklyTypedOneOfWriteOnlyObjectType type) {
            Type = type;
        }
        public SimpleObject? SimpleObject { get; set; } 
        public WriteOnlyObject? WriteOnlyObject { get; set; } 

        public WeaklyTypedOneOfWriteOnlyObjectType Type {get; set; }


        public static WeaklyTypedOneOfWriteOnlyObject CreateSimpleObject(SimpleObject simpleObject) {
            WeaklyTypedOneOfWriteOnlyObjectType typ = WeaklyTypedOneOfWriteOnlyObjectType.SimpleObject;

            WeaklyTypedOneOfWriteOnlyObject res = new WeaklyTypedOneOfWriteOnlyObject(typ);
            res.SimpleObject = simpleObject;
            return res;
        }

        public static WeaklyTypedOneOfWriteOnlyObject CreateWriteOnlyObject(WriteOnlyObject writeOnlyObject) {
            WeaklyTypedOneOfWriteOnlyObjectType typ = WeaklyTypedOneOfWriteOnlyObjectType.WriteOnlyObject;

            WeaklyTypedOneOfWriteOnlyObject res = new WeaklyTypedOneOfWriteOnlyObject(typ);
            res.WriteOnlyObject = writeOnlyObject;
            return res;
        }

        public static WeaklyTypedOneOfWriteOnlyObject CreateNull() {
            WeaklyTypedOneOfWriteOnlyObjectType typ = WeaklyTypedOneOfWriteOnlyObjectType.Null;
            return new WeaklyTypedOneOfWriteOnlyObject(typ);
        }

        public class WeaklyTypedOneOfWriteOnlyObjectConverter : JsonConverter
        {

            public override bool CanConvert(System.Type objectType) => objectType == typeof(WeaklyTypedOneOfWriteOnlyObject);

            public override bool CanRead => true;

            public override object? ReadJson(JsonReader reader, System.Type objectType, object? existingValue, JsonSerializer serializer)
            { 
                var json = JRaw.Create(reader).ToString();

                if (json == "null") {
                    return null;
                }
                try
                {
                    WriteOnlyObject? writeOnlyObject = JsonConvert.DeserializeObject<WriteOnlyObject>(json, new JsonSerializerSettings(){ NullValueHandling = NullValueHandling.Ignore, MissingMemberHandling = MissingMemberHandling.Error, Converters = Utilities.GetJsonConverters(typeof(WriteOnlyObject), "string")});
                    return new WeaklyTypedOneOfWriteOnlyObject(WeaklyTypedOneOfWriteOnlyObjectType.WriteOnlyObject) {
                        WriteOnlyObject = writeOnlyObject
                    };
                }
                catch (Exception ex)
                {
                    if (!(ex is Newtonsoft.Json.JsonReaderException || ex is Newtonsoft.Json.JsonSerializationException)) {
                        throw ex;
                    }
                }
                try
                {
                    SimpleObject? simpleObject = JsonConvert.DeserializeObject<SimpleObject>(json, new JsonSerializerSettings(){ NullValueHandling = NullValueHandling.Ignore, MissingMemberHandling = MissingMemberHandling.Error, Converters = Utilities.GetJsonConverters(typeof(SimpleObject), "string")});
                    return new WeaklyTypedOneOfWriteOnlyObject(WeaklyTypedOneOfWriteOnlyObjectType.SimpleObject) {
                        SimpleObject = simpleObject
                    };
                }
                catch (Exception ex)
                {
                    if (!(ex is Newtonsoft.Json.JsonReaderException || ex is Newtonsoft.Json.JsonSerializationException)) {
                        throw ex;
                    }
                }

                throw new InvalidOperationException("Could not deserialize into any supported types.");
            }

            public override void WriteJson(JsonWriter writer, object? value, JsonSerializer serializer)
            {
                if (value == null) {
                    writer.WriteRawValue("null");
                    return;
                }
                WeaklyTypedOneOfWriteOnlyObject res = (WeaklyTypedOneOfWriteOnlyObject)value;
                if (WeaklyTypedOneOfWriteOnlyObjectType.FromString(res.Type).Equals(WeaklyTypedOneOfWriteOnlyObjectType.Null))
                {
                    writer.WriteRawValue("null");
                    return;
                }
                if (res.SimpleObject != null)
                {
                    writer.WriteRawValue(Utilities.SerializeJSON(res.SimpleObject));
                    return;
                }
                if (res.WriteOnlyObject != null)
                {
                    writer.WriteRawValue(Utilities.SerializeJSON(res.WriteOnlyObject));
                    return;
                }

            }
        }

    }


}