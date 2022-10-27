import React from 'react';
import { SlideLayout, Text, FlexBox, Image, fadeTransition } from 'spectacle';
import vegard from './bilder/vegard.jpg';
import tormartin from './bilder/tormartin.jpg';
import kenan from './bilder/kenan.jpg';
import sigurd from './bilder/sigurd.jpg';
import ingrid from './bilder/ingrid.jpg';

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

export const Hjelpere = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <FlexBox
            flexDirection="row"
            height="100%"
            width="100%"
            justifyContent="space-evenly"
            alignItems="center"
        >
            <OmPerson navn="Tor Martin Frøberg Wang" bildeUrl={tormartin} />
            <OmPerson navn="Kenan Mahic" bildeUrl={kenan} />
            <OmPerson navn="Sigurd Hynne" bildeUrl={sigurd} />
            <OmPerson navn="Ingrid Volden" bildeUrl={ingrid} />
        </FlexBox>
    </SlideLayout.Full>
);
