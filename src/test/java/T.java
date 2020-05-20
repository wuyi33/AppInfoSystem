import com.jbit.entity.DevUser;
import com.jbit.service.DevUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applictionContext.xml")
public class T {

    @Resource
    private DevUserService devUserService;

    @Test
    public void queryLogin() {
        DevUser devUser = devUserService.queryLogin("test001", "123456");
        System.out.println("devUser = " + devUser);
    }
}
