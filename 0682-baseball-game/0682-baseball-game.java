class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<operations.length;i++){
            String operation=operations[i];
            if(operation.equals("+")){
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }
            else if(operation.equals("C")){
                s.pop();
            }
            else if(operation.equals("D")){
                s.push(2*s.peek());
            }
            else{
                s.push(Integer.parseInt(operation));
            }
            
            }
            int sum=0;
            while(!s.isEmpty())
            {
                sum=sum+s.pop();
            }
            return sum;
        }
        
    
}