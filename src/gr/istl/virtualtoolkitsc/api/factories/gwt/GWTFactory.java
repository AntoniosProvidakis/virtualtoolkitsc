package gr.istl.virtualtoolkitsc.api.factories.gwt;

import com.google.gwt.user.client.ui.Button;

import gr.istl.virtualtoolkitsc.api.factories.abstraction.UIFactory;
import gr.istl.virtualtoolkitsc.api.listeners.abstraction.AbstractButtonHandler;
import gr.istl.virtualtoolkitsc.api.listeners.gwt.GWTButtonHandler;
import gr.istl.virtualtoolkitsc.api.widgets.abstraction.AbstractButton;
import gr.istl.virtualtoolkitsc.api.widgets.abstraction.AbstractFlowPanel;
import gr.istl.virtualtoolkitsc.api.widgets.abstraction.AbstractWindow;
import gr.istl.virtualtoolkitsc.api.widgets.gwt.GWTButton;
import gr.istl.virtualtoolkitsc.api.widgets.gwt.GWTFlowPanel;
import gr.istl.virtualtoolkitsc.api.widgets.gwt.GWTWindow;

public class GWTFactory extends UIFactory {

	@Override
	public AbstractWindow createWindow() {
		return new GWTWindow();
	}

	@Override
	public AbstractFlowPanel createFlowPanel() {
		return new GWTFlowPanel();
	}

	@Override
	public AbstractButton createButton() {
		return new GWTButton();
	}
		
	@Override
	public AbstractButtonHandler createButtonHandler(AbstractButton button) {
		return new GWTButtonHandler((Button) button);
	}

}