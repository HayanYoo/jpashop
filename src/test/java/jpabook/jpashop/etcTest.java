package jpabook.jpashop;

import net.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class etcTest {

    @Test
    public void calculateProfits() throws IllegalArgumentException {
        String price = "400000";
        int price2 = 0;
        int tax;

        // 유효성 검사
        try {

            price2 = Integer.parseInt(price);
            if(price2 < 0) throw new IllegalArgumentException();

            if(price2 <= 500000){
                tax = 20;
            } else if ( price2 <= 1000000){
                tax = 10;
            } else {
                tax = 5;
            }
            int result = price2 - price2 * tax / 100;
            System.out.println(result);

        } catch (Exception e){
        }

    }


}
