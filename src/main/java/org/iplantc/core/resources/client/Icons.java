/**
 * 
 */
package org.iplantc.core.resources.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * @author sriram
 *
 */
public interface Icons extends ClientBundle {
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
    @Source("refreshicon.png")
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
    @Source("up.gif")
    ImageResource goUp();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("analysis.gif")
    ImageResource analysis();

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
    @Source("fav.png")
    ImageResource favourite();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("fav_add.png")
    ImageResource addFav();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("fav_remove.png")
    ImageResource removeFav();

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

    @Source("headerlogo_85h.png")
    ImageResource headerLogo();

    @Source("iplant_about.gif")
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
     * Image resource.
     * 
     * @return image.
     */
    @Source("close.png")
    ImageResource close();

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
	
	
}
