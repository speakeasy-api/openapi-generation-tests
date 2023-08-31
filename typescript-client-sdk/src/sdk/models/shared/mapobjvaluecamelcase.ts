/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { objectToClass, SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { SimpleObjectCamelCase } from "./simpleobjectcamelcase";
import { Expose, Transform } from "class-transformer";

/**
 * OK
 */
export class MapObjValueCamelCase extends SpeakeasyBase {
    @SpeakeasyMetadata({ elemType: SimpleObjectCamelCase })
    @Expose({ name: "json" })
    @Transform(
        ({ value }) => {
            const obj: Record<string, SimpleObjectCamelCase> = {};
            for (const key in value) {
                obj[key] = objectToClass(value[key], SimpleObjectCamelCase);
            }
            return obj;
        },
        { toClassOnly: true }
    )
    json?: Record<string, SimpleObjectCamelCase>;

    @SpeakeasyMetadata()
    @Expose({ name: "required" })
    required?: any;
}