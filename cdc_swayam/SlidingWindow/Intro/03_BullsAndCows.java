// class Solution {
//     public String getHint(String a, String b) {
//         int i=0;int j=0;
//         HashMap<Character,Integer> mp1=new HashMap<Character,Integer>();
//         HashMap<Character,Integer> mp2=new HashMap<Character,Integer>();int x=0;int y=0;
//         while(i<a.length()&&j<b.length()){
//             if(a.charAt(i)==b.charAt(j)){
//                 x++;
//             }else{
//                 mp1.put(a.charAt(i),mp1.getOrDefault(a.charAt(i),0)+1);
//                 mp2.put(b.charAt(j),mp2.getOrDefault(b.charAt(j),0)+1);
//             }
//             i++;j++;
//         }
//         while(j<b.length()){
//             mp2.put(b.charAt(j),mp2.getOrDefault(a.charAt(j),0)+1);j++;
//         }
//         while(i<a.length()){
//             mp1.put(a.charAt(i),mp1.getOrDefault(b.charAt(i),0)+1);i++;
//         }
//         // System.out.println(mp2);
//         for(Map.Entry<Character,Integer> e:mp1.entrySet()){
//             // System.out.println(e.getKey()+" "+e.getValue());
//              int temp=mp2.getOrDefault(e.getKey(),0);
//              y+=Math.min(temp,e.getValue());
            
//         }
//         StringBuilder res=new StringBuilder();
//         res.append(x);res.append('A');res.append(y);res.append('B');
//         return res.toString();
//     }
// }