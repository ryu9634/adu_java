public class HomeWork1_Queue {
    private Integer[] obj;          // 객체를 담을 배열
    private int size = 0;           // Queue의 원소의 갯수
    private int capacity = 10;      // 메모리 공간

    public HomeWork1_Queue() {
        this.obj = new Integer[this.capacity];  // 초기 저장용량은 10으로 함
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    private void reSize() {         // 동적크기 할당 메서드 접근 지정자 private
        if (capacity == size) {
            capacity += 10;
            Integer[] temp = new Integer[capacity];
            for (int i = 0; i < size; i++)
                temp[i] = obj[i];
            obj = temp;
        }
    }

    public void offer(Integer element) {
        obj[size++] = element;
        reSize();
    }

    public int search(Integer element) {
        int index = -1;         // 조건에 충족하지 못한 경우 -1 리턴
        for (int i = 0; i < size; i++)
            if (element.equals(obj[i])) {
                index = i + 1;
                break;
            }

        return index;
    }

    public Integer peek() {
        return obj[0];
    }

    public Integer poll() {
        if (obj[0] == null)
            return null;
        int subSize = size - 1;
        Integer temp = obj[0];
        Integer[] temps = new Integer[capacity];
        for(int i = 0 ; i < subSize; i++){
            temps[i] = obj[i+1];
        }
        size--;
        obj = temps;
        return temp;
    }

    @Override
    public String toString() {
        String answer = "";
        for (int i = 0; i < size; i++) {
            if(obj[i] != null)
            answer += obj[i] + " ";
        }
        return "Queue : " + answer;
    }
}

