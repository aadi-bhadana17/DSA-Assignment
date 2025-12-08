// /* The isBadVersion API is defined in the parent class VersionControl.
//       boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int s=1;int e=n;int mid=0;
//         while(s<=e){
//             mid=(s+(e-s)/2);
//             boolean check=isBadVersion(mid);
//             // System.out.println(s+" "+e+" "+check+" "+mid);
//             if(check==true){
//                 e=mid-1;
//             }else{
//                 s=mid+1;            }
//         }
//         return s;
//     }
// }