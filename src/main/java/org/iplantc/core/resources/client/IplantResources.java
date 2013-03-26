/**
 * 
 */
package org.iplantc.core.resources.client;

import org.iplantc.core.resources.client.messages.IplantDisplayStrings;
import org.iplantc.core.resources.client.messages.IplantErrorStrings;

import com.google.gwt.core.shared.GWT;

/**
 * @author sriram
 *
 */
public class IplantResources {

	public static IplantDisplayStrings DISPLAY = GWT.create(IplantDisplayStrings.class);
	
	public static IplantErrorStrings ERROR = GWT.create(IplantErrorStrings.class);
	
	public static Icons ICON = GWT.create(Icons.class);
	
}
