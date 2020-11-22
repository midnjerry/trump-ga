package crusader.games.trump.ga.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BigEntry {
    Integer vote_counted;
    Integer vote_remaining;
    BigDecimal democrat_voteshare_counted;
    BigDecimal other_voteshare_counted;
    BigDecimal republican_voteshare_counted;
    BigDecimal democrat_wp;
    BigDecimal democrat_wp_absentee;
    BigDecimal democrat_wp_early;
    BigDecimal democrat_wp_electionday;
    BigDecimal democrat_wp_provisional;
    BigDecimal other_wp;
    BigDecimal other_wp_absentee;
    BigDecimal other_wp_early;
    BigDecimal other_wp_electionday;
    BigDecimal other_wp_provisional;
    BigDecimal republican_wp;
    BigDecimal republican_wp_absentee;
    BigDecimal republican_wp_early;
    BigDecimal republican_wp_electionday;
    BigDecimal republican_wp_provisional;
    String timestamp;

    /*

     */

}
