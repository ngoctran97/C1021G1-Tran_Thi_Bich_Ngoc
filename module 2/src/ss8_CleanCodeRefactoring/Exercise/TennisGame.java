package ss8_CleanCodeRefactoring.Exercise;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int playSore1, int phayScore2) {
        int tempScore = 0;
        String score = "";
        boolean hoa = playSore1 == phayScore2;
        boolean thang = playSore1 >= 4 || phayScore2 >= 4;

        if (hoa)
            switch (playSore1)
            {
                case 0:
                    return "Love-All";

                case 1:
                    return "Fifteen-All";
                case 2:
                    return  "Thirty-All";
                case 3:
                    return  "Forty-All";
                default:
                    return  "Deuce";

            }

            if (thang)
            {
                int minusResult = playSore1-phayScore2;
                if (minusResult==1) return "Advantage player1";
                else if (minusResult ==-1) return "Advantage player2";
                else if (minusResult>=2) return  "Win for player1";
                else return "Win for player2";
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = playSore1;
                    else { tempScore = phayScore2;}
                    switch(tempScore)
                    {
                        case 0:
                            return"Love";
                        case 1:
                            return"Fifteen";
                        case 2:
                            return"Thirty";
                        case 3:
                            return"Forty";
                    }
                }
            }

        return "";
    }

}
