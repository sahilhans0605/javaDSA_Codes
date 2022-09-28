package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//also see activity selection problem for this
public class NMeetingsInOneRoom {

    class Meeting {
        int start;
        int end;
        int pos;

        public Meeting(int start, int end, int pos) {
            this.end = end;
            this.start = start;
            this.pos = pos;
        }
    }

    class MeetingComparator implements Comparator<Meeting> {

        @Override
        public int compare(Meeting o1, Meeting o2) {//o1 is start array
//            o2 is end array
            if (o1.end < o2.end) return -1;
            else if (o1.end > o2.end) return 1;

            else if (o1.pos < o2.pos) return -1;//if meeting ending times are same
            return 1;
        }
    }

    public void maxMeetings(int start[], int end[], int n) {
        ArrayList<Meeting> meet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meet.add(new Meeting(start[i], end[i], i + 1));
        }
        Collections.sort(meet, new MeetingComparator());

        ArrayList<Integer> answerList = new ArrayList<>();
        answerList.add(meet.get(0).pos);
        int limit = meet.get(0).end;
        for (int i = 1; i < start.length; i++) {
            if (meet.get(i).start < limit) {
                limit = meet.get(i).end;
                answerList.add(meet.get(i).pos);
            }
        }
        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i) + " ");
        }
    }

    public static void main(String[] args) {

    }
}
