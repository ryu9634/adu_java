public class HomeWork_2 {
    /*
    결과
메뉴를 선택하세요
1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료
1
학번을 입력하세요
반을 입력하세요
이름을 입력하세요
나이를 입력하세요
연락처를 입력하세요
 */
    int StudentNo;
    String className;
    String Name;
    int Old;
    String Phone;

    public HomeWork_2(int studentNo, String className, String name, int old, String phone) {
        this.StudentNo = studentNo;
        this.className = className;
        this.Name = name;
        this.Old = old;
        this.Phone = phone;
    }

    public HomeWork_2() {

    }

    public int getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(int studentNo) {
        StudentNo = studentNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getOld() {
        return Old;
    }

    public void setOld(int old) {
        Old = old;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "학번 : " +StudentNo+ "\n반 :  "+ className +"\n이름 : "+ Name +"\n나이 : "+ Old +"\n연락처 : "+ Phone;
    }
}
