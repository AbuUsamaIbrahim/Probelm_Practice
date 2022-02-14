package practice;

 class ReverseString {
   public static void main(String [] args){

       int y[]={1,3,2,4,5};
       function(y,2);
//       return 0;
//       java.lang.String input = "BTCLJOBPREPERATION";
//       byte[] strAsByteArray = input.getBytes();
//       byte[] result = new byte[strAsByteArray.length];
//       for(int i=0;i<strAsByteArray.length;i++){
//           result[i] = strAsByteArray[strAsByteArray.length-i-1];
//       }
//       System.out.println(new String(result));
   }

    public static int function(int x[], int i)
     {
         int s=x[i];
         if(i>0)
         {
             s+=function(x,i-1);
         }
         System.out.println(s);
         return s;
     }
}
