package com.tennisteam.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreParserTest
{
    @Test
    public void parseEmptyString()
    {
        String str = "";
        ScoreParser sp = new ScoreParser();
        assertEquals(0 ,sp.countSetsWon(str));
    }

    @Test
    public void parseSingleString()
    {
        String str = "9-3 2-4";
        ScoreParser sp = new ScoreParser();
        assertEquals(1,sp.countSetsWon(str));
    }

}