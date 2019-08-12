package com.findsec.find;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;

public class LoginForm extends Form<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginForm(String id) {
		super(id);
	}

	public final void onSubmit() {
		
		add(new Label("someLabel").setEscapeModelStrings(false));
	}
}