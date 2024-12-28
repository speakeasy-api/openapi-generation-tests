# FakerFormattedStrings

A set of strings with format values that lead to relevant examples being generated for them

## Example Usage

```typescript
import { FakerFormattedStrings } from "openapi/sdk/models/shared";
import { RFCDate } from "openapi/sdk/types";

let value: FakerFormattedStrings = {
  addressFormat: "82587 Wolf Lodge",
  dateFormat: new RFCDate("2022-11-02"),
  datetimeFormat: new Date("2022-11-28T11:09:05.244Z"),
  directoryFormat: "/usr/lib",
  domainFormat: "jealous-hello.com",
  emailFormat: "Sabina.Rogahn2@gmail.com",
  filenameFormat: "example.file",
  filepathFormat: "/private/tmp/dense_or_eyeglasses.tiff",
  imageFormat: "https://loremflickr.com/1343/2672?lock=1685286093723958",
  ipv4Format: "76.227.117.57",
  ipv6Format: "70a4:d0c4:06e5:b86e:babc:aaa5:e545:ba90",
  jsonFormat: "{key: 8788639864322055, key1: null, key2: \"<value>\"}",
  macFormat: "2d:cf:c5:36:3b:da",
  passwordFormat: "2XL3CTN_w75iOXx",
  phoneFormat: "364-847-5177",
  timezoneFormat: "Africa/Sao_Tome",
  unknownFormat: "<value>",
  urlFormat: "https://great-impostor.info",
  uuidFormat: "1213d06c-13ba-492c-a22c-55455b35ce91",
  zipcodeFormat: "38751-6829",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `addressFormat`                                                                               | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have an address generated as example                                        |
| `dateFormat`                                                                                  | [RFCDate](../../../types/rfcdate.md)                                                          | :heavy_check_mark:                                                                            | A field that will have RFC3339 formatted datestamp generated as example                       |
| `datetimeFormat`                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | A field that will have RFC3339 formatted timestamp generated as example                       |
| `directoryFormat`                                                                             | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a directory path generated as example                                  |
| `domainFormat`                                                                                | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a domain name generated as example                                     |
| `emailFormat`                                                                                 | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have an email address generated as example                                  |
| `filenameFormat`                                                                              | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a filename generated as example                                        |
| `filepathFormat`                                                                              | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a file path generated as example                                       |
| `imageFormat`                                                                                 | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a image url generated as example                                       |
| `ipv4Format`                                                                                  | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have an IPv4 address generated as example                                   |
| `ipv6Format`                                                                                  | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have an IPv6 address generated as example                                   |
| `jsonFormat`                                                                                  | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a JSON generated as example                                            |
| `macFormat`                                                                                   | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a MAC address generated as example                                     |
| `passwordFormat`                                                                              | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a fake password generated as example                                   |
| `phoneFormat`                                                                                 | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a phone number generated as example                                    |
| `timezoneFormat`                                                                              | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a timezone generated as example                                        |
| `unknownFormat`                                                                               | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have random words generated as example                                      |
| `urlFormat`                                                                                   | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a URL generated as example                                             |
| `uuidFormat`                                                                                  | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a UUID generated as example                                            |
| `zipcodeFormat`                                                                               | *string*                                                                                      | :heavy_check_mark:                                                                            | A field that will have a postal code generated as example                                     |