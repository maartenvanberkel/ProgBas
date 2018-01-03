package be.pxl.spel;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreTest {
    @Test
    public void testScoreMetGeldigeWaarde() {
        Score score = new Score(3);
        assertEquals("***", score.getStars());
    }

    @Test
    public void testScoreMetNulWaarde() {
        Score score = new Score(0);
        assertEquals("", score.getStars());
    }

    @Test
    public void testScoreMetNegatieveWaarde() {
        Score score = new Score(-5);
        assertEquals("", score.getStars());
    }
    
    @Test
    public void testScoreMetGrotereWaardeDanMaxWaarde() {
        Score score = new Score(Score.MAX_SCORE + 1);
        assertEquals(Score.MAX_SCORE, score.getStars().length());
    }

    @Test
    public void testScoreMetLegeArrayGeeftGeenSterren() {
        Score score = new Score(new Score[0]);
        assertEquals("", score.getStars());
    }

    @Test
    public void testScoreMetMeerdereScoresGeeftGemiddelde() {
        Score[] scores = {new Score(3), new Score(4), new Score(5)};
        Score score = new Score(scores);
        assertEquals("****", score.getStars());
    }
    
    @Test
    public void testTweeScoresZijnGelijkIndienHunWaardeGelijk() {
    	Score score = new Score(4);
    	Score otherScore = new Score(4);
    	assertTrue(score.equals(otherScore));
    	assertTrue(otherScore.equals(score));
    }
    
    @Test
    public void testScoreIsNietGelijkAanNull() {
    	Score score = new Score(4);
    	assertFalse(score.equals(null));
    }
    
    @Test
    public void testTweeScoresZijnNietGelijkIndienHunWaardeNietGelijk() {
    	Score score = new Score(3);
    	Score otherScore = new Score(4);
    	assertFalse(score.equals(otherScore));
    	assertFalse(otherScore.equals(score));
    }

}
