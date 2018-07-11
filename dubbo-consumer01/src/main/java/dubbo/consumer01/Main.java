package dubbo.consumer01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动类
 * 
 * @author zhongjy
 *
 */
@SpringBootApplication(scanBasePackages = "dubbo.consumer01")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

}
