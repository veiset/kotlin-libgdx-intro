import React from 'react';
import {CodePane, fadeTransition, Heading, SlideLayout} from 'spectacle';
import kotlinExample from './code/kotlin05-immutability.kts?raw';

export const Kotlin05Immutability = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Immutability
        </Heading>
            <CodePane showLineNumbers={true} language="kotlin">{kotlinExample}</CodePane>
    </SlideLayout.Full>
);

