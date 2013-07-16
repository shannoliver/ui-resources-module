/**
 *
 */
package org.iplantc.core.resources.client;

import org.iplantc.core.resources.client.uiapps.integration.AppIntegrationPaletteImages;
import org.iplantc.core.resources.client.uiapps.widgets.ArgumentListEditorCss;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * @author sriram
 * 
 */
public interface IplantResources extends ClientBundle, AppResources, DiskResourceResources,
        AppIntegrationPaletteImages, DEHeaderResources, DataLinkResources, DataCollapseResources {

    public static IplantResources RESOURCES = GWT.create(IplantResources.class);

    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("iplant_tiny.png")
    ImageResource iplantTiny();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("list-items.gif")
    ImageResource listItems();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("delete.gif")
    ImageResource cancel();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("save.gif")
    ImageResource save();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("refresh.gif")
    ImageResource refresh();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("whitelogo.png")
    ImageResource whitelogo();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("Stop.png")
    ImageResource stop();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("tick.png")
    ImageResource tick();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("up.gif")
    ImageResource goUp();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("analysis_gear.gif")
    ImageResource userMenu();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("run.png")
    ImageResource run();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("edit.gif")
    ImageResource edit();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("file_copy.gif")
    ImageResource copy();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("comments.png")
    ImageResource metadata();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("arrow_undo.png")
    ImageResource arrow_undo();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("delete_icon.png")
    ImageResource deleteIcon();

    /**
     * 
     * @return image.
     */
    @Source("arrow.gif")
    ImageResource menuAnchor();

    @Source("iplant_about.png")
    ImageResource iplantAbout();

    @Source("wand.png")
    ImageResource layoutWand();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("arrow_undo.png")
    ImageResource arrowUndo();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("book.png")
    ImageResource subCategory();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("book_edit.png")
    ImageResource cat_edit();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("magnifier.png")
    ImageResource search();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("new.gif")
    ImageResource add();

    /**
     * Image resource
     * 
     * @return image.
     */
    @Source("delete.gif")
    ImageResource delete();

    /**
     * Image resource for window title-bars and the taskbar.
     * 
     * @return image.
     */
    @Source("whitelogo_sm.png")
    ImageResource whitelogoSmall();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("group_key.png")
    ImageResource share();

    /**
	 * the close window icon
	 * 
	 * @return image.
	 */
    @Source("close.png")
    ImageResource close();

    /**
	 * the close window icon to show when the mouse is over the closer
	 * 
	 * @return image.
	 */
	@Source("close_hover.png")
	ImageResource closeHover();

	/**
	 * Image resource.
	 * 
	 * @return image.
	 */
    @Source("group.png")
    ImageResource viewCurrentCollabs();

    @Source("down.png")
    DataResource down();

    @Source("trash_can_open.png")
    DataResource trashOpen();

    @Source("trash_can_close.png")
    DataResource trashClose();

    @Source("icon-error.gif")
    ImageResource iconError();

    @Source("information.png")
    ImageResource info();

    @Source("publish.png")
    ImageResource publish();

    @Source("arrow_up.png")
    ImageResource arrowUp();

    @Source("arrow_down.png")
    ImageResource arrowDown();

    /** Begin App resources **/

    @Source("AppFavoriteCell.css")
    AppFavoriteCellStyle appFavoriteCss();

    @Override
    @Source("star-gold.gif")
    ImageResource goldStar();

    @Override
    @Source("star-red.gif")
    ImageResource redStar();

    @Override
    @Source("star-white.gif")
    ImageResource whiteStar();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("fav.png")
    ImageResource favIcon();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("fav_add.png")
    ImageResource favIconAdd();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("fav_remove.png")
    ImageResource favIconDelete();

    /**
     * Image resource for a View Deployed Components icon.
     * 
     * @return image.
     */
    @Override
    @Source("script_link.png")
    ImageResource viewDeployedComponents();

    /**
     * Image resource for app launch
     * 
     * @return image.
     */
    @Override
    @Source("application_go.png")
    ImageResource applicationLaunch();

    /**
     * 
     * @return image.
     */
    @Override
    @Source("delete_rating.png")
    ImageResource deleteRating();

    /**
     * 
     * @return image.
     */
    @Override
    @Source("delete_rating_hover.png")
    ImageResource deleteRatingHover();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("book_add.png")
    ImageResource category();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("book_open.png")
    ImageResource category_open();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("go_public.png")
    ImageResource submitForPublic();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("not_fav.png")
    ImageResource disabledFavIcon();

    @Override
    @Source("exclamation.png")
    ImageResource exclamation();

    /** end app resources **/

    /** begin Disk resource **/

    @Source("DiskResourceNameCell.css")
    DiskResourceNameCellStyle diskResourceNameCss();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("file.gif")
    ImageResource file();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("folder.gif")
    ImageResource folder();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("file_view.gif")
    ImageResource fileView();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("file_rename.gif")
    ImageResource fileRename();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("folder_delete.gif")
    ImageResource folderDelete();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("file_delete.gif")
    ImageResource fileDelete();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("folder_home.gif")
    ImageResource folderHome();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("folder_add.gif")
    ImageResource folderAdd();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("folder_rename.gif")
    ImageResource folderRename();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("import.gif")
    ImageResource importData();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("file_download.gif")
    ImageResource download();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("drive_disk.png")
    ImageResource desktopUpload();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("drive_web.png")
    ImageResource urlImport();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Override
    @Source("control_arrow_down.png")
    ImageResource dataActionMenuIcon();

    @Override
    @Source("input_checkbox.png")
    ImageResource inputCheckBox();

    @Override
    @Source("input_env_var.png")
    ImageResource inputEnvVar();

    @Override
    @Source("input_file_multi.png")
    ImageResource inputFileMulti();

    @Override
    @Source("input_file_single.png")
    ImageResource inputFileSingle();

    @Override
    @Source("input_group.png")
    ImageResource inputGroup();

    @Override
    @Source("input_number_integer.png")
    ImageResource inputNumberInteger();

    @Override
    @Source("input_select_grouped.png")
    ImageResource inputSelectGrouped();

    @Override
    @Source("input_select_multi.png")
    ImageResource inputSelectMulti();

    @Override
    @Source("input_select_single.png")
    ImageResource inputSelectSingle();

    @Override
    @Source("input_text_multi.png")
    ImageResource inputTextMulti();

    @Override
    @Source("input_text_single.png")
    ImageResource inputTextSingle();

    @Override
    @Source("header_bg.png")
    ImageResource headerBg();

    @Override
    @Source("mini_logo.png")
    ImageResource headerLogo();

    @Source("DEHeader.css")
    DEHeaderStyle getHeaderStyle();

    @Source("bin_empty.png")
    ImageResource trashEmpty();

    @Source("bin.png")
    ImageResource trash();

    @Override
    @Source("tree_collapse.png")
    ImageResource treeCollapse();
    
    @Override
    @Source("tree_collapse_hover.png")
    ImageResource treeCollapseHover();

    @Override
    @Source("tree_expand.png")
    ImageResource treeExpand();

    @Source("link.png")
    ImageResource dataLink();

    @Source("warning_mini.png")
    ImageResource warningMini();

    @Override
    @Source("link_add.png")
    ImageResource linkAdd();

    @Override
    @Source("link_delete.png")
    ImageResource linkDelete();

    @Override
    @Source("paste_plain.png")
    ImageResource paste();

    @Source("DataLinkPanelCell.css")
    DataLinkPanelCellStyle getDataLinkCss();

    @Source("user_comment.png")
    ImageResource feedback();
    
    /**
     * Accesses the style for the Announcer widget
     * 
     * @return the CSS resource associated with the style
     */
	@Source("Announcer.css")
	AnnouncerStyle getAnnouncerStyle();

    @Source("ToolRequestStatusHelp.css")
    ToolRequestStatusHelpStyle getToolRequestStatusHelpCss();

    @Source("uiapps/widgets/ArgumentListEditorCss.css")
    ArgumentListEditorCss argumentListEditorCss();
    
    @Source("DataCollapse.css")
    DataCollapseStyle getDataCollapseStyle();
}
