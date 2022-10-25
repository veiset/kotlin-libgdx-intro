import React from 'react';
import './fonts/fonts.css';
import { Deck } from 'spectacle';
import { TitleSplash } from './slides/TitleSplash';
import { PresentereOss } from './slides/PresentereOss';
import { KortOmLibGDX } from './slides/KortOmLibGDX';
import { IntroMainLoop } from './slides/IntroMainLoop';
import { LinkTilKoden } from './slides/LinkTilKoden';
import {
    KotlinExtensionFunctions,
    KotlinImmutability,
    KotlinImperativVsFunksjonelt,
    KotlinTips,
} from './slides/KotlinTips';
import { SpilletViSkalLage } from './slides/SpilletViSkalLage';
import { Demo } from './slides/Demo';
import {HvaErKotlin} from "./slides/kotlin/HvaErKotlin";
import {Kotlin00VsJava} from "./slides/kotlin/Kotlin00VsJava";
import {Kotlin01Functions} from "./slides/kotlin/Kotlin01Functions";
import {Kotlin02NamedArguments} from "./slides/kotlin/Kotlin02NamedArguments";
import {Kotlin03Lambdas} from "./slides/kotlin/Kotlin03Lambdas";
import {Kotlin04Lists} from "./slides/kotlin/Kotlin04Lists";
import {Kotlin05Immutability} from "./slides/kotlin/Kotlin05Immutability";

const theme = {
    fonts: {
        header: 'Newzald, Georgia, sans-serif',
        text: "DIN, 'Calibre Light', sans-serif",
    },
    colors: {
        primary: '#FFFFFF',
        secondary: '#FFFFFF',
        tertiary: '#0E0E0E',
    },
};

export const Presentation = () => (
    <Deck theme={theme}>
        <TitleSplash />
        <PresentereOss />
        <SpilletViSkalLage />
        <Demo />
        <IntroMainLoop />

        <HvaErKotlin />

        <Kotlin00VsJava />
        <Kotlin01Functions />
        <Kotlin02NamedArguments />
        <Kotlin03Lambdas />
        <Kotlin04Lists />
        <Kotlin05Immutability />

        <KortOmLibGDX />
        <LinkTilKoden />
    </Deck>
);
