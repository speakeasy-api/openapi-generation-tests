/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { catchUnrecognizedEnum, OpenEnum, Unrecognized } from "../../types";
import * as z from "zod";

export enum Color {
    Red = "red",
    Green = "green",
    Blue = "blue",
}
export type ColorOpen = OpenEnum<typeof Color>;

export enum HeroWidth {
    FourHundredAndEighty = 480,
    SevenHundredAndTwenty = 720,
    OneThousandAndEighty = 1080,
}
export type HeroWidthOpen = OpenEnum<typeof HeroWidth>;

export enum Icon {
    Tick = "tick",
    ThumbsUp = "thumbs-up",
    Fire = "fire",
}

export type Theme = {
    color?: ColorOpen | undefined;
    heroWidth?: HeroWidthOpen | undefined;
    icon?: Icon | undefined;
};

/** @internal */
export namespace Color$ {
    export const inboundSchema: z.ZodType<ColorOpen, z.ZodTypeDef, unknown> = z.union([
        z.nativeEnum(Color),
        z.string().transform(catchUnrecognizedEnum),
    ]);

    export const outboundSchema = z.union([
        z.nativeEnum(Color),
        z.string().and(z.custom<Unrecognized<string>>()),
    ]);
}

/** @internal */
export namespace HeroWidth$ {
    export const inboundSchema: z.ZodType<HeroWidthOpen, z.ZodTypeDef, unknown> = z.union([
        z.nativeEnum(HeroWidth),
        z.number().transform(catchUnrecognizedEnum),
    ]);

    export const outboundSchema = z.union([
        z.nativeEnum(HeroWidth),
        z.number().and(z.custom<Unrecognized<number>>()),
    ]);
}

/** @internal */
export namespace Icon$ {
    export const inboundSchema = z.nativeEnum(Icon);
    export const outboundSchema = inboundSchema;
}

/** @internal */
export namespace Theme$ {
    export const inboundSchema: z.ZodType<Theme, z.ZodTypeDef, unknown> = z
        .object({
            color: Color$.inboundSchema.default(Color.Blue),
            heroWidth: HeroWidth$.inboundSchema.optional(),
            icon: Icon$.inboundSchema.optional(),
        })
        .transform((v) => {
            return {
                color: v.color,
                ...(v.heroWidth === undefined ? null : { heroWidth: v.heroWidth }),
                ...(v.icon === undefined ? null : { icon: v.icon }),
            };
        });

    export type Outbound = {
        color: string;
        heroWidth?: number | undefined;
        icon?: string | undefined;
    };

    export const outboundSchema: z.ZodType<Outbound, z.ZodTypeDef, Theme> = z
        .object({
            color: Color$.outboundSchema.default(Color.Blue),
            heroWidth: HeroWidth$.outboundSchema.optional(),
            icon: Icon$.outboundSchema.optional(),
        })
        .transform((v) => {
            return {
                color: v.color,
                ...(v.heroWidth === undefined ? null : { heroWidth: v.heroWidth }),
                ...(v.icon === undefined ? null : { icon: v.icon }),
            };
        });
}