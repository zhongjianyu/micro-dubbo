package dubbo.provider01;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 应用启动类
 * 
 * @author zhongjy
 *
 */
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class)
        .web(WebApplicationType.NONE)
        .run(args);

	}

}
