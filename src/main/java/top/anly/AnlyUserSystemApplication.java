package top.anly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wangli
 * @date 2020/10/29 15:03
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AnlyUserSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnlyUserSystemApplication.class, args);
        System.out.println("anly_user_system项目启动成功!!!");
    }
}
