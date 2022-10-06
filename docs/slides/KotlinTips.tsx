import React from 'react';
import {
    SlideLayout,
    fadeTransition,
    Heading,
    UnorderedList,
    ListItem,
} from 'spectacle';

export const KotlinTips = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Kotlin-tips
        </Heading>
        <UnorderedList>
            <ListItem>Imperativt vs Funksjonelt</ListItem>
            <ListItem>Immutability</ListItem>
            <ListItem>Extension functions</ListItem>
        </UnorderedList>
    </SlideLayout.Full>
);
