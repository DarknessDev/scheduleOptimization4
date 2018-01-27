package iitu.kz.darkness.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import iitu.kz.darkness.entities.Speciality;

@SuppressWarnings("serial")
public class MainWindow extends VerticalLayout implements View {

    private VerticalLayout updatedFields = new VerticalLayout();
    private VerticalLayout vertFormLayout = new VerticalLayout();

    private long numOfSpecialities = 0;
    private long numOfSpec = 0;

    private long currSpecId = 0;

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
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        updatedFields.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        vertFormLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

    }

    protected void createSpecialityInputs() {

        Label title = new Label();
        title.setValue("Wellcome");
        title.addStyleName(ValoTheme.LABEL_H2);
        title.setSizeUndefined();

        TextField numOfSpec = new TextField("How many speciality do you want to add ?");
        numOfSpec.setPlaceholder("1");

        Button btnOk = new Button("OK");
        btnOk.addClickListener(event -> ok(numOfSpec));

        updatedFields.addComponents(title, numOfSpec, btnOk);


        addComponents(updatedFields);

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

        Label title = new Label();
        title.setValue("Create Speciality");
        title.addStyleName(ValoTheme.LABEL_H2);
        title.setSizeUndefined();

        TextField specName = new TextField("Name of Speciality");

        Button btnCreate = new Button("Create");
        btnCreate.addClickListener(event -> addSpecialty(event, specName));

        updatedFields.addComponents(title, specName, btnCreate);
        addComponent(updatedFields);

    }

    private void addGroup(long currSpecId2, TextField groupName1, TextField groupName2, TextField groupName3) {
        if (!groupName1.isEmpty() && !groupName2.isEmpty() && !groupName3.isEmpty()) {
            presenter.addGroup(currSpecId2, groupName1.getValue());
            presenter.addGroup(currSpecId2, groupName2.getValue());
            presenter.addGroup(currSpecId2, groupName3.getValue());

            numOfSpec++;
            if (numOfSpecialities > numOfSpec) {
                vertFormLayout.removeAllComponents();
                specialityInputs();
            }else{
                removeAllComponents();
            }
        }
    }

    private void addSpecialty(ClickEvent event, TextField nameOfSpec) {
        if (!nameOfSpec.isEmpty()) {
            Speciality addSpeciality = presenter.addSpeciality(nameOfSpec.getValue());
            currSpecId = addSpeciality.getId();
            vertFormLayout.setVisible(true);
            event.getButton().setVisible(false);
            groupInputs();
        } else {
            return;
        }

    }

    private void groupInputs() {
        FormLayout formLayout = new FormLayout();
        formLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        TextField groupName1 = new TextField("Group 1");
        groupName1.setRequiredIndicatorVisible(true);

        TextField groupName2 = new TextField("Group 2");
        groupName2.setRequiredIndicatorVisible(true);

        TextField groupName3 = new TextField("Group 3");
        groupName3.setRequiredIndicatorVisible(true);

        formLayout.addComponents(groupName1, groupName2, groupName3);

        Button btnAdd = new Button("Add");
        btnAdd.addClickListener(event -> addGroup(currSpecId, groupName1, groupName2, groupName3));

        vertFormLayout.addComponents(formLayout, btnAdd);
        addComponent(vertFormLayout);
    }

}
