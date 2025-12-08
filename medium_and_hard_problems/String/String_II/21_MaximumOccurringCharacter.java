// class sol{
//     int getMaxFrequency(String s){
//         int n=s.length;
//         int[] count=new int[256];
//         for(int i=0;i<n;i++)count[s.charAt(i)]++;
//         int max=0;
//         char res=0;
//         for(int i=0;i<256;i++){
//             if(count[i]>max){
//                 count=max;res=(char)i;
//             }
//         }
//         return res;
//     }
// }
