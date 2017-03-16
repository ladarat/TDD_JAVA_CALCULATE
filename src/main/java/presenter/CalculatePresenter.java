package presenter;

public class CalculatePresenter {
    private View view;

    public CalculatePresenter(View view) {

        this.view = view;
    }

    public int sum(int oprOne, int oprTwo) {

        return oprOne + oprTwo;
    }

    public interface View {
    }
}
