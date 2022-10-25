import React from 'react';
import {CodePane, fadeTransition, Heading, SlideLayout} from 'spectacle';
import kotlinExample from './code/kotlin02-named-arguments.kts?raw';

export const Kotlin02NamedArguments = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Named Arguments
        </Heading>
            <CodePane showLineNumbers={true} language="kotlin">{kotlinExample}</CodePane>
    </SlideLayout.Full>
);

