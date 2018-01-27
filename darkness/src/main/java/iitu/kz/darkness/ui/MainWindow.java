package iitu.kz.darkness.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainWindow extends VerticalLayout implements View{
    
    public MainWindow(){
        setSizeFull();
        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        
        Button btn = new Button("Test");
        btn.addClickListener(event->doBtnRegister());
        
        addComponents(btn);
    }
     
    @Override
    public void enter(ViewChangeEvent event){
    }
    
    protected void doBtnRegister() {
//        UI.getCurrent().getNavigator().navigateTo("test");
    }

}
