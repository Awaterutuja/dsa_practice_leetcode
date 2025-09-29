public class Queue_Array_Implementation {
    public static int[] numsQueue = new int [5];
    public static int currSize = 0;
    public static int head = 0;
    public static int tail = 0;
    
    public static void push(int num){
        if(currSize ==0)
            head = tail =0;
        else
            tail = (tail + 1) % currSize;


        numsQueue[tail] = num;
        currSize++;
    }

    public static void pop () {
        if(currSize ==0)
            System.out.print("Queue is Empty!!");
        else{
            head++;
            currSize--;
        }
    }

    public static void top(){
        if(currSize ==0)
            System.out.println("Queue Is Empty !!!");

        System.out.println("top->" + numsQueue[head]);

    }

    public static void size() {
        System.out.println("Size-> " + currSize);
    }

    public static void main(String[] args) {
        push(10);
        push(2);
        push(5);
        top();
        pop();
        push(3);
        push(4);
        push(90);
        pop();
        pop();
        top();
        for(int i=0;i<currSize;i++){
            System.out.print(" " + numsQueue[i]);
        }
    }
}
