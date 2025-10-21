package com.tennisteam.service;

import com.tennisteam.model.Match;
import com.tennisteam.util.ScoreParser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculatorTest
{
    String filePath1 = "src/main/resources/matches.csv";
    String filePath2 = "src/main/resources/matches_extra.csv";

    List<Match> matches = CSVLoader.loadMatches(filePath1);

    List<Match> matches_Extra =  CSVLoader.loadMatches(filePath2);

    @Test
    void CalculateTeamWinsMatches()
    {
        assertEquals(2, StatsCalculator.calculateTeamWins(matches).size());
    }
    @Test
    void CalculateTeamWinsFromMatch_Extra()
    {
        assertEquals(2, StatsCalculator.calculateTeamWins(matches_Extra).size());
    }

    @Test
    void CalculatePlayerWinsFromMatches()
    {
        assertEquals(3, StatsCalculator.calculatePlayerWins(matches).size());
    }

    @Test
    void CalculatePlayerWinsFromMatch_Extra()
    {
        assertEquals(2, StatsCalculator.calculatePlayerWins(matches_Extra).size());
    }
}