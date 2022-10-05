import React from 'react'
import ReactDOM from 'react-dom/client'
import { Deck } from 'spectacle'
import { TitleSplash } from './slides/TitleSplash'
import { PresentereOss } from './slides/PresentereOss'

const theme = {
    fonts: {
        header: "'DejaVu Sans', Helvetica, sans-serif",
        text: "'DejaVu Sans', Helvetica, sans-serif",
    },
    colors: {
        primary: '#FFFFFF',
        secondary: '#FFFFFF',
        tertiary: '#0E0E0E',
    },
}

const Presentation = () => (
    <Deck theme={theme}>
        <TitleSplash />
        <PresentereOss />
    </Deck>
)

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(<Presentation />)
