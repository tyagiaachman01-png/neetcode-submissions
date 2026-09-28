class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1 = new Stack<>();
        int[] ans = new int[temperatures.length];
        int index=0;

        for(int i =0;i<temperatures.length;i++){
            if(s1.isEmpty()||  temperatures[s1.peek()]>=temperatures[i]){
                     s1.push(i);

            }
            else{while(!s1.isEmpty() && temperatures[s1.peek()]<temperatures[i]){
                int x= s1.pop();
                temperatures[x]= i-x;;}
                s1.push(i);
            

            }
        }
        while(!s1.isEmpty()){
            int j = s1.pop();
            temperatures[j]= 0;
        }
return temperatures;
    }
}
