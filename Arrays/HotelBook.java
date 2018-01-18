import java.util.*;
public class Hotel{
    class Interval implements Comparable<Interval>{
        int a;
        int d;
        public Interval(int a, int d){
            this.a = a;
            this.d = d;            
        }
        
        public int compareTo(Interval that){
            return this.a - that.a;
        }
        
    }
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        if(arrive == null || arrive.size() == 0||
           depart == null || depart.size() == 0 ||
           depart.size() != arrive.size() || K < 1)
            return false;
        Interval[] intervals = new Interval[arrive.size()];
        for(int i = 0; i < arrive.size(); i++){
            intervals[i] = new Interval(arrive.get(i), depart.get(i));            
        }
        
        for(int i = 0; i < arrive.size(); i++){
            System.out.print(intervals[i].a + " ");
        }
        System.out.println();
        for(int i = 0; i < arrive.size(); i++){
            System.out.print(intervals[i].d + " ");
        }
        System.out.println();
        
                
        Arrays.sort(intervals);
        System.out.println("After sorting");
        for(int i = 0; i < arrive.size(); i++){
            System.out.print(intervals[i].a + " ");
        }
        System.out.println();
        for(int i = 0; i < arrive.size(); i++){
            System.out.print(intervals[i].d + " ");
        }
        System.out.println();
        
        int rooms = K;
        rooms--;
        for(int i = 1; i < intervals.length; i++){
            if(rooms > 0){
                rooms--;
                continue;
            }
            else if(intervals[i].a < intervals[i-1].d){
                return false;
            }
            
        }
        
        
        return true;
    }