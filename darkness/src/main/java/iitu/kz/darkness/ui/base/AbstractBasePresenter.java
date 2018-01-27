package iitu.kz.darkness.ui.base;

public class AbstractBasePresenter {

    public AbstractBasePresenter() {
        MvpInjector.Inject(this);
    }
}
