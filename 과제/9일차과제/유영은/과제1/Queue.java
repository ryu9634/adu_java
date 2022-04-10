public class Queue {
    /*
        queue
        offer() : 요소를 추가
        peek() : 첫번째 데이터를 반환
        poll() : 첫번째 데이터를 반환하고 제거
        remove() : 값제거
        clear : queue 초기화
     */
    int[] arr = new int[5];
    int temp = 0;
    int indexnum = 0;
    int[] ar = new int[5];

    public void offer(int num) {    //요소추가
        arr[indexnum] = num;
        indexnum++;
    }

    public int peek() { //첫번째 데이터 반환
        temp = arr[0];
        return temp;
    }

    public int poll() {//첫번째 데이터를 반환하고 제거
        temp = arr[0];
        for (int i = 0; i < indexnum - 1; i++) {
            arr[i] = arr[i + 1];
            if(arr[i] == arr[i+1]){
                arr[i+1] = 0;
            }
        }
        indexnum--;
        return temp;
    }

    public void remove() {//값제거
        temp = arr[0];
        for (int i = 0; i < indexnum - 1; i++) {
            arr[i] = arr[i + 1];
            if(arr[i] == arr[i+1]){
                arr[i+1] = 0;
            }
        }indexnum--;


    }
    public void clear(){
        arr = ar;
    }
    public void print() {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
