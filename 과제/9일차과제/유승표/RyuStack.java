import java.util.Arrays;

/*
push()   : 요소를 저장
peek()   : 마지막(첫번째 뽑힐) 데이터를 반환
pop()    : 마지막(첫번째 뽑힐) 데이터를 반환하고 삭제
search() : 데이터의 순서를 반환
 */
public class RyuStack {
    int arrayNum = 0;  // 배열의 방의 순번
    int[] stack = new int[5]; // 5개의 방 생성


    public void push(int Num) { // 값을 입력해야하기 때문에 void 사용


        stack[arrayNum] = Num; //첫번째 입력되는 rearNum 을 queue[0] 에 입력
        arrayNum++;  // 다음 계산에서 값을 덮어 씌우지 않기 위해서 ++ 을 통하여 방의 번호를 바꿈
    }

    public int peek() { //배열의 가장 마지막에 입력된 값을 출력
        int LastNum = 0;
        for (int i = stack.length - 1; i <= stack.length && i >= 0; i--) {  //중간에 0 이 값으로 들어갈수있나..?음...
            //배열의 끝부터 값을뽑으려면...우우워우어ㅜ렁마뤼ㅏㅓㄴ이
            if (stack[i] != 0) { // 뒤에 배열값이 없으면 0이 찍히니까 뒤부터 검사해서 나아가다 값을 발견하면
                LastNum = stack[i]; //방이 5개인데 stack[5] 하면 빨간줄은 없는데 실행오류생김
                break;
            }
        }
        return LastNum;
    }

    public int pop() {
        int LastNum = 0; //그 마지막에 입력될 변수 초기화
        for (int i = stack.length - 1; i <= stack.length && i >= 0; i--) { //for문으로 배열의 끝부터  i--로 0까지 내려감
            if (stack[i] != 0) { //내려가다가 0이 아닌 값을 만나면 그 값가 마지막에 입력된 값이니까
                LastNum = stack[i]; //그 값을 리턴값으로 뽑아내고
                // 뽑아내고 난 값을 다음값인 0으로 덮어  버려서 삭제시킴
                if ( stack[stack.length-1] != 0){ //만약에 배열의 마지막 방에 값이 있으면 i+1 로 덮으려하면 오류나니까
                    stack[stack.length-1] = 0;  // 그냥 0으로 값을 줘서 없애버림 근데 0을 넣으면 값이 0이되는거니까 삭제가 맞는건가
                }else stack[i] = stack [i+1];
                break;
            }
        }
        return LastNum;


    }

    @Override
    public String toString() {
        return "RyuStack{" +
                "arrayNum=" + arrayNum +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
}
