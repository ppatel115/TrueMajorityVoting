import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Priyam on 4/29/2017.
 */
public class trueMajority {
    public static void main(String[] args){

        int percentage;
        Vector<Candidate> winner;
        VoteCounter vc = new VoteCounter();

        File voterData = new File("D:\\Priyam\\IdeaProjects\\untitled2\\src\\votinginput.txt");

        Scanner scan = null;
        try {
            scan = new Scanner(voterData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        int numberOfCandidates = Integer.parseInt(scan.nextLine());
        VotingBlock[] votingblocks = new VotingBlock [numberOfCandidates];
        Candidate[] orderOfCandidates = new Candidate[numberOfCandidates];

        for(int i = 0; i<numberOfCandidates; i++)
        {
            percentage = Integer.parseInt(scan.nextLine());

            for (int j = 0; j<numberOfCandidates; j++)
            {
                orderOfCandidates[j] = new Candidate(scan.nextLine());
            }

            votingblocks[i] = new VotingBlock(percentage, orderOfCandidates);

        }
        winner = vc.checkVotes(votingblocks);
        if(winner.size() == 1)
        {
            System.out.println(winner.get(0).getName() + " is the winner!");
        }
        else
        {
            System.out.println("There is a " + winner.size() + " way tie between ");
            for(int p = 0; p<winner.size(); p++)
            {
                System.out.print(winner.get(p).getName());
            }
        }

    }
}
