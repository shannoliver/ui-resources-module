package org.iplantc.core.resources.client.messages;

/**
 * Interface to represent the messages contained in resource bundle:
 * src/main/resources/org/iplantc/core/resources/client/messages/IplantContextualHelpStrings.properties
 */
public interface IplantContextualHelpStrings extends com.google.gwt.i18n.client.Messages {

    /**
     * Translated "
     * <p>
     * This window allows you to quickly find,add, and remove iPlant users within your Collaborators
     * list.
     * </p>
     * <br/>
     * <p>
     * Your current collaborators are displayed when the collaborators window is first opened.
     * </p>
     * <br/>
     * <p>
     * To add a collaborator, enter a name or email address in the search field and click the search
     * icon. Select the (+) icon next to your desired name and a check mark will replace the (+) icon.
     * </p>
     * <br/>
     * <p>
     * To return to your collaborators list, simply click on the buddy icon to the right of the search
     * icon.
     * </p>
     * ".
     * 
     * @return translated "
     *         <p>
     *         This window allows you to quickly find,add, and remove iPlant users within your
     *         Collaborators list.
     *         </p>
     * <br/>
     *         <p>
     *         Your current collaborators are displayed when the collaborators window is first opened.
     *         </p>
     * <br/>
     *         <p>
     *         To add a collaborator, enter a name or email address in the search field and click the
     *         search icon. Select the (+) icon next to your desired name and a check mark will replace
     *         the (+) icon.
     *         </p>
     * <br/>
     *         <p>
     *         To return to your collaborators list, simply click on the buddy icon to the right of the
     *         search icon.
     *         </p>
     *         "
     */
    @DefaultMessage("<p>This window allows you to quickly find,add, and remove iPlant users within your Collaborators list.</p> <br/><p> Your current collaborators are displayed when the collaborators window is first opened.</p> <br/><p> To add a collaborator, enter a name or email address in the search field and click the search icon. Select the (+) icon next to your desired name and a check mark will replace the (+) icon.</p><br/> <p>To return to your collaborators list, simply click on the buddy icon to the right of the search icon.</p> ")
    @Key("collaboratorsHelp")
    String collaboratorsHelp();

    /**
     * Translated "
     * <p>
     * This will be the default location where all outputs from your analyses can be found.
     * </p>
     * <br/>
     * <p>
     * You can keep the default path or click Browse to select a new location.
     * </p>
     * ".
     * 
     * @return translated "
     *         <p>
     *         This will be the default location where all outputs from your analyses can be found.
     *         </p>
     * <br/>
     *         <p>
     *         You can keep the default path or click Browse to select a new location.
     *         </p>
     *         "
     */
    @DefaultMessage("<p>This will be the default location where all outputs from your analyses can be found. </p><br/><p> You can keep the default path or click Browse to select a new location.</p>")
    @Key("defaultOutputFolderHelp")
    String defaultOutputFolderHelp();

    /**
     * Translated "
     * <p>
     * Manage Data Links allows you to create and manage links generated for your data, allowing you to
     * copy the links and share them with others.
     * </p>
     * <p>
     * To create a new link, select the file and click Create.
     * </p>
     * <br/>
     * <p>
     * To create links for multiple files, hold the Shift key, select the multiple files, then click
     * Create.
     * </p>
     * <br/>
     * <p>
     * To break a link, click the link icon with the red \"-\" sign to the left of the file. No one will
     * be able to further use that link and it will not be public. It is good practice to break a link
     * once it is no longer needed.
     * </p>
     * </br>
     * <p>
     * Links can not be generated for folders. The files within the folder must be linked individually.
     * </p>
     * ".
     * 
     * @return translated "
     *         <p>
     *         Manage Data Links allows you to create and manage links generated for your data, allowing
     *         you to copy the links and share them with others.
     *         </p>
     *         <p>
     *         To create a new link, select the file and click Create.
     *         </p>
     * <br/>
     *         <p>
     *         To create links for multiple files, hold the Shift key, select the multiple files, then
     *         click Create.
     *         </p>
     * <br/>
     *         <p>
     *         To break a link, click the link icon with the red \"-\" sign to the left of the file. No
     *         one will be able to further use that link and it will not be public. It is good practice
     *         to break a link once it is no longer needed.
     *         </p>
     *         </br>
     *         <p>
     *         Links can not be generated for folders. The files within the folder must be linked
     *         individually.
     *         </p>
     *         "
     */
    @DefaultMessage("<p>Manage Data Links allows you to create and manage links generated for your data, allowing you to copy the links and share them with others. </p><p> To create a new link, select the file and click Create.</p> <br/><p>To create links for multiple files, hold the Shift key, select the multiple files, then click Create.</p><br/><p>To break a link, click the link icon with the red \"-\" sign to the left of the file. No one will be able to further use that  link and it will not be public. It is good practice to break a link once it is no longer needed.</p> </br><p>Links can not be generated for folders. The files within the folder must be linked individually.</p>")
    @Key("manageDataLinksHelp")
    String manageDataLinksHelp();

    /**
     * Translated "
     * <p>
     * This option will send you an email when your analysis is complete or has failed. It will be sent
     * to the email address you used to register for your iPlant account.
     * </p>
     * </br>
     * <p>
     * This option is helpful if you would like to track the status of your analysis while outside of the
     * Discovery Environment.
     * </p>
     * ".
     * 
     * @return translated "
     *         <p>
     *         This option will send you an email when your analysis is complete or has failed. It will
     *         be sent to the email address you used to register for your iPlant account.
     *         </p>
     *         </br>
     *         <p>
     *         This option is helpful if you would like to track the status of your analysis while
     *         outside of the Discovery Environment.
     *         </p>
     *         "
     */
    @DefaultMessage("<p>This option will send you an email when your analysis is complete or has failed. It will be sent to the email address you used to register for your iPlant account.</p></br><p>This option is helpful if you would like to track the status of your analysis while outside of the Discovery Environment.</p>")
    @Key("notifyemailHelp")
    String notifyemailHelp();

    /**
     * Translated "For example, you may want to include a link to a paper which referenced your app. ".
     * 
     * @return translated
     *         "For example, you may want to include a link to a paper which referenced your app. "
     */
    @DefaultMessage("For example, you may want to include a link to a paper which referenced your app. ")
    @Key("publicSubmissionFormAttach")
    String publicSubmissionFormAttach();

    /**
     * Translated
     * "Select the possible categories under which your app may be displayed in the apps list within the Apps window."
     * .
     * 
     * @return translated
     *         "Select the possible categories under which your app may be displayed in the apps list within the Apps window."
     */
    @DefaultMessage("Select the possible categories under which your app may be displayed in the apps list within the Apps window.")
    @Key("publicSubmissionFormCategories")
    String publicSubmissionFormCategories();

    /**
     * Translated "
     * <p>
     * This option allows the Data Manager to automatically navigate the file tree to the file location
     * that was used the last time you ran an app.
     * </p>
     * <br/>
     * <p>
     * This option is helpful if you have an extensive file tree or often use the same input file
     * location.
     * </p>
     * ".
     * 
     * @return translated "
     *         <p>
     *         This option allows the Data Manager to automatically navigate the file tree to the file
     *         location that was used the last time you ran an app.
     *         </p>
     * <br/>
     *         <p>
     *         This option is helpful if you have an extensive file tree or often use the same input file
     *         location.
     *         </p>
     *         "
     */
    @DefaultMessage("<p>This option allows the Data Manager to automatically navigate the file tree to the file location that was used the last time you ran an app.</p> <br/> <p> This option is helpful if you have an extensive file tree or often use the same input file location.</p>")
    @Key("rememberFileSectorPathHelp")
    String rememberFileSectorPathHelp();

    /**
     * Translated "
     * <p>
     * Enabling the Save session option will restore your Discovery Environment desktop to exactly how
     * you left it when you last logged out.
     * </p>
     * ".
     * 
     * @return translated "
     *         <p>
     *         Enabling the Save session option will restore your Discovery Environment desktop to
     *         exactly how you left it when you last logged out.
     *         </p>
     *         "
     */
    @DefaultMessage("<p>Enabling the Save session option will restore your Discovery Environment desktop to exactly how you left it when you last logged out.</p>")
    @Key("saveSessionHelp")
    String saveSessionHelp();

    /**
     * Translated "
     * <p>
     * There are 3 permission levels: Read, Write, and Ow".
     * 
     * @return translated "
     *         <p>
     *         There are 3 permission levels: Read, Write, and Ow"
     */
    @DefaultMessage("<p>There are 3 permission levels: Read, Write, and Ow")
    @Key("sharePermissionsHelp")
    String sharePermissionsHelp();

    /**
     * Translated "Your Tool Request may be in one of the following Statuses." .
     * 
     * @return translated "Your Tool Request may be in one of the following Statuses."
     */
    @DefaultMessage("Your Tool Request may be in one of the following Statuses.")
    @Key("toolRequestStatusHelp")
    String toolRequestStatusHelp();

    /**
     * Translated
     * "Your requested tool is now available in the Discovery Environment. Please see the Status Comments for more information."
     * .
     * 
     * @return translated
     *         "Your requested tool is now available in the Discovery Environment. Please see the Status Comments for more information."
     */
    @DefaultMessage("Your requested tool is now available in the Discovery Environment. Please see the Status Comments for more information.")
    @Key("toolRequestStatusCompleteHelp")
    String toolRequestStatusCompleteHelp();

    /**
     * Translated
     * "Your tool request is currently being evaluated. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
     * .
     * 
     * @return translated
     *         "Your tool request is currently being evaluated. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
     */
    @DefaultMessage("Your tool request is currently being evaluated. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.")
    @Key("toolRequestStatusEvaluationHelp")
    String toolRequestStatusEvaluationHelp();

    /**
     * Translated
     * "The installation of your requested tool was unsuccessful. Please see the Status Comments for more information."
     * .
     * 
     * @return translated
     *         "The installation of your requested tool was unsuccessful. Please see the Status Comments for more information."
     */
    @DefaultMessage("The installation of your requested tool was unsuccessful. Please see the Status Comments for more information.")
    @Key("toolRequestStatusFailedHelp")
    String toolRequestStatusFailedHelp();

    /**
     * Translated
     * "The iPlant team is currently installing your requested tool. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
     * .
     * 
     * @return translated
     *         "The iPlant team is currently installing your requested tool. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
     */
    @DefaultMessage("The iPlant team is currently installing your requested tool. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.")
    @Key("toolRequestStatusInstallationHelp")
    String toolRequestStatusInstallationHelp();

    /**
     * Translated
     * "The iPlant team is waiting for more information regarding your tool request. Please see the Status Comments for more information."
     * .
     * 
     * @return translated
     *         "The iPlant team is waiting for more information regarding your tool request. Please see the Status Comments for more information."
     */
    @DefaultMessage("The iPlant team is waiting for more information regarding your tool request. Please see the Status Comments for more information.")
    @Key("toolRequestStatusPendingHelp")
    String toolRequestStatusPendingHelp();

    /**
     * Translated
     * "Your tool request has been submitted. You will receive updates in the Discovery Environment as the evaluation and installation process proceeds."
     * .
     * 
     * @return translated
     *         "Your tool request has been submitted. You will receive updates in the Discovery Environment as the evaluation and installation process proceeds."
     */
    @DefaultMessage("Your tool request has been submitted. You will receive updates in the Discovery Environment as the evaluation and installation process proceeds.")
    @Key("toolRequestStatusSubmittedHelp")
    String toolRequestStatusSubmittedHelp();

    /**
     * Translated
     * "The iPlant team is currently validating your requested tool. You will receive notifications in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
     * .
     * 
     * @return translated
     *         "The iPlant team is currently validating your requested tool. You will receive notifications in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
     */
    @DefaultMessage("The iPlant team is currently validating your requested tool. You will receive notifications in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.")
    @Key("toolRequestStatusValidationHelp")
    String toolRequestStatusValidationHelp();
}
