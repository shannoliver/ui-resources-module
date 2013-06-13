/**
 *
 */
package org.iplantc.core.resources.client.messages;

import org.iplantc.core.resources.client.constants.IplantValidationConstants;

import com.google.gwt.core.shared.GWT;

/**
 * @author sriram
 *
 */
public class I18N {

    public static final IplantDisplayStrings DISPLAY = GWT.create(IplantDisplayStrings.class);
	public static final IplantErrorStrings  ERROR = GWT.create(IplantErrorStrings.class);
    public static final IplantValidationMessages RULES = GWT.create(IplantValidationMessages.class);
    public static final IplantContextualHelpStrings HELP = GWT.create(IplantContextualHelpStrings.class);
    public static final IplantValidationConstants V_CONSTANTS = GWT.create(IplantValidationConstants.class);
    public static final IplantNewUserTourStrings TOUR = GWT.create(IplantNewUserTourStrings.class);
}
