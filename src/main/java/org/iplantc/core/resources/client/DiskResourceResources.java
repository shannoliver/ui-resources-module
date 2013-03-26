package org.iplantc.core.resources.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface DiskResourceResources extends ClientBundle{
	@Source("DiskResourceNameCell.css")
    DiskResourceNameCellStyle css();
	
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("file.gif")
    ImageResource file();
    
    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("folder.gif")
    ImageResource folder();
    
    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("file_view.gif")
    ImageResource fileView();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("file_rename.gif")
    ImageResource fileRename();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("folder_delete.gif")
    ImageResource folderDelete();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("file_delete.gif")
    ImageResource fileDelete();



    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("folder_home.gif")
    ImageResource folderHome();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("folder_add.gif")
    ImageResource folderAdd();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("folder_rename.gif")
    ImageResource folderRename();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("import.gif")
    ImageResource importData();

    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("file_download.gif")
    ImageResource download();
    
    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("drive_disk.png")
    ImageResource desktopUpload();

    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("drive_web.png")
    ImageResource urlImport();
    
    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("control_arrow_down.png")
    ImageResource dataActionMenuIcon();
    
    
    /**
     * Image resource.
     * 
     * @return image.
     */
    @Source("mydata_tiny.gif")
    ImageResource dataTiny();

}
