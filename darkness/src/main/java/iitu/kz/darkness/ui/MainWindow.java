package iitu.kz.darkness.ui;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbstractComponentContainer;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class MainWindow extends VerticalLayout implements View {

    Label title = new Label();
    private VerticalLayout updatedFields = new VerticalLayout();
    private VerticalLayout vertFormLayout = new VerticalLayout();

    private long numOfSpecialities = 0;

    private MainWindowPresenter presenter;

    public MainWindow() {
        this.presenter = new MainWindowPresenter();
        setupIU();
        createSpecialityInputs();
    }

    @Override
    public void enter(ViewChangeEvent event) {}

    protected void setupIU() {
        setSizeFull();
        setDefaultComponentAlignment(Alignment.TOP_CENTER);
//        title.addStyleName(ValoTheme.LABEL_H2);  
        
    }

    protected void createSpecialityInputs() {

        title.setValue("Speciality");

        TextField numOfSpec = new TextField("How many speciality do you want to add ?");
        numOfSpec.setPlaceholder("1");

        Button btnOk = new Button("OK");
        btnOk.addClickListener(event -> ok(numOfSpec));

        updatedFields.addComponents(numOfSpec, btnOk);

        addComponents(title, updatedFields);

    }

    private void ok(TextField field) {
        if (!field.isEmpty()) {
            numOfSpecialities = Integer.parseInt(field.getValue());
        } else {
            numOfSpecialities = 1;
        }
        specialityInputs();
    }

    protected void specialityInputs() {
        updatedFields.removeAllComponents();

        TextField specName = new TextField("Name of Speciality");

        Button btnCreate = new Button("Create");
        btnCreate.addClickListener(event -> addSpecialty(event,specName));

        vertFormLayout.removeAllComponents();
        vertFormLayout.setVisible(false);
        
        FormLayout formLayout = new FormLayout();

        TextField groupName1 = new TextField("Group 1");
        groupName1.setRequiredIndicatorVisible(true);

        TextField groupName2 = new TextField("Group 2");
        groupName2.setRequiredIndicatorVisible(true);

        TextField groupName3 = new TextField("Group 3");
        groupName3.setRequiredIndicatorVisible(true);

        formLayout.addComponents(groupName1, groupName2, groupName3);
        
        Button btnAdd = new Button("Add");
        btnCreate.addClickListener(event -> addGroup(groupName1,groupName2,groupName3));

        vertFormLayout.addComponents(formLayout, btnAdd);        
        
        updatedFields.addComponents(specName, btnCreate, vertFormLayout);
        
        
    }

    private void addGroup(TextField groupName1, TextField groupName2, TextField groupName3) {
        presenter.addGroup(groupName1.getValue());
        presenter.addGroup(groupName2.getValue());
        presenter.addGroup(groupName3.getValue());        
    }

    private void addSpecialty(ClickEvent event, TextField nameOfSpec) {
        if (!nameOfSpec.isEmpty()) {
            presenter.addSpeciality(nameOfSpec.getValue());
            vertFormLayout.setVisible(true);
            title.setValue("Groups of Specialties");
            event.getButton().setVisible(false);
        } else {
            return;
        }
        
    }

}
