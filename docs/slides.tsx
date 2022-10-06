import React from 'react';
import './fonts/fonts.css';
import { Deck } from 'spectacle';
import { TitleSplash } from './slides/TitleSplash';
import { PresentereOss } from './slides/PresentereOss';
import { KortOmLibGDX } from './slides/KortOmLibGDX';
import { IntroMainLoop } from './slides/IntroMainLoop';
import { LinkTilKoden } from './slides/LinkTilKoden';
import { KotlinTips } from './slides/KotlinTips';
import { ProblemM1Mac } from './slides/ProblemM1Mac';

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
        <KortOmLibGDX />
        <IntroMainLoop />
        <KotlinTips />
        <ProblemM1Mac />
        <LinkTilKoden />
    </Deck>
);
