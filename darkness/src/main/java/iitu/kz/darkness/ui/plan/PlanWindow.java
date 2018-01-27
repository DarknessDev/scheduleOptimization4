package iitu.kz.darkness.ui.plan;

import java.util.Collection;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

import iitu.kz.darkness.entities.Speciality;

@SuppressWarnings("serial")
public class PlanWindow extends VerticalLayout implements View {


    private PlanWindowPresenter presenter;

    public PlanWindow() {
        setupUI();
        createGrid();
    }

    private void createGrid() {
        Grid<Speciality> grid = new Grid<>();
        List<Speciality> createItems = createItems();
        
        grid.setItems((Collection<Speciality>) createItems());
        grid.addColumn(Speciality::getName).setCaption("Speciality");
            
        for(Speciality spec:createItems){
            spec.getGroups();
        }
        addComponent(grid);

    }

    private List<Speciality> createItems() {
        return presenter.getAllSpeciality();
    }

    private void setupUI() {
        this.presenter = new PlanWindowPresenter();

    }
}
