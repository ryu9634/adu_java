public class HomeWork1_Stack {
    private Integer[] obj;          // 객체를 담을 배열
    private int size = 0;           // stack의 원소의 갯수
    private int arrayIndex = -1;    // search와 pop을 위한 인덱스 유사 값
    private int capacity = 10;      // 메모리 공간

    public HomeWork1_Stack() {
        this.obj = new Integer[this.capacity];  // 초기 저장용량은 10으로 함
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    private void reSize() {         // 동적크기 할당 메서드
        if (capacity == size) {
            capacity += 10;
            Integer[] temp = new Integer[capacity];
            for (int i = 0; i < size; i++)
                temp[i] = obj[i];
            obj = temp;
        }
    }

    public void push(Integer element) {
        obj[size++] = element;
        arrayIndex++;
        reSize();
    }

    public int search(Integer element) {
        int index = -1;         // 조건에 충족하지 못한 경우 -1 리턴
        for (int i = 0; i < size; i++)
            if (element.equals(obj[i])) {
                index = size - i;
                break;
            }

        return index;
    }

    public int peek() {
        return obj[arrayIndex];
    }

    public int pop() {
        int temp = obj[arrayIndex];
        obj[arrayIndex--] = null;
        size--;

        return temp;
    }

    @Override
    public String toString() {
        int tempSize = 0;
        String answer = "";
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                tempSize++;
            }
        }
        for (int i = 0; i < tempSize; i++) {
            answer += obj[i] + " ";
        }

        return "Stack : " + answer;
    }
}
