import React from 'react';
import { SlideLayout, fadeTransition, Heading } from 'spectacle';

export const KotlinTips = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Kotlin-tips
        </Heading>
    </SlideLayout.Full>
);
