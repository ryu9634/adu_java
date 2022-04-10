public class Stack {
    /*
    push() : 요소를 저장
    peek() : 마지막 데이터(첫번째 뽑힐)를 반환
    pop() : 마지막 데이터(첫번째 뽑힐)를 반환하고 삭제
    search() : 데이터의 순서 반환(첫번째 뽑힐 데이터가 첫번째 순서)
    clear() : stack 초기화
 */
    int[] arr = new int[5];
    int temp = 0;
    int indexnum = 0;
    int[] ar = new int[5];

    public void push(int num) {
        arr[indexnum] = num;
        indexnum++;
    }

    public int peek() {
        return arr[indexnum-1];
    }

    public int pop() {//마지막 데이터(첫번째 뽑힐)를 반환하고 삭제
        for(int i = 0; i < indexnum; i++){
            arr[indexnum-1] = 0;
        }
        indexnum--;
        return temp;
    }

    public int search() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr.length) - i;
            temp = arr[i];
        }
        return temp;
    }

    public void clear() {
        arr = ar;
    }
    public void print() {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
