package gr.istl.virtualtoolkitsc.widgets.gwt;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Button;

import gr.istl.virtualtoolkitsc.api.listeners.VirtualActionListener;
import gr.istl.virtualtoolkitsc.widgets.VirtualButton;

public class GWTButton extends GWTComponent implements VirtualButton {

	private ArrayList<VirtualActionListener> vActionListeners = new ArrayList<VirtualActionListener>();
	// private ArrayList<VirtualMouseMoveListener> vMouseMoveListeners = new
	// ArrayList<VirtualMouseMoveListener>();

	public GWTButton(Button button) {
		super(button);
	}

	@Override
	protected void init() {
		super.init();
		getButton().addClickHandler(new GWTButtonEventForwarder(this));
	}

	public Button getButton() {
		return (Button) component;
	}

	@Override
	public void addActionListener(VirtualActionListener listener) {
		vActionListeners.add(listener);
	}

	// @Override
	// public void addMouseMoveListener(VirtualMouseMoveListener listener) {
	// vMouseMoveListeners.add(listener);
	// }

	@Override
	public ArrayList<VirtualActionListener> getVirtualActionListeners() {
		return vActionListeners;
	}

	// public ArrayList<VirtualMouseMoveListener> getVirtualMouseMoveListeners() {
	// return vMouseMoveListeners;
	// }

	@Override
	public void setText(String text) {
		getButton().setText(text);
	}

	@Override
	public String getText() {
		return getButton().getText();
	}

	@Override
	public void addStyleName(String style) {
		getButton().addStyleName(style);
	}

	@Override
	public void removeStyleName(String name) {
		getButton().removeStyleName(name);
	}

}
