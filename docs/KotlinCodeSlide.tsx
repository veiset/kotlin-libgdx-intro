import { fadeTransition, SlideLayout } from 'spectacle';
import React from 'react';

type KotlinCodeSlideProps = {
    title: string;
    code: string;
};

export const KotlinCodeSlide = ({ title, code }: KotlinCodeSlideProps) => (
    <SlideLayout.Code
        language="kotlin"
        title={title}
        transition={fadeTransition}
    >
        {code}
    </SlideLayout.Code>
);

type KotlinCodeSlideTwoColumnsProps = {
    title: string;
    codeLeft: string;
    codeRight: string;
};

export const KotlinCodeSlideTwoColumns = ({
    title,
    codeLeft,
    codeRight,
}: KotlinCodeSlideTwoColumnsProps) => (
    <SlideLayout.MultiCodeLayout
        title={title}
        transition={fadeTransition}
        numColumns={2}
        codeBlocks={[
            { code: codeLeft, language: 'kotlin' },
            {
                code: codeRight,
                language: 'kotlin',
            },
        ]}
    />
);
