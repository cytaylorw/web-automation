package web.automation.core.exception.timeout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import web.automation.core.browser.WebBrowser;
import web.automation.core.element.BrowserElement;
import web.automation.core.exception.WebBrowserException;

public class NotSelectedException extends WebBrowserException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotSelectedException (){
		super();
	}

	public NotSelectedException (java.lang.String message){
		super(message);
	}
	
	public NotSelectedException (java.lang.Throwable cause){
		super(cause);
	}
	
	public NotSelectedException (java.lang.String message, java.lang.Throwable cause){
		super(message,cause);
	}
	
	public NotSelectedException (WebBrowser browser, java.lang.String message){
		super(browser,message);
	}
	
	public NotSelectedException (WebBrowser browser, By locator, java.lang.String message){
		super(browser,locator,message);
	}
	
	public NotSelectedException (WebBrowser browser, WebElement element, java.lang.String message){
		super(browser,element,message);
	}
	
	public NotSelectedException (WebBrowser browser, BrowserElement element, java.lang.String message){
		super(browser,element,message);
	}
}
