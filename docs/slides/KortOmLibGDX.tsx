import React from 'react';
import { CodePane, SlideLayout, fadeTransition } from 'spectacle';
import code from './code-examples/simple-module.kt?raw';

export const KortOmLibGDX = () => (
    <SlideLayout.Full transition={fadeTransition}>
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
