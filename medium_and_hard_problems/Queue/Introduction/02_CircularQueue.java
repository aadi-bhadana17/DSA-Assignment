// class MyCircularQueue {
//     int[] arr;
//     int front;int rear;int len;
//     public MyCircularQueue(int k) {
//         arr=new int[k];
//         front=-1;rear=-1;
//         len=k;
//     }
    
//     public boolean enQueue(int value) {
//         if(isFull())return false;
//         if(front==-1){
//             front=0;
//         }
//         rear=(rear+1)%len;
//         arr[rear]=value;
//         return true;
//     }
    
//     public boolean deQueue() {
//         if(isEmpty())return false;
//         if(front==rear){
//             front=-1;
//             rear=-1;
//             return true;
//         }
//         front=(front+1)%len;
//         return true;
//     }
    
//     public int Front() {
//         if(isEmpty())return -1;
//         return arr[front];
//     }
    
//     public int Rear() {
//         if(isEmpty()==true)return -1;
//         return arr[rear];
//     }
    
//     public boolean isEmpty() {
//         if(front==-1)return true;
//         return false;
//     }
    
//     public boolean isFull() {
//         return (rear+1)%len==front;
//     }
// }
