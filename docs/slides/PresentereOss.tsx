import React from 'react';
import {
    SlideLayout,
    Text,
    FlexBox,
    Image,
    fadeTransition,
    Heading,
    Box,
} from 'spectacle';
import vegardPNG from './bilder/vegard.png';
import steffenPNG from './bilder/steffen.png';
import stianPNG from './bilder/stian.png';
import alexanderPNG from './bilder/alexander.png';
import styled from '@emotion/styled';

type OmPersonProps = {
    navn: string;
    erfaring: string;
    bildeUrl: string;
    attending?: boolean
};

const OmPerson = ({ navn, bildeUrl, erfaring, attending = true }: OmPersonProps) => (
    <PersonWrapper opacity={attending ? 1 : 0.3}>
        <FlexBox flexDirection="column" justifyContent="center">
            <RoundedProfileImage bildeUrl={bildeUrl} />
            <Text
                fontWeight="300"
                textAlign="center"
                padding="0px"
                margin="10px"
                fontSize={20}
            >
                {navn}
            </Text>
            <Text
                fontWeight="300"
                textAlign="center"
                padding="0px"
                margin="0px"
                fontSize={16}
            >
                {erfaring} i Bekk
            </Text>
        </FlexBox>
    </PersonWrapper>
);

export const PresentereOss = () => (
    <SlideLayout.Full transition={fadeTransition}>
        <Heading mb="50px">Kursholdere</Heading>
        <Box mt="60px">
            <MainWrapper>
                <OmPerson
                    navn="Steffen Hageland"
                    bildeUrl={steffenPNG}
                    erfaring="9 år"
                />
                <OmPerson
                    navn="Alexander Svendsen"
                    bildeUrl={alexanderPNG}
                    erfaring="9 år"
                />
                <OmPerson
                    navn="Stian Stensli"
                    bildeUrl={stianPNG}
                    erfaring="3 år"
                />
                <OmPerson
                    navn="Vegard Veiset"
                    bildeUrl={vegardPNG}
                    erfaring="10 år"
                    attending={false}
                />
            </MainWrapper>
        </Box>
    </SlideLayout.Full>
);

type RoundedProfileImageProps = {
    bildeUrl: string;
};

const RoundedProfileImage = ({ bildeUrl }: RoundedProfileImageProps) => (
    <ProfileImageWrapper>
        <ProfileImage src={bildeUrl} />
    </ProfileImageWrapper>
);

const ProfileImageWrapper = styled.div`
    width: 180px;
    height: 180px;
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden;
    border-radius: 50%;
`;

const ProfileImage = styled(Image)`
    max-height: 220px;
    max-width: 220px;
`;

const MainWrapper = styled.div`
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    width: 100%;
`;

type PersonWrapperProps = {
    opacity: number
}
const PersonWrapper = styled.div(({ opacity }: PersonWrapperProps) => `
    opacity: ${opacity};
    width: 19%;
    margin-top: 10px;
    margin-bottom: 30px;
`);
