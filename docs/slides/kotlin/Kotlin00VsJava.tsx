import React from 'react';
import {CodePane, fadeTransition, FlexBox, Heading, Notes, SlideLayout, Text} from 'spectacle';
import kotlinExample from './code/kotlin-base-example.kts?raw';
import javaExample from './code/java-base-example.java?raw';

export const Kotlin00VsJava = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading fontWeight="300" fontSize="100px">
            Forskjellen på Kotlin og Java
        </Heading>
        <FlexBox
            flexDirection="row"
            height="100%"
            justifyContent="space-evenly"
            alignItems="center"
        >
            <CodePane showLineNumbers={true} language="kotlin">{kotlinExample}</CodePane>
            <CodePane showLineNumbers={true} language="java">{javaExample}</CodePane>
        </FlexBox>
        <Notes>
            <Text>Dette er ikke poenget... POENGET er at kotlin gjør masse greier mer smooth. Dette er worst case.</Text>
            <Text>Jobbing med lister er mye enklere, string templating...</Text>
        </Notes>
    </SlideLayout.Full>
);

