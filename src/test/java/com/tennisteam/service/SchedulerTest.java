package com.tennisteam.service;

import com.tennisteam.model.Match;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchedulerTest
{
    String filePath1 = "src/main/resources/matches.csv";
    String filePath2 = "src/main/resources/matches_extra.csv";

    List<Match> matches = CSVLoader.loadMatches(filePath1);

    List<Match> matches_Extra =  CSVLoader.loadMatches(filePath2);

    @Test
    void getTeamsFromMatches()
    {
        String str = Scheduler.getTeams(matches).toString();
        assertEquals("[Georgia, Florida, LSU]", str);
    }
    @Test
    void getTeamsFromMatches_Extra()
    {
        String str = Scheduler.getTeams(matches_Extra).toString();
        assertEquals("[Texas, Auburn, Florida, LSU]", str);
    }

    @Test
    void NextOpponentsFromMatches()
    {
        String string = Scheduler.suggestNextOpponents("auburn" ,matches).toString();
        assertEquals("[Georgia, Florida, LSU]", string);
    }

    @Test
    void NextOpponentsFromMatchesExtra()
    {
        String string = Scheduler.suggestNextOpponents("auburn",matches_Extra).toString();
        assertEquals("[Texas, Auburn, Florida, LSU]", string);
    }
}