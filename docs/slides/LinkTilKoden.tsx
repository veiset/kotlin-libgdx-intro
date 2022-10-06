import React from 'react';
import { SlideLayout, fadeTransition, Heading, Notes, Text } from 'spectacle';

export const LinkTilKoden = () => (
    <SlideLayout.Center transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            https://github.com/veiset/kotlin-libgdx-intro
        </Heading>
        <Notes>
            <Text>Koden ligger på GitHub.</Text>
            <Text>Følg oppgave-teksten som ligger i ReadMe-fila.</Text>
            <Text>Vi går rundt og hjelper. Samarbeid er helt klar lov.</Text>
        </Notes>
    </SlideLayout.Center>
);
