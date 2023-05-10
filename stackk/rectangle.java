package stackk;

import java.util.Stack;

public class rectangle {
    public static void main(String[] args) {
        int[] arr={30,40,10,20,60};
        Stack<Integer> st=new Stack<>();
        int area=0;
        for (int i = 0; i < arr.length; i++) 
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                int rm=i;
                int height=arr[st.pop()];
                if(st.isEmpty())
                {
                    int a=rm*height;
                    area=Math.max(area, a);
                }
                else
                {
                    int lm=st.peek();
                    int a=(rm-lm-1)*height;
                    area=Math.max(area, a);
                }
            }
            
        }
    }
}
