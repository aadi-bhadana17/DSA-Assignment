// class myQueue {
//     int[] arr;
//     int front;
//     int back;
//     int n;

//     public myQueue(int n) {
//         this.n = n;
//         arr = new int[n];
//         front = -1;
//         back = -1;
//     }

//     public boolean isEmpty() {
//         return front == -1;
//     }

//     public boolean isFull() {
//         return (back + 1) % n == front;
//     }

//     public void enqueue(int x) {
//         if (isFull()) {
//             System.out.println("Queue is full");
//             return;
//         }
//         if (isEmpty()) {
//             front = 0;
//         }
//         back = (back + 1) % n;
//         arr[back] = x;
//     }

//     public void dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return;
//         }
//         if (front == back) {
//             // Queue becomes empty
//             front = -1;
//             back = -1;
//         } else {
//             front = (front + 1) % n;
//         }
//     }

//     public int getFront() {
//         if (isEmpty()) return -1;
//         return arr[front];
//     }

//     public int getRear() {
//         if (isEmpty()) return -1;
//         return arr[back];
//     }
// }