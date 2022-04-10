

 public class stackTest {
    public static void main(String[] args) {
    supperArray supperArray =new supperArray(4);

   supperArray.push(10); //10
    System.out.println(supperArray.peek());
    supperArray.push(5); //5
    System.out.println(supperArray.peek());
    supperArray.push(7); //7
    System.out.println(supperArray.peek());
    supperArray.push(3); //3
    System.out.println(supperArray.peek());

    System.out.println();
    System.out.println(supperArray.peek()); //3
    supperArray.pop(); //3 -pop
    System.out.println(supperArray.peek()); //7
    supperArray.pop(); //7-pop
    System.out.println(supperArray.peek()); //5
    supperArray.pop(); //5-pop
    System.out.println(supperArray.peek()); //10
     /*
     queue
      */
     queueTest superQueue = new queueTest(4);
     superQueue.enqueue(10);
     superQueue.enqueue(5);
     superQueue.enqueue(7);
     superQueue.enqueue(3);
     System.out.println(superQueue.peek());




}
}
