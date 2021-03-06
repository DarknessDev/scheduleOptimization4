package iitu.kz.darkness;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.UI;

import iitu.kz.darkness.ui.MainWindow;
import iitu.kz.darkness.ui.plan.PlanWindow;

@SuppressWarnings("serial")
@SpringUI
@Theme("valo")
@UIScope
public class ScheduleUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        navigator = new Navigator(this,this);
        navigator.addView("testInput", new MainWindow());
        navigator.addView("", new PlanWindow());
//        navigator.addView("register", UserRegisterViewImpl.class);        
    }
    
    private Navigator navigator;
    
    public Navigator getNavigator(){
        return navigator;
    }

}
