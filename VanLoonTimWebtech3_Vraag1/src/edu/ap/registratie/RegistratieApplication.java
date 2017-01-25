package edu.ap.registratie;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RegistratieApplication extends Application {

	    /**
	     * Creates a root Restlet that will receive all incoming calls.
	     */
	   @Override
	   public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());

	       router.attach("/registratie", RegistratieResource.class);

	       return router;
	   }
}