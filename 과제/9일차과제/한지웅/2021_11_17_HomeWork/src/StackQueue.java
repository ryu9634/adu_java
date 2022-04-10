public class StackQueue {
    protected int arr[];
    protected int index;

    public StackQueue(){
        arr = new int [5];
        index = 0;
    }
    public StackQueue(int count){  //오버로딩
        arr = new int[count];
    }
    public void push(int i){
        arr[index++] = i;
        System.out.println("입력값 : " + i);
    }
   

}


