import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in) ;
        int sum=0 ;  // 입력받은 값들의 합을 저장
        int count=0 ;  // 입력받은 수들의 개수를 저장
        int num=0 ;  // 숫자를 입력받아 저장
        int h_sum=0 ;  // 조화 평균을 계산하기 위한 합을 저장

        System.out.println("값을 입력하세요 (0이 되면 종료)");
        while((num=data.nextInt())!=0) {  // 입력값이 0이 아니면 계속 반복을 수행 -> 입력값이 0이면 종료
            sum += num ;  // 입력된 값들을 누적해서 더함
            count++ ;  // 0이 아닌 수가 입력될 때마다 1씩 증가 -> 숫자의 개수를 카운트
            h_sum += 1/(double)num;
        }
        System.out.println("입력된 숫자들의 개수는" + count + "입니다.") ;
        System.out.println("입력된 숫자들의 합" + sum + " ,산술평균 :" + (double)sum/count) ;
        System.out.println("입력된 숫자들의 합" + sum + " ,조화평균 :" + 1/h_sum/count) ;

        data.close();
    }


}
