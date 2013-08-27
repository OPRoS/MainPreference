/*
 * MainPreferencePage.java
 * 
 * Name: OPRoS-KNU
 * Date: 2011-07-05
 * It is the main preference page for tabbed preference 
 * pages for OPRoS IDE.  
 * 
 * Name: OPRoS-KNU
 * Date: 2011-09-02
 * OPRoS local repository directory path and 
 * copyright contents are added
 * 
 */
package org.opros.mainpreference.preferences;

//import java.awt.Image;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.opros.mainpreference.Activator;

public class MainPreferencePage extends FieldEditorPreferencePage
     implements IWorkbenchPreferencePage {
	
	private DirectoryFieldEditor localRepositoryField; 

	public MainPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("******* Open Platform for Robotic Services (OPRoS) *******\n\n"+
					   "OPRoS Homepage: <http://www.opros.or.kr>\n"+
					   "OPRoS Contact : opros.contact@gmail.com\n\n" +
					   "*********************************************************\n\n"); 
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		
		addField(
				new StringFieldEditor(PreferenceConstants.COPYRIGHT_LICENSE, "License:", getFieldEditorParent()));		
		addField(
			new StringFieldEditor(PreferenceConstants.COPYRIGHT_VERSION, "Version:", getFieldEditorParent()));

		addField(
			new StringFieldEditor(PreferenceConstants.COPYRIGHT_NAME, "Copyright Name:", getFieldEditorParent()));
		addField(
			new StringFieldEditor(PreferenceConstants.COPYRIGHT_ADDRESS, "Copyright Address:", getFieldEditorParent()));
		addField(
			new StringFieldEditor(PreferenceConstants.COPYRIGHT_PHONE, "Copyright Phone:", getFieldEditorParent()));
		addField(
			new StringFieldEditor(PreferenceConstants.COPYRIGHT_HOMEPAGE, "Copyright Homepage:", getFieldEditorParent()));
						
		localRepositoryField=new DirectoryFieldEditor(PreferenceConstants.LOCAL_REPOSITORY_PATH, 
				"&Local Repository Path: ", getFieldEditorParent());
		addField(localRepositoryField);

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
/*
	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}
*/	
	



}