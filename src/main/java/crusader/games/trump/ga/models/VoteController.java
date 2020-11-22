package crusader.games.trump.ga.models;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoteController {

    @PostMapping("/big")
    public String postBigVotes(@RequestBody List<BigEntry> votes){
        StringBuilder result = new StringBuilder();

        result.append("Trump, Biden, Votes, %Complete, Timestamp \n");


        for (BigEntry vote: votes){
            result.append(vote.republican_voteshare_counted + ",");
            result.append(vote.democrat_voteshare_counted + ",");
            result.append(vote.vote_counted + ",");
            result.append(vote.vote_counted * 100 / (vote.vote_counted + vote.vote_remaining) + ",");
            result.append(vote.timestamp + "\n");
        }
        return result.toString();
    }

    @PostMapping
    public String postVotes(@RequestBody List<Entry> votes){
        StringBuilder result = new StringBuilder();

        result.append("Trump, Biden, Votes, %Complete, Timestamp \n");


        for (Entry vote: votes){
           result.append(vote.vote_shares.trumpd + ",");
           result.append(vote.vote_shares.bidenj + ",");
           result.append(vote.votes + ",");
           result.append(vote.eevp + ",");
           result.append(vote.timestamp + "\n");
        }
        return result.toString();
    }
}
