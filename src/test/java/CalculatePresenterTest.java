import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import presenter.CalculatePresenter;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.spy;

public class CalculatePresenterTest {

    @Mock
    private
    CalculatePresenter.View view;

    @Test
    public void บวกเลข_1_บวก_1_เท่ากับ_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        CalculatePresenter presenter = new CalculatePresenter(view);
        CalculatePresenter spyPresenter = spy(presenter);

        int oprOne = 1;
        int oprTwo = 1;
        int result = presenter.sum(oprOne, oprTwo);

        Assert.assertEquals("Success Sum", 2, result);
    }

}
