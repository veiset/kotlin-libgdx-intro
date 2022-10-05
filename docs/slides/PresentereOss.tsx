import React from 'react';
import { SlideLayout, Text, FlexBox, Image } from 'spectacle';
import { simpleTransition } from './common';
import vegardPNG from './bilder/vegard.png';
import steffenPNG from './bilder/steffen.png';

type OmPersonProps = {
    navn: string;
    bildeUrl: string;
};

const OmPerson = ({ navn, bildeUrl }: OmPersonProps) => (
    <FlexBox flexDirection="column" justifyContent="center" height="100%">
        <Image width="300px" alt={`Bilde av ${navn}`} src={bildeUrl} />
        <Text
            fontWeight="300"
            textAlign="center"
            padding="0px"
            mt="60px"
            fontSize={25}
        >
            {navn}
        </Text>
    </FlexBox>
);

export const PresentereOss = () => (
    <SlideLayout.Full transition={simpleTransition}>
        <FlexBox
            flexDirection="row"
            height="100%"
            justifyContent="space-evenly"
            alignItems="center"
        >
            <OmPerson navn="Steffen Hageland" bildeUrl={steffenPNG} />
            <OmPerson navn="Vegard Veiset" bildeUrl={vegardPNG} />
        </FlexBox>
    </SlideLayout.Full>
);
