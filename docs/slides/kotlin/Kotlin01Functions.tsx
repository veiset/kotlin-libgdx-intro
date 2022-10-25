import React from 'react';
import {CodePane, fadeTransition, Heading, SlideLayout} from 'spectacle';
import kotlinExample from './code/kotlin01-funksjoner.kts?raw';

export const Kotlin01Functions = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Funksjoner
        </Heading>
            <CodePane showLineNumbers={true} language="kotlin">{kotlinExample}</CodePane>
    </SlideLayout.Full>
);

