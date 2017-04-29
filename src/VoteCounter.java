import java.util.Vector;

/**
 * Created by Priyam on 4/29/2017.
 */
public class VoteCounter {

    public Vector<Candidate> checkVotes(VotingBlock[] votes)
    {
        Vector<Candidate> winners;
        Candidate one;
        Candidate two;
        Candidate winner;
        Candidate[] listOfCandidates = votes[0].getOrderOfCandidates();

        for(int i = 0; i<listOfCandidates.length; i++)
        {
            one = listOfCandidates[i];
            for(int j = 0; j < listOfCandidates.length; j++)
            {
                two = listOfCandidates[j];
                winner = compareTwoCandidates(votes, one, two);
                if(winner == one){one.addWin(); two.addLoss();}
                else if(winner == two){two.addWin(); two.addLoss();}
                else
                {
                    one.addTie();
                    two.addTie();
                }

            }
        }
        winners = getWinner(listOfCandidates);
        return winners;

    }

    public int getRank( Candidate[] candidateListInOrder, Candidate candidate)
    {
        for(int i = 0; i<candidateListInOrder.length; i++)
        {
            if(candidateListInOrder[i] == candidate)
            {
                return i + 1;
            }
        }

        return 0;     //Should never happen
    }

    public Candidate compareTwoCandidates(VotingBlock[] votes, Candidate one, Candidate two)
    {
        int votePercentOne = 0;
        int votePercentTwo = 0;
        Candidate[] candidateListInOrder;
        Candidate three = new Candidate("Tie");

        for(int i = 0; i<votes.length; i++)
        {
            candidateListInOrder = votes[i].getOrderOfCandidates();
            if(getRank(candidateListInOrder, one) < getRank(candidateListInOrder, two))         //Opposite intuition, since rank 1 is higher than rank 2, but not mathematically
            {
                votePercentOne += votes[i].getPercentOfTotalVotes();
            }
            else
            {
                votePercentTwo += votes[i].getPercentOfTotalVotes();
            }

        }

        if (votePercentOne > votePercentTwo) return one;
        else if (votePercentTwo > votePercentOne) return two;
        else return three;
    }

    public Vector<Candidate> getWinner(Candidate[] listOfCandidates){
        Vector <Candidate> winners = null;
        for(int i = 0; i<listOfCandidates.length; i++)
        {
            if(listOfCandidates[i].getWins() == (listOfCandidates.length - 1)){
                winners.add(listOfCandidates[i]);
            }
            else if(listOfCandidates[i].getLosses() == 0){
                winners.add(listOfCandidates[i]);
            }
        }
        return winners;

    }
}
