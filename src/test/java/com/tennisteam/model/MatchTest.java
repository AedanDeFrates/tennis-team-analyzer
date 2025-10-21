package com.tennisteam.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest
{
    @Test
    public void getMethodTests()
    {
        LocalDate localDate = LocalDate.now();
        Match match = new Match(localDate,"A","B","Arnold","Beth","2","4");
        assertEquals(match.getDate(), localDate.now());
        assertEquals(match.getTeamA(), "A");
        assertEquals(match.getTeamB(), "B");
        assertEquals(match.getPlayerA(), "Arnold");
        assertEquals(match.getPlayerB(), "Beth");
        assertEquals(match.getScoreA(), "2");
        assertEquals(match.getScoreB(), "4");
    }
}