// import java.util.Scanner;

// class Stack {
//     private static final int STACK_CAPACITY = 101;
//     private char[] stackArray = new char[STACK_CAPACITY];
//     private int topIndex = -1;

//     void push(char character) {
//         // If stack is full (check using isFull function)
//         // Then print "Stack is full"
//         // Otherwise add the next element at topIndex + 1 and update topIndex
//         if(isFull()){
//             System.out.println("Stack is full");
//         }else{
//             topIndex++;
//             stackArray[topIndex]=character;
//         }
//     }

//     char pop() {
//         // If the stack is empty (check using isEmpty function)
//         // Then print "Stack is empty" and return '-1'
//         // Otherwise return the element at the topIndex
//         // But reduce topIndex before returning the element
//         if(isEmpty()){
//             System.out.println("Stack is Empty");
//             return "-1";
//         }else{
//             char res=stackArray[topIndex--];
//             return res;
//         }
//     }

//     boolean isEmpty() {
//         return topIndex == -1;
//     }

//     boolean isFull() {
//         return topIndex >= STACK_CAPACITY - 1;
//     }
// }
