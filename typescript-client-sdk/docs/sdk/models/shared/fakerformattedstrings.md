# FakerFormattedStrings

A set of strings with format values that lead to relevant examples being generated for them

## Example Usage

```typescript
import { FakerFormattedStrings } from "openapi/sdk/models/shared";
import { RFCDate } from "openapi/sdk/types";

let value: FakerFormattedStrings = {
  addressFormat: "9919 Alena Village",
  dateFormat: new RFCDate("2024-11-20"),
  datetimeFormat: new Date("2022-06-11T09:12:10.015Z"),
  directoryFormat: "/opt/share",
  domainFormat: "majestic-strategy.name",
  emailFormat: "Jazmyne_Rice0@hotmail.com",
  filenameFormat: "example.file",
  filepathFormat: "/opt/judicious.epub",
  imageFormat: "https://picsum.photos/seed/iVlEh6v/1142/3256",
  ipv4Format: "236.158.53.174",
  ipv6Format: "a7cf:3f9f:4a30:589d:d9fd:7fad:d8c5:dfc8",
  jsonFormat: "{key: 859109835392719, key1: null, key2: \"<value>\"}",
  macFormat: "f6:45:7f:f4:58:02",
  passwordFormat: "yHfs6VfiDdvDTUe",
  phoneFormat: "(688) 756-0486 x920",
  timezoneFormat: "Asia/Phnom_Penh",
  unknownFormat: "<value>",
  urlFormat: "https://speedy-discourse.name/",
  uuidFormat: "cc7f744b-6604-4dcb-b004-7e649ebd228b",
  zipcodeFormat: "35657",
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