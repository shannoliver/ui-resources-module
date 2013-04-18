/**
 *
 */
package org.iplantc.core.resources.client.messages;

import com.google.gwt.core.shared.GWT;

/**
 * @author sriram
 *
 */
public class I18N {

	public final static IplantDisplayStrings DISPLAY = GWT.create(IplantDisplayStrings.class);
	public static final IplantErrorStrings  ERROR = GWT.create(IplantErrorStrings.class);
    public static final IplantValidationMessages RULES = GWT.create(IplantValidationMessages.class);
}
