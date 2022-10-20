import React from 'react';
import {SlideLayout, fadeTransition, Heading, Notes, Text} from 'spectacle';
export const KortOmLibGDX = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading>Hva er LibGDX?</Heading>
        <Notes>
            <Text>Abstraksjon over openGL (grafikkort-API): vektorer og firkanter i stede for matriser.</Text>
            <Text>En del tooling: Tastatur-input, main-loop bruk av ressurser som f.eks. bilder</Text>
            <Text>libKTX som gir hjelpefunksjoner tilpasset kotlin</Text>
        </Notes>
    </SlideLayout.Full>
);
