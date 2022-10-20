import React from 'react';
import {SlideLayout, fadeTransition, CodePane, Heading, Notes, Text} from 'spectacle';
import code from './code-examples/simple-module.kts?raw';

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
        <Notes>
            <Text>FixedUpdate vs Delta/dynamisk</Text>
            <Text>Gamle spill er ofte cpu-bound fixedUpdate: Sleep regne ut med delta</Text>
        </Notes>
    </SlideLayout.Full>
);
