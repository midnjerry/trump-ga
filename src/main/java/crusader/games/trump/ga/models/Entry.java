package crusader.games.trump.ga.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
    VoteShares vote_shares;
    BigDecimal votes;
    Integer eevp;
    String eevp_source;
    String timestamp;
}
