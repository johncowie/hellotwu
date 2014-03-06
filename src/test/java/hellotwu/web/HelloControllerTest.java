package hellotwu.web;

import hellotwu.service.HelloService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.ModelMap;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest extends TestCase {

    @Mock
    private HelloService helloService;

    @Test
    public void shouldGetMessageFromHelloService() {
        final HelloController helloController = new HelloController(helloService);
        ModelMap modelMap = new ModelMap();

        final String message = "Hello";
        when(helloService.getGreeting()).thenReturn(message);

        helloController.displayMessage(modelMap);

        assertEquals(message, modelMap.get("message"));
    }

}
