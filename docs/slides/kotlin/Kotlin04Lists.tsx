import React from 'react';
import {CodePane, fadeTransition, Heading, SlideLayout} from 'spectacle';
import kotlinExample from './code/kotlin04-lists.kts?raw';

export const Kotlin04Lists = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Lists
        </Heading>
            <CodePane showLineNumbers={true} language="kotlin">{kotlinExample}</CodePane>
    </SlideLayout.Full>
);

