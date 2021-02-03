class Solution {
    public int reverse(int x) {
        long res=0;
        int flag=0;
        if(x<0){
            x=-x;
            flag=1;
            while(x!=0){
                res=res*10+x%10;
                x=x/10;
            }
        }else if(x>0){
            while(x!=0){
                res=res*10+x%10;
                x=x/10;
            }
            
        }
        else {
            res=0;
        };
        if(res>2147483647||res<-2147483648)
        {
            return 0;
        }
        else{
            if(flag==1)
            {
                return -1*(int)res;
            }
            else{
                return (int)res;
            }
        }

    }
}
