import React from 'react';
import { SlideLayout, fadeTransition, CodePane, Heading } from 'spectacle';
import code from './code-examples/simple-module.kt?raw';

export const IntroMainLoop = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading>Main loop</Heading>
        <CodePane
            showLineNumbers={true}
            language="kotlin"
            highlightRanges={[
                [2, 3],
                [5, 6],
            ]}
        >
            {code}
        </CodePane>
    </SlideLayout.Full>
);
