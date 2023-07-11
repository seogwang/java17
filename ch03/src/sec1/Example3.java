package sec1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // 키보드로 학번과 세 과목 점수를 입력받아
        // 총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        // tot(총점), avg(평균), hak(학점), Pan(판정), grd(등급)
        // 총점 = 전산 + PG + OA
        // 평균은 세 과목의 점수의 촘점을 3으로 나눈 실수
        // 학점은 평균이 96 이상 A+, 93 이상은 A0,90 이상 A-
        //  86 이상 B+, 83이상은 B0,80이상 B-
        //  76 이상 C+, 73이상은 C0,70이상 C-
        //  66 이상 D+, 63이상은 D0,60이상 D-
        // 나머지는 F
        // 판정은 평균이 80이상이면서, 세 과목 모두 70이상이면, "합격",아니면, "불합격"
        // 등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면, 4등급, 3이면, 3등급,
        // 2이면 2등급, 1이면 1등급
        // 출력형식
        // 학번   전산  PG  OA 총점 평균 학점 판정 등급.
        // XXX   XX   XX   xx  xxx  xx.xx   xx  x등급
        Scanner score = new Scanner(System.in);

        //학번, 점수 입력받기
        System.out.println("학번 입력 : ");
        int stnum = score.nextInt();
        System.out.println("전산 점수 입력 : ");
        int js = score.nextInt();
        System.out.println("PG 점수 입력 : ");
        int pg = score.nextInt();
        System.out.println("OA 점수 입력 : ");
        int oa = score.nextInt();

        //총점, 평균 구하기
        int tot = js + pg + oa;
        float avg = (float) tot / 3;

        //학점 구하기
        String hak = "";
        if (avg>=96) hak="A+";
        else if (avg>=93) hak="A0";
        else if (avg>=90) hak="A-";
        else if (avg>=86) hak="B+";
        else if (avg>=83) hak="B0";
        else if (avg>=80) hak="B-";
        else if (avg>=76) hak="C+";
        else if (avg>=73) hak="C0";
        else if (avg>=70) hak="C-";
        else if (avg>=66) hak="D+";
        else if (avg>=63) hak="D0";
        else if (avg>=60) hak="D-";
        else hak="F";

        //판정 조건식
        String pan = "";
        if (avg>=80 && js>=70 && pg>=70 && oa>=70 ) pan="합격";
        else pan="불합격";

        //등급 조건식
        int pt = (int) avg / 20;
        String grade = "";
        switch (pt) {
            case 5:
                grade = "1등급";
                break;
            case 4:
                grade = "2등급";
                break;
            case 3:
                grade = "3등급";
                break;
            case 2:
                grade = "4등급";
                break;
            case 1:
                grade = "5등급";
                break;
            default:
                grade = "판정불가";
        }
        System.out.println("학번       전산 PG OA 총점 평균 학점 판정 등급");
        System.out.printf("%d %d %d %d %d %3.2f %s %s %s\n", stnum, js, pg, oa, tot, avg, hak, pan, grade);
        // System.out.println(stnum+" "+js+" "+pg+" "+oa+" "+tot+" "+avg+" "+hak+" "+pan+" "+grade);
    }
}
