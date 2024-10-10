김영한 강의 7. scanner 상품 구매 문제
``` java
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int choice = scanner.nextInt();
            if(choice==1){
                scanner.nextLine();
                System.out.print("상품명을 입력하세요: ");
                String productName= scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력사헤요: ");
                int amount =scanner.nextInt();
                sum= amount*price;
                System.out.println("상품명: "+productName+" 가격: "+price+" 합계: "+sum);
            } else if (choice==2){
                System.out.println("총 비용: "+sum);
                sum=0;
            } else if (choice==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else{
                System.out.println("올바른 번호를 입력해주세요.");
            }
            
        }
    }
}

```
