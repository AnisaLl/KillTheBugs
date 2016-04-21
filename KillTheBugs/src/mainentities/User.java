
package mainentities;

import java.time.Duration;
import GE.Account;

/**
 * User	- This class holds basic information about a user of the game
 *
 * @author Anisa Llaveshi
 * @version 1.00 2016/4/14
 */
public class User {
    
    private String name;
    private Account score;
    private Duration duration;
    
    public User(String name, Account score, Duration duration)
    {
           this.name = name;
           this.score = score;
           this.duration = duration;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the score
     */
    public Account getScore() {
        return score;
    }
    
    /**
     * @param Account the score to set
     */
    public void setScore(Account score) {
        this.score = score;
    }

    /**
     * @return the duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    
}
