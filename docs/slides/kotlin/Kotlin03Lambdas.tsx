import React from 'react';
import {CodePane, fadeTransition, Heading, SlideLayout} from 'spectacle';
import kotlinExample from './code/kotlin03-lambdas.kts?raw';

export const Kotlin03Lambdas = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Lambdas
        </Heading>
            <CodePane showLineNumbers={true} language="kotlin">{kotlinExample}</CodePane>
    </SlideLayout.Full>
);

