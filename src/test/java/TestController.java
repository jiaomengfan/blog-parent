import org.jmf.controller.HelloController;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * @ClassName TestController
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/14 15:00
 * @Version 1.0
 **/
@SpringBootTest
public class TestController {
    private MockMvc mockMvc;

    @BeforeEach
    public void beforeEach(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    public void testHello() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/boot")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello")));
    }




}




