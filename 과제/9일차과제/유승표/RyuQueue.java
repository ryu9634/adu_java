import java.util.Arrays;

/*
offer()  : 요소를 추가
peek() : 첫번째 데이터를 반환
poll() : 첫번째 데이터를 반환하고 제거
remove() : 값 제거
clear : queue 초기화
 */

public class RyuQueue {
    int arrayNum = 0;  // 배열의 방의 순번
    int[] queue = new int[5]; // 5개의 방 생성


    public void offer(int rearNum) { // 값을 입력해야하기 때문에 void 사용
        queue[arrayNum] = rearNum; //첫번째 입력되는 rearNum 을 queue[0] 에 입력
        arrayNum++;  // 다음 계산에서 값을 덮어 씌우지 않기 위해서 ++ 을 통하여 방의 번호를 바꿈
    }

    public int peek() { //배열의 가장 첫번째 값을 출력
        return queue[0];
    }

    public int poll() {//poll 배열의 마지막 (첫번째로 입력한) 데이터를 삭제
        int frontIndex = 0;      //첫번째배열의방의 값이 제일 먼저 삭제됨
        int nextIndex = 1;       //두번째배열의방의 값
        int pollNum = queue[0];  //반환된후 삭제되어야하는 값
        for (int i = 0; i < queue.length; i++) { //배열의 크기만큼 반복문을 돌림
            queue[frontIndex] = queue[nextIndex]; // queue[1] 의 값을 queue[0] 으로 입력한다.
            frontIndex++;  // [0] 의 값을 [1] 값으로 바꾸어줌
            nextIndex++;   // [1] 의 값을 [2] 값으로 바꾸어줌
            //반복되면서 [2] 의 값은 [1] 로 [3]의 값은 [2] 로 값이 이전됨
            if (frontIndex == queue.length || nextIndex == queue.length) break; //배열의 크기가 5이므로 맥주알딸딸
            // 5가 넘어가면 오류가 발생한다. 오류발생을 막기위해 5가 되면 동작을 그만하게끔 break 를 사용하여따
        }
        return pollNum; // 숫자 반환
    }

    @Override
    public String toString() {
        return  "그거 = " + arrayNum +", 는 이거 = " + Arrays.toString(queue) +
                '}';
    }
}


