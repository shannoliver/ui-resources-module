package org.iplantc.core.resources.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle{
	 @Source("AppFavoriteCell.css")
     AppFavoriteCellStyle css();
	 
		@Source("star-gold.gif")
		ImageResource goldStar();

		@Source("star-red.gif")
		ImageResource redStar();

		@Source("star-white.gif")
		ImageResource whiteStar();
		
		
		  /**
	     * 
	     * @return image.
	     */
	    @Source("star-gold.gif")
	    ImageResource starGold();

	    /**
	     * 
	     * @return image.
	     */
	    @Source("star-red.gif")
	    ImageResource starRed();
	    
	    
	    /**
	     * Image resource for a View Deployed Components icon.
	     * 
	     * @return image.
	     */
	    @Source("script_link.png")
	    ImageResource viewDeployedComponents();

	    /**
	     * Image resource for app launch
	     * 
	     * @return image.
	     */
	    @Source("application_go.png")
	    ImageResource applicationLaunch();

	  

	    /**
	     * 
	     * @return image.
	     */
	    @Source("star-white.gif")
	    ImageResource starWhite();

	    /**
	     * 
	     * @return image.
	     */
	    @Source("delete_rating.png")
	    ImageResource deleteRating();

	    /**
	     * 
	     * @return image.
	     */
	    @Source("delete_rating_hover.png")
	    ImageResource deleteRatingHover();

		
		 /**
	     * 
	     * @return image.
	     */
	    @Source("award_star_gold_3.png")
	    ImageResource starGold3();
	    
	    /**
	     * 
	     * @return image.
	     */
	    @Source("award_star_silver_3.png")
	    ImageResource starSilver3();
	    
	    
	    /**
	     * Image resource.
	     * 
	     * @return image.
	     */
	    @Source("book_add.png")
	    ImageResource category();

	    /**
	     * Image resource.
	     * 
	     * @return image.
	     */
	    @Source("book_open.png")
	    ImageResource category_open();
	    
	    
	    /**
	     * Image resource.
	     * 
	     * @return image.
	     */
	    @Source("go_public.png")
	    ImageResource submitForPublic();
}
