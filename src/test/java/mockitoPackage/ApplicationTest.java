package mockitoPackage;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ApplicationTest {

    @SuppressWarnings("unchecked")
    @Test
    public void test() {
        // using Mockito.mock() method
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(5);
        assertEquals(5, mockList.size());
    }
}
