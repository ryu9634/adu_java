import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WordController {
    private ArrayList<Word> list;

    public ArrayList<Word> getList() {
        return list;
    }

    public void setList(ArrayList<Word> list) {
        this.list = list;
    }

    public void insert(String eng){
        String kor, wdate;
        int lev;
        Word w;

        Scanner sc = new Scanner(System.in);
        System.out.print("* 뜻을 입력하세요 : ");
        kor = sc.next();
        System.out.print("* 레벨을 입력하세요 : ");
        lev = sc.nextInt();
        System.out.print("* 날짜를 입력하세요 : ");
        wdate = sc.next();
        w = new Word(eng, kor, lev, wdate);
        list.add(w);
    }

    public void list(){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public boolean find(){
        Scanner sc = new Scanner(System.in);
        boolean isFind = false;
        System.out.println("* 찾는 단어를 입력하세요");
        String find = sc.next();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getEnglish().equals(find)){
                System.out.println(list.get(i));
                isFind = true;
            }
        }
        return isFind;
    }

    public void save(String file){
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(file));
            for(Word w : list){
                pw.println(w);
            }
            System.out.println("저장되었습니다");
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void read(String file){
        Scanner sc = null;
        String temp;
        String[] arr;
        Word w;

        try{
            sc = new Scanner(new FileInputStream(file));
            while(sc.hasNextLine()){
                temp = sc.nextLine();
                arr = temp.split(", ");
                w = new Word(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]);
                list.add(w);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
