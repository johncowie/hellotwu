package hellotwu.web;

import hellotwu.service.HelloService;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.ui.ModelMap;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class HelloControllerTest {
    @Mock
    private HelloService helloService;

    @Test
    public void shouldGetMessageFromHelloService() {
        initMocks(this);
        final HelloController helloController = new HelloController(helloService);
        ModelMap modelMap = new ModelMap();

        final String message = "Hello";
        when(helloService.getGreeting()).thenReturn(message);

        helloController.displayMessage(modelMap);

        assertEquals(message, modelMap.get("message"));
    }

}
