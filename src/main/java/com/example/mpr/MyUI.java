package com.example.mpr;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.LegacyWrapper;
import com.vaadin.mpr.core.HasLegacyComponents;
import com.vaadin.mpr.core.MprTheme;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@Route("")
@MprTheme("valo")
public class MyUI extends Div implements HasLegacyComponents {

    public MyUI() {
        final VerticalLayout layout = new VerticalLayout();

        add(new LegacyWrapper(layout));

        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            layout.addComponent(
                    new Label("Thanks " + name.getValue() + ", it works!"));
        });

        layout.addComponents(name, button);
    }
}
