import java.util.HashMap;
import java.util.Map;
class sequence{
    int consec(int [] arr){
        int longest=0;
        Map<Integer,Boolean> exploreMap=new HashMap<>();
        for(int num:arr){
            exploreMap.put(num,Boolean.FALSE);
        }
        for(int  num:arr){
            int currentLength=1;
            int nextNum=num+1;
            while(exploreMap.containsKey(nextNum)&&exploreMap.get(nextNum)==Boolean.FALSE){
                currentLength++;
                exploreMap.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            int prevNum=num-1;
            while(exploreMap.containsKey(prevNum)&&exploreMap.get(prevNum)==Boolean.FALSE){
                currentLength++;
                exploreMap.put(prevNum,Boolean.TRUE);
                prevNum--;
            }
            longest=Math.max(longest,currentLength);
        }
        return longest;
    }
    public static void main(String args[]){
        sequence obj=new sequence();
        int []arr={100,4,200,1,3,2};
        int result=obj.consec(arr);
        System.out.println(result);
    }
}