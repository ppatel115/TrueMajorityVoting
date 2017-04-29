/**
 * Created by Priyam on 4/29/2017.
 */
public class VotingBlock {
    private int PercentOfTotalVotes;
    private Candidate[] orderOfCandidates;

    public VotingBlock(int percentofTotalVotes, Candidate[] orderOfCandidates) {
        this.PercentOfTotalVotes = percentofTotalVotes;
        this.orderOfCandidates = orderOfCandidates;
    }


    public int getPercentOfTotalVotes() {
        return PercentOfTotalVotes;
    }

    public void setPercentOfTotalVotes(int percentOfTotalVotes) {
        PercentOfTotalVotes = percentOfTotalVotes;
    }

    public Candidate[] getOrderOfCandidates() {
        return orderOfCandidates;
    }

    public void setOrderOfCandidates(Candidate[] orderOfCandidates) {
        this.orderOfCandidates = orderOfCandidates;
    }
}
