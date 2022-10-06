import React from 'react';
import ReactDOM from 'react-dom/client';
import './fonts/fonts.css';
import { Deck } from 'spectacle';
import { TitleSplash } from './slides/TitleSplash';
import { PresentereOss } from './slides/PresentereOss';
import { KortOmLibGDX } from './slides/KortOmLibGDX';

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

const Presentation = () => (
    <Deck theme={theme}>
        <TitleSplash />
        <PresentereOss />
        <KortOmLibGDX />
    </Deck>
);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Presentation />);
