package com.vtb.test;

import junit.htmlui.TestServletBase;

/**
 * @version 	1.0
 * @author
 */
public class TestServlet extends TestServletBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TestServlet
	 */
	public TestServlet() {
		super();
	}

	/**
	 * @see TestServletBase#getDynamicClassLoader()
	 */
	protected ClassLoader getDynamicClassLoader() {
		return this.getClass().getClassLoader();
	}

}
