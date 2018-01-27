package iitu.kz.darkness.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class MainWindow extends VerticalLayout implements View {

    public MainWindow() {
        setupIU();
        createSpecialityInputs();
    }



    @Override
    public void enter(ViewChangeEvent event) {}

    protected void setupIU() {
        setSizeFull();
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
    }

    protected void createSpecialityInputs() {

        TextField numOfSpec = new TextField("How many speciality do you want to add ?");

        Label title = new Label("Enter Speciality");
        title.addStyleName(ValoTheme.LABEL_H2);
        title.setSizeUndefined();

        TextField specName = new TextField("Name");

        HorizontalLayout forBtns = new HorizontalLayout();
        forBtns.setSpacing(true);

        Button btnAdd = new Button("ADD");
        Button btnNext = new Button("NEXT");

        forBtns.addComponents(btnAdd, btnNext);

        addComponents(title, specName, forBtns);

    }

    protected void doBtnRegister() {
        // UI.getCurrent().getNavigator().navigateTo("test");
    }

}
