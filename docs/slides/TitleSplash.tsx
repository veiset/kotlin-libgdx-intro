import React from 'react';
import { Heading, SlideLayout, Text } from 'spectacle';
import { simpleTransition } from './common';

export const TitleSplash = () => (
    <SlideLayout.Center transition={simpleTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Introduksjon til spillutvikling med Kotlin
        </Heading>
    </SlideLayout.Center>
);
